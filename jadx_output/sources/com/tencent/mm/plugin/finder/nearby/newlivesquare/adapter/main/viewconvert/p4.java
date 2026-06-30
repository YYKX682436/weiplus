package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public class p4 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final sp2.c4 f121882e;

    /* renamed from: f, reason: collision with root package name */
    public final sp2.k f121883f;

    /* renamed from: g, reason: collision with root package name */
    public rl5.r f121884g;

    /* renamed from: h, reason: collision with root package name */
    public tp2.f f121885h;

    /* renamed from: i, reason: collision with root package name */
    public r45.qt2 f121886i;

    /* renamed from: m, reason: collision with root package name */
    public final ml2.d f121887m;

    public p4(sp2.c4 outsideEventListener, sp2.k outsideOperator) {
        kotlin.jvm.internal.o.g(outsideEventListener, "outsideEventListener");
        kotlin.jvm.internal.o.g(outsideOperator, "outsideOperator");
        this.f121882e = outsideEventListener;
        this.f121883f = outsideOperator;
        this.f121887m = new ml2.d();
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.c6y;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ae  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, in5.c r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.p4.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        this.f121885h = new tp2.f(V6, (com.tencent.mm.ui.MMActivity) context, null, 0, this.f121883f);
        this.f121886i = V6;
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = (com.tencent.mm.view.recyclerview.WxRecyclerView) holder.p(com.tencent.mm.R.id.lqa);
        if (wxRecyclerView != null) {
            in5.o.b(wxRecyclerView, new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.j4(holder, this), com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.k4.f121760d);
        }
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        com.tencent.mars.xlog.Log.i("Finder.RecentWatchListConvert", "#onViewRecycled holder=" + holder);
        n(holder);
    }

    public final void n(in5.s0 s0Var) {
        com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView;
        java.lang.Object obj = s0Var.f293124h;
        if (obj != null && (obj instanceof com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c4)) {
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c4 c4Var = (com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.c4) obj;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView2 = c4Var.f121615a;
            if (wxRecyclerView2 != null) {
                wxRecyclerView2.setAdapter(new up2.n(new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.RecentWatchItemConvertFactory(), new java.util.ArrayList()));
            }
            sp2.b4 b4Var = c4Var.f121616b;
            if (b4Var != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[AutoPlayCheck] REMOVE caller=");
                sb6.append(b4Var);
                sb6.append(", item.hashCode=");
                sb6.append(c4Var.f121619e);
                sb6.append(", size before=");
                sp2.c4 c4Var2 = this.f121882e;
                sb6.append(((java.util.ArrayList) c4Var2.f410997a).size());
                com.tencent.mars.xlog.Log.i("Finder.RecentWatchListConvert", sb6.toString());
                ((java.util.ArrayList) c4Var2.f410997a).remove(b4Var);
            }
            androidx.recyclerview.widget.w2 w2Var = c4Var.f121617c;
            if (w2Var != null && (wxRecyclerView = c4Var.f121615a) != null) {
                wxRecyclerView.V0(w2Var);
            }
            android.app.Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = c4Var.f121618d;
            if (activityLifecycleCallbacks != null) {
                android.content.Context applicationContext = com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext();
                android.app.Application application = applicationContext instanceof android.app.Application ? (android.app.Application) applicationContext : null;
                if (application != null) {
                    application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
                }
            }
        }
        s0Var.f293124h = null;
    }

    public final void o(int i17, long j17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("press_liveid", j17);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        java.lang.String t17 = r26.i0.t(jSONObject2, ",", ";", false);
        com.tencent.mars.xlog.Log.i("LiveScrollReportUtils", "optionPanelReport json: " + jSONObject);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.K1, t17, 0L, null, null, null, null, null, 252, null);
    }
}
