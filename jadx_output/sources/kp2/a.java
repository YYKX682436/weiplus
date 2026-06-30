package kp2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final kp2.a f310956a = new kp2.a();

    public final int a(int i17, int i18) {
        com.tencent.mm.plugin.finder.extension.reddot.jb L0 = ((c61.l7) i95.n0.c(c61.l7.class)).nk().L0("FinderLiveEntrance");
        if (L0 != null && L0.I0("FinderLiveEntrance") != null && L0.getType() == 16) {
            r45.xs2 Q = ((c61.l7) i95.n0.c(c61.l7.class)).nk().Q("NearbyLiveTab");
            i18 = Q != null ? Q.getInteger(12) : 0;
        }
        if (i18 == 0) {
            i18 = wo2.n0.f448105a.c(i17);
            com.tencent.mars.xlog.Log.i("FinderLiveSquareConfig", "getTargetLiveTabId use last cache targetTabId=" + i18 + " commentScene=" + i17);
        }
        if (i18 != 0) {
            return i18;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveSquareConfig", "getTargetLiveTabId use default targetTabId=88890");
        return 88890;
    }
}
