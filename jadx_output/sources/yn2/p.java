package yn2;

/* loaded from: classes2.dex */
public final class p implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yn2.r f464002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn2.c f464003b;

    public p(yn2.r rVar, zn2.c cVar) {
        this.f464002a = rVar;
        this.f464003b = cVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        jz5.l[] lVarArr = new jz5.l[4];
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.e eVar = this.f464002a.f464008e;
        if (eVar == null || (str2 = ((xn2.p0) eVar).f455544b) == null) {
            str2 = "";
        }
        lVarArr[0] = new jz5.l("finder_context_id", str2);
        lVarArr[1] = new jz5.l("comment_scene", 281);
        zn2.c cVar = this.f464003b;
        lVarArr[2] = new jz5.l("feed_id", pm0.v.u(cVar.getItemId()));
        lVarArr[3] = new jz5.l("session_buffer", cVar.getFeedObject().getFeedObject().getSessionBuffer());
        return kz5.c1.k(lVarArr);
    }
}
