package rr3;

/* loaded from: classes3.dex */
public final class y implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final rr3.y f399220d = new rr3.y();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NewBizInfoSettingJsApiUIC", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
