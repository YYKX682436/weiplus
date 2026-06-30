package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151906d;

    public n0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151906d = musicMVCardChooseView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151906d;
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.b(musicMVCardChooseView, 1);
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.a(musicMVCardChooseView, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
