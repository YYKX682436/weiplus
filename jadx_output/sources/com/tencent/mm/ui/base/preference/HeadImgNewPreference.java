package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public final class HeadImgNewPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final int L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.view.View P;
    public java.lang.String Q;
    public boolean R;
    public android.view.View.OnClickListener S;
    public boolean T;
    public com.tencent.mm.ui.base.preference.q U;

    public HeadImgNewPreference(android.content.Context context) {
        this(context, null);
    }

    public void M(java.lang.String str) {
        this.Q = null;
        android.widget.ImageView imageView = this.M;
        if (imageView != null) {
            com.tencent.mm.ui.base.preference.q qVar = this.U;
            if (qVar != null) {
                ((com.tencent.mm.plugin.finder.ui.pg) qVar).a(str, imageView, this.R);
            } else if (this.R) {
                ng5.a.b(imageView, str);
            } else {
                ng5.a.a(imageView, str);
            }
        } else {
            this.Q = str;
        }
        if (str == null) {
            this.T = false;
        } else {
            this.T = true;
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.M == null) {
            this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9k);
        }
        if (this.N == null) {
            this.N = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kc6);
        }
        if (this.P == null) {
            this.P = view.findViewById(com.tencent.mm.R.id.f485856jc0);
        }
        android.view.View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            this.P.setOnClickListener(onClickListener);
        }
        java.lang.String str = this.Q;
        if (str != null) {
            com.tencent.mm.ui.base.preference.q qVar = this.U;
            if (qVar != null) {
                ((com.tencent.mm.plugin.finder.ui.pg) qVar).a(str, this.M, this.R);
            } else if (this.R) {
                ng5.a.b(this.M, str);
            } else {
                ng5.a.a(this.M, str);
            }
            this.Q = null;
        }
        if (this.T) {
            this.N.setVisibility(8);
            android.view.View view2 = this.P;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = this.R;
            android.content.Context context = this.f197770d;
            if (z17) {
                this.P.setBackground(context.getDrawable(com.tencent.mm.R.drawable.azb));
            } else {
                this.P.setBackground(context.getDrawable(com.tencent.mm.R.drawable.az_));
            }
        } else {
            android.view.View view3 = this.P;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/base/preference/HeadImgNewPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.N.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) view.findViewById(com.tencent.mm.R.id.jlx);
        int i17 = this.L;
        if (i17 != -1) {
            relativeLayout.setMinimumHeight(i17);
        }
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.tencent.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bza, viewGroup2);
        this.M = (android.widget.ImageView) u17.findViewById(com.tencent.mm.R.id.h9k);
        this.N = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.kc6);
        this.P = u17.findViewById(com.tencent.mm.R.id.f485856jc0);
        return u17;
    }

    public HeadImgNewPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HeadImgNewPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        this.T = false;
        this.U = null;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
