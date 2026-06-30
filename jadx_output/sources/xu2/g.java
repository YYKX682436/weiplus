package xu2;

/* loaded from: classes8.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xu2.n f457204d;

    public g(xu2.n nVar) {
        this.f457204d = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xu2.n nVar = this.f457204d;
        com.tencent.mars.xlog.Log.i(nVar.f457215e, "click reason 1");
        xu2.v vVar = nVar.f457214d;
        java.lang.String str = vVar.f457241c;
        com.tencent.mars.xlog.Log.i(str, "reportFeedback");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", vVar.f457248j);
            jSONObject.put("expTime", vVar.f457244f);
            jSONObject.put("isClickAd", vVar.f457242d ? 1 : 0);
            jSONObject.put("clickAdTimeMs", vVar.f457243e);
            jSONObject.put("feedbackTimeMs", c01.id.c());
            vVar.f457249k.put(jSONObject);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, th6, "reportFeedbackGood", new java.lang.Object[0]);
        }
        android.content.Context context = nVar.f457211a;
        db5.t7.h(context, context.getResources().getString(com.tencent.mm.R.string.d2g));
        nVar.c();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/liveAdUtil/FinderLiveAdFeedbackWidget$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
