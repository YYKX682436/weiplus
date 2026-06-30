package it2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.reward.view.MagicRewardView f294545a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.reward.view.MagicRewardView f294546b;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        if (((r1 == null || (r1 = r1.getLayoutParams()) == null || r1.height != r22.height) ? false : true) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (((r1 == null || (r1 = r1.getLayoutParams()) == null || r1.height != r22.height) ? false : true) == false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.finder.reward.view.MagicRewardView a(java.lang.String r18, kt2.c r19, android.view.ViewGroup r20, int r21, android.view.ViewGroup.LayoutParams r22) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it2.z.a(java.lang.String, kt2.c, android.view.ViewGroup, int, android.view.ViewGroup$LayoutParams):com.tencent.mm.plugin.finder.reward.view.MagicRewardView");
    }

    public final void b(java.lang.String source, kt2.c type) {
        kotlin.jvm.internal.o.g(source, "source");
        kotlin.jvm.internal.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.tencent.mars.xlog.Log.i("MagicRewardViewManager", source + " dettachView PLAYER,playMagicRewardView:" + this.f294545a);
            com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = this.f294545a;
            if (magicRewardView != null) {
                zl2.r4.f473950a.Q2(magicRewardView);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MagicRewardViewManager", source + " dettachView EDITOR,editMagicRewardView:" + this.f294546b);
        com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView2 = this.f294546b;
        if (magicRewardView2 != null) {
            zl2.r4.f473950a.Q2(magicRewardView2);
        }
    }
}
