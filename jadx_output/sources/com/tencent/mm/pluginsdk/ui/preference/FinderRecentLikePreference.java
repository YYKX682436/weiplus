package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes3.dex */
public final class FinderRecentLikePreference extends com.tencent.mm.ui.base.preference.Preference {
    public final java.lang.String L;
    public final java.util.List M;
    public r45.qw6 N;
    public android.view.View P;

    public FinderRecentLikePreference(android.content.Context context) {
        this(context, null);
    }

    public void M() {
        java.util.List list = this.M;
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            ((android.widget.ImageView) it.next()).setVisibility(8);
        }
        r45.qw6 qw6Var = this.N;
        if (qw6Var != null) {
            int size = qw6Var.getList(1).size();
            for (int i17 = 0; i17 < size && i17 < ((java.util.LinkedList) list).size(); i17++) {
                android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.LinkedList) list).get(i17);
                imageView.setVisibility(0);
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                com.tencent.mm.plugin.finder.assist.d8.f102092a.d(qw6Var.getList(1).get(i17), imageView);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        java.util.List list = this.M;
        ((java.util.LinkedList) list).clear();
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9p));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9q));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9r));
        ((java.util.LinkedList) list).add((android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9s));
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482920rt);
        java.lang.String str = this.L;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setText(str);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(this.f197770d, com.tencent.mm.R.dimen.f479786f7);
            textView.setLayoutParams(layoutParams);
        }
        M();
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.P == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.tencent.mm.R.layout.bze, viewGroup2);
            this.P = u17;
        }
        return this.P;
    }

    public FinderRecentLikePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FinderRecentLikePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = new java.util.LinkedList();
        this.N = null;
        this.L = context.getString(com.tencent.mm.R.string.f491240cg3);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
