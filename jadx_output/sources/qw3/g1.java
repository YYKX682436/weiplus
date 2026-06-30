package qw3;

/* loaded from: classes.dex */
public class g1 implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw3.i1 f367160d;

    public g1(qw3.i1 i1Var) {
        this.f367160d = i1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.jly);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(android.R.id.summary);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (textView != null && textView.getText() != null) {
            sb6.append(textView.getText());
        }
        if (textView2 != null && textView2.getText() != null) {
            sb6.append(textView2.getText());
        }
        qw3.i1 i1Var = this.f367160d;
        if (findViewById != null && findViewById.getTag() != null) {
            if (findViewById.getTag().equals("radio_on")) {
                sb6.append(",");
                sb6.append(i1Var.getString(com.tencent.mm.R.string.g6m));
            }
            if (findViewById.getTag().equals("radio_off")) {
                sb6.append(",");
                sb6.append(i1Var.getString(com.tencent.mm.R.string.kkx));
            }
        }
        sb6.append(i1Var.getString(com.tencent.mm.R.string.apw));
        return sb6.toString();
    }
}
