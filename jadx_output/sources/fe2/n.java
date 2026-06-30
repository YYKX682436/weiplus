package fe2;

/* loaded from: classes3.dex */
public final class n implements oa.c {
    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onTabReselected: ");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof he2.e) {
            he2.e eVar = (he2.e) obj;
            eVar.b(com.tencent.mm.R.color.BW_100_Alpha_0_5);
            eVar.a(false);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onTabUnselected: ");
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof he2.e) {
            he2.e eVar = (he2.e) obj;
            eVar.b(com.tencent.mm.R.color.aaz);
            eVar.a(true);
            com.tencent.mars.xlog.Log.i("FinderLiveViewPagerComm", "onTabSelected: " + eVar.f280888b);
        }
    }
}
