package up2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory f429796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory) {
        super(2);
        this.f429796d = newEntranceItemConvertFactory;
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
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.NewEntranceItemConvertFactory newEntranceItemConvertFactory = this.f429796d;
        mMActivity = newEntranceItemConvertFactory.context;
        i17 = newEntranceItemConvertFactory.commentScene;
        sVar.a(mMActivity, finderItem, username, i17);
        return jz5.f0.f302826a;
    }
}
