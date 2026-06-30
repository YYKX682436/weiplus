package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView f151897d;

    public m0(com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView) {
        this.f151897d = musicMVCardChooseView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView musicMVCardChooseView = this.f151897d;
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.b(musicMVCardChooseView, 0);
        com.tencent.mm.plugin.mv.ui.view.MusicMVCardChooseView.a(musicMVCardChooseView, 0);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMVCardChooseView$initFinderBtnArea$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
