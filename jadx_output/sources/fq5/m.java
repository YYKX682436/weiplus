package fq5;

/* loaded from: classes5.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265676d;

    public m(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC) {
        this.f265676d = transferFileUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265676d;
        if (transferFileUIC.f214278g != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "loadQrcode() called");
            transferFileUIC.V6(3);
            v65.i.b(transferFileUIC.f214283o, null, new fq5.h(transferFileUIC, null), 1, null);
        } else {
            transferFileUIC.U6();
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
