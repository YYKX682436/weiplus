package com.tencent.mm.plugin.mv.ui.view;

/* loaded from: classes10.dex */
public final class d3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView f151810d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f151811e;

    public d3(com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView, android.view.View view) {
        this.f151810d = musicMvLyricView;
        this.f151811e = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.tencent.mm.plugin.mv.ui.view.MusicMvLyricView musicMvLyricView = this.f151810d;
        if (!musicMvLyricView.f151699y) {
            musicMvLyricView.f151699y = true;
            com.tencent.mm.view.recyclerview.WxRecyclerView wxRecyclerView = musicMvLyricView.lyricRv;
            if (wxRecyclerView != null) {
                wxRecyclerView.setFadingEdgeLength(0);
            }
            musicMvLyricView.f151690p.setFade(true);
        }
        android.view.View view = this.f151811e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$doInFadingAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/mv/ui/view/MusicMvLyricView$doInFadingAnimation$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        this.f151811e.invalidate();
    }
}
