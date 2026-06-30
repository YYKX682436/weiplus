package n34;

/* loaded from: classes3.dex */
public final class l4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final n34.l4 f334674d = new n34.l4();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showCancelStarAlbert$2");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showCancelStarAlbert$2");
    }
}
