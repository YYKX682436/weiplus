package com.tencent.thumbplayer.adapter.strategy;

/* loaded from: classes16.dex */
public interface ITPStrategy {
    int[] strategyForDec();

    int strategyForOpen(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo);

    int strategyForRetry(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo, com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext tPStrategyContext);
}
