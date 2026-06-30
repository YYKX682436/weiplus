package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ActionBarSearchView f210449d;

    public h(com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView) {
        this.f210449d = actionBarSearchView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.r rVar = com.tencent.mm.ui.tools.r.CLEAR;
        com.tencent.mm.ui.tools.ActionBarSearchView actionBarSearchView = this.f210449d;
        if (rVar == actionBarSearchView.f209964g) {
            actionBarSearchView.g(true);
            com.tencent.mm.ui.tools.q qVar = actionBarSearchView.f209968n;
            if (qVar != null) {
                qVar.v();
            }
        } else {
            actionBarSearchView.j(com.tencent.mm.ui.tools.r.VOICE_SEARCH);
            com.tencent.mm.ui.tools.q qVar2 = actionBarSearchView.f209968n;
            if (qVar2 != null) {
                qVar2.w();
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/tools/ActionBarSearchView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
