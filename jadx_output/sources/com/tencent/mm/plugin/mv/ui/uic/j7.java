package com.tencent.mm.plugin.mv.ui.uic;

/* loaded from: classes10.dex */
public final class j7 implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.uic.q7 f151224a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm3.u f151225b;

    public j7(com.tencent.mm.plugin.mv.ui.uic.q7 q7Var, fm3.u uVar) {
        this.f151224a = q7Var;
        this.f151225b = uVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Long l17;
        java.lang.String str2;
        java.lang.Long valueOf;
        java.lang.String objectNonceId;
        if (z17) {
            androidx.appcompat.app.AppCompatActivity activity = this.f151224a.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC musicMvMainUIC = (com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.mv.ui.uic.MusicMvMainUIC.class);
            musicMvMainUIC.getClass();
            fm3.u musicMv = this.f151225b;
            kotlin.jvm.internal.o.g(musicMv, "musicMv");
            com.tencent.mars.xlog.Log.i(musicMvMainUIC.f150974d, "deleteMv " + musicMv.f264123c + ' ' + musicMv.f264124d + ' ' + musicMv.f264136p);
            int i17 = musicMv.f264136p;
            if (i17 == 1) {
                valueOf = musicMv.f264123c;
                objectNonceId = musicMv.f264124d;
            } else {
                l17 = null;
                if (i17 != 4) {
                    str2 = null;
                    if (l17 != null || str2 == null) {
                    }
                    long longValue = l17.longValue();
                    i95.m c17 = i95.n0.c(cq.k.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    cq.j1.b((cq.k) c17, xy2.c.e(musicMvMainUIC.getContext()), longValue, str2, false, null, 0, new com.tencent.mm.plugin.mv.ui.uic.v1(musicMvMainUIC), null, 184, null);
                    return;
                }
                com.tencent.mm.protocal.protobuf.FinderObject finderObject = musicMv.f264140t;
                valueOf = finderObject != null ? java.lang.Long.valueOf(finderObject.getId()) : null;
                com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = musicMv.f264140t;
                objectNonceId = finderObject2 != null ? finderObject2.getObjectNonceId() : null;
            }
            l17 = valueOf;
            str2 = objectNonceId;
            if (l17 != null) {
            }
        }
    }
}
