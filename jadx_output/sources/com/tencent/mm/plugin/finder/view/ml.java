package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ml implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f132668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.nl f132669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.tr f132670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.pl f132671g;

    public ml(int i17, com.tencent.mm.plugin.finder.view.nl nlVar, com.tencent.mm.plugin.finder.view.tr trVar, com.tencent.mm.plugin.finder.view.pl plVar) {
        this.f132668d = i17;
        this.f132669e = nlVar;
        this.f132670f = trVar;
        this.f132671g = plVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.view.tr trVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderSubtitleSettingBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.nl nlVar = this.f132669e;
        int i17 = nlVar.f132720d;
        int i18 = this.f132668d;
        if (i18 != i17) {
            java.util.List list = nlVar.f132721e;
            if (list != null && (trVar = (com.tencent.mm.plugin.finder.view.tr) kz5.n0.a0(list, i17)) != null) {
                trVar.f133150c = false;
                nlVar.notifyItemChanged(nlVar.f132720d);
            }
            com.tencent.mm.plugin.finder.view.tr trVar2 = this.f132670f;
            trVar2.f133150c = true;
            nlVar.notifyItemChanged(i18);
            nlVar.f132720d = i18;
            com.tencent.mm.plugin.finder.view.sr srVar = nlVar.f132722f;
            com.tencent.mm.plugin.finder.view.pl plVar = this.f132671g;
            if (srVar != null) {
                srVar.a(trVar2, plVar.f132848a);
            }
            ((com.tencent.mm.ui.widget.dialog.a4) ((jz5.n) plVar.f132849b).getValue()).dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderSubtitleSettingBottomSheet$RecycleViewAdapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
