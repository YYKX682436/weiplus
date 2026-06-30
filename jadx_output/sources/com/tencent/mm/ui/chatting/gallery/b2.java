package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes12.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f200806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f200807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.k1 f200808f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.d2 f200809g;

    public b2(com.tencent.mm.ui.chatting.gallery.d2 d2Var, long j17, java.lang.Boolean bool, com.tencent.mm.ui.chatting.gallery.k1 k1Var) {
        this.f200809g = d2Var;
        this.f200806d = j17;
        this.f200807e = bool;
        this.f200808f = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.gallery.d2 d2Var = this.f200809g;
        d2Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "isBizChat = " + com.tencent.mm.ui.chatting.gallery.k1.D);
        boolean z17 = com.tencent.mm.ui.chatting.gallery.k1.D;
        java.lang.String str = d2Var.f200850a;
        if (z17) {
            d2Var.f200857h = c01.d9.b().j().k(str, com.tencent.mm.ui.chatting.gallery.k1.C);
        } else {
            d2Var.f200857h = ((com.tencent.mm.storage.g9) c01.d9.b().u()).S3(str);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "<init>, totalCount = " + d2Var.f200857h);
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "totalCount spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        boolean z18 = com.tencent.mm.ui.chatting.gallery.k1.D;
        long j17 = this.f200806d;
        if (z18) {
            com.tencent.mm.storage.v j18 = c01.d9.b().j();
            long j19 = com.tencent.mm.ui.chatting.gallery.k1.C;
            j18.getClass();
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str, j17);
            if (Li.getMsgId() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizChatMessageStorage", "getCountEarlyThan fail, msg does not exist");
            } else {
                java.lang.String e17 = j18.e(str);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                sb6.append(e17);
                sb6.append(" INDEXED BY bizmessageBizChatIdTypeCreateTimeIndex  WHERE ");
                sb6.append(j18.i(str));
                sb6.append(j18.l(str, j19));
                sb6.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                j18.f193895a.getClass();
                sb6.append(Li.getCreateTime());
                android.database.Cursor B = j18.d().B(sb6.toString(), null);
                r10 = B.moveToLast() ? B.getInt(0) : 0;
                B.close();
            }
            d2Var.f200858i = r10;
        } else {
            xg3.m0 u17 = c01.d9.b().u();
            final java.lang.String str2 = d2Var.f200850a;
            final com.tencent.mm.storage.g9 g9Var = (com.tencent.mm.storage.g9) u17;
            g9Var.getClass();
            com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(str2, j17);
            if (Li2.getMsgId() == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MsgInfoStorage", "getCountEarlyThan fail, msg does not exist");
            } else {
                final java.lang.String X8 = g9Var.X8(str2);
                final long createTime = Li2.getCreateTime();
                final java.util.List y47 = g9Var.y4();
                final long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(str2);
                if (g9Var.Da(X8)) {
                    r10 = ot0.c3.l().d("getImgVideoCountEarlyThan", new yz5.a() { // from class: com.tencent.mm.storage.g9$$i
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            return java.lang.Integer.valueOf(ot0.z2.f348822a.h0(com.tencent.mm.storage.g9.this.f193989r, X8, str2, y47, m07, createTime));
                        }
                    }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$j
                        @Override // yz5.a
                        public final java.lang.Object invoke() {
                            com.tencent.mm.storage.g9 g9Var2 = com.tencent.mm.storage.g9.this;
                            g9Var2.getClass();
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("SELECT COUNT(*) FROM ");
                            java.lang.String str3 = X8;
                            sb7.append(str3);
                            sb7.append(" ");
                            sb7.append(g9Var2.V3(str3));
                            sb7.append(" WHERE ");
                            sb7.append(g9Var2.P0(m07));
                            sb7.append(g9Var2.Z8(str2));
                            sb7.append("AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < ");
                            sb7.append(createTime);
                            android.database.Cursor f17 = g9Var2.f193989r.f(sb7.toString(), null, 2);
                            int i17 = f17.moveToFirst() ? f17.getInt(0) : 0;
                            f17.close();
                            return java.lang.Integer.valueOf(i17);
                        }
                    });
                } else if (g9Var.Pb(X8)) {
                    r10 = ot0.z2.f348822a.h0(g9Var.f193989r, X8, str2, y47, m07, createTime);
                } else {
                    android.database.Cursor f17 = g9Var.f193989r.f("SELECT COUNT(*) FROM " + X8 + " " + g9Var.V3(X8) + " WHERE " + g9Var.P0(m07) + g9Var.Z8(str2) + "AND type IN (3,39,13,43,62,44,268435505,486539313) AND createTime < " + createTime, null, 2);
                    r10 = f17.moveToFirst() ? f17.getInt(0) : 0;
                    f17.close();
                }
            }
            d2Var.f200858i = r10;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AutoList", "min spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis2));
        d2Var.f200859j = d2Var.f200858i;
        d2Var.f200856g = true;
        if (this.f200807e.booleanValue() || d2Var.f200855f) {
            d2Var.f200863n.postDelayed(new com.tencent.mm.ui.chatting.gallery.a2(this), 0L);
        }
    }
}
