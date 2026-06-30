package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes5.dex */
public final class i1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter f151870d;

    public i1(com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter) {
        this.f151870d = musicMvCommentFooter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("commentModeIv clicked, curEditMode:");
        com.tencent.mm.plugin.mv.ui.view.MusicMvCommentFooter musicMvCommentFooter = this.f151870d;
        sb6.append(musicMvCommentFooter.f151650g);
        com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", sb6.toString());
        int i17 = 202;
        if (musicMvCommentFooter.f151650g == 202) {
            com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "onlyShowVKB");
            i17 = 201;
            musicMvCommentFooter.f151651h = 201;
            android.content.Context context = musicMvCommentFooter.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).showVKB();
        } else {
            com.tencent.mars.xlog.Log.i("Music.MusicMvCommentFooter", "onlyShowSmilePanel");
            musicMvCommentFooter.f151651h = 202;
            android.content.Context context2 = musicMvCommentFooter.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context2).hideVKB();
        }
        musicMvCommentFooter.f151650g = i17;
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/MusicMvCommentFooter$initEmojiBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
