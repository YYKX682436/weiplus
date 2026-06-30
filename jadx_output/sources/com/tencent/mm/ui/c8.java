package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class c8 implements c01.qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198082a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.ProgressDialog f198083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.JSAPIUploadLogHelperUI f198084c;

    public c8(com.tencent.mm.ui.JSAPIUploadLogHelperUI jSAPIUploadLogHelperUI, int i17, android.app.ProgressDialog progressDialog) {
        this.f198084c = jSAPIUploadLogHelperUI;
        this.f198082a = i17;
        this.f198083b = progressDialog;
    }

    @Override // c01.qa
    public void a(com.tencent.mm.network.s sVar) {
        synchronized (com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196820f) {
            com.tencent.mm.ui.JSAPIUploadLogHelperUI.f196819e = true;
        }
        com.tencent.mm.ui.a8 a8Var = new com.tencent.mm.ui.a8(this);
        com.tencent.mm.network.s sVar2 = c01.d9.e().f70764d;
        if (sVar2 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQueue", "flushPushLog autoAuth  == null");
        } else {
            sVar2.m0();
        }
        com.tencent.mars.xlog.Log.appenderFlush();
        com.tencent.mm.app.i3.d(new int[]{this.f198082a}, gm0.j1.a(), gm0.j1.a() ? gm0.j1.b().h() : 0, 0, 24, null, "", "", new com.tencent.mm.ui.b8(this, a8Var));
    }
}
