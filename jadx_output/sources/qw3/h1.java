package qw3;

/* loaded from: classes.dex */
public class h1 implements yz5.l {
    public h1(qw3.i1 i1Var) {
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (view != null && (view instanceof android.widget.TextView)) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getText() != null) {
                sb6.append(textView.getText());
            }
        }
        return sb6.toString();
    }
}
