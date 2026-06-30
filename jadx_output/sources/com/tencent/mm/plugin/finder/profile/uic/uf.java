package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class uf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f124268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f124269e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124269e = finderProfileTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.uf(this.f124269e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.uf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar2;
        com.tencent.mm.protobuf.f fVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f124268d;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f124269e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            i95.m c17 = i95.n0.c(cq.k.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String F7 = finderProfileTabUIC.F7();
            this.f124268d = 1;
            obj = rm0.h.b(new bq.x0(null, F7, null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2 && i17 != 3 && i17 != 4) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar3 = (com.tencent.mm.modelbase.f) obj;
        android.app.Activity context = finderProfileTabUIC.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var != null) {
            int i18 = fVar3.f70616b;
            com.tencent.mm.modelbase.i iVar = fVar3.f70620f;
            java.lang.Integer num = (iVar == null || (oVar2 = iVar.f70646f) == null || (fVar2 = oVar2.f70710a.f70684a) == null) ? null : new java.lang.Integer(fVar2.computeSize());
            com.tencent.mm.modelbase.i iVar2 = fVar3.f70620f;
            p2Var.Q6(10923, i18, new az2.g(num, (iVar2 == null || (oVar = iVar2.f70646f) == null || (fVar = oVar.f70711b.f70700a) == null) ? null : new java.lang.Integer(fVar.computeSize()), az2.j.f16133r.a(fVar3)));
        }
        r45.cp3 cp3Var = (r45.cp3) fVar3.f70618d;
        if (fVar3.b() && cp3Var != null) {
            java.util.LinkedList list = cp3Var.getList(1);
            kotlin.jvm.internal.o.f(list, "getTopic_list(...)");
            if (true ^ list.isEmpty()) {
                kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
                kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
                com.tencent.mm.plugin.finder.profile.uic.rf rfVar = new com.tencent.mm.plugin.finder.profile.uic.rf(cp3Var, finderProfileTabUIC, null);
                this.f124268d = 2;
                if (kotlinx.coroutines.l.g(g3Var, rfVar, this) == aVar) {
                    return aVar;
                }
                return jz5.f0.f302826a;
            }
        }
        if (finderProfileTabUIC.isSelfFlag()) {
            kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.profile.uic.sf sfVar = new com.tencent.mm.plugin.finder.profile.uic.sf(finderProfileTabUIC, null);
            this.f124268d = 3;
            if (kotlinx.coroutines.l.g(g3Var2, sfVar, this) == aVar) {
                return aVar;
            }
        } else {
            com.tencent.mars.xlog.Log.e("Finder.FinderProfileTabUIC", "requestFinderGetTemplateList errType=" + fVar3.f70615a + ", errCode=" + fVar3.f70616b + ", errMsg=" + fVar3.f70617c + ", resp=" + cp3Var);
            kotlinx.coroutines.p0 p0Var3 = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var3 = kotlinx.coroutines.internal.b0.f310484a;
            com.tencent.mm.plugin.finder.profile.uic.tf tfVar = new com.tencent.mm.plugin.finder.profile.uic.tf(finderProfileTabUIC, null);
            this.f124268d = 4;
            if (kotlinx.coroutines.l.g(g3Var3, tfVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
