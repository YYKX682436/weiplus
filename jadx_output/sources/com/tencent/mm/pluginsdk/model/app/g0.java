package com.tencent.mm.pluginsdk.model.app;

/* loaded from: classes12.dex */
public class g0 extends l75.n0 implements lt.l0 {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f188903f = {l75.n0.getCreateSQLs(ot0.t.E, "AppMessage")};

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f188904g = {"CREATE INDEX IF NOT EXISTS AppMessage_Talker_LocalId ON AppMessage ( msgTalker,msgId )", "CREATE INDEX IF NOT EXISTS AppMessage_Talker_SvrId ON AppMessage ( msgTalker,msgSvrId )"};

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.pluginsdk.model.app.f0 f188905d;

    /* renamed from: e, reason: collision with root package name */
    public final l75.k0 f188906e;

    public g0(l75.k0 k0Var) {
        super(k0Var, ot0.t.E, "AppMessage", null);
        this.f188905d = new com.tencent.mm.pluginsdk.model.app.f0(null);
        this.f188906e = k0Var;
        qt0.b.f366491a.b(new qt0.e(k0Var, f188904g, "AppMessage", null, 0));
    }

    public /* bridge */ /* synthetic */ boolean D0(ot0.t tVar) {
        return super.insert(tVar);
    }

    @Override // l75.n0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean insertNotify(ot0.t tVar, boolean z17) {
        long j17 = tVar.field_msgId;
        com.tencent.mm.pluginsdk.model.app.f0 f0Var = this.f188905d;
        return f0Var.d(j17) ? f0Var.b(tVar, z17) : super.insertNotify(tVar, z17);
    }

    public /* bridge */ /* synthetic */ boolean L0(ot0.t tVar, java.lang.String[] strArr) {
        return super.update(tVar, strArr);
    }

    @Override // l75.n0
    public boolean replace(l75.f0 f0Var, boolean z17) {
        ot0.t tVar = (ot0.t) f0Var;
        long j17 = tVar.field_msgId;
        com.tencent.mm.pluginsdk.model.app.f0 f0Var2 = this.f188905d;
        return f0Var2.d(j17) ? f0Var2.c(tVar, z17) : super.replace(tVar, z17);
    }

    @Override // l75.n0
    public boolean updateNotify(l75.f0 f0Var, boolean z17, java.lang.String[] strArr) {
        ot0.t tVar = (ot0.t) f0Var;
        long j17 = tVar.field_msgId;
        com.tencent.mm.pluginsdk.model.app.f0 f0Var2 = this.f188905d;
        return f0Var2.d(j17) ? f0Var2.e(tVar, z17, strArr) : super.updateNotify(tVar, z17, strArr);
    }

    public ot0.t y0(java.lang.String str, long j17) {
        com.tencent.mm.pluginsdk.model.app.f0 f0Var = this.f188905d;
        if (f0Var.d(j17)) {
            return f0Var.a(j17);
        }
        ot0.t tVar = new ot0.t();
        if (pt0.p.B3("AppMessage")) {
            tVar.field_msgId = j17;
            tVar.field_msgTalker = str;
        } else {
            tVar.field_msgId = j17;
        }
        if (super.get(tVar, new java.lang.String[0])) {
            return tVar;
        }
        return null;
    }

    public android.database.Cursor z0(int i17, com.tencent.wcdb.support.CancellationSignal cancellationSignal) {
        l75.k0 k0Var = this.f188906e;
        if (!(k0Var instanceof d95.b0)) {
            return null;
        }
        return ((d95.b0) k0Var).P().query(false, "AppMessage", ot0.t.E.f316954c, "msgTalker IS NULL", new java.lang.String[0], null, null, null, i17 + "", cancellationSignal);
    }
}
