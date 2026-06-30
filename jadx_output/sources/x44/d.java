package x44;

/* loaded from: classes4.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x44.g f451809d;

    public d(x44.g gVar) {
        this.f451809d = gVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$2");
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("SnsAdJs.Download", "the user cancel the download");
        x44.g gVar = this.f451809d;
        gVar.b(w44.d.k(gVar, -1, "cancel", null, 4, null));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.AddDownloadTaskStraight$doAction$3$2");
    }
}
