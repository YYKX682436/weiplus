package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes4.dex */
public final class SnsPreference extends com.tencent.mm.ui.base.preference.Preference implements com.tencent.mm.ui.base.preference.s {
    public final java.lang.String L;
    public android.widget.LinearLayout M;
    public com.tencent.mm.ui.widget.QDisFadeImageView N;
    public com.tencent.mm.ui.widget.QDisFadeImageView P;
    public com.tencent.mm.ui.widget.QDisFadeImageView Q;
    public com.tencent.mm.ui.widget.QDisFadeImageView R;
    public android.widget.ImageView S;
    public android.widget.ImageView T;
    public android.widget.ImageView U;
    public android.widget.ImageView V;
    public com.tencent.mm.storage.s7 W;
    public final int X;
    public final com.tencent.mm.ui.MMActivity Y;
    public final java.util.List Z;

    /* renamed from: p0, reason: collision with root package name */
    public final y35.e0 f191072p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.view.View f191073x0;

    public SnsPreference(android.content.Context context) {
        this(context, null);
        this.Y = (com.tencent.mm.ui.MMActivity) context;
    }

    public void M(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.storage.k4) c01.d9.b().q()).n(str, true);
        com.tencent.mm.storage.s7 s7Var = com.tencent.mm.storage.s7.f195303g;
        if (n17 != null && ((int) n17.E2) > 0 && n17.r2()) {
            this.W = s7Var;
        } else if (str.equals(c01.z1.r())) {
            this.W = s7Var;
        } else {
            this.W = com.tencent.mm.storage.s7.f195304h;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new y35.d0(this, str));
    }

    public void N(java.util.List list) {
        if (this.M != null) {
            if (list.isEmpty()) {
                this.M.setVisibility(8);
            } else {
                this.M.setVisibility(0);
            }
        }
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView = this.N;
        if (qDisFadeImageView != null) {
            qDisFadeImageView.setImageResource(com.tencent.mm.R.color.aaw);
            this.N.setVisibility(8);
        }
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView2 = this.P;
        if (qDisFadeImageView2 != null) {
            qDisFadeImageView2.setImageResource(com.tencent.mm.R.color.aaw);
            this.P.setVisibility(8);
        }
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView3 = this.Q;
        if (qDisFadeImageView3 != null) {
            qDisFadeImageView3.setImageResource(com.tencent.mm.R.color.aaw);
            this.Q.setVisibility(8);
        }
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView4 = this.R;
        if (qDisFadeImageView4 != null) {
            qDisFadeImageView4.setImageResource(com.tencent.mm.R.color.aaw);
            this.R.setVisibility(8);
        }
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView5 = this.N;
        com.tencent.mm.ui.MMActivity mMActivity = this.Y;
        if (qDisFadeImageView5 != null && list.size() >= 1) {
            this.N.setVisibility(0);
            if (fp.i.b()) {
                ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).e0((r45.jj4) list.get(0), this.N, mMActivity.hashCode(), this.W);
                this.S.setVisibility(((r45.jj4) list.get(0)).f377856e == 6 ? 0 : 8);
            } else {
                this.N.setImageResource(com.tencent.mm.R.drawable.bkq);
                this.S.setVisibility(8);
            }
        }
        if (this.P != null && list.size() >= 2) {
            this.P.setVisibility(0);
            if (fp.i.b()) {
                ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).e0((r45.jj4) list.get(1), this.P, mMActivity.hashCode(), this.W);
                this.T.setVisibility(((r45.jj4) list.get(1)).f377856e == 6 ? 0 : 8);
            } else {
                this.P.setImageResource(com.tencent.mm.R.drawable.bkq);
            }
        }
        if (this.Q != null && list.size() >= 3) {
            this.Q.setVisibility(0);
            if (fp.i.b()) {
                ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).e0((r45.jj4) list.get(2), this.Q, mMActivity.hashCode(), this.W);
                this.U.setVisibility(((r45.jj4) list.get(2)).f377856e == 6 ? 0 : 8);
            } else {
                this.Q.setImageResource(com.tencent.mm.R.drawable.bkq);
            }
        }
        if (this.R == null || list.size() < 4) {
            return;
        }
        this.R.setVisibility(0);
        if (!fp.i.b()) {
            this.R.setImageResource(com.tencent.mm.R.drawable.bkq);
        } else {
            ((com.tencent.mm.plugin.sns.model.i1) p94.w0.d()).e0((r45.jj4) list.get(3), this.R, mMActivity.hashCode(), this.W);
            this.V.setVisibility(((r45.jj4) list.get(3)).f377856e == 6 ? 0 : 8);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.u3y);
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView = (com.tencent.mm.ui.widget.QDisFadeImageView) view.findViewById(com.tencent.mm.R.id.h9p);
        this.N = qDisFadeImageView;
        int i17 = this.X;
        qDisFadeImageView.setAlpha(i17);
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView2 = this.N;
        y35.e0 e0Var = this.f191072p0;
        qDisFadeImageView2.setImageDrawable(e0Var);
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView3 = (com.tencent.mm.ui.widget.QDisFadeImageView) view.findViewById(com.tencent.mm.R.id.h9q);
        this.P = qDisFadeImageView3;
        qDisFadeImageView3.setAlpha(i17);
        this.P.setImageDrawable(e0Var);
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView4 = (com.tencent.mm.ui.widget.QDisFadeImageView) view.findViewById(com.tencent.mm.R.id.h9r);
        this.Q = qDisFadeImageView4;
        qDisFadeImageView4.setAlpha(i17);
        this.Q.setImageDrawable(e0Var);
        com.tencent.mm.ui.widget.QDisFadeImageView qDisFadeImageView5 = (com.tencent.mm.ui.widget.QDisFadeImageView) view.findViewById(com.tencent.mm.R.id.h9s);
        this.R = qDisFadeImageView5;
        qDisFadeImageView5.setAlpha(i17);
        this.R.setImageDrawable(e0Var);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f482920rt);
        java.lang.String str = this.L;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.content.Context context = this.f197770d;
        if (!K0) {
            textView.setText(str);
            com.tencent.mm.ui.fk.b(textView);
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = i65.a.h(context, com.tencent.mm.R.dimen.f479786f7);
            textView.setLayoutParams(layoutParams);
        }
        this.S = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nat);
        this.T = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nau);
        this.U = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.nav);
        this.V = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.naw);
        this.S.setVisibility(8);
        this.T.setVisibility(8);
        this.U.setVisibility(8);
        this.V.setVisibility(8);
        java.util.List list = this.Z;
        N(list);
        if (list == null) {
            return;
        }
        java.lang.String string = context.getString(com.tencent.mm.R.string.hng, java.lang.Integer.valueOf(((java.util.LinkedList) list).size()));
        if (str == null) {
            view.setContentDescription(string);
            return;
        }
        view.setContentDescription(str + string);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        if (this.f191073x0 == null) {
            android.view.View u17 = super.u(viewGroup);
            android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
            viewGroup2.removeAllViews();
            layoutInflater.inflate(com.tencent.mm.R.layout.bz_, viewGroup2);
            this.f191073x0 = u17;
        }
        return this.f191073x0;
    }

    public SnsPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        this.Y = (com.tencent.mm.ui.MMActivity) context;
    }

    public SnsPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = "";
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.X = 255;
        this.Z = new java.util.LinkedList();
        this.f191072p0 = new y35.e0();
        this.Y = (com.tencent.mm.ui.MMActivity) context;
        this.L = context.getString(com.tencent.mm.R.string.bhd);
        this.G = com.tencent.mm.R.layout.byv;
    }
}
