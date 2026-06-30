package n34;

/* loaded from: classes3.dex */
public final class k4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f334655d;

    public k4(yz5.a aVar) {
        this.f334655d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showCancelStarAlbert$1");
        dialogInterface.dismiss();
        this.f334655d.invoke();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.SnsStarUIHelper$showCancelStarAlbert$1");
    }
}
