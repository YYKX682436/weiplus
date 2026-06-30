package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class h5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f201661a;

    public h5(boolean z17) {
        this.f201661a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.ui.chatting.h5) && this.f201661a == ((com.tencent.mm.ui.chatting.h5) obj).f201661a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f201661a);
    }

    public java.lang.String toString() {
        return "IsQuoteMsgWaitSend(value=" + this.f201661a + ')';
    }
}
