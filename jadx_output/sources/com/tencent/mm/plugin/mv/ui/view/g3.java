package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class g3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151832d;

    public g3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151832d = musicMvLyricView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.z2 eventListener = this.f151832d.getEventListener();
        if (eventListener != null) {
            ((com.tencent.mm.plugin.mv.ui.uic.j1) eventListener).f151214a.S6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$prepareViews$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
