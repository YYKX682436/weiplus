package db2;

/* loaded from: classes2.dex */
public final class x1 extends az2.j {

    /* renamed from: x, reason: collision with root package name */
    public static long f228228x;

    /* renamed from: t, reason: collision with root package name */
    public final db2.c5 f228229t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f228230u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.qd1 f228231v;

    /* renamed from: w, reason: collision with root package name */
    public final long f228232w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(db2.c5 params, r45.qt2 qt2Var) {
        super(qt2Var, null, 2, null);
        kotlin.jvm.internal.o.g(params, "params");
        r45.pd1 pd1Var = null;
        this.f228229t = params;
        this.f228230u = "Finder.CgiFinderLikeFeed";
        long c17 = c01.id.c();
        this.f228232w = c17;
        long j17 = f228228x;
        if (c17 < j17) {
            f228228x = 1 + j17;
            this.f228232w = j17;
        }
        f228228x = this.f228232w;
        r45.qd1 qd1Var = new r45.qd1();
        this.f228231v = qd1Var;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        long j18 = params.f227927a;
        qd1Var.set(1, java.lang.Long.valueOf(j18));
        qd1Var.set(8, params.f227929c);
        qd1Var.set(4, java.lang.Long.valueOf(this.f228232w));
        qd1Var.set(6, xy2.c.f(qt2Var));
        qd1Var.set(7, java.lang.Integer.valueOf(params.f227932f));
        qd1Var.set(15, java.lang.Integer.valueOf(params.f227933g));
        java.lang.String str = params.f227935i;
        if (str != null) {
            pd1Var = new r45.pd1();
            pd1Var.set(0, str);
            pd1Var.set(1, str);
        }
        qd1Var.set(18, pd1Var);
        boolean z17 = params.f227930d;
        qd1Var.set(3, java.lang.Integer.valueOf(z17 ? 3 : 4));
        qd1Var.set(12, java.lang.Integer.valueOf(params.f227931e ? 1 : 0));
        db2.t4 t4Var = db2.t4.f228171a;
        qd1Var.set(9, t4Var.b(3710, qt2Var));
        i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c18;
        long j19 = params.f227927a;
        java.lang.String str2 = params.f227928b;
        r45.kv0 kv0Var = (r45.kv0) qd1Var.getCustom(9);
        qd1Var.set(10, com.tencent.mm.plugin.finder.report.o3.fk(o3Var, j19, str2, kv0Var != null ? kv0Var.getInteger(1) : 0, qt2Var != null ? qt2Var.getInteger(7) : 0, null, 16, null));
        java.lang.String str3 = params.f227934h;
        if (str3 != null) {
            qd1Var.set(16, str3);
        }
        r45.kv0 kv0Var2 = (r45.kv0) qd1Var.getCustom(9);
        r45.kv0 kv0Var3 = (r45.kv0) qd1Var.getCustom(9);
        t4Var.h(kv0Var2, qt2Var, kz5.b0.c(new jz5.o(java.lang.Integer.valueOf(kv0Var3 != null ? kv0Var3.getInteger(1) : 0), java.lang.Long.valueOf(j18), params.f227928b)));
        if (qd1Var.getInteger(3) == 3) {
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            fo3.s sVar = fo3.s.INSTANCE;
            cu5Var.d(sVar.Ci("ce_feed_like"));
            k57Var.f378395e = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.h());
            k57Var.f378396f = cu5Var2;
            r45.kv0 kv0Var4 = (r45.kv0) qd1Var.getCustom(9);
            if (kv0Var4 != null) {
                kv0Var4.set(2, new com.tencent.mm.protobuf.g(k57Var.toByteArray()));
            }
            w04.l.INSTANCE.Ch(540999691, 5);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        long j27 = this.f228232w;
        sb6.append(j27);
        sb6.append(" objectId:");
        sb6.append(qd1Var.getLong(1));
        sb6.append(" opType:");
        sb6.append(qd1Var.getInteger(3));
        sb6.append(" likeId:");
        sb6.append(qd1Var.getLong(4));
        sb6.append(" username:");
        sb6.append(qd1Var.getString(6));
        sb6.append(" action:");
        sb6.append(z17);
        sb6.append(", private:");
        sb6.append(params.f227931e);
        sb6.append(" sourceType:");
        sb6.append(params.f227933g);
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLikeFeed", sb6.toString());
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = qd1Var;
        r45.rd1 rd1Var = new r45.rd1();
        rd1Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) rd1Var.getCustom(0);
        if (ieVar != null) {
            ieVar.f376960e = new r45.du5();
        }
        lVar.f70665b = rd1Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlike";
        lVar.f70667d = 3710;
        p(lVar.a());
        com.tencent.mars.xlog.Log.i("Finder.CgiFinderLikeFeed", "likeId:" + j27 + " CgiFinderLikeComment init " + qd1Var.getLong(1));
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.tencent.mm.protobuf.f fVar, com.tencent.mm.modelbase.m1 m1Var) {
        r45.rd1 resp = (r45.rd1) fVar;
        kotlin.jvm.internal.o.g(resp, "resp");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("likeId:");
        sb6.append(this.f228232w);
        sb6.append(" [onCgiBack] errType=");
        sb6.append(i17);
        sb6.append(" errCode=");
        sb6.append(i18);
        sb6.append(" errMsg=");
        sb6.append(str);
        sb6.append(" thread=");
        sb6.append(java.lang.Thread.currentThread());
        sb6.append(" objectId:");
        r45.qd1 qd1Var = this.f228231v;
        sb6.append(qd1Var.getLong(1));
        sb6.append(" opType:");
        sb6.append(qd1Var.getInteger(3));
        sb6.append(" likeId:");
        sb6.append(qd1Var.getLong(4));
        sb6.append(" username:");
        sb6.append(qd1Var.getString(6));
        sb6.append(" action:");
        sb6.append(this.f228229t.f227930d);
        com.tencent.mars.xlog.Log.i(this.f228230u, sb6.toString());
        hz2.d dVar = hz2.d.f286313a;
        dVar.h(i17, i18, str);
        dVar.d(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1i));
        dVar.f(i17, i18, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1h));
    }
}
