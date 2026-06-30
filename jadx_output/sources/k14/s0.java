package k14;

/* loaded from: classes11.dex */
public class s0 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f303373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f303374e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f303375f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k14.x0 f303376g;

    public s0(k14.x0 x0Var, java.util.HashSet hashSet, long j17, long j18) {
        this.f303376g = x0Var;
        this.f303373d = hashSet;
        this.f303374e = j17;
        this.f303375f = j18;
    }

    @Override // o13.x
    public void X2(p13.v vVar) {
        int i17;
        java.util.List<p13.y> list = vVar.f351160e;
        java.util.HashSet hashSet = this.f303373d;
        k14.x0 x0Var = this.f303376g;
        if (list != null) {
            for (p13.y yVar : list) {
                hashSet.remove(yVar.f351187e);
                x0Var.f303409h.add(yVar.f351187e);
            }
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            final java.lang.String str = (java.lang.String) it.next();
            final com.tencent.mm.storage.g9 cj6 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj();
            final long j17 = this.f303374e;
            final long currentTimeMillis = java.lang.System.currentTimeMillis();
            final java.lang.String X8 = cj6.X8(str);
            if (cj6.Da(X8)) {
                ot0.c3 l17 = ot0.c3.l();
                final int i18 = 50;
                final int i19 = 1;
                yz5.a aVar = new yz5.a() { // from class: com.tencent.mm.storage.g9$$e
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        return java.lang.Integer.valueOf(ot0.z2.f348822a.I(com.tencent.mm.storage.g9.this.f193989r, X8, str, i18, j17, currentTimeMillis, i19));
                    }
                };
                final int i27 = 50;
                final int i28 = 1;
                i17 = l17.b("getCountByTimeWithType", aVar, new yz5.a() { // from class: com.tencent.mm.storage.g9$$f
                    @Override // yz5.a
                    public final java.lang.Object invoke() {
                        com.tencent.mm.storage.g9 g9Var = com.tencent.mm.storage.g9.this;
                        g9Var.getClass();
                        android.database.Cursor f17 = g9Var.f193989r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + g9Var.Z8(str) + "AND type = " + i27 + " AND createTime >= " + j17 + " AND createTime <= " + currentTimeMillis + " LIMIT " + i28, null, 2);
                        int i29 = f17.moveToFirst() ? f17.getInt(0) : 0;
                        f17.close();
                        return java.lang.Integer.valueOf(i29);
                    }
                });
            } else if (cj6.Pb(X8)) {
                i17 = ot0.z2.f348822a.I(cj6.f193989r, X8, str, 50, j17, currentTimeMillis, 1);
            } else {
                android.database.Cursor f17 = cj6.f193989r.f("SELECT COUNT(*) FROM " + X8 + " WHERE" + cj6.Z8(str) + "AND type = 50 AND createTime >= " + j17 + " AND createTime <= " + currentTimeMillis + " LIMIT 1", null, 2);
                int i29 = f17.moveToFirst() ? f17.getInt(0) : 0;
                f17.close();
                i17 = i29;
            }
            if (i17 > 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] talker:%s voipCount:%s", str, java.lang.Integer.valueOf(i17));
            } else {
                android.database.Cursor C8 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().C8(str, this.f303374e, java.lang.System.currentTimeMillis(), true, 1);
                if (C8.getCount() > 0) {
                    android.database.Cursor C82 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().C8(str, this.f303374e, java.lang.System.currentTimeMillis(), false, 1);
                    if (C82.getCount() <= 0) {
                        x0Var.f303409h.add(str);
                    }
                    C82.close();
                } else {
                    x0Var.f303409h.add(str);
                }
                C8.close();
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.UnfamiliarContactEngine", "[getHalfYearNotChatInfo] query:%s cost:%sms", java.lang.Long.valueOf(this.f303374e), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.f303375f));
        x0Var.f303405d.countDown();
    }
}
