package com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

/* loaded from: classes4.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final cl0.g f165400a;

    public p0(int i17, long j17, int i18, java.lang.String str, int i19, long j18, int i27) {
        cl0.g gVar = new cl0.g();
        this.f165400a = gVar;
        try {
            cl0.g gVar2 = new cl0.g();
            gVar2.h("cid", str);
            gVar2.o(dm.n.COL_EXPOSURECOUNT, i19);
            gVar2.p("stayTime", j18);
            gVar2.o("clickCount", i27);
            gVar.o(dm.n.COL_EXPOSURECOUNT, i17);
            gVar.p("stayTime", j17);
            gVar.o("clickCount", i18);
            gVar.h("btnInfo", gVar2);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLandingFullScreenFloatBarComp", th6.toString());
        }
    }
}
