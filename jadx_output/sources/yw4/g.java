package yw4;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.webview.core.g3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yw4.i f466955b;

    public g(yw4.i iVar) {
        this.f466955b = iVar;
    }

    @Override // com.tencent.mm.plugin.webview.core.f3
    public void k(int i17, java.lang.String reqUrl, r45.s83 response) {
        kotlin.jvm.internal.o.g(reqUrl, "reqUrl");
        kotlin.jvm.internal.o.g(response, "response");
        super.k(i17, reqUrl, response);
        boolean z17 = this.f466955b.f466958c;
    }

    @Override // com.tencent.mm.plugin.webview.core.g3
    public void r(hy4.k0 performanceHelper) {
        java.lang.String[][] strArr;
        kotlin.jvm.internal.o.g(performanceHelper, "performanceHelper");
        if (nw4.w2.a()) {
            zq1.m0 m0Var = (zq1.m0) gm0.j1.s(zq1.m0.class);
            yw4.i iVar = this.f466955b;
            java.lang.String url = iVar.w();
            java.lang.String v17 = iVar.v();
            ((yq1.x0) m0Var).getClass();
            kotlin.jvm.internal.o.g(url, "url");
            com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2 t2Var = com.tencent.mm.plugin.brandservice.ui.timeline.preload.t2.f94445a;
            java.lang.String i17 = com.tencent.mm.plugin.brandservice.ui.timeline.preload.d.i(url, false);
            r45.o97 a17 = ts1.q.f421614a.a(i17, v17);
            if (a17 != null) {
                strArr = new java.lang.String[8];
                strArr[0] = new java.lang.String[]{"section", "PreAuthInfo"};
                strArr[1] = new java.lang.String[]{"webId", i17};
                strArr[2] = new java.lang.String[]{"authorized", java.lang.String.valueOf(a17.f382057g)};
                strArr[3] = new java.lang.String[]{"antiSpam", java.lang.String.valueOf(a17.f382056f)};
                java.lang.String date = new java.util.Date(a17.f382055e).toString();
                kotlin.jvm.internal.o.f(date, "toString(...)");
                strArr[4] = new java.lang.String[]{"modifyTime", date};
                strArr[5] = new java.lang.String[]{"bizScene", java.lang.String.valueOf(a17.f382063p)};
                java.lang.String[] strArr2 = new java.lang.String[2];
                strArr2[0] = "appId";
                java.lang.String str = a17.f382065r;
                if (str == null) {
                    str = "";
                }
                strArr2[1] = str;
                strArr[6] = strArr2;
                java.lang.String[] strArr3 = new java.lang.String[2];
                strArr3[0] = "businessData";
                java.lang.String b17 = x51.j1.b(a17.f382069v);
                strArr3[1] = b17 != null ? b17 : "";
                strArr[7] = strArr3;
            } else {
                strArr = null;
            }
            performanceHelper.f286122d = strArr;
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.g3
    public void s(hy4.k0 performanceHelper) {
        kotlin.jvm.internal.o.g(performanceHelper, "performanceHelper");
        zq1.m0 x17 = this.f466955b.x();
        zg0.q2 q2Var = this.f181833a;
        if (q2Var == null) {
            kotlin.jvm.internal.o.o("controller");
            throw null;
        }
        int c17 = ((yq1.x0) x17).c(q2Var.i());
        jz5.g gVar = cx4.s.f224654a;
        if (performanceHelper.f286123e) {
            cx4.s.c(1L, 1L, c17);
        }
    }
}
