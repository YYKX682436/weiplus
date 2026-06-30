package nc4;

/* loaded from: classes.dex */
public final class p implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final nc4.p f336169d = new nc4.p();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$3");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.improve.component.toolbar.ImproveToolBarUIC$onRequestPermissionsResult$3");
    }
}
