package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class f extends com.tencent.mm.roomsdk.model.factory.a {

    /* renamed from: f, reason: collision with root package name */
    public xg3.q0 f192261f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f192262g = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f192263h = new com.tencent.mm.roomsdk.model.factory.RoomOpLogCallbackFactory$1(this, com.tencent.mm.app.a0.f53288d);

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.roomsdk.model.factory.e f192264i;

    public f(boolean z17) {
        this.f192245a = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "RoomOpLogCallbackFactory created, isWxRoom: %s", java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "cancel called, operate: %s", this.f192261f);
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void b() {
        o65.b bVar = this.f192248d;
        if (bVar == null) {
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(this.f192261f);
        } else {
            this.f192264i = new com.tencent.mm.roomsdk.model.factory.e(bVar, this.f192249e);
            ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).d(this.f192261f, this.f192264i, null);
            com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "request oplog with result %s", e21.a1.a(this.f192261f));
        }
    }

    @Override // com.tencent.mm.roomsdk.model.factory.a
    public void c(android.content.Context context, java.lang.String str, java.lang.String str2, boolean z17, boolean z18, android.content.DialogInterface.OnCancelListener onCancelListener) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "requestWithProgress called, title: %s, message: %s, indeterminate: %s, cancelable: %s, operate: %s", str, str2, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), e21.a1.a(this.f192261f));
        this.f192249e = db5.e1.Q(context, str, str2, z17, z18, onCancelListener);
        b();
    }

    public void d(xg3.q0 q0Var) {
        this.f192261f = q0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.RoomCallbackFactory", "__setOperate: %s", q0Var);
    }
}
