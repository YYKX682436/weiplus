package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class o6 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132769a;

    public o6(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132769a = finderCommentFooter;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[1];
        com.tencent.mm.plugin.finder.storage.FinderItem feedObj = this.f132769a.getFeedObj();
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(feedObj != null ? feedObj.getId() : 0L));
        return kz5.c1.l(lVarArr);
    }
}
