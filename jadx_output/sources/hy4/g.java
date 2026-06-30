package hy4;

/* loaded from: classes3.dex */
public final class g implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public static final hy4.g f286102d = new hy4.g();

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        try {
            dialogInterface.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ToastUtil", "showProgressDlg onCancel exp: %s ", e17.getLocalizedMessage());
        }
    }
}
