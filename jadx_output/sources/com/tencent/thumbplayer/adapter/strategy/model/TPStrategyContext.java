package com.tencent.thumbplayer.adapter.strategy.model;

/* loaded from: classes16.dex */
public class TPStrategyContext {
    private java.lang.String definition;
    private int errorCode;
    private int errorType;
    int lastPlayerType;

    public TPStrategyContext(int i17, int i18, int i19, java.lang.String str) {
        this.errorCode = i19;
        this.errorType = i18;
        this.lastPlayerType = i17;
        this.definition = str;
    }

    public java.lang.String getDefinition() {
        return this.definition;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public int getErrorType() {
        return this.errorType;
    }

    public int getPlayerType() {
        return this.lastPlayerType;
    }
}
