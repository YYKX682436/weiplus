package gp3;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;

    public q(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.G = com.tencent.mm.R.layout.bwd;
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
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.j_6);
        textView.setText(this.N);
        textView.setOnClickListener(this.M);
    }
}
