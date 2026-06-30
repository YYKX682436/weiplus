package com.tencent.thumbplayer.adapter.strategy;

/* loaded from: classes16.dex */
public class TPDefaultStrategy extends com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy {
    public TPDefaultStrategy(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tPStrategyConfig) {
        super(tPStrategyConfig);
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy
    public boolean checkNeedDoRetry(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext tPStrategyContext) {
        return false;
    }
}
