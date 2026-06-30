package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC f151484d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC) {
        super(1);
        this.f151484d = musicMvMainUIC;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = this.f151484d;
        com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "ret delete mv finished");
        int i17 = musicMvMainUIC.f150982o;
        java.util.ArrayList arrayList = musicMvMainUIC.f150977g;
        if (i17 < arrayList.size()) {
            fm3.u mv6 = ((lm3.e) arrayList.get(musicMvMainUIC.f150982o)).f319482d;
            kotlin.jvm.internal.o.g(mv6, "mv");
            mv6.f264138r = true;
            mv6.f264130j = null;
            mv6.f264129i = null;
            for (r45.jf2 jf2Var : mv6.f264127g) {
                jf2Var.set(3, "");
                jf2Var.set(2, 0L);
                jf2Var.set(5, 0);
                jf2Var.set(6, 0);
            }
            mv6.f264131k = 0;
            mv6.f264132l = 0;
            mv6.f264133m = 0;
            mv6.f264134n = false;
            mv6.f264137q = null;
            mv6.f264140t = null;
            mv6.f264141u.clear();
            ((lm3.e) arrayList.get(musicMvMainUIC.f150982o)).f319482d.f264138r = true;
            kl3.t.g().a().c(0);
            musicMvMainUIC.T6().notifyItemRangeChanged(musicMvMainUIC.f150982o, 1, "NetSceneDeleteFinderObject");
        }
        return jz5.f0.f302826a;
    }
}
