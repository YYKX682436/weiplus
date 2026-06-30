package f93;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.AbsLabelUserDialog f260292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f260293f;

    public b(android.view.View view, long j17, com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog, int i17) {
        this.f260291d = view;
        this.f260292e = absLabelUserDialog;
        this.f260293f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f260291d;
        view2.setClickable(false);
        view2.postDelayed(new f93.a(view2), 1000L);
        com.tencent.mm.plugin.label.ui.AbsLabelUserDialog absLabelUserDialog = this.f260292e;
        f93.r5 r5Var = ((f93.c5) absLabelUserDialog.f143187w.get(this.f260293f)).f260307c;
        java.lang.String str2 = r5Var != null ? r5Var.f260450a : null;
        if (str2 != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AbsLabelUserDialog", "showLabelDetailDialog: ".concat(str2));
            m80.j jVar = (m80.j) i95.n0.c(m80.j.class);
            android.content.Context context = absLabelUserDialog.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((l80.k) jVar).getClass();
            new f93.p5(context, str2).show();
            n80.c cVar = absLabelUserDialog.f143184t;
            if (cVar != null) {
                bk4.n0 n0Var = (bk4.n0) cVar;
                try {
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("tag", str2);
                    str = jSONObject.toString();
                    kotlin.jvm.internal.o.f(str, "toString(...)");
                    try {
                        kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                        qj4.s.m(qj4.s.f363958a, n0Var.f21514a, 98L, str, n0Var.f21515b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
                        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    str = "";
                }
                qj4.s.m(qj4.s.f363958a, n0Var.f21514a, 98L, str, n0Var.f21515b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
