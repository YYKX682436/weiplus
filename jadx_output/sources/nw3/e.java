package nw3;

/* loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final nw3.e f340789d = new nw3.e();

    public e() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        java.lang.CharSequence text;
        java.lang.String obj2;
        java.lang.CharSequence text2;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        android.widget.TextView textView = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.axa);
        java.lang.String str2 = "";
        if (textView == null || (text2 = textView.getText()) == null || (str = text2.toString()) == null) {
            str = "";
        }
        sb6.append(str);
        if (sb6.length() > 0) {
            sb6.append(",");
        }
        android.widget.TextView textView2 = (android.widget.TextView) it.findViewById(com.tencent.mm.R.id.ax_);
        if (textView2 != null && (text = textView2.getText()) != null && (obj2 = text.toString()) != null) {
            str2 = obj2;
        }
        sb6.append(str2);
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }
}
