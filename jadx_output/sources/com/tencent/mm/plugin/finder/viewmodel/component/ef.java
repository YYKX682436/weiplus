package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class ef implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f134270a;

    public ef(com.tencent.mm.plugin.finder.storage.FinderItem finderItem) {
        this.f134270a = finderItem;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f134270a;
        return kz5.c1.k(new jz5.l("finder_username", finderItem.getUserName()), new jz5.l("feed_id", pm0.v.u(finderItem.getId())));
    }
}
