package com.tencent.thumbplayer.adapter.strategy;

/* loaded from: classes16.dex */
public abstract class TPBaseStrategy implements com.tencent.thumbplayer.adapter.strategy.ITPStrategy {
    protected com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tpStrategyConfig;

    public TPBaseStrategy(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tPStrategyConfig) {
        this.tpStrategyConfig = tPStrategyConfig;
    }

    public boolean checkNeedDoRetry(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext tPStrategyContext) {
        return false;
    }

    public boolean isSystemPlayerEnable(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        if (com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isTVPlatform()) {
            return true;
        }
        return com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isSystemPlayerEnable() && com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.enablePlayBySystemPlayer(tPPlaybackInfo);
    }

    public boolean isThumbPlayerEnable(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        return com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isTVPlatform() ? com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isThumbPlayerEnable() : com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isThumbPlayerEnable() && com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.enablePlayByThumbPlayer(tPPlaybackInfo);
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int[] strategyForDec() {
        int decStrategy = this.tpStrategyConfig.getDecStrategy();
        if (decStrategy == 0) {
            return new int[]{102, 101};
        }
        if (decStrategy == 1) {
            return new int[]{102};
        }
        if (decStrategy == 2) {
            return new int[]{102, 101};
        }
        if (decStrategy == 3) {
            return new int[]{101};
        }
        if (decStrategy != 4) {
            return null;
        }
        return new int[]{101, 102};
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int strategyForOpen(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        int playerStrategy = this.tpStrategyConfig.getPlayerStrategy();
        if (playerStrategy == 0) {
            if (isThumbPlayerEnable(tPPlaybackInfo)) {
                return 2;
            }
            return com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (playerStrategy == 1) {
            return isThumbPlayerEnable(tPPlaybackInfo) ? 2 : 0;
        }
        if (playerStrategy == 2) {
            if (isThumbPlayerEnable(tPPlaybackInfo)) {
                return 2;
            }
            return com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isSystemPlayerEnable() ? 1 : 0;
        }
        if (playerStrategy == 3) {
            return isSystemPlayerEnable(tPPlaybackInfo) ? 1 : 0;
        }
        if (playerStrategy != 4) {
            return 0;
        }
        if (isSystemPlayerEnable(tPPlaybackInfo)) {
            return 1;
        }
        return com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isThumbPlayerEnable() ? 2 : 0;
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int strategyForRetry(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo, com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext tPStrategyContext) {
        int playerStrategy = this.tpStrategyConfig.getPlayerStrategy();
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 0) {
            return strategyForOpen(tPPlaybackInfo);
        }
        if (!checkNeedDoRetry(tPStrategyContext)) {
            return 0;
        }
        if (playerStrategy != 0) {
            return playerStrategy != 2 ? (playerStrategy == 4 && tPStrategyContext != null && tPStrategyContext.getPlayerType() == 1 && isThumbPlayerEnable(tPPlaybackInfo)) ? 2 : 0 : (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 2 && isSystemPlayerEnable(tPPlaybackInfo)) ? 1 : 0;
        }
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 1) {
            return isThumbPlayerEnable(tPPlaybackInfo) ? 2 : 0;
        }
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 2 && isSystemPlayerEnable(tPPlaybackInfo)) {
            return 1;
        }
        return 0;
    }
}
