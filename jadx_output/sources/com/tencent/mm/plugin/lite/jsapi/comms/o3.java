package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class o3 implements l81.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f143700a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.p3 f143701b;

    public o3(com.tencent.mm.plugin.lite.jsapi.comms.p3 p3Var, boolean z17) {
        this.f143701b = p3Var;
        this.f143700a = z17;
    }

    @Override // l81.e1
    public void a() {
    }

    @Override // l81.e1
    public void b() {
    }

    @Override // l81.e1
    public void d(java.lang.String str) {
        r45.br2 br2Var = (r45.br2) com.tencent.mm.plugin.lite.jsapi.comms.p3.f143718h.get(str);
        if (br2Var != null) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            c61.l7 l7Var = (c61.l7) b6Var;
            l7Var.getClass();
            kotlin.jvm.internal.o.g(context, "context");
            kotlinx.coroutines.l.d(kotlinx.coroutines.i2.f310477d, null, null, new c61.y6(l7Var, context, br2Var, "", null), 3, null);
        }
    }

    @Override // l81.e1
    public void e() {
        if (this.f143700a) {
            android.content.Context c17 = this.f143701b.c();
            if (c17 instanceof android.app.Activity) {
                ku5.u0 u0Var = ku5.t0.f312615d;
                com.tencent.mm.plugin.lite.jsapi.comms.n3 n3Var = new com.tencent.mm.plugin.lite.jsapi.comms.n3(this, c17);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(n3Var, 100L, false);
            }
        }
    }

    @Override // l81.e1
    public void f(boolean z17) {
    }
}
