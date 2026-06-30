package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes3.dex */
public final class b3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151785d;

    public b3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView) {
        this.f151785d = musicMvLyricView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$bindSongInfoData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView.a(this.f151785d);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$bindSongInfoData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
