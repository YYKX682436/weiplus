package ja4;

/* loaded from: classes.dex */
public class a implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Dialog f298618d;

    public a(android.app.Dialog dialog) {
        this.f298618d = dialog;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsLuckyCommentAlertUI", "showTipsDialog onCancel");
        android.app.Dialog dialog = this.f298618d;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCancel", "com.tencent.mm.plugin.sns.lucky.ui.SnsLuckyCommentAlertUI$1");
    }
}
