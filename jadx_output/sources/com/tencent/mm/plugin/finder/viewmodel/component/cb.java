package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class cb {

    /* renamed from: a, reason: collision with root package name */
    public final long f133996a;

    /* renamed from: b, reason: collision with root package name */
    public long f133997b;

    /* renamed from: c, reason: collision with root package name */
    public long f133998c;

    /* renamed from: d, reason: collision with root package name */
    public long f133999d;

    /* renamed from: e, reason: collision with root package name */
    public long f134000e;

    /* renamed from: f, reason: collision with root package name */
    public long f134001f;

    /* renamed from: g, reason: collision with root package name */
    public long f134002g;

    /* renamed from: h, reason: collision with root package name */
    public long f134003h;

    /* renamed from: i, reason: collision with root package name */
    public int f134004i;

    public cb(long j17) {
        this.f133996a = j17;
    }

    public final void a(int i17) {
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.U6).getValue()).r()).intValue() != 1) {
            return;
        }
        com.tencent.mm.autogen.events.FinderEnhanceActionEvent finderEnhanceActionEvent = new com.tencent.mm.autogen.events.FinderEnhanceActionEvent();
        am.bb bbVar = finderEnhanceActionEvent.f54271g;
        bbVar.f6229b = i17;
        bbVar.f6228a = this.f133996a;
        bbVar.f6230c = this.f134002g - this.f133997b;
        bbVar.f6231d = this.f133999d - this.f133998c;
        bbVar.f6232e = this.f134001f - this.f134000e;
        bbVar.f6233f = this.f134004i;
        finderEnhanceActionEvent.e();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.tencent.mm.plugin.finder.viewmodel.component.cb) && this.f133996a == ((com.tencent.mm.plugin.finder.viewmodel.component.cb) obj).f133996a;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f133996a);
    }

    public java.lang.String toString() {
        return "{allCost=" + (this.f134002g - this.f133997b) + "ms, cgi=" + (this.f133999d - this.f133998c) + "ms, preload=" + (this.f134001f - this.f134000e) + "ms, ui=" + (this.f134002g - this.f134003h) + "ms}";
    }
}
