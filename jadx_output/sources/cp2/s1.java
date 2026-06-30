package cp2;

/* loaded from: classes8.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f220912d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cp2.u1 f220913e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.plugin.finder.storage.FinderItem finderItem, cp2.u1 u1Var) {
        super(1);
        this.f220912d = finderItem;
        this.f220913e = u1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xs5.a saveCurrentTestRedDotData = (xs5.a) obj;
        kotlin.jvm.internal.o.g(saveCurrentTestRedDotData, "$this$saveCurrentTestRedDotData");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f220912d;
        saveCurrentTestRedDotData.f456404a = finderItem.getId();
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderItem.getFeedObject().getContact();
        saveCurrentTestRedDotData.f456405b = contact != null ? contact.getHeadUrl() : null;
        saveCurrentTestRedDotData.f456408e = finderItem.field_username;
        saveCurrentTestRedDotData.f456409f = finderItem.getFeedObject().getNickname();
        saveCurrentTestRedDotData.f456407d = finderItem.getFeedObject().getObjectNonceId();
        com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment = this.f220913e.f220921b;
        saveCurrentTestRedDotData.f456406c = absNearByFragment != null ? absNearByFragment.t0() : null;
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderItem.getFeedObject().getContact();
        saveCurrentTestRedDotData.f456410g = contact2 != null ? contact2.getLiveCoverImgUrl() : null;
        return jz5.f0.f302826a;
    }
}
