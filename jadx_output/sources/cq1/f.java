package cq1;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.p00 f221350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI f221351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.r00 f221352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dq1.b f221353g;

    public f(r45.p00 p00Var, com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI, r45.r00 r00Var, dq1.b bVar) {
        this.f221350d = p00Var;
        this.f221351e = bizComSchIntermediateUI;
        this.f221352f = r00Var;
        this.f221353g = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = this.f221350d.f382643d;
        cq1.b[] bVarArr = cq1.b.f221328d;
        com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI bizComSchIntermediateUI = this.f221351e;
        if (i17 == 2) {
            com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.T6(bizComSchIntermediateUI, this.f221352f, this.f221353g);
        } else {
            cq1.b[] bVarArr2 = cq1.b.f221328d;
            if (i17 == 1) {
                int i18 = com.tencent.mm.plugin.biz.scheme.BizComSchIntermediateUI.f93872v;
                bizComSchIntermediateUI.a7();
            } else {
                bizComSchIntermediateUI.Z6();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/biz/scheme/BizComSchIntermediateUI$initBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
