package qd2;

/* loaded from: classes2.dex */
public final class s implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.x f361815a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f361816b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f361817c;

    public s(qd2.x xVar, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, kotlinx.coroutines.q qVar) {
        this.f361815a = xVar;
        this.f361816b = finderItem;
        this.f361817c = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("FinderModifyFeedHelper", "[doModFeedCgi] errType:" + fVar.f70615a + " errCode:" + fVar.f70616b + " errMsg:" + fVar.f70617c);
        int i17 = fVar.f70615a;
        kotlinx.coroutines.q qVar = this.f361817c;
        if (i17 == 0 && fVar.f70616b == 0) {
            this.f361815a.getClass();
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f361816b;
            ((c61.p2) ybVar).wi(finderItem.getId(), finderItem.getDupFlag()).l().K(new qd2.u(finderItem));
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.TRUE, fVar.f70617c)));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(new jz5.l(java.lang.Boolean.FALSE, fVar.f70617c)));
        }
        return jz5.f0.f302826a;
    }
}
