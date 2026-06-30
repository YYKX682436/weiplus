package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public final class k6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f190446a;

    /* renamed from: b, reason: collision with root package name */
    public final int f190447b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f190448c;

    public k6(int i17, int i18, int[] loc) {
        kotlin.jvm.internal.o.g(loc, "loc");
        this.f190446a = i17;
        this.f190447b = i18;
        this.f190448c = loc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.chat.k6)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.chat.k6 k6Var = (com.tencent.mm.pluginsdk.ui.chat.k6) obj;
        return this.f190446a == k6Var.f190446a && this.f190447b == k6Var.f190447b && kotlin.jvm.internal.o.b(this.f190448c, k6Var.f190448c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f190446a) * 31) + java.lang.Integer.hashCode(this.f190447b)) * 31) + java.util.Arrays.hashCode(this.f190448c);
    }

    public java.lang.String toString() {
        return "AnimViewParam(width=" + this.f190446a + ", height=" + this.f190447b + ", loc=" + java.util.Arrays.toString(this.f190448c) + ')';
    }
}
