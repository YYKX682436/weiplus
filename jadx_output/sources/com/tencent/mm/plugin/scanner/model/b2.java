package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes15.dex */
public final class b2 implements com.tencent.mm.plugin.scanner.view.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.u f158820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sz3.w0 f158821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.c2 f158822c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.model.y1 f158823d;

    public b2(com.tencent.mm.plugin.scanner.model.u uVar, sz3.w0 w0Var, com.tencent.mm.plugin.scanner.model.c2 c2Var, com.tencent.mm.plugin.scanner.model.y1 y1Var) {
        this.f158820a = uVar;
        this.f158821b = w0Var;
        this.f158822c = c2Var;
        this.f158823d = y1Var;
    }

    @Override // com.tencent.mm.plugin.scanner.view.w0
    public void b(boolean z17) {
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.scanner.model.a2 a2Var = new com.tencent.mm.plugin.scanner.model.a2(this.f158820a, this.f158821b, this.f158822c, this.f158823d);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(a2Var, 200L, false);
    }

    @Override // com.tencent.mm.plugin.scanner.view.w0
    public void c() {
    }
}
