package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public class TextPreference extends com.tencent.mm.ui.base.preference.Preference {
    public int L;
    public java.lang.CharSequence M;
    public android.widget.TextView N;
    public com.tencent.mm.ui.base.preference.t0 P;

    public TextPreference(android.content.Context context) {
        this(context, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.N = textView;
        if (textView != null) {
            textView.setText(this.M);
            this.N.setGravity(this.L);
        }
        com.tencent.mm.ui.base.preference.t0 t0Var = this.P;
        if (t0Var != null) {
            android.widget.TextView textView2 = this.N;
            com.tencent.mm.plugin.profile.l1 l1Var = (com.tencent.mm.plugin.profile.l1) t0Var;
            com.tencent.mm.plugin.profile.e0 e0Var = l1Var.f153521d;
            e0Var.f153420d.getResources().getDimension(com.tencent.mm.R.dimen.f479646bl);
            com.tencent.mm.ui.base.preference.TextPreference textPreference = l1Var.f153518a;
            android.widget.TextView textView3 = textPreference.N;
            if (textView3 != null) {
                textPreference.M = l1Var.f153519b;
                textPreference.L = 17;
                textView3.setGravity(17);
            }
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            com.tencent.mm.ui.MMActivity mMActivity = e0Var.f153420d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add("https://www.wechat.com/tpl/oversea/new/page/difference_of_users/index");
            ((ke0.e) xVar).sj(mMActivity, arrayList, l1Var.f153519b, l1Var.f153520c, textView2);
        }
        view.setImportantForAccessibility(android.text.TextUtils.isEmpty(this.N.getText()) ? 4 : 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public TextPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.tencent.mm.R.layout.c0d;
    }
}
