package com.tencent.mm.ui.base.preference;

/* loaded from: classes11.dex */
public final class DialogPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final com.tencent.mm.ui.base.preference.i L;
    public com.tencent.mm.ui.base.preference.q0 M;
    public com.tencent.mm.ui.base.preference.k N;
    public com.tencent.mm.ui.widget.dialog.j0 P;

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void D(com.tencent.mm.ui.base.preference.q0 q0Var) {
        this.M = q0Var;
    }

    public void M() {
        android.content.Context context = this.f197770d;
        com.tencent.mm.ui.ListViewInScrollView listViewInScrollView = (com.tencent.mm.ui.ListViewInScrollView) android.view.View.inflate(context, com.tencent.mm.R.layout.byq, null);
        listViewInScrollView.setOnItemClickListener(new com.tencent.mm.ui.base.preference.j(this));
        listViewInScrollView.setAdapter((android.widget.ListAdapter) this.L);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211709a = this.f197774h.toString();
        aVar.L = listViewInScrollView;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        this.P = j0Var;
        j0Var.show();
        db5.e1.a(context, this.P);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        com.tencent.mm.ui.base.preference.i iVar = this.L;
        com.tencent.mm.ui.base.preference.g gVar = (com.tencent.mm.ui.base.preference.g) iVar.f197830i.get(iVar.f197829h);
        if (gVar != null) {
            H(gVar.f197801a);
        }
        super.t(view);
    }

    public DialogPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        com.tencent.mm.ui.base.preference.i iVar = new com.tencent.mm.ui.base.preference.i(context, 1);
        this.L = iVar;
        int i18 = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f447188f, i17, 0);
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        if (resourceId != -1) {
            iVar.f197827f = context.getResources().getStringArray(resourceId);
        }
        iVar.f197828g = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        if (iVar.f197827f == null) {
            iVar.f197827f = new java.lang.CharSequence[0];
        }
        if (iVar.f197828g == null) {
            iVar.f197828g = new java.lang.CharSequence[0];
        }
        iz5.a.g("entries count different", iVar.f197827f.length == iVar.f197828g.length);
        java.util.HashMap hashMap = iVar.f197830i;
        hashMap.clear();
        while (true) {
            java.lang.CharSequence[] charSequenceArr = iVar.f197828g;
            if (i18 >= charSequenceArr.length) {
                return;
            }
            java.lang.CharSequence charSequence = charSequenceArr[i18];
            hashMap.put(charSequence, new com.tencent.mm.ui.base.preference.g(charSequence, iVar.f197827f[i18], 1048576 + i18));
            i18++;
        }
    }
}
