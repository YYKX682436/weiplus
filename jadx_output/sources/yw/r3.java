package yw;

/* loaded from: classes9.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.r3 f466450a = new yw.r3();

    public final com.tencent.pigeon.biz_base.OftenReadAccountInfo a(java.lang.String userName, boolean z17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.pigeon.biz_base.OftenReadAccountInfo oftenReadAccountInfo = new com.tencent.pigeon.biz_base.OftenReadAccountInfo(yw.h1.f466332a.h(userName), null, null, 6, null);
        com.tencent.mm.storage.f9 q57 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(userName);
        if (q57 == null) {
            return oftenReadAccountInfo;
        }
        com.tencent.pigeon.biz_base.OftenReadAccountInfo copy$default = com.tencent.pigeon.biz_base.OftenReadAccountInfo.copy$default(oftenReadAccountInfo, null, null, java.lang.Long.valueOf(q57.getCreateTime()), 3, null);
        com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(userName);
        if ((p17 != null ? p17.d1() : 0) <= 0) {
            return copy$default;
        }
        long u17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().u(userName);
        if (z17) {
            return p17.d1() > r01.q3.oj().P0(u17) ? com.tencent.pigeon.biz_base.OftenReadAccountInfo.copy$default(copy$default, null, java.lang.Boolean.TRUE, null, 5, null) : copy$default;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - q57.getCreateTime();
        if (qs1.n.f366254a <= 0) {
            qs1.n.f366254a = 43200000L;
        }
        if (currentTimeMillis < qs1.n.f366254a) {
            return p17.d1() > r01.q3.oj().P0(u17) ? com.tencent.pigeon.biz_base.OftenReadAccountInfo.copy$default(copy$default, null, java.lang.Boolean.TRUE, null, 5, null) : copy$default;
        }
        return copy$default;
    }
}
