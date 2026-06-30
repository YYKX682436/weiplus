package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes2.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f191188a;

    /* renamed from: b, reason: collision with root package name */
    public final int f191189b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191190c;

    public b1(int i17, int i18, int i19) {
        this.f191188a = i17;
        this.f191189b = i18;
        this.f191190c = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.span.b1)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.span.b1 b1Var = (com.tencent.mm.pluginsdk.ui.span.b1) obj;
        return this.f191188a == b1Var.f191188a && this.f191189b == b1Var.f191189b && this.f191190c == b1Var.f191190c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f191188a) * 31) + java.lang.Integer.hashCode(this.f191189b)) * 31) + java.lang.Integer.hashCode(this.f191190c);
    }

    public java.lang.String toString() {
        return "SeparatorSpanObj(start=" + this.f191188a + ", end=" + this.f191189b + ", color=" + this.f191190c + ')';
    }
}
