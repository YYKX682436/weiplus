package fq5;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265665d;

    public f(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC) {
        this.f265665d = transferFileUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView;
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265665d;
        em.j4 j4Var = transferFileUIC.f214276e;
        com.tencent.mm.ui.widget.button.WeButton weButton = null;
        if (j4Var != null) {
            if (j4Var.f254477b == null) {
                j4Var.f254477b = (android.widget.TextView) j4Var.f254476a.findViewById(com.tencent.mm.R.id.f485453u84);
            }
            textView = j4Var.f254477b;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(transferFileUIC.getContext().getString(com.tencent.mm.R.string.nms));
        }
        em.j4 j4Var2 = transferFileUIC.f214276e;
        if (j4Var2 != null) {
            if (j4Var2.f254486k == null) {
                j4Var2.f254486k = (com.tencent.mm.ui.widget.button.WeButton) j4Var2.f254476a.findViewById(com.tencent.mm.R.id.f485450u81);
            }
            weButton = j4Var2.f254486k;
        }
        if (weButton != null) {
            weButton.setText(transferFileUIC.getContext().getString(com.tencent.mm.R.string.nmr));
        }
        em.j4 j4Var3 = transferFileUIC.f214276e;
        if (j4Var3 != null) {
            if (j4Var3.f254486k == null) {
                j4Var3.f254486k = (com.tencent.mm.ui.widget.button.WeButton) j4Var3.f254476a.findViewById(com.tencent.mm.R.id.f485450u81);
            }
            com.tencent.mm.ui.widget.button.WeButton weButton2 = j4Var3.f254486k;
            if (weButton2 != null) {
                weButton2.setOnClickListener(new fq5.e(transferFileUIC));
            }
        }
    }
}
