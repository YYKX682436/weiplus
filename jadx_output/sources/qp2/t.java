package qp2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.s {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qp2.y f365802d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(qp2.y yVar) {
        super(5);
        this.f365802d = yVar;
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
        com.tencent.mars.xlog.Log.i("NearbyLiveSquareTabLayoutUIC", "fetchTabsInfo title:" + title + " videoTabName:" + videoTabName + " liveTabName:" + liveTabName + " tabList:" + tabList + " isHideTabs:" + booleanValue);
        pm0.v.X(new qp2.s(this.f365802d, title, booleanValue, tabList));
        return jz5.f0.f302826a;
    }
}
