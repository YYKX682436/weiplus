package pi2;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.b0 f354762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(pi2.b0 b0Var) {
        super(2);
        this.f354762d = b0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.widget.TextView textView;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        pi2.b0 b0Var = this.f354762d;
        b0Var.getClass();
        if (booleanValue) {
            android.view.View G = b0Var.G();
            textView = G instanceof android.widget.TextView ? (android.widget.TextView) G : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.f478494f));
                textView.setEnabled(true);
            }
        } else {
            android.view.View G2 = b0Var.G();
            textView = G2 instanceof android.widget.TextView ? (android.widget.TextView) G2 : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_2));
                textView.setEnabled(false);
            }
        }
        return jz5.f0.f302826a;
    }
}
