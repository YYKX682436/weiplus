package ml2;

/* loaded from: classes10.dex */
public final class a0 implements e62.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml2.c0 f327193a;

    public a0(ml2.c0 c0Var) {
        this.f327193a = c0Var;
    }

    @Override // e62.e
    public void a(java.lang.Object obj, l52.g gVar, android.view.View view) {
    }

    @Override // e62.e
    public void b(java.lang.Object obj, l52.g gVar, android.view.View view) {
        if (gVar == null) {
            return;
        }
        r45.p86 p86Var = gVar.f316607a;
        java.lang.String str = p86Var.f382856y;
        int i17 = gVar.f316608b;
        java.lang.String feedId = p86Var.f382838d;
        kotlin.jvm.internal.o.f(feedId, "feedId");
        long E1 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316607a.f382838d);
        long E12 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316609c);
        ml2.c0 c0Var = this.f327193a;
        ml2.x1 x1Var = c0Var.f327316j;
        java.lang.String str2 = c0Var.f327317k;
        java.lang.String str3 = gVar.f316607a.A;
        if (str3 == null) {
            str3 = "";
        }
        java.lang.String str4 = str3;
        ml2.e0 e0Var = gVar.f316610d == 1 ? ml2.e0.f327370e : ml2.e0.f327371f;
        ml2.v3[] v3VarArr = ml2.v3.f328148d;
        java.lang.String str5 = gVar.f316616j;
        java.lang.String talkerUsername = gVar.f316617k;
        kotlin.jvm.internal.o.f(talkerUsername, "talkerUsername");
        long E13 = com.tencent.mm.sdk.platformtools.t8.E1(gVar.f316607a.f382838d);
        int D1 = com.tencent.mm.sdk.platformtools.t8.D1(c0Var.f327317k, 0);
        java.lang.String gmsgId = gVar.f316618l;
        kotlin.jvm.internal.o.f(gmsgId, "gmsgId");
        ml2.f0 f0Var = new ml2.f0(null, str, i17, feedId, E1, E12, x1Var, str2, -1, str4, e0Var, true, true, 1, null, null, null, str5, 0L, talkerUsername, 0, E13, D1, gmsgId, null, java.lang.Integer.valueOf(gVar.f316611e), 18202624, null);
        ml2.x0 x0Var = c0Var.f327307a;
        if (x0Var != null) {
            ((ml2.b) x0Var).a(f0Var, false);
        }
    }
}
