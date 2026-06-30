package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class e1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f123649d;

    /* renamed from: e, reason: collision with root package name */
    public int f123650e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC f123651f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.ob1 f123652g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC, r45.ob1 ob1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123651f = finderProfileAllLayoutUIC;
        this.f123652g = ob1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.e1(this.f123651f, this.f123652g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.e1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int size;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f123650e;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC finderProfileAllLayoutUIC = this.f123651f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            size = finderProfileAllLayoutUIC.T6().size();
            java.lang.Integer num = (java.lang.Integer) ((jz5.n) finderProfileAllLayoutUIC.f123423p).getValue();
            int intValue = num != null ? num.intValue() : 0;
            com.tencent.wechat.aff.emoticon.s sVar = finderProfileAllLayoutUIC.f123416f;
            sVar.c(intValue);
            sVar.f216664b = kotlin.jvm.internal.o.b(finderProfileAllLayoutUIC.getUsername(), (java.lang.String) ((jz5.n) finderProfileAllLayoutUIC.f123422o).getValue()) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonFinderProfileIsAuthor()) == 1;
            this.f123649d = size;
            this.f123650e = 1;
            if (sVar.e(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            size = this.f123649d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.profile.uic.d1 d1Var = new com.tencent.mm.plugin.finder.profile.uic.d1(finderProfileAllLayoutUIC, this.f123652g, size, null);
        this.f123650e = 2;
        if (kotlinx.coroutines.l.g(g3Var, d1Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
