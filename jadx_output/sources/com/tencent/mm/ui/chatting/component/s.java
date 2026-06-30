package com.tencent.mm.ui.chatting.component;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f199886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f199887b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199888c;

    /* renamed from: d, reason: collision with root package name */
    public final int f199889d;

    /* renamed from: e, reason: collision with root package name */
    public final long f199890e;

    /* renamed from: f, reason: collision with root package name */
    public long f199891f;

    public s(java.lang.String sessionId, java.lang.String chatName, int i17, int i18) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(chatName, "chatName");
        this.f199886a = sessionId;
        this.f199887b = chatName;
        this.f199888c = i17;
        this.f199889d = i18;
        this.f199890e = java.lang.System.currentTimeMillis();
        this.f199891f = -1L;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.component.s)) {
            return false;
        }
        com.tencent.mm.ui.chatting.component.s sVar = (com.tencent.mm.ui.chatting.component.s) obj;
        return kotlin.jvm.internal.o.b(this.f199886a, sVar.f199886a) && kotlin.jvm.internal.o.b(this.f199887b, sVar.f199887b) && this.f199888c == sVar.f199888c && this.f199889d == sVar.f199889d;
    }

    public int hashCode() {
        return (((((this.f199886a.hashCode() * 31) + this.f199887b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f199888c)) * 31) + java.lang.Integer.hashCode(this.f199889d);
    }

    public java.lang.String toString() {
        return "ChattingStatInfo(sessionId='" + this.f199886a + "', chatName='" + this.f199887b + "', chatType=" + this.f199888c + ", chatRoomUserCountOnEnter=" + this.f199889d + ", enterTime=" + this.f199890e + ", exitTime=" + this.f199891f + ')';
    }
}
