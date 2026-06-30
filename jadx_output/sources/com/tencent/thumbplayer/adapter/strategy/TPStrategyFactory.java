package com.tencent.thumbplayer.adapter.strategy;

/* loaded from: classes16.dex */
public class TPStrategyFactory {
    public static com.tencent.thumbplayer.adapter.strategy.ITPStrategy createStrategy(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tPStrategyConfig) {
        return tPStrategyConfig.isExtPlayerList() ? new com.tencent.thumbplayer.adapter.strategy.TPExtStrategy(tPStrategyConfig) : new com.tencent.thumbplayer.adapter.strategy.TPDefaultStrategy(tPStrategyConfig);
    }
}
