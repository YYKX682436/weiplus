package qz2;

/* loaded from: classes9.dex */
public final class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qz2.j1 f367838d;

    public a1(qz2.j1 j1Var) {
        this.f367838d = j1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        dialogInterface.dismiss();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletOpenTouchPayAfterPayFinishUIC", "showSuccessAlert, finish ui!");
        this.f367838d.getActivity().finish();
    }
}
