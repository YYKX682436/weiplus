package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ul implements xe0.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205711a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f205712b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f205713c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.wl f205714d;

    public ul(com.tencent.mm.ui.chatting.viewitems.wl wlVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f205714d = wlVar;
        this.f205711a = str;
        this.f205712b = i17;
        this.f205713c = str2;
    }

    public void a(boolean z17, java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.wl wlVar = this.f205714d;
        if (!z17) {
            db5.e1.s(wlVar.f205950s.g(), wlVar.f205950s.g().getString(com.tencent.mm.R.string.msg_net_error), "");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("werun_daily_push_list;");
        java.lang.String str2 = this.f205711a;
        sb6.append(str2);
        sb6.append(";");
        sb6.append(this.f205712b);
        java.lang.String sb7 = sb6.toString();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        pj4.j0 j0Var = new pj4.j0();
        j0Var.f355139d = "11";
        arrayList.add(j0Var);
        pj4.j0 j0Var2 = new pj4.j0();
        j0Var2.f355139d = "3";
        j0Var2.f355141f = "https://support.weixin.qq.com/security/readtemplate?t=w_security_center_website/upgrade&scene=1#wechat_redirect";
        arrayList.add(j0Var2);
        bi4.c1 c1Var = new bi4.c1();
        c1Var.b(str2);
        c1Var.a(this.f205713c);
        c1Var.h(str);
        c1Var.f("wx7fa037cc7dfabad5@jsticket");
        c1Var.g(wlVar.f205950s.g().getString(com.tencent.mm.R.string.c5b));
        c1Var.f21034a.f354954x = sb7;
        c1Var.c(arrayList);
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).Di(wlVar.f205950s.g(), c1Var.f21034a);
    }
}
