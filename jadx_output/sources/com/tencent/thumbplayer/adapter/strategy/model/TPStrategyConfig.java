package com.tencent.thumbplayer.adapter.strategy.model;

/* loaded from: classes16.dex */
public class TPStrategyConfig {
    int decStrategy;
    boolean mIsExtPlayerList;
    int[] mPlayerList;
    int playerStrategy;

    public TPStrategyConfig(com.tencent.thumbplayer.adapter.TPPlaybackParams tPPlaybackParams) {
        this.mIsExtPlayerList = false;
        this.decStrategy = 2;
        this.playerStrategy = 2;
        if (com.tencent.thumbplayer.adapter.strategy.utils.TPStrategyUtils.isTVPlatform()) {
            this.playerStrategy = 4;
            this.decStrategy = 2;
        }
        if (tPPlaybackParams == null) {
            return;
        }
        com.tencent.thumbplayer.api.TPOptionalParam optionalParam = tPPlaybackParams.getOptionalParam(210);
        if (optionalParam != null && optionalParam.getParamType() == 4) {
            this.mPlayerList = optionalParam.getParamQueueInt().queueValue;
            this.mIsExtPlayerList = true;
            return;
        }
        com.tencent.thumbplayer.api.TPOptionalParam optionalParam2 = tPPlaybackParams.getOptionalParam(202);
        if (optionalParam2 != null && optionalParam2.getParamType() == 2 && isPlayerStrategyVaild(optionalParam2.getParamLong().value)) {
            this.playerStrategy = (int) optionalParam2.getParamLong().value;
        }
        com.tencent.thumbplayer.api.TPOptionalParam optionalParam3 = tPPlaybackParams.getOptionalParam(203);
        if (optionalParam3 != null && optionalParam3.getParamType() == 2 && isDecStrategyVaild(optionalParam3.getParamLong().value)) {
            this.decStrategy = (int) optionalParam3.getParamLong().value;
        }
        checkParamsIllegal(this.playerStrategy, this.decStrategy);
    }

    private void checkParamsIllegal(int i17, int i18) {
        if (i17 == 3 && i18 == 3) {
            throw new java.lang.IllegalArgumentException("can not soft with systemplayer");
        }
    }

    private boolean isDecStrategyVaild(long j17) {
        return j17 > 0 && j17 < 5;
    }

    private boolean isPlayerStrategyVaild(long j17) {
        return j17 > 0 && j17 < 5;
    }

    public int getDecStrategy() {
        return this.decStrategy;
    }

    public int[] getPlayerList() {
        return this.mPlayerList;
    }

    public int getPlayerStrategy() {
        return this.playerStrategy;
    }

    public boolean isExtPlayerList() {
        return this.mIsExtPlayerList;
    }
}
