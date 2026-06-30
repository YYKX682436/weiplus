package ie4;

/* loaded from: classes3.dex */
public final class b implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ie4.b f291004d = new ie4.b();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper$showCommitLoadingDialog$1");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.ui.widget.multi_image.util.MultiPicUIHelper$showCommitLoadingDialog$1");
    }
}
