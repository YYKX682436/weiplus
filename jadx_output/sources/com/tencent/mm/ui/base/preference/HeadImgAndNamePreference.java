package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public final class HeadImgAndNamePreference extends com.tencent.mm.ui.base.preference.Preference {
    public final int L;
    public android.widget.ImageView M;
    public android.view.View N;
    public android.widget.TextView P;
    public java.lang.String Q;
    public boolean R;
    public boolean S;
    public com.tencent.mm.ui.base.preference.p T;

    public HeadImgAndNamePreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        if (this.M == null) {
            this.M = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.h9k);
        }
        if (this.P == null) {
            this.P = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kc6);
        }
        if (this.N == null) {
            this.N = view.findViewById(com.tencent.mm.R.id.f485856jc0);
        }
        java.lang.String str = this.Q;
        if (str != null) {
            com.tencent.mm.ui.base.preference.p pVar = this.T;
            if (pVar != null) {
                ((com.tencent.mm.plugin.finder.ui.ah) pVar).a(str, this.M, this.R);
            } else if (this.R) {
                ng5.a.b(this.M, str);
            } else {
                ng5.a.a(this.M, str);
            }
            this.Q = null;
        }
        if (this.S) {
            this.P.setVisibility(8);
            android.view.View view2 = this.N;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            boolean z17 = this.R;
            android.content.Context context = this.f197770d;
            if (z17) {
                this.N.setBackground(context.getDrawable(com.tencent.mm.R.drawable.azb));
            } else {
                this.N.setBackground(context.getDrawable(com.tencent.mm.R.drawable.az_));
            }
        } else {
            android.view.View view3 = this.N;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/base/preference/HeadImgAndNamePreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.P.setVisibility(0);
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
        android.view.View.inflate(this.f197770d, com.tencent.mm.R.layout.bzb, viewGroup2);
        this.M = (android.widget.ImageView) u17.findViewById(com.tencent.mm.R.id.h9k);
        this.N = u17.findViewById(com.tencent.mm.R.id.f485857jc1);
        this.P = (android.widget.TextView) u17.findViewById(com.tencent.mm.R.id.f484050cu2);
        return u17;
    }

    public HeadImgAndNamePreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = -1;
        this.S = false;
        this.T = null;
        this.G = com.tencent.mm.R.layout.byv;
    }
}
