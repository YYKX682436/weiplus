package ju1;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final ju1.m f301762d = new ju1.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bvx);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.bvr);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.bvv);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(textView.getText());
        sb6.append(textView2.getText());
        kotlin.jvm.internal.o.d(viewGroup);
        com.tencent.mm.accessibility.base.MapExpandKt.visitChild(viewGroup, new ju1.l(sb6));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
