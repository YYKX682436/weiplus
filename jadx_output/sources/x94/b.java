package x94;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI f452726d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f452727e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f452728f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f452729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f452730h;

    public b(com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI snsCoverFinderPreviewUI, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i17, int i18, int i19) {
        this.f452726d = snsCoverFinderPreviewUI;
        this.f452727e = finderObject;
        this.f452728f = i17;
        this.f452729g = i18;
        this.f452730h = i19;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI snsCoverFinderPreviewUI = this.f452726d;
        snsCoverFinderPreviewUI.setResult(-1, snsCoverFinderPreviewUI.getIntent());
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct A = s0Var.A();
        n30.r rVar = (n30.r) i95.n0.c(n30.r.class);
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f452727e;
        long id6 = finderObject.getId();
        ((m30.m) rVar).getClass();
        A.f60516g = A.b("FinderFeedID", b52.b.q(id6), true);
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverPostStruct A2 = s0Var.A();
        int i17 = this.f452728f;
        A2.f60514e = i17;
        int i18 = this.f452729g;
        if (i18 != 0) {
            s0Var.A().f60513d = i18;
        } else {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
            int i19 = this.f452730h;
            if (i19 == 1) {
                s0Var.V.f60513d = 7;
            } else if (i19 == 2) {
                s0Var.V.f60513d = 6;
            } else if (i19 == 3) {
                s0Var.V.f60513d = 4;
            } else if (i19 == 4) {
                s0Var.V.f60513d = 5;
            } else if (i19 == 5) {
                s0Var.V.f60513d = 3;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setSnsCoverPostSelectTabType", "com.tencent.mm.plugin.sns.statistics.SnsReportHelper");
        }
        com.tencent.mm.autogen.mmdata.rpt.SnsCoverActionStruct z17 = s0Var.z();
        n30.r rVar2 = (n30.r) i95.n0.c(n30.r.class);
        long id7 = finderObject.getId();
        ((m30.m) rVar2).getClass();
        z17.f60512h = z17.b("FinderFeedID", b52.b.q(id7), true);
        s0Var.z().f60509e = i17;
        snsCoverFinderPreviewUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/sns/cover/edit/SnsCoverFinderPreviewUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.cover.edit.SnsCoverFinderPreviewUI$onCreate$2");
    }
}
