package com.tencent.mm.ui.conversation.unreadmode;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f208164a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.conversation.unreadmode.t f208165b;

    public u(java.lang.String talker, com.tencent.mm.ui.conversation.unreadmode.t action) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(action, "action");
        this.f208164a = talker;
        this.f208165b = action;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.conversation.unreadmode.u)) {
            return false;
        }
        com.tencent.mm.ui.conversation.unreadmode.u uVar = (com.tencent.mm.ui.conversation.unreadmode.u) obj;
        return kotlin.jvm.internal.o.b(this.f208164a, uVar.f208164a) && this.f208165b == uVar.f208165b;
    }

    public int hashCode() {
        return (this.f208164a.hashCode() * 31) + this.f208165b.hashCode();
    }

    public java.lang.String toString() {
        return "PendingUnreadUpdate(talker=" + this.f208164a + ", action=" + this.f208165b + ')';
    }
}
