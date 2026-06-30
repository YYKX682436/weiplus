package com.tencent.thumbplayer.adapter.strategy;

/* loaded from: classes16.dex */
public class TPExtStrategy extends com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy {
    private static final java.lang.String TAG = "TPThumbPlayer[TPExtStrategy.java]";
    private int mCurId;
    private int[] mPlayerList;

    public TPExtStrategy(com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig tPStrategyConfig) {
        super(tPStrategyConfig);
        this.mCurId = 0;
        int[] playerList = tPStrategyConfig.getPlayerList();
        this.mPlayerList = playerList;
        if (playerList == null || playerList.length == 0) {
            this.mPlayerList = new int[1];
        }
    }

    private boolean isUseSoftDec(java.lang.String str) {
        return android.text.TextUtils.equals(str, "hd") || android.text.TextUtils.equals(str, "sd") || android.text.TextUtils.equals(str, "msd");
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy, com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int[] strategyForDec() {
        int[] iArr = {-1};
        int i17 = this.mCurId;
        int[] iArr2 = this.mPlayerList;
        if (i17 >= iArr2.length) {
            com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "strategyForDec error, decType:" + iArr[0]);
            return iArr;
        }
        int i18 = iArr2[i17];
        if (i18 == 1 || i18 == 2) {
            iArr[0] = 102;
        } else if (i18 == 3) {
            iArr[0] = 101;
        }
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "strategyForDec, decType:" + iArr[0]);
        return iArr;
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy, com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int strategyForOpen(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo) {
        int[] iArr = this.mPlayerList;
        int length = iArr.length;
        int i17 = this.mCurId;
        int i18 = length > i17 ? iArr[i17] : 0;
        int i19 = (!(i18 == 2 || i18 == 3) || isThumbPlayerEnable(tPPlaybackInfo)) ? i18 : 0;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "strategyForOpen, playerType:" + i19);
        return i19;
    }

    @Override // com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy, com.tencent.thumbplayer.adapter.strategy.ITPStrategy
    public int strategyForRetry(com.tencent.thumbplayer.adapter.TPPlaybackInfo tPPlaybackInfo, com.tencent.thumbplayer.adapter.strategy.model.TPStrategyContext tPStrategyContext) {
        int i17;
        if (tPStrategyContext != null && tPStrategyContext.getPlayerType() == 0) {
            return strategyForOpen(tPPlaybackInfo);
        }
        int[] iArr = this.mPlayerList;
        int length = iArr.length - 1;
        int i18 = this.mCurId;
        if (length > i18) {
            int i19 = i18 + 1;
            this.mCurId = i19;
            i17 = iArr[i19];
        } else {
            i17 = 0;
        }
        int i27 = (!(i17 == 2 || i17 == 3) || isThumbPlayerEnable(tPPlaybackInfo)) ? i17 : 0;
        com.tencent.thumbplayer.utils.TPLogUtil.i(TAG, "strategyForRetry, playerType:" + i27);
        return i27;
    }
}
