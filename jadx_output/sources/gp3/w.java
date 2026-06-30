package gp3;

/* loaded from: classes9.dex */
public class w extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public int M;
    public java.lang.String N;

    public w(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = Integer.MAX_VALUE;
        this.G = com.tencent.mm.R.layout.bwi;
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
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_e);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_d);
        textView.setText(this.f197774h);
        textView2.setText(this.N);
        int i17 = this.M;
        if (i17 != Integer.MAX_VALUE) {
            textView2.setTextColor(i17);
        }
    }
}
