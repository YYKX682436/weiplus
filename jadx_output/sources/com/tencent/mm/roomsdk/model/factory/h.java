package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class h extends com.tencent.mm.roomsdk.model.factory.a implements gd0.f {

    /* renamed from: f, reason: collision with root package name */
    public e21.k f192266f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f192267g = new com.tencent.mm.roomsdk.model.factory.g(this);

    public h(boolean z17) {
        this.f192245a = z17;
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void a() {
        if (this.f192266f == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f192266f);
        gm0.j1.i();
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        this.f192266f.getClass();
        r1Var.q(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this.f192267g);
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void b() {
        e21.k kVar = this.f192266f;
        if (kVar == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "request scene %s", kVar);
        if (this.f192249e != null || this.f192246b != null || this.f192247c != null || this.f192248d != null) {
            gm0.j1.i();
            com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
            this.f192266f.getClass();
            r1Var.a(com.tencent.mm.plugin.appbrand.jsapi.pay.x.CTRL_INDEX, this.f192267g);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(this.f192266f);
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f192266f == null) {
            return;
        }
        this.f192249e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }
}
