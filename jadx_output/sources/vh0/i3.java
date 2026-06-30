package vh0;

/* loaded from: classes8.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vh0.p3 f436882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo f436883e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(vh0.p3 p3Var, com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo iYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f436882d = p3Var;
        this.f436883e = iYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vh0.i3(this.f436882d, this.f436883e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        vh0.i3 i3Var = (vh0.i3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        i3Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        vh0.d1 d1Var = (vh0.d1) ((jz5.n) this.f436882d.f436938m).getValue();
        com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo extendedAgreement = this.f436883e;
        kotlin.jvm.internal.o.g(extendedAgreement, "extendedAgreement");
        ((vh0.f2) d1Var).Di("yuanbao_unified_scene", new com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo(extendedAgreement.f67865d, extendedAgreement.f67866e, extendedAgreement.f67867f, extendedAgreement.f67868g, extendedAgreement.f67869h, extendedAgreement.f67870i), true);
        return jz5.f0.f302826a;
    }
}
