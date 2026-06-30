package com.tencent.mm.plugin.fts.ui.widget;

/* loaded from: classes12.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.ui.widget.v f138324d;

    public t(com.tencent.mm.plugin.fts.ui.widget.v vVar) {
        this.f138324d = vVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$voiceV3Btn$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.tools.r rVar = com.tencent.mm.ui.tools.r.VOICE_SEARCH;
        com.tencent.mm.plugin.fts.ui.widget.v vVar = this.f138324d;
        vVar.j(rVar);
        com.tencent.mm.ui.tools.q qVar = vVar.f209968n;
        if (qVar != null) {
            qVar.w();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSActionBarNewSearchView$voiceV3Btn$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
