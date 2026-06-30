package n14;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n14.k f334149d = new n14.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.hsx);
        java.lang.CharSequence text = textView != null ? textView.getText() : null;
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.qqs);
        java.lang.CharSequence text2 = textView2 != null ? textView2.getText() : null;
        if (text2 == null || r26.n0.N(text2)) {
            return java.lang.String.valueOf(text);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append((java.lang.Object) text);
        sb6.append(',');
        sb6.append((java.lang.Object) text2);
        return sb6.toString();
    }
}
