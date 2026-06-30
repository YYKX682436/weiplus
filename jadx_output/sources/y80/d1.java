package y80;

/* loaded from: classes3.dex */
public final class d1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f459836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y80.e1 f459837e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f459838f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z80.q0 f459839g;

    public d1(com.tencent.mm.ui.widget.dialog.y1 y1Var, y80.e1 e1Var, android.content.Context context, z80.q0 q0Var) {
        this.f459836d = y1Var;
        this.f459837e = e1Var;
        this.f459838f = context;
        this.f459839g = q0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/location/POICorrectLogicService$showCorrectGuideView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f459836d.q();
        this.f459837e.getClass();
        android.content.Context context = this.f459838f;
        kotlin.jvm.internal.o.g(context, "context");
        z80.q0 actionInfo = this.f459839g;
        kotlin.jvm.internal.o.g(actionInfo, "actionInfo");
        if (i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.POICorrectLogicService", "jumpTencentMapWeAppForCorrect: failed");
        } else {
            r45.aq aqVar = new r45.aq();
            aqVar.f370182e = "wx7643d5f831302ab0";
            aqVar.f370186i = "modules/ugc/pages/index/index.html";
            com.tencent.mm.plugin.appbrand.service.h6 h6Var = (com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class);
            l81.b1 b1Var = new l81.b1();
            b1Var.f317014b = aqVar.f370182e;
            b1Var.f317012a = aqVar.f370181d;
            b1Var.f317016c = 0;
            b1Var.f317018d = aqVar.f370187m;
            java.lang.String page_url = aqVar.f370186i;
            kotlin.jvm.internal.o.f(page_url, "page_url");
            android.net.Uri.Builder buildUpon = android.net.Uri.parse(page_url).buildUpon();
            buildUpon.appendQueryParameter("src", "wxlocation");
            buildUpon.appendQueryParameter("latitude", java.lang.String.valueOf(actionInfo.f470664e));
            buildUpon.appendQueryParameter("longitude", java.lang.String.valueOf(actionInfo.f470663d));
            buildUpon.appendQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, actionInfo.f470661b);
            buildUpon.appendQueryParameter("address", actionInfo.f470662c);
            if (r26.i0.A(actionInfo.f470660a, "qqmap_", false, 2, null)) {
                buildUpon.appendQueryParameter("poi_id", r26.i0.v(actionInfo.f470660a, "qqmap_", "", false, 4, null));
            }
            java.lang.String uri = buildUpon.build().toString();
            kotlin.jvm.internal.o.f(uri, "toString(...)");
            b1Var.f317022f = uri;
            b1Var.f317032k = com.tencent.mm.plugin.appbrand.jsapi.audio.u1.CTRL_INDEX;
            ((com.tencent.mm.plugin.appbrand.launching.xc) h6Var).bj(context, b1Var);
        }
        yj0.a.h(this, "com/tencent/mm/feature/location/POICorrectLogicService$showCorrectGuideView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
