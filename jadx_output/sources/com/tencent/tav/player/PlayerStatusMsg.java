package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerStatusMsg {
    private java.lang.String errorMsg;
    private com.tencent.tav.player.IPlayer.PlayerStatus playerStatus;

    public PlayerStatusMsg(com.tencent.tav.player.IPlayer.PlayerStatus playerStatus, java.lang.String str) {
        this.playerStatus = playerStatus;
        this.errorMsg = str;
    }

    public java.lang.String getErrorMsg() {
        return this.errorMsg;
    }

    public com.tencent.tav.player.IPlayer.PlayerStatus getPlayerStatus() {
        return this.playerStatus;
    }
}
