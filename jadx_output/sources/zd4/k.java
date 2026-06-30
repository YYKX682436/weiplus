package zd4;

/* loaded from: classes4.dex */
public class k implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI f471636d;

    public k(com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI baseSelectVisibleRangeUI) {
        this.f471636d = baseSelectVisibleRangeUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$8");
        this.f471636d.m7();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI$8");
    }
}
