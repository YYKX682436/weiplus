package db2;

/* loaded from: classes2.dex */
public final class h0 extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static long f227998x;

    /* renamed from: t, reason: collision with root package name */
    public final db2.a5 f227999t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228000u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.w21 f228001v;

    /* renamed from: w, reason: collision with root package name */
    public final long f228002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(db2.a5 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(params, "params");
        this.f227999t = params;
        this.f228000u = "Finder.CgiFinderFavFeed";
        long c17 = c01.id.c();
        this.f228002w = c17;
        long j17 = f227998x;
        if (c17 < j17) {
            f227998x = 1 + j17;
            this.f228002w = j17;
        }
        f227998x = this.f228002w;
        r45.w21 w21Var = new r45.w21();
        this.f228001v = w21Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long j18 = params.f227891a;
        w21Var.set(2, java.lang.Long.valueOf(j18));
        w21Var.set(4, params.f227893c);
        w21Var.set(5, java.lang.Long.valueOf(this.f228002w));
        w21Var.set(6, xy2.c.f(qt2Var));
        boolean z17 = params.f227894d;
        w21Var.set(3, java.lang.Integer.valueOf(z17 ? 1 : 2));
        db2.t4 t4Var = db2.t4.f228171a;
        w21Var.set(1, t4Var.b(3515, qt2Var));
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        w21Var.set(7, com.tencent.mm.plugin.finder.report.o3.fk((com.tencent.mm.plugin.finder.report.o3) c18, params.f227891a, params.f227892b, qt2Var != null ? qt2Var.getInteger(5) : 0, qt2Var != null ? qt2Var.getInteger(7) : 0, null, 16, null));
        w21Var.set(8, java.lang.Integer.valueOf(params.f227896f));
        w21Var.set(9, params.f227898h);
        w21Var.set(10, params.f227899i);
        t4Var.h((r45.kv0) w21Var.getCustom(1), qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(j18), params.f227892b)));
        if (w21Var.getInteger(3) == 1) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_fav"));
            k57Var.f378395e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f378396f = cu5Var2;
            r45.kv0 kv0Var = (r45.kv0) w21Var.getCustom(1);
            if (kv0Var != null) {
                kv0Var.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
            }
            w04.l.INSTANCE.b(540999701);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        long j19 = this.f228002w;
        sb6.append(j19);
        sb6.append(" objectId:");
        sb6.append(w21Var.getLong(2));
        sb6.append(" opType:");
        sb6.append(w21Var.getInteger(3));
        sb6.append(" likeId:");
        sb6.append(w21Var.getLong(5));
        sb6.append(" username:");
        sb6.append(w21Var.getString(6));
        sb6.append(" action:");
        sb6.append(z17);
        sb6.append(" sourceType:");
        sb6.append(params.f227896f);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderFavFeed", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w21Var;
        r45.x21 x21Var = new r45.x21();
        x21Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) x21Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = x21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderfav";
        lVar.f70667d = 3515;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderFavFeed", "likeId:" + j19 + " CgiFinderLikeComment init " + w21Var.getLong(2));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.x21 resp = (r45.x21) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        sb6.append(this.f228002w);
        sb6.append(" [onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" objectId:");
        r45.w21 w21Var = this.f228001v;
        sb6.append(w21Var.getLong(2));
        sb6.append(" opType:");
        sb6.append(w21Var.getInteger(3));
        sb6.append(" likeId:");
        sb6.append(w21Var.getLong(5));
        sb6.append(" username:");
        sb6.append(w21Var.getString(6));
        sb6.append(" action:");
        sb6.append(this.f227999t.f227894d);
        com.tencent.mars.xlog.Log.i(this.f228000u, sb6.toString());
        hz2.d.f286313a.h(i17, i18, str);
    }
}
