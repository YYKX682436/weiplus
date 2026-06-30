package com.tencent.tav.player;

/* loaded from: classes16.dex */
public class PlayerMessage {
    public java.lang.Object bizMsg1;
    public com.tencent.tav.player.Callback callback;
    public java.lang.String form;
    public long msgId;

    public PlayerMessage(java.lang.Object obj, long j17) {
        this.bizMsg1 = obj;
        this.msgId = j17;
    }

    public java.lang.String toString() {
        return "PlayerMessage{bizMsg1=" + this.bizMsg1 + ", form='" + this.form + "', msgId=" + this.msgId + '}';
    }

    public PlayerMessage(java.lang.Object obj, java.lang.String str, long j17) {
        this.bizMsg1 = obj;
        this.form = str;
        this.msgId = j17;
    }

    public PlayerMessage(java.lang.Object obj, java.lang.String str, long j17, com.tencent.tav.player.Callback callback) {
        this.bizMsg1 = obj;
        this.form = str;
        this.msgId = j17;
        this.callback = callback;
    }
}
