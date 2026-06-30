package hk5;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hk5.k f282001d;

    public d(hk5.k kVar) {
        this.f282001d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        hk5.k kVar = this.f282001d;
        kVar.f343068e = 1;
        com.tencent.mm.ui.widget.dialog.y1 y1Var = new com.tencent.mm.ui.widget.dialog.y1(kVar.getContext());
        android.view.View inflate = android.view.View.inflate(kVar.getContext(), com.tencent.mm.R.layout.d1g, null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.oe_);
        if (com.tencent.mm.sdk.platformtools.m2.j()) {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgl);
        } else {
            imageView.setImageResource(com.tencent.mm.R.drawable.cgm);
        }
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.oed)).setOnClickListener(new hk5.h(y1Var));
        y1Var.k(inflate);
        y1Var.s();
        yj0.a.h(this, "com/tencent/mm/ui/transmit/uic/preview/ForwardMsgPreviewAppBrandUIC$onCreate$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
