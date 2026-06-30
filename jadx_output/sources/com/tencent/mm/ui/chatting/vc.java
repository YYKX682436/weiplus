package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class vc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f202803d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f202804e;

    public vc(java.lang.String str, android.content.Context context) {
        this.f202803d = str;
        this.f202804e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        java.lang.String str2 = this.f202803d;
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[text]: to[%s] text[%s]", str, str2);
        if (w11.t1.a(str)) {
            w11.r1 a17 = w11.s1.a(str);
            a17.g(str);
            a17.e(str2);
            a17.h(c01.e2.C(str));
            a17.b();
        } else {
            w11.r1 a18 = w11.s1.a(str);
            a18.g(str);
            a18.e(str2);
            a18.h(c01.e2.C(str));
            a18.f442131f = 0;
            a18.f442134i = 4;
            a18.a().a();
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(10424, 1, 1, str);
        android.content.Context context = this.f202804e;
        db5.e1.T(context, context.getString(com.tencent.mm.R.string.f490548y7));
    }
}
