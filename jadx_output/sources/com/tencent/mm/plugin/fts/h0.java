package com.tencent.mm.plugin.fts;

/* loaded from: classes12.dex */
public class h0 extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f137413n = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);

    /* renamed from: o, reason: collision with root package name */
    public boolean f137414o = false;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.d0 f137415p;

    public h0(com.tencent.mm.plugin.fts.d0 d0Var) {
        this.f137415p = d0Var;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "CheckLanguageUpdate";
    }

    @Override // p13.c
    public boolean i() {
        int k17 = (int) this.f137415p.f137381f.k(-3L, 0L);
        int hashCode = this.f137413n.hashCode();
        boolean z17 = k17 != hashCode;
        this.f137414o = z17;
        if (k17 != 0 && z17) {
            new com.tencent.mm.autogen.events.UpdateLanguageEvent().e();
        }
        this.f137415p.f137381f.q(-3L, hashCode);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{changed: %b}", java.lang.Boolean.valueOf(this.f137414o));
    }
}
