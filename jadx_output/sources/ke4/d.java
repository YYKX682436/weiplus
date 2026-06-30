package ke4;

/* loaded from: classes4.dex */
public final class d implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ke4.d f307039d = new ke4.d();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper$showEditLiveAlert$1");
        dialogInterface.dismiss();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.util.livephoto.SnsLivePhotoUIHelper$showEditLiveAlert$1");
    }
}
