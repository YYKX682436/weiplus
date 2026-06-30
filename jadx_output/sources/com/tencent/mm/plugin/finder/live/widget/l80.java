package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes16.dex */
public final class l80 {

    /* renamed from: a, reason: collision with root package name */
    public final int f118918a;

    /* renamed from: b, reason: collision with root package name */
    public final int f118919b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f118920c;

    public l80(int i17, int i18, yz5.a onClick) {
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f118918a = i17;
        this.f118919b = i18;
        this.f118920c = onClick;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.live.widget.l80)) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.widget.l80 l80Var = (com.tencent.mm.plugin.finder.live.widget.l80) obj;
        return this.f118918a == l80Var.f118918a && this.f118919b == l80Var.f118919b && kotlin.jvm.internal.o.b(this.f118920c, l80Var.f118920c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f118918a) * 31) + java.lang.Integer.hashCode(this.f118919b)) * 31) + this.f118920c.hashCode();
    }

    public java.lang.String toString() {
        return "AssistantMoreItem(titleResId=" + this.f118918a + ", iconResId=" + this.f118919b + ", onClick=" + this.f118920c + ')';
    }
}
