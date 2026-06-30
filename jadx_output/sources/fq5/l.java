package fq5;

/* loaded from: classes5.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265675d;

    public l(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC) {
        this.f265675d = transferFileUIC;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean c17 = jq5.n.f301282a.c();
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265675d;
        if (c17) {
            jq5.b.f301255a.b().G("is_first_receive", false);
            transferFileUIC.U6();
        } else {
            v65.i.b(transferFileUIC.f214283o, null, new fq5.k(transferFileUIC, null), 1, null);
        }
        yj0.a.h(this, "com/tencent/mm/wedrop/ui/code/TransferFileUIC$onStatusChangedInner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
