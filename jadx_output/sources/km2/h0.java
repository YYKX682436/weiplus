package km2;

/* loaded from: classes3.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km2.i0 f309105a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.i f309106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f309107c;

    public h0(km2.i0 i0Var, com.tencent.mm.modelbase.i iVar, kotlin.coroutines.Continuation continuation) {
        this.f309105a = i0Var;
        this.f309106b = iVar;
        this.f309107c = continuation;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        long j17;
        r45.p61 p61Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.d(fVar);
        lm2.s sVar = (lm2.s) this.f309105a;
        sVar.getClass();
        com.tencent.mm.modelbase.i cgi = this.f309106b;
        kotlin.jvm.internal.o.g(cgi, "cgi");
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && (p61Var = (r45.p61) fVar.f70618d) != null) {
            j17 = p61Var.f382784f;
            java.util.LinkedList<r45.ch1> app_msg_list = p61Var.f382783e;
            kotlin.jvm.internal.o.f(app_msg_list, "app_msg_list");
            for (r45.ch1 ch1Var : app_msg_list) {
                if (((r45.qm1) ch1Var.getCustom(8)) == null) {
                    java.lang.String string = ((db2.u0) cgi).f228185t.getString(1);
                    if (string == null) {
                        string = "";
                    }
                    r45.qm1 qm1Var = new r45.qm1();
                    int i17 = qs5.v.f366472a;
                    qm1Var.set(0, 1);
                    qm1Var.set(1, string);
                    ch1Var.set(8, qm1Var);
                }
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : app_msg_list) {
                if (lm2.h0.f319393j.contains(java.lang.Integer.valueOf(((r45.ch1) obj2).getInteger(1)))) {
                    arrayList.add(obj2);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj3 : app_msg_list) {
                if (((r45.ch1) obj3).getInteger(1) == 20062) {
                    arrayList2.add(obj3);
                }
            }
            kotlinx.coroutines.l.f(null, new lm2.r(sVar, p61Var.f382786h, p61Var.f382782d, arrayList, arrayList2, kz5.p0.f313996d, null), 1, null);
        } else {
            j17 = 1000;
        }
        this.f309107c.resumeWith(kotlin.Result.m521constructorimpl(new km2.j0(true, j17)));
        return jz5.f0.f302826a;
    }
}
