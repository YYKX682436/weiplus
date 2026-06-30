package g63;

/* loaded from: classes8.dex */
public final class s extends g63.q0 {

    /* renamed from: b, reason: collision with root package name */
    public g63.c f269172b;

    /* renamed from: c, reason: collision with root package name */
    public g63.d f269173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g63.p0 delegate) {
        super(delegate);
        kotlin.jvm.internal.o.g(delegate, "delegate");
    }

    public static final void a(g63.s sVar, z53.i iVar, long j17, int i17) {
        sVar.getClass();
        java.lang.String str = j17 == 72 ? "2" : null;
        boolean u07 = iVar.u0();
        com.tencent.mm.game.report.d dVar = com.tencent.mm.game.report.e.f68194a;
        g63.p0 p0Var = sVar.f269164a;
        if (u07) {
            int x17 = ((g63.j) p0Var).x();
            java.lang.String field_sessionId = iVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId, "field_sessionId");
            dVar.e(i17 + 1, j17, x17, field_sessionId, 0L, "", 0L, "", iVar.t0(), e63.a.f249817a, str);
            return;
        }
        y53.m Di = ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Di(iVar.field_selfUserName);
        if (Di != null) {
            int x18 = ((g63.j) p0Var).x();
            java.lang.String field_sessionId2 = iVar.field_sessionId;
            kotlin.jvm.internal.o.f(field_sessionId2, "field_sessionId");
            long j18 = Di.field_accountType;
            java.lang.String field_selfUserName = iVar.field_selfUserName;
            kotlin.jvm.internal.o.f(field_selfUserName, "field_selfUserName");
            y53.m mVar = iVar.F;
            kotlin.jvm.internal.o.d(mVar);
            long j19 = mVar.field_accountType;
            java.lang.String field_talker = iVar.field_talker;
            kotlin.jvm.internal.o.f(field_talker, "field_talker");
            dVar.e(i17 + 1, j17, x18, field_sessionId2, j18, field_selfUserName, j19, field_talker, iVar.t0(), e63.a.f249817a, str);
        }
    }
}
