package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f124403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f124404e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f124404e = finderProfileAllLayoutUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.z0(this.f124404e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.z0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        com.tencent.mm.modelbase.o oVar;
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mm.modelbase.o oVar2;
        com.tencent.mm.protobuf.f fVar2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f124403d;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = this.f124404e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            android.app.Activity context = finderProfileAllLayoutUIC.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
            if (p2Var != null) {
                p2Var.O6(11847, 10, 1);
            }
            int intExtra = finderProfileAllLayoutUIC.getIntent().getIntExtra("finder_from_feed_type", 0);
            java.lang.String stringExtra = finderProfileAllLayoutUIC.getIntent().getStringExtra("finder_from_feed_dup_flag");
            boolean hasExtra = finderProfileAllLayoutUIC.getIntent().hasExtra("finder_from_session_buffer");
            jz5.g gVar = finderProfileAllLayoutUIC.f123414d;
            java.lang.String stringExtra2 = hasExtra ? finderProfileAllLayoutUIC.getIntent().getStringExtra("finder_from_session_buffer") : ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(finderProfileAllLayoutUIC.U6(), stringExtra, ((r45.qt2) ((jz5.n) gVar).getValue()).getInteger(7));
            java.lang.String username = finderProfileAllLayoutUIC.getUsername();
            java.lang.String str = username == null ? "" : username;
            androidx.appcompat.app.AppCompatActivity activity = finderProfileAllLayoutUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            db2.v1 v1Var = new db2.v1(str, ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6().getInteger(8), finderProfileAllLayoutUIC.U6(), intExtra == 1 ? ((java.lang.Number) ((jz5.n) finderProfileAllLayoutUIC.f123421n).getValue()).longValue() : 0L, stringExtra2 == null ? "" : stringExtra2, (r45.qt2) ((jz5.n) gVar).getValue());
            this.f124403d = 1;
            b17 = rm0.h.b(v1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar3 = (com.tencent.mm.modelbase.f) b17;
        android.app.Activity context2 = finderProfileAllLayoutUIC.getContext();
        kotlin.jvm.internal.o.g(context2, "context");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var2 = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var2 != null) {
            int i18 = fVar3.f70616b;
            com.tencent.mm.modelbase.i iVar = fVar3.f70620f;
            java.lang.Integer num = null;
            java.lang.Integer num2 = (iVar == null || (oVar2 = iVar.f70646f) == null || (fVar2 = oVar2.f70710a.f70684a) == null) ? null : new java.lang.Integer(fVar2.computeSize());
            com.tencent.mm.modelbase.i iVar2 = fVar3.f70620f;
            if (iVar2 != null && (oVar = iVar2.f70646f) != null && (fVar = oVar.f70711b.f70700a) != null) {
                num = new java.lang.Integer(fVar.computeSize());
            }
            p2Var2.Q6(11847, i18, new az2.g(num2, num, az2.j.f16133r.a(fVar3)));
        }
        if (fVar3.f70615a == 0 && fVar3.f70616b == 0) {
            com.tencent.mars.xlog.Log.i("Finder.ProfileAllLayoutUIC", "homePage success");
            finderProfileAllLayoutUIC.Y6((r45.nb1) fVar3.f70618d);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.ProfileAllLayoutUIC", "homePage errCode: " + fVar3.f70616b + ", errType: " + fVar3.f70615a + ", errMsg: " + fVar3.f70617c);
            finderProfileAllLayoutUIC.X6(false);
        }
        return jz5.f0.f302826a;
    }
}
