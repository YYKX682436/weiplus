package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class bd implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198503e;

    public bd(java.lang.String str, android.content.Context context) {
        this.f198502d = str;
        this.f198503e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = this.f198502d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, str2);
        com.tencent.mm.storage.y8 i18 = com.tencent.mm.storage.y8.i(str2);
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(com.tencent.mm.storage.z3.m4(i18.f196358a) ? 66 : 42);
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(com.tencent.mm.storage.z3.m4(i18.f196358a) ? 66 : 42);
            a18.f442131f = 0;
            a18.f442134i = 4;
            a18.a().a();
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(com.tencent.mm.storage.z3.m4(i18.f196358a) ? 66 : 42);
        objArr[1] = 32;
        objArr[2] = str;
        g0Var.d(10424, objArr);
        android.content.Context context = this.f198503e;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490548y7));
    }
}
