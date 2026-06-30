package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ke implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.oe f134959d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f134960e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f134961f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134962g;

    public ke(com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar, android.widget.TextView textView, kotlin.jvm.internal.h0 h0Var, java.lang.String str) {
        this.f134959d = oeVar;
        this.f134960e = textView;
        this.f134961f = h0Var;
        this.f134962g = str;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        r45.u25 u25Var = (r45.u25) obj;
        java.lang.String str2 = this.f134962g;
        com.tencent.mm.plugin.finder.viewmodel.component.oe oeVar = this.f134959d;
        kotlin.jvm.internal.h0 h0Var = this.f134961f;
        if (u25Var != null) {
            oeVar.f135470o = u25Var;
            if (!android.text.TextUtils.isEmpty(u25Var.getString(0))) {
                r45.u25 u25Var2 = oeVar.f135470o;
                if (u25Var2 == null || (str = u25Var2.getString(0)) == null) {
                    str = "";
                }
            } else if (android.text.TextUtils.isEmpty(u25Var.getString(1)) || android.text.TextUtils.isEmpty(u25Var.getString(2))) {
                str = str2;
            } else {
                str = u25Var.getString(1) + " - " + u25Var.getString(2);
                kotlin.jvm.internal.o.d(str);
            }
            h0Var.f310123d = str;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            h0Var.f310123d = str2;
        }
        float dimension = oeVar.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479850gz);
        android.widget.TextView textView = this.f134960e;
        textView.setTextSize(0, dimension);
        textView.setText((java.lang.CharSequence) h0Var.f310123d);
        textView.requestLayout();
    }
}
