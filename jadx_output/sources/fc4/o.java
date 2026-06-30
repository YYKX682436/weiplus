package fc4;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fc4.p f261189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f261191f;

    public o(fc4.p pVar, java.lang.String str, android.widget.LinearLayout linearLayout) {
        this.f261189d = pVar;
        this.f261190e = str;
        this.f261191f = linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealSecondCutJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dw3.c cVar = dw3.c.f244181a;
        fc4.p pVar = this.f261189d;
        boolean b17 = cVar.b(pVar.getContext(), "com.tencent.phoenix", "A24DC0755072F64C480DC06DCD3412BF");
        int i17 = b17 ? com.tencent.mm.R.string.f490414ub : com.tencent.mm.R.string.f490413ua;
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        java.lang.String str = pVar.f261197i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMPublishId$p", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC");
        s0Var.e(str, 2);
        db5.e1.j(pVar.getContext(), i17, com.tencent.mm.R.string.f490573yv, com.tencent.mm.R.string.f490507x1, com.tencent.mm.R.string.f490347sg, new fc4.m(b17, this.f261190e, pVar), new fc4.n(this.f261191f, pVar));
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/flexible/FlexibleSameStyleUIC$dealSecondCutJumpClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.flexible.FlexibleSameStyleUIC$dealSecondCutJumpClick$1");
    }
}
