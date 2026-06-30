package gp3;

/* loaded from: classes9.dex */
public class u extends com.tencent.mm.ui.base.preference.Preference {
    public static int S;
    public android.view.View L;
    public com.tencent.mm.ui.base.preference.r M;
    public java.lang.String N;
    public java.lang.String[] P;
    public android.text.TextUtils.TruncateAt Q;
    public boolean R;

    public u(android.content.Context context) {
        super(context);
        this.L = null;
        this.R = false;
        this.G = com.tencent.mm.R.layout.bwf;
        S = context.getResources().getColor(com.tencent.mm.R.color.f479383xz);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_b);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_a);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.j__);
        textView.setText(this.f197774h);
        java.lang.String[] strArr = this.P;
        if (strArr == null || strArr.length <= 1) {
            textView2.setTextColor(S);
        } else {
            textView2.setOnClickListener(new gp3.t(this, textView2, linearLayout));
        }
        textView2.setText(this.N);
    }
}
