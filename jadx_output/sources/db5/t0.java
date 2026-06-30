package db5;

/* loaded from: classes8.dex */
public class t0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnClickListener f228515d;

    public t0(android.content.DialogInterface.OnClickListener onClickListener) {
        this.f228515d = onClickListener;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f228515d;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, 0);
        }
    }
}
