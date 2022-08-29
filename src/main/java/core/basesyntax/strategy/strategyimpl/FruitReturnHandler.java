package core.basesyntax.strategy.strategyimpl;

import core.basesyntax.dao.FruitDao;
import core.basesyntax.model.FruitData;
import core.basesyntax.model.FruitTransaction;

public class FruitReturnHandler implements OperationHandler {
    private final FruitDao fruitDao;

    public FruitReturnHandler(FruitDao fruitDao) {
        this.fruitDao = fruitDao;
    }

    @Override
    public void processedTransaction(FruitTransaction fruitTransaction) {
        fruitDao.add(new FruitData(fruitTransaction.getFruitName(),
                fruitTransaction.getQuantity()));
    }
}