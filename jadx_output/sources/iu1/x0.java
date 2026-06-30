package iu1;

/* loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final iu1.x0 f294977d = new iu1.x0();

    public x0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        kotlin.jvm.internal.o.g(view, "view");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.byr);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.byo);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) textView.getText());
        sb6.append((java.lang.Object) textView2.getText());
        return sb6.toString();
    }
}
