package gl4;

/* loaded from: classes11.dex */
public final class v implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f272884d;

    public v(android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f272884d = onCancelListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TingMembershipHelper", "showTipsDialog cancel");
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f272884d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
