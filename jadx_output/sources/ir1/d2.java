package ir1;

/* loaded from: classes3.dex */
public final class d2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final ir1.d2 f293956d = new ir1.d2();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("BizFans.BizFansSettingUI", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
