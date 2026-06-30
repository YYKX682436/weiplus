package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public final class f5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f200486a;

    /* renamed from: b, reason: collision with root package name */
    public final int f200487b;

    public f5(boolean z17, int i17) {
        this.f200486a = z17;
        this.f200487b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.f5)) {
            return false;
        }
        com.tencent.mm.ui.chatting.f5 f5Var = (com.tencent.mm.ui.chatting.f5) obj;
        return this.f200486a == f5Var.f200486a && this.f200487b == f5Var.f200487b;
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f200486a) * 31) + java.lang.Integer.hashCode(this.f200487b);
    }

    public java.lang.String toString() {
        return "IsFromNewsJump(value=" + this.f200486a + ", unreadCount=" + this.f200487b + ')';
    }
}
