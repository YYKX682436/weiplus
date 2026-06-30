package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class wc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f206221e;

    public wc(com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        this.f206220d = f9Var;
        this.f206221e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String Ai = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Ai(this.f206220d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(Ai)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LongClickBrandServiceHelper", "Transfer fileName erro: fileName null");
            return;
        }
        w21.w0 j17 = w21.x0.j(Ai);
        java.lang.String r17 = w21.x0.r(str, Ai, j17 == null ? 0 : j17.f442495l);
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[voice]: to[%s] filePath[%s]", str, r17);
        c01.d9.e().g(new w21.o(r17, 1));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10424, 34, 2, str);
        android.content.Context context = this.f206221e;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490548y7));
    }
}
