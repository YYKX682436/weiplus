package pk2;

/* loaded from: classes3.dex */
public final class d1 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f355646h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f355647i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f355646h = helper.f356099n0;
        this.f355647i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        r45.n73 n73Var;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        yf2.q qVar = (yf2.q) o9Var.e(yf2.q.class);
        if (qVar == null || (n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) qVar.getStore().business(mm2.g1.class)).f329071i).getValue()) == null) {
            return;
        }
        boolean z17 = true;
        r45.z53 z53Var = (r45.z53) n73Var.getCustom(1);
        java.lang.String string = z53Var != null ? z53Var.getString(17) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{\"gameappid\":\"");
        r45.z53 z53Var2 = (r45.z53) n73Var.getCustom(1);
        sb6.append(z53Var2 != null ? z53Var2.getString(0) : null);
        sb6.append("\"}");
        java.lang.String params = sb6.toString();
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct finderLiveStreamStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveStreamStruct();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        finderLiveStreamStruct.f57382d = finderLiveStreamStruct.b("FinderUsrname", xy2.c.e(context), true);
        finderLiveStreamStruct.f57384f = hc2.s.b() ? 1 : 0;
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderLiveStreamStruct.f57385g = finderLiveStreamStruct.b("FinderSessionId", Ri, true);
        finderLiveStreamStruct.f57386h = java.lang.System.currentTimeMillis();
        finderLiveStreamStruct.f57387i = com.tencent.mm.plugin.finder.assist.x2.f102673b;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 10);
        java.lang.String gVar2 = gVar.toString();
        kotlin.jvm.internal.o.f(gVar2, "toString(...)");
        finderLiveStreamStruct.p(r26.i0.t(gVar2, ",", ";", false));
        finderLiveStreamStruct.f57391m = finderLiveStreamStruct.b("Params", params, true);
        finderLiveStreamStruct.k();
        com.tencent.mars.xlog.Log.i("Finder.FinderGameLiveReportUtil", "report21017, " + finderLiveStreamStruct.n() + ' ');
        java.lang.String n17 = finderLiveStreamStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        java.lang.String t17 = r26.i0.t(n17, ",", ";", false);
        com.tencent.mars.xlog.Log.i("FinderLivePostReporter", "[reportActionBeforeLive] data = ".concat(t17));
        com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct androidFinderLivePostReportStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidFinderLivePostReportStruct();
        androidFinderLivePostReportStruct.p("21017");
        androidFinderLivePostReportStruct.q(t17);
        androidFinderLivePostReportStruct.k();
        if (string != null && string.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(qVar.f461769m, "url empty:" + string);
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", string);
            com.tencent.mm.ui.MMActivity N6 = qVar.N6();
            if (N6 != null) {
                j45.l.n(N6, "webview", ".ui.tools.WebViewUI", intent, qVar.f461770n);
            }
        }
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f355647i;
    }

    @Override // qk2.f
    public boolean o() {
        r45.z53 z53Var;
        java.lang.String string;
        r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) this.f364427a.c(mm2.g1.class)).f329071i).getValue();
        return (n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null || (string = z53Var.getString(17)) == null || string.length() <= 0) ? false : true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        int i17 = this.f355646h;
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.cyl);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        t(menu, i17, string, com.tencent.mm.R.raw.picture_regular, o9Var.f356078d.getResources().getColor(com.tencent.mm.R.color.FG_0));
    }

    @Override // qk2.h
    public int y() {
        return this.f355646h;
    }
}
