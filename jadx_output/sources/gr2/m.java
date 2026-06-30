package gr2;

/* loaded from: classes8.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f274793d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        super(1);
        this.f274793d = finderItem;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        xs5.a saveCurrentTestRedDotData = (xs5.a) obj;
        kotlin.jvm.internal.o.g(saveCurrentTestRedDotData, "$this$saveCurrentTestRedDotData");
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f274793d;
        saveCurrentTestRedDotData.f456404a = finderItem.getId();
        com.tencent.mm.protocal.protobuf.FinderContact contact = finderItem.getFeedObject().getContact();
        saveCurrentTestRedDotData.f456405b = contact != null ? contact.getHeadUrl() : null;
        saveCurrentTestRedDotData.f456408e = finderItem.field_username;
        saveCurrentTestRedDotData.f456409f = finderItem.getFeedObject().getNickname();
        saveCurrentTestRedDotData.f456407d = finderItem.getFeedObject().getObjectNonceId();
        com.tencent.mm.protocal.protobuf.FinderContact contact2 = finderItem.getFeedObject().getContact();
        saveCurrentTestRedDotData.f456410g = contact2 != null ? contact2.getLiveCoverImgUrl() : null;
        return jz5.f0.f302826a;
    }
}
