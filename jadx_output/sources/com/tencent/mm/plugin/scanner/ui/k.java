package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.n f159573d;

    public k(com.tencent.mm.plugin.scanner.ui.n nVar) {
        this.f159573d = nVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        if (motionEvent.getAction() == 0) {
            com.tencent.mm.plugin.scanner.ui.n nVar = this.f159573d;
            nVar.P.setVisibility(4);
            nVar.N.setMaxLines(2000);
            nVar.Q = true;
            com.tencent.mm.plugin.scanner.ui.m mVar = nVar.W;
            if (mVar != null) {
                java.lang.String str = nVar.f197780q;
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                com.tencent.mm.plugin.scanner.ui.v0 v0Var = (com.tencent.mm.plugin.scanner.ui.v0) mVar;
                if (str != null && str.length() > 0) {
                    v0Var.f159657a.A.put(str, bool);
                }
                com.tencent.mm.ui.base.preference.r rVar = ((com.tencent.mm.plugin.scanner.ui.v0) nVar.W).f159657a.f159309d;
                if (rVar != null) {
                    ((com.tencent.mm.ui.base.preference.h0) rVar).notifyDataSetChanged();
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/scanner/ui/DescriptionTextPreference$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
