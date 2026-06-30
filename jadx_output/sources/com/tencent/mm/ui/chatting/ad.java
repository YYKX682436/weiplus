package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ad implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f198381e;

    public ad(java.lang.String str, android.content.Context context) {
        this.f198380d = str;
        this.f198381e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = this.f198380d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[location]: to[%s] content[%s]", str, str2);
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(48);
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(48);
            a18.f442131f = 0;
            a18.f442134i = 4;
            a18.a().a();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10424, 48, 16, str);
        android.content.Context context = this.f198381e;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490548y7));
    }
}
