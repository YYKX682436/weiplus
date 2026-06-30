package cp2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory f220948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory) {
        super(2);
        this.f220948d = nearbyLiveItemConvertFactory;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.ui.MMActivity mMActivity;
        int i17;
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = (com.tencent.mm.plugin.finder.storage.FinderItem) obj;
        java.lang.String username = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(finderItem, "finderItem");
        kotlin.jvm.internal.o.g(username, "username");
        cq2.s sVar = cq2.s.f221445a;
        com.tencent.mm.plugin.finder.nearby.live.NearbyLiveItemConvertFactory nearbyLiveItemConvertFactory = this.f220948d;
        mMActivity = nearbyLiveItemConvertFactory.baseContext;
        i17 = nearbyLiveItemConvertFactory.commentScene;
        sVar.a(mMActivity, finderItem, username, i17);
        return jz5.f0.f302826a;
    }
}
