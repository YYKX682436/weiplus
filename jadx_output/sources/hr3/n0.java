package hr3;

/* loaded from: classes.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final hr3.n0 f283816d = new hr3.n0();

    public n0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.CharSequence text;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.ViewGroup viewGroup = it instanceof android.view.ViewGroup ? (android.view.ViewGroup) it : null;
        if (viewGroup == null) {
            return "";
        }
        if (viewGroup.findViewById(com.tencent.mm.R.id.nsc) == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(android.R.id.title);
            java.lang.CharSequence text2 = textView != null ? textView.getText() : null;
            if (text2 == null) {
                text2 = "";
            }
            sb6.append((java.lang.Object) text2);
            sb6.append(',');
            android.widget.TextView textView2 = (android.widget.TextView) viewGroup.findViewById(android.R.id.summary);
            text = textView2 != null ? textView2.getText() : null;
            sb6.append((java.lang.Object) (text != null ? text : ""));
            return sb6.toString();
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        android.widget.TextView textView3 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        java.lang.CharSequence text3 = textView3 != null ? textView3.getText() : null;
        if (text3 == null) {
            text3 = "";
        }
        sb7.append((java.lang.Object) text3);
        sb7.append(',');
        android.widget.TextView textView4 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nsg);
        java.lang.CharSequence text4 = textView4 != null ? textView4.getText() : null;
        if (text4 == null) {
            text4 = "";
        }
        sb7.append((java.lang.Object) text4);
        sb7.append(", ");
        android.widget.TextView textView5 = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.nsh);
        java.lang.CharSequence text5 = textView5 != null ? textView5.getText() : null;
        if (text5 == null) {
            text5 = "";
        }
        sb7.append((java.lang.Object) text5);
        if (!(r26.n0.u0(r26.i0.v(sb7.toString(), ",", "", false, 4, null)).toString().length() == 0)) {
            return "";
        }
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        android.widget.TextView textView6 = (android.widget.TextView) viewGroup.findViewById(android.R.id.title);
        java.lang.CharSequence text6 = textView6 != null ? textView6.getText() : null;
        if (text6 == null) {
            text6 = "";
        }
        sb8.append((java.lang.Object) text6);
        sb8.append(',');
        android.widget.TextView textView7 = (android.widget.TextView) viewGroup.findViewById(android.R.id.summary);
        text = textView7 != null ? textView7.getText() : null;
        sb8.append((java.lang.Object) (text != null ? text : ""));
        return sb8.toString();
    }
}
