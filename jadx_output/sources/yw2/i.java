package yw2;

/* loaded from: classes2.dex */
public final class i implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yw2.n f466646a;

    public i(yw2.n nVar) {
        this.f466646a = nVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.storage.FinderItem feedObj = this.f466646a.k().getFeedObj();
        return kz5.b1.e(new jz5.l("feed_id", pm0.v.u(feedObj != null ? feedObj.getId() : 0L)));
    }
}
