package si1;

/* loaded from: classes7.dex */
public final class n1 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.d9 f408277d;

    public n1(com.tencent.mm.sdk.platformtools.d9 d9Var) {
        this.f408277d = d9Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.content.DialogInterface.OnClickListener onClickListener = this.f408277d.f192543g;
        if (onClickListener != null) {
            onClickListener.onClick(dialogInterface, -2);
        }
    }
}
