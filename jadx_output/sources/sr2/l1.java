package sr2;

/* loaded from: classes10.dex */
public final class l1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr2.o1 f411620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(sr2.o1 o1Var) {
        super(1);
        this.f411620d = o1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View layout = (android.view.View) obj;
        kotlin.jvm.internal.o.g(layout, "layout");
        if (zv2.l0.f476408i.b()) {
            android.widget.TextView textView = (android.widget.TextView) layout.findViewById(com.tencent.mm.R.id.olp);
            if (textView != null) {
                textView.setText(this.f411620d.getResources().getString(com.tencent.mm.R.string.f491277dd1));
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) layout.findViewById(com.tencent.mm.R.id.pnp);
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.square_play_regular);
            }
        }
        return jz5.f0.f302826a;
    }
}
