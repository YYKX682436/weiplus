package gp3;

/* loaded from: classes3.dex */
public class x extends com.tencent.mm.ui.base.preference.Preference {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;
    public android.view.View.OnClickListener P;
    public java.util.List Q;

    public x(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.P = null;
        this.Q = new java.util.LinkedList();
        this.G = com.tencent.mm.R.layout.bwn;
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
        android.content.Context context;
        super.t(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.j_g);
        linearLayout.removeAllViews();
        if (this.Q == null) {
            return;
        }
        int size = (com.tencent.mm.sdk.platformtools.t8.K0(this.N) || this.P == null) ? this.Q.size() - 1 : this.Q.size();
        if (size == 0) {
            size = -1;
        }
        int i17 = 0;
        int i18 = 0;
        while (true) {
            int size2 = this.Q.size();
            context = this.f197770d;
            if (i17 >= size2) {
                break;
            }
            com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter mallOrderDetailObject$HelpCenter = (com.tencent.mm.plugin.order.model.MallOrderDetailObject$HelpCenter) this.Q.get(i17);
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            textView.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
            textView.setIncludeFontPadding(false);
            textView.setText(mallOrderDetailObject$HelpCenter.f152777d);
            textView.setTag(mallOrderDetailObject$HelpCenter);
            textView.setGravity(17);
            textView.setOnClickListener(this.M);
            if (i18 == size) {
                textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479206su));
            }
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
            if (i18 < size) {
                android.view.View view2 = new android.view.View(context);
                view2.setBackgroundColor(context.getResources().getColor(com.tencent.mm.R.color.a4m));
                linearLayout.addView(view2, new android.widget.LinearLayout.LayoutParams(i65.a.h(context, com.tencent.mm.R.dimen.f479639be), -1));
            }
            i18++;
            i17++;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.N) || this.P == null) {
            return;
        }
        android.widget.TextView textView2 = new android.widget.TextView(context);
        textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
        textView2.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479897ia));
        textView2.setIncludeFontPadding(false);
        textView2.setText(this.N);
        textView2.setGravity(17);
        textView2.setOnClickListener(this.P);
        if (i18 == size) {
            textView2.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.f479206su));
        }
        linearLayout.addView(textView2, new android.widget.LinearLayout.LayoutParams(0, -2, 1.0f));
    }
}
