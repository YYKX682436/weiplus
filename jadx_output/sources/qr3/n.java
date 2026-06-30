package qr3;

/* loaded from: classes3.dex */
public final class n implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final qr3.n f366101d = new qr3.n();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("NewBizInfoSettingJsApiUIC", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
