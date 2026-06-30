package ju2;

/* loaded from: classes2.dex */
public final class e implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f301813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f301814b;

    public e(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        this.f301813a = baseFinderFeed;
        this.f301814b = str;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[3];
        nv2.h1 h1Var = nv2.n1.f340550g;
        nv2.n1 n1Var = nv2.n1.f340551h;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f301813a;
        lVarArr[0] = new jz5.l("like_cnt", java.lang.Integer.valueOf(n1Var.l(baseFinderFeed.getFeedObject().getFeedObject())));
        java.lang.String str2 = this.f301814b;
        if (str2 == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("recom_uin", str2);
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(baseFinderFeed.getItemId()));
        return kz5.c1.l(lVarArr);
    }
}
