package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class kf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f123900d;

    /* renamed from: e, reason: collision with root package name */
    public int f123901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC f123902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kf(com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f123902f = finderProfileTabUIC;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.profile.uic.kf(this.f123902f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.profile.uic.kf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.wechat.aff.emoticon.s sVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f123901e;
        com.tencent.mm.plugin.finder.profile.uic.FinderProfileTabUIC finderProfileTabUIC = this.f123902f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.appcompat.app.AppCompatActivity activity = finderProfileTabUIC.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            sVar = ((com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.profile.uic.FinderProfileAllLayoutUIC.class)).f123416f;
            sVar.c(finderProfileTabUIC.f123464z);
            sVar.f216664b = kotlin.jvm.internal.o.b(finderProfileTabUIC.B, finderProfileTabUIC.F7()) || bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonFinderProfileIsAuthor()) == 1;
            this.f123900d = sVar;
            this.f123901e = 1;
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
            sVar = (com.tencent.wechat.aff.emoticon.s) this.f123900d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.profile.uic.jf jfVar = new com.tencent.mm.plugin.finder.profile.uic.jf(sVar, finderProfileTabUIC, null);
        this.f123900d = null;
        this.f123901e = 2;
        if (kotlinx.coroutines.l.g(g3Var, jfVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
