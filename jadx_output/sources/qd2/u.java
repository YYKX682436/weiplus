package qd2;

/* loaded from: classes2.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f361840a;

    public u(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f361840a = finderItem;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderModifyFeedHelper", "[refreshModFeed] errType:" + fVar.f70615a + " errCode:" + fVar.f70616b);
        r45.h51 h51Var = (r45.h51) fVar.f70618d;
        if (h51Var == null || (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) h51Var.getCustom(2)) == null) {
            return null;
        }
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f361840a;
        finderItem.setFeedObject(finderObject);
        bu2.j.f24534a.n(finderItem, bu2.i.f24526g);
        com.tencent.mm.autogen.events.FeedUpdateEvent feedUpdateEvent = new com.tencent.mm.autogen.events.FeedUpdateEvent();
        feedUpdateEvent.f54252g.f6918a = finderItem.field_id;
        return java.lang.Boolean.valueOf(feedUpdateEvent.e());
    }
}
