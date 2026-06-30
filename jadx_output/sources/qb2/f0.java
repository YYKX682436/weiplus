package qb2;

/* loaded from: classes10.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.t f361205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f361206e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361207f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361208g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(qb2.t tVar, qb2.g0 g0Var, java.lang.String str, android.view.View view) {
        super(4);
        this.f361205d = tVar;
        this.f361206e = g0Var;
        this.f361207f = str;
        this.f361208g = view;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        if (intValue == 0 && intValue2 == 0) {
            pm0.v.X(new qb2.e0(booleanValue, this.f361206e, this.f361205d, this.f361207f, this.f361208g));
        }
        com.tencent.mm.plugin.finder.report.p pVar = com.tencent.mm.plugin.finder.report.p.f125222a;
        java.lang.String field_sessionId = this.f361205d.field_sessionId;
        kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
        com.tencent.mm.plugin.finder.report.a6 a6Var = com.tencent.mm.plugin.finder.report.p.f125224c;
        boolean z17 = a6Var.f124949a;
        if (!z17) {
            com.tencent.mm.plugin.finder.report.a6 a6Var2 = com.tencent.mm.plugin.finder.report.p.f125223b;
            a6Var2.getClass();
            if (a6Var2.f124949a) {
                a6Var2.b(field_sessionId, 2);
            }
        } else if (z17) {
            a6Var.b(field_sessionId, 2);
        }
        com.tencent.mm.plugin.finder.report.p.f125227f.f125145g = r7.field_unReadCount;
        return jz5.f0.f302826a;
    }
}
