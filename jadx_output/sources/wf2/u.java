package wf2;

/* loaded from: classes10.dex */
public final class u implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445622d;

    public u(wf2.a0 a0Var) {
        this.f445622d = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareEntranceController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wf2.a0 a0Var = this.f445622d;
        a0Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 2);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.hj((ml2.r0) c17, ml2.b4.N1, jSONObject2, 0L, null, null, null, null, null, 252, null);
        kotlinx.coroutines.r2 r2Var = a0Var.f445561r;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        android.widget.RelativeLayout relativeLayout = a0Var.f445556m;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(8);
        }
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) a0Var.business(mm2.c1.class)).f328852o);
        java.lang.String w07 = b17 != null ? b17.w0() : null;
        com.tencent.mars.xlog.Log.i("FinderLiveScreenShotShareEntranceController", "#onEntranceClick live_id=" + ((mm2.e1) a0Var.business(mm2.e1.class)).f328988r.getLong(0) + " nickname=" + w07);
        a0Var.f445562s = com.tencent.mm.plugin.finder.live.util.y.d(a0Var, null, null, new wf2.t(a0Var, w07, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/screenshotshare/ShareEntranceController$onViewMount$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
