package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class c extends com.tencent.mm.roomsdk.model.factory.a {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.m1 f192251f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f192252g = new com.tencent.mm.roomsdk.model.factory.b(this);

    public c(boolean z17) {
        this.f192245a = z17;
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void a() {
        if (this.f192251f == null) {
            return;
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.d(this.f192251f);
        gm0.j1.i();
        gm0.j1.n().f273288b.q(this.f192251f.getType(), this.f192252g);
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void b() {
        com.tencent.mm.modelbase.m1 m1Var = this.f192251f;
        if (m1Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "request scene %s", m1Var);
        if (this.f192249e != null || this.f192246b != null || this.f192247c != null || this.f192248d != null) {
            gm0.j1.i();
            gm0.j1.n().f273288b.a(this.f192251f.getType(), this.f192252g);
        }
        gm0.j1.i();
        gm0.j1.n().f273288b.g(this.f192251f);
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        if (this.f192251f == null) {
            return;
        }
        this.f192249e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }
}
