package com.tencent.mm.plugin.mv.ui.shake;

/* loaded from: classes5.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew f150953d;

    public m(com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew) {
        this.f150953d = musicMainUINew;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.mv.ui.shake.MusicMainUINew musicMainUINew = this.f150953d;
        musicMainUINew.f150909o.startAnimation(android.view.animation.AnimationUtils.loadAnimation(musicMainUINew.getContext(), com.tencent.mm.R.anim.f477909ex));
    }
}
