package fq5;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265666d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f265667e;

    public g(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC, android.graphics.Bitmap bitmap) {
        this.f265666d = transferFileUIC;
        this.f265667e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265666d;
        em.j4 j4Var = transferFileUIC.f214276e;
        if (j4Var != null) {
            if (j4Var.f254487l == null) {
                j4Var.f254487l = (android.widget.ImageView) j4Var.f254476a.findViewById(com.tencent.mm.R.id.uvr);
            }
            android.widget.ImageView imageView = j4Var.f254487l;
            if (imageView != null) {
                imageView.setImageBitmap(this.f265667e);
            }
        }
        com.tencent.mm.wedrop.ui.code.TransferFileUIC.T6(transferFileUIC, 4);
    }
}
