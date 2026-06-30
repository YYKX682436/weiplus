package fq5;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wedrop.ui.code.TransferFileUIC f265658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.code.CodeItemView f265659e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC, com.tencent.mm.ui.widget.code.CodeItemView codeItemView) {
        super(2);
        this.f265658d = transferFileUIC;
        this.f265659e = codeItemView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        kotlin.jvm.internal.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = this.f265658d;
        transferFileUIC.f214277f = booleanValue;
        if (expandContainer.getChildCount() == 0) {
            com.tencent.mm.ui.widget.code.CodeItemView codeItemView = this.f265659e;
            android.view.View inflate = android.view.LayoutInflater.from(codeItemView.getContext()).inflate(com.tencent.mm.R.layout.equ, (android.view.ViewGroup) null);
            transferFileUIC.f214275d = inflate;
            if (inflate != null) {
                inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                transferFileUIC.f214276e = new em.j4(inflate);
                expandContainer.addView(inflate);
                int dimension = (int) codeItemView.getResources().getDimension(com.tencent.mm.R.dimen.f479693cs);
                int dimension2 = (int) codeItemView.getResources().getDimension(com.tencent.mm.R.dimen.f479688cn);
                expandContainer.setPadding(dimension2, dimension, dimension2, dimension);
            }
            if (booleanValue && transferFileUIC.f214278g == null) {
                transferFileUIC.U6();
            }
        }
        return jz5.f0.f302826a;
    }
}
