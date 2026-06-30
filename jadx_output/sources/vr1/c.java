package vr1;

/* loaded from: classes8.dex */
public final class c implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr1.o f439551d;

    public c(vr1.o oVar) {
        this.f439551d = oVar;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        xr1.e item = (xr1.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        vr1.o oVar = this.f439551d;
        oVar.f439592q = rawX;
        oVar.f439593r = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        xr1.e data = (xr1.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f456185e == xr1.n.f456204f) {
            vr1.o oVar = this.f439551d;
            oVar.f439582d.add(data);
            com.tencent.mm.autogen.mmdata.rpt.BizRecentReadReportStruct bizRecentReadReportStruct = new com.tencent.mm.autogen.mmdata.rpt.BizRecentReadReportStruct();
            bizRecentReadReportStruct.f55416d = 1L;
            androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI");
            bizRecentReadReportStruct.f55417e = ((com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI) activity).f94064e;
            r45.yk ykVar = data.f456184d;
            bizRecentReadReportStruct.f55418f = bizRecentReadReportStruct.b("bizuin", ykVar.f391169n, true);
            bizRecentReadReportStruct.f55419g = ykVar.f391170o;
            bizRecentReadReportStruct.f55420h = ykVar.f391171p;
            bizRecentReadReportStruct.f55421i = 0L;
            bizRecentReadReportStruct.f55422j = java.lang.System.currentTimeMillis();
            bizRecentReadReportStruct.k();
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "onClick jump to title:" + ykVar.f391164f + ", url:" + ykVar.f391163e);
            android.content.Intent intent = new android.content.Intent();
            java.lang.String a17 = ot0.g0.a(ykVar.f391163e, 90, 245, ((int) java.lang.System.currentTimeMillis()) / 1000);
            intent.putExtra("rawUrl", a17);
            intent.putExtra("geta8key_scene", 56);
            intent.putExtra("srcDisplayname", ykVar.f391165g);
            intent.putExtra("key_enable_fts_quick", true);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.tencent.mm.plugin.brandservice.ui.timeline.preload.t1.e(1)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(oVar.getContext(), a17, ykVar.f391168m, false, 90, 245, intent)) {
                    com.tencent.mars.xlog.Log.i(pf5.o.TAG, "jump to TmplWebview");
                    return;
                }
            }
            j45.l.j(oVar.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        xr1.e data = (xr1.e) cVar;
        kotlin.jvm.internal.o.g(itemView, "itemView");
        kotlin.jvm.internal.o.g(data, "data");
        if (data.f456185e != xr1.n.f456204f) {
            return false;
        }
        vr1.o oVar = this.f439551d;
        oVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popMenu, title:");
        r45.yk ykVar = data.f456184d;
        sb6.append(ykVar.f391164f);
        sb6.append(", url:");
        sb6.append(ykVar.f391163e);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        rl5.r rVar = new rl5.r(oVar.getContext());
        rVar.C = false;
        rVar.h(itemView, new vr1.l(oVar), new vr1.m(oVar, data, i17), oVar.f439592q, oVar.f439593r);
        return true;
    }
}
