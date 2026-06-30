package uq0;

/* loaded from: classes4.dex */
public final class f extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f430197e = {l75.n0.getCreateSQLs(uq0.e.f430196t, "MagicSclFrameSetInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f430198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(l75.k0 db6) {
        super(db6, uq0.e.f430196t, "MagicSclFrameSetInfo", dm.a8.f235664i);
        kotlin.jvm.internal.o.g(db6, "db");
        l75.e0 e0Var = uq0.e.f430196t;
        this.f430198d = db6;
    }

    public final uq0.e y0(java.lang.String bizName, java.lang.String frameSetId) {
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(frameSetId, "frameSetId");
        uq0.e eVar = new uq0.e();
        eVar.field_bizName = bizName;
        eVar.field_frameSetName = vq0.a.b(frameSetId);
        java.lang.String q07 = r26.n0.q0(frameSetId, "-", frameSetId);
        eVar.field_frameSetRootPath = r26.n0.s0(q07, "_", q07);
        if (get(eVar, "bizName", "frameSetName", "frameSetRootPath")) {
            return eVar;
        }
        return null;
    }
}
