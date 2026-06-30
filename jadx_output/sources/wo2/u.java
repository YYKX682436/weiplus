package wo2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f448129d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(wo2.m0 m0Var) {
        super(5);
        this.f448129d = m0Var;
    }

    @Override // yz5.s
    public java.lang.Object v(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
        java.lang.String title = (java.lang.String) obj;
        java.lang.String videoTabName = (java.lang.String) obj2;
        java.lang.String liveTabName = (java.lang.String) obj3;
        java.util.LinkedList tabList = (java.util.LinkedList) obj4;
        boolean booleanValue = ((java.lang.Boolean) obj5).booleanValue();
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(videoTabName, "videoTabName");
        kotlin.jvm.internal.o.g(liveTabName, "liveTabName");
        kotlin.jvm.internal.o.g(tabList, "tabList");
        com.tencent.mars.xlog.Log.i("NearbyActionBarUIC", "fetchTabsInfo videoTabName:" + videoTabName + " liveTabName:" + liveTabName + " tabList:" + tabList + " isHideTabs:" + booleanValue);
        pm0.v.X(new wo2.t(this.f448129d, videoTabName, liveTabName));
        return jz5.f0.f302826a;
    }
}
