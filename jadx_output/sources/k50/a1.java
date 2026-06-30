package k50;

/* loaded from: classes9.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f304177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f304178e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304179f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wf0.x1 f304180g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304181h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f304182i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f304183m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f304184n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(t21.v2 v2Var, java.lang.String str, wf0.x1 x1Var, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.storage.f9 f9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f304178e = v2Var;
        this.f304179f = str;
        this.f304180g = x1Var;
        this.f304181h = str2;
        this.f304182i = str3;
        this.f304183m = h0Var;
        this.f304184n = f9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new k50.a1(this.f304178e, this.f304179f, this.f304180g, this.f304181h, this.f304182i, this.f304183m, this.f304184n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((k50.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f304177d;
        java.lang.String str = this.f304181h;
        wf0.x1 x1Var = this.f304180g;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            t21.v2 v2Var = this.f304178e;
            java.lang.String f17 = v2Var.f();
            y15.d dVar = new y15.d();
            java.lang.String g17 = v2Var.g();
            kotlin.jvm.internal.o.f(g17, "getRecvXml(...)");
            dVar.fromXml(g17);
            r15.b j17 = dVar.j();
            r15.d j18 = j17 != null ? j17.j() : null;
            if (j18 != null) {
                j18.k(this.f304179f);
            }
            java.lang.String xml = dVar.toXml();
            int i18 = v2Var.f415022t;
            int i19 = v2Var.f415015m;
            ((vf0.y1) x1Var).Bi(this.f304181h, null, i19, this.f304182i, f17, i18, xml, 43, v2Var.E, "", v2Var.f415016n, v2Var.f415020r, null, v2Var.N, false, -1L, v2Var.Q, v2Var.R);
            ((vf0.y1) x1Var).getClass();
            t21.v2 h17 = t21.d3.h(str);
            kotlin.jvm.internal.h0 h0Var = this.f304183m;
            if (!com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) h0Var.f310123d) && h17 != null) {
                com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f304182i, h17.f415016n);
                i95.m c17 = i95.n0.c(tg3.u0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                java.lang.String e86 = tg3.u0.e8((tg3.u0) c17, null, bm5.f0.f22562g, (java.lang.String) h0Var.f310123d, false, 8, null);
                if (com.tencent.mm.vfs.w6.j(e86)) {
                    i95.m c18 = i95.n0.c(c35.m.class);
                    kotlin.jvm.internal.o.f(c18, "getService(...)");
                    java.lang.String p86 = c35.m.p8((c35.m) c18, n17, false, 2, null);
                    if (!kotlin.jvm.internal.o.b(e86, p86)) {
                        com.tencent.mm.vfs.w6.c(e86, p86);
                        com.tencent.mm.vfs.w6.h(e86);
                    }
                }
                ((vf0.y1) x1Var).Bi(this.f304181h, (java.lang.String) h0Var.f310123d, i19, this.f304182i, f17, i18, xml, 43, v2Var.E, "", v2Var.f415016n, v2Var.f415020r, null, v2Var.N, true, h17.f415016n, v2Var.Q, v2Var.R);
                com.tencent.mm.storage.f9 f9Var = this.f304184n;
                if (f9Var != null) {
                    kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
                    k50.z0 z0Var = new k50.z0(f9Var, n17, null);
                    this.f304177d = 1;
                    if (kotlinx.coroutines.l.g(p0Var, z0Var, this) == aVar) {
                        return aVar;
                    }
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        ((vf0.y1) x1Var).getClass();
        t21.d3.M(str);
        return jz5.f0.f302826a;
    }
}
