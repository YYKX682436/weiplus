package sp2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f410998d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI f410999e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(kotlin.jvm.internal.g0 g0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.FinderLiveSquareNewEntranceUI finderLiveSquareNewEntranceUI) {
        super(1);
        this.f410998d = g0Var;
        this.f410999e = finderLiveSquareNewEntranceUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject feedObject;
        r45.nw1 liveInfo;
        com.tencent.mars.xlog.Log.i("FinderLiveSquareNewEntranceUI", "checkRedDotEnterLive: enter live failed, errCode=" + ((java.lang.Number) obj).intValue());
        ae2.in inVar = ae2.in.f3688a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3740f1).getValue()).r()).intValue() == 1) {
            com.tencent.mm.plugin.finder.storage.FinderItem h17 = bu2.j.f24534a.h(this.f410998d.f310121d);
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new sp2.c((h17 == null || (feedObject = h17.getFeedObject()) == null || (liveInfo = feedObject.getLiveInfo()) == null) ? 0L : liveInfo.getLong(0), null), 3, null);
        }
        ml2.m5 m5Var = ml2.m5.f327718a;
        ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
        java.lang.String str = a52.a.f1584l;
        if (str == null) {
            str = "";
        }
        m5Var.f(str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).bk(this.f410999e, true);
        return jz5.f0.f302826a;
    }
}
