package com.tencent.mm.ui.base.preference;

/* loaded from: classes9.dex */
public class KeyValuePreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.TextView L;
    public android.widget.TextView M;
    public android.widget.LinearLayout N;
    public boolean P;
    public boolean Q;
    public boolean R;
    public java.lang.String S;
    public boolean T;
    public boolean U;
    public int V;
    public int W;
    public int X;
    public android.widget.ImageView Y;
    public android.graphics.drawable.Drawable Z;

    /* renamed from: l1, reason: collision with root package name */
    public int f197758l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.view.View f197759p0;

    /* renamed from: x0, reason: collision with root package name */
    public final java.util.List f197760x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f197761y0;

    public KeyValuePreference(android.content.Context context) {
        this(context, null);
    }

    public void M(android.view.View view) {
        ((java.util.LinkedList) this.f197760x0).add(view);
    }

    public void N() {
        ((java.util.LinkedList) this.f197760x0).clear();
    }

    public void O(boolean z17) {
        this.R = z17;
        if (z17) {
            this.H = com.tencent.mm.R.layout.f489294c10;
        }
    }

    public void Q(android.graphics.drawable.Drawable drawable) {
        this.Z = drawable;
    }

    public void R(int i17) {
        this.X = i17;
    }

    public void S(int i17) {
        this.f197758l1 = i17;
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setMaxLines(i17);
        }
    }

    public void T(boolean z17) {
        this.P = z17;
    }

    public void V(java.lang.String str) {
        this.S = str;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.widget.LinearLayout linearLayout;
        super.t(view);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m7k);
        this.f197759p0 = findViewById;
        if (this.f197772f != null) {
            findViewById.setOnClickListener(new com.tencent.mm.ui.base.preference.w(this));
        }
        this.L = (android.widget.TextView) view.findViewById(android.R.id.summary);
        this.N = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.nsc);
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setSingleLine(this.P);
            if (this.U) {
                this.N.setGravity(this.W);
            }
        }
        if (this.R) {
            this.H = com.tencent.mm.R.layout.f489294c10;
        }
        this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.S)) {
            this.M.setText(this.S);
        }
        android.widget.TextView textView2 = this.M;
        android.content.Context context = this.f197770d;
        if (textView2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            int i17 = this.f197761y0;
            if (i17 == 0) {
                i17 = i65.a.h(context, com.tencent.mm.R.dimen.f479786f7);
            }
            layoutParams2.width = i17;
            this.M.setLayoutParams(layoutParams2);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9o);
        this.Y = imageView;
        if (this.Z != null) {
            imageView.setVisibility(this.X);
            this.Y.setImageDrawable(this.Z);
        } else {
            imageView.setVisibility(8);
        }
        if (this.T && (linearLayout = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.cg7)) != null) {
            linearLayout.setGravity(this.V);
        }
        java.util.List<android.view.View> list = this.f197760x0;
        if (((java.util.LinkedList) list).size() > 0) {
            android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.nsc);
            linearLayout2.removeAllViews();
            for (android.view.View view2 : list) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view2.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(view2);
                }
                linearLayout2.addView(view2);
            }
        }
        if (this.Q) {
            android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.cg7);
            if (findViewById2 instanceof android.widget.LinearLayout) {
                ((android.widget.LinearLayout) findViewById2).setGravity(16);
            }
            android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.oct);
            if ((findViewById3 instanceof android.view.ViewGroup) && (layoutParams = findViewById3.getLayoutParams()) != null) {
                layoutParams.height = -2;
                findViewById3.setLayoutParams(layoutParams);
            }
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) this.M.getLayoutParams();
            layoutParams3.gravity = 48;
            layoutParams3.topMargin = i65.a.f(context, com.tencent.mm.R.dimen.f479688cn);
            this.M.setLayoutParams(layoutParams3);
            com.tencent.mm.ui.bk.s0(this.M.getPaint());
            this.M.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479850gz));
            this.L.setTextSize(0, i65.a.h(context, com.tencent.mm.R.dimen.f479850gz));
            this.L.setTextColor(i65.a.d(context, com.tencent.mm.R.color.ahj));
        }
        int i18 = this.f197758l1;
        if (i18 > 0) {
            this.L.setMaxLines(i18);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f197770d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.tencent.mm.R.layout.bzk, viewGroup2);
        return u17;
    }

    public KeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public KeyValuePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = true;
        this.Q = false;
        this.R = false;
        this.S = null;
        this.T = false;
        this.U = false;
        this.V = 17;
        this.W = 17;
        this.X = 0;
        this.Y = null;
        this.Z = null;
        this.f197760x0 = new java.util.LinkedList();
        this.G = com.tencent.mm.R.layout.byv;
    }
}
