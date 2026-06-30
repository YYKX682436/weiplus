package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes9.dex */
public class p0 implements wy.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f189022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f189023b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f189024c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.q f189025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.bq0 f189026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ul5 f189027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f189028g;

    public p0(long j17, com.tencent.mm.storage.f9 f9Var, java.lang.String str, ot0.q qVar, r45.bq0 bq0Var, r45.ul5 ul5Var, com.tencent.mm.storage.f9 f9Var2) {
        this.f189022a = j17;
        this.f189023b = f9Var;
        this.f189024c = str;
        this.f189025d = qVar;
        this.f189026e = bq0Var;
        this.f189027f = ul5Var;
        this.f189028g = f9Var2;
    }

    @Override // wy.f
    public void a(int i17, java.lang.String str, java.util.List list) {
        long j17 = this.f189022a;
        if (i17 != 0) {
            if (-3200 == i17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppMsgLogic", "why errCode equals %s", java.lang.Integer.valueOf(i17));
            }
            com.tencent.mm.storage.f9 f9Var = this.f189028g;
            f9Var.r1(5);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().bb(j17, f9Var);
            com.tencent.mm.storage.f9 f9Var2 = new com.tencent.mm.storage.f9();
            f9Var2.e1(f9Var.getCreateTime() + 1);
            f9Var2.u1(f9Var.Q0());
            f9Var2.d1(str);
            f9Var2.setType(10000);
            f9Var2.r1(6);
            f9Var2.j1(0);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var2);
            return;
        }
        zs3.b0 b0Var = new zs3.b0();
        b0Var.field_msgId = j17;
        com.tencent.mm.storage.f9 f9Var3 = this.f189023b;
        b0Var.field_oriMsgId = f9Var3.getMsgId();
        b0Var.field_oriMsgTalker = f9Var3.Q0();
        b0Var.field_toUser = this.f189024c;
        ot0.q qVar = this.f189025d;
        b0Var.field_title = qVar.n();
        b0Var.field_desc = qVar.f348658g;
        b0Var.field_dataProto = this.f189026e;
        b0Var.field_type = 0;
        b0Var.field_favFrom = this.f189027f.f387466g;
        b0Var.field_localId = new java.util.Random().nextInt(2147483645) + 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgLogic", "summerrecord needNetScene insert ret:%b, id:%d, localid:%d", java.lang.Boolean.valueOf(((bt3.c2) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).fj()).insert(b0Var)), java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(b0Var.field_localId));
        ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).cj().f(b0Var, false);
    }
}
