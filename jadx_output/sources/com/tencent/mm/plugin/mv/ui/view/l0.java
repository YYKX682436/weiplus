package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151888d;

    public l0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151888d = musicMVCardChooseView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151888d;
        com.tencent.mm.plugin.mv.ui.view.b0 b0Var = musicMVCardChooseView.G;
        musicMVCardChooseView.n();
        if (musicMVCardChooseView.h()) {
            musicMVCardChooseView.o();
        } else {
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView2 = this.f151888d;
            com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.j(musicMVCardChooseView2, false, null, new com.tencent.mm.plugin.mv.ui.view.k0(musicMVCardChooseView2), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initEditView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
