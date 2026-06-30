package f93;

/* loaded from: classes3.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f260458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f93.u0 f260459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f260460f;

    public s0(android.view.View view, long j17, f93.u0 u0Var, com.tencent.mm.storage.z3 z3Var) {
        this.f260458d = view;
        this.f260459e = u0Var;
        this.f260460f = z3Var;
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
        android.view.View view2 = this.f260458d;
        view2.setClickable(false);
        view2.postDelayed(new f93.r0(view2), 1000L);
        f93.u0 u0Var = this.f260459e;
        n80.c cVar = u0Var.f260475e;
        com.tencent.mm.storage.z3 z3Var = this.f260460f;
        if (cVar != null) {
            java.lang.String d17 = z3Var.d1();
            bk4.n0 n0Var = (bk4.n0) cVar;
            java.lang.String str2 = "";
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                if (d17 == null) {
                    d17 = "";
                }
                jSONObject.put("touser", d17);
                java.lang.String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                try {
                    kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
                    str = jSONObject2;
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    str2 = jSONObject2;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th));
                    str = str2;
                    qj4.s.m(qj4.s.f363958a, n0Var.f21514a, 99L, str, n0Var.f21515b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
                    java.lang.String d18 = z3Var.d1();
                    kotlin.jvm.internal.o.f(d18, "getUsername(...)");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("Contact_User", d18);
                    intent.putExtra("Contact_Scene", 0);
                    intent.putExtra("CONTACT_INFO_UI_SOURCE", 0);
                    ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, u0Var.f260474d);
                    yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
                }
            } catch (java.lang.Throwable th7) {
                th = th7;
            }
            qj4.s.m(qj4.s.f363958a, n0Var.f21514a, 99L, str, n0Var.f21515b, 0L, 0L, 0L, 0L, null, null, 0L, 2032, null);
        }
        java.lang.String d182 = z3Var.d1();
        kotlin.jvm.internal.o.f(d182, "getUsername(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("Contact_User", d182);
        intent2.putExtra("Contact_Scene", 0);
        intent2.putExtra("CONTACT_INFO_UI_SOURCE", 0);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent2, u0Var.f260474d);
        yj0.a.h(this, "com/tencent/mm/plugin/sns/data/SnsUtilExt$Companion$setThrottleOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$setThrottleOnClickListener$1");
    }
}
