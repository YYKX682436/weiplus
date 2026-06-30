package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f191287a;

    /* renamed from: b, reason: collision with root package name */
    public final int f191288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191289c;

    /* renamed from: d, reason: collision with root package name */
    public int f191290d = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.f478524a5);

    /* renamed from: e, reason: collision with root package name */
    public int f191291e = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.Link_Alpha_0_6);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.pluginsdk.ui.span.t f191292f;

    public u(java.lang.Object obj, int i17, int i18) {
        this.f191287a = obj;
        this.f191288b = i17;
        this.f191289c = i18;
    }

    public final int a() {
        return this.f191291e;
    }

    public final com.tencent.mm.pluginsdk.ui.span.t b() {
        return this.f191292f;
    }

    public final int c() {
        return this.f191290d;
    }

    public final int d() {
        return this.f191289c;
    }

    public final int e() {
        return this.f191288b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.pluginsdk.ui.span.u)) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.span.u uVar = (com.tencent.mm.pluginsdk.ui.span.u) obj;
        return kotlin.jvm.internal.o.b(this.f191287a, uVar.f191287a) && this.f191288b == uVar.f191288b && this.f191289c == uVar.f191289c;
    }

    public final void f(int i17) {
        this.f191291e = i17;
    }

    public final void g(com.tencent.mm.pluginsdk.ui.span.t tVar) {
        this.f191292f = tVar;
    }

    public final void h(int i17) {
        this.f191290d = i17;
    }

    public int hashCode() {
        java.lang.Object obj = this.f191287a;
        return ((((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Integer.hashCode(this.f191288b)) * 31) + java.lang.Integer.hashCode(this.f191289c);
    }

    public java.lang.String toString() {
        return "LinkSpanObj(content=" + this.f191287a + ", start=" + this.f191288b + ", end=" + this.f191289c + ')';
    }
}
