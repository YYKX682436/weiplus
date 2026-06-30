package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public final class k5 implements com.tencent.mm.ui.chatting.l5 {

    /* renamed from: a, reason: collision with root package name */
    public final int f201892a;

    /* renamed from: b, reason: collision with root package name */
    public final int f201893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f201894c;

    /* renamed from: d, reason: collision with root package name */
    public final int f201895d;

    public k5(int i17, int i18, int i19, int i27) {
        this.f201892a = i17;
        this.f201893b = i18;
        this.f201894c = i19;
        this.f201895d = i27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.ui.chatting.k5)) {
            return false;
        }
        com.tencent.mm.ui.chatting.k5 k5Var = (com.tencent.mm.ui.chatting.k5) obj;
        return this.f201892a == k5Var.f201892a && this.f201893b == k5Var.f201893b && this.f201894c == k5Var.f201894c && this.f201895d == k5Var.f201895d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f201892a) * 31) + java.lang.Integer.hashCode(this.f201893b)) * 31) + java.lang.Integer.hashCode(this.f201894c)) * 31) + java.lang.Integer.hashCode(this.f201895d);
    }

    public java.lang.String toString() {
        return "ThumbParams(thumbLeft=" + this.f201892a + ", thumbTop=" + this.f201893b + ", thumbWidth=" + this.f201894c + ", thumbHeight=" + this.f201895d + ')';
    }
}
