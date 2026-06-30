package nv2;

/* loaded from: classes2.dex */
public final class z1 extends nv2.g1 {

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f340642n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.mm.plugin.finder.storage.FinderItem finderObject, long j17, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, nv2.i1 i1Var, r45.qt2 contextObj, byte[] bArr) {
        super(finderObject, j17, objectNonceId, z17, z18, i17, i18, i1Var, contextObj, null);
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f340642n = bArr;
    }

    @Override // nv2.g1, nv2.r
    public void a(nv2.o1 callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        c61.zb zbVar = (c61.zb) i95.n0.c(c61.zb.class);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f340491d;
        r45.nw1 liveInfo = finderItem.getLiveInfo();
        long j17 = liveInfo != null ? liveInfo.getLong(0) : 0L;
        int i17 = this.f340494g ? 1 : 2;
        long id6 = finderItem.getFeedObject().getId();
        java.lang.String nonceId = finderItem.getObjectNonceId();
        java.lang.String dupFlag = finderItem.getDupFlag();
        java.lang.String sessionBuffer = finderItem.getFeedObject().getSessionBuffer();
        if (sessionBuffer == null) {
            sessionBuffer = "";
        }
        java.lang.String str = sessionBuffer;
        byte[] bArr = this.f340642n;
        ((b92.d1) zbVar).getClass();
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        r45.qt2 contextObj = this.f340498k;
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        new ek2.f0(db2.t4.f228171a.b(564, contextObj), bArr, j17, 0, id6, 3, nonceId, dupFlag, xy2.c.f(contextObj), contextObj, i17, 3, 0L, null, str, 8192, null).l().K(new nv2.y1(this, callback));
    }
}
