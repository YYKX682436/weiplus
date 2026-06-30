package com.tencent.mm.plugin.profile;

/* loaded from: classes7.dex */
public class r1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f153598d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r01.l1 f153599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f153600f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f153601g;

    public r1(int i17, r01.l1 l1Var, int i18, android.content.Context context) {
        this.f153598d = i17;
        this.f153599e = l1Var;
        this.f153600f = i18;
        this.f153601g = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        sr3.a aVar = sr3.a.f411829e;
        r01.l1 l1Var = this.f153599e;
        int i17 = this.f153598d;
        java.lang.String str = i17 == 1 ? l1Var.f368147i.f368153a : l1Var.f368148m.f368153a;
        java.lang.String str2 = "pages/setting/setting.html?biz=" + android.net.Uri.encode(str);
        l81.b1 b1Var = new l81.b1();
        b1Var.f317032k = this.f153600f;
        b1Var.f317016c = num.intValue();
        b1Var.f317034l = "1";
        b1Var.f317014b = "wx0b2ec076ec39c786";
        b1Var.f317022f = str2;
        b1Var.f317028i = l1Var.Bi(i17, str);
        com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
        if (h6Var != null) {
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(this.f153601g, b1Var);
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.ProfileUtils", "launchCreatorSetting: IWeAppLauncher service is null");
        }
        return jz5.f0.f302826a;
    }
}
