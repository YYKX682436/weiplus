package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class f3 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f143574a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.h3 f143575b;

    public f3(com.tencent.mm.plugin.lite.jsapi.comms.h3 h3Var, boolean z17) {
        this.f143575b = h3Var;
        this.f143574a = z17;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
    }

    @Override // l81.e1
    public void e() {
        if (this.f143574a) {
            android.content.Context c17 = this.f143575b.c();
            if (c17 instanceof android.app.Activity) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.lite.jsapi.comms.e3 e3Var = new com.tencent.mm.plugin.lite.jsapi.comms.e3(this, c17);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(e3Var, 100L, false);
            }
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
