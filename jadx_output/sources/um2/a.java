package um2;

/* loaded from: classes3.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f428706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ um2.g f428707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(um2.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f428707e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new um2.a(this.f428707e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((um2.a) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f428706d;
        um2.g gVar = this.f428707e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var = gVar.f428801f;
            if (jf0Var != null) {
                this.f428706d = 1;
                ya2.b2 b17 = jf0Var.Y().f410646a != null ? ya2.h.f460484a.b(jf0Var.Y().f410646a) : null;
                if (com.tencent.mm.sdk.platformtools.t8.K0(b17 != null ? b17.y0() : null)) {
                    com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPlugin", "update bg fail,contact is null!");
                    jf0Var.f113098x.setVisibility(8);
                    jf0Var.N.setVisibility(0);
                } else {
                    jf0Var.v1((b17 == null || (finderAuthInfo = b17.field_authInfo) == null) ? null : finderAuthInfo.getAuthProfession(), jf0Var.Y().f410647b, b17 != null ? b17.field_authInfo : null);
                    jf0Var.x1(b17 != null ? b17.y0() : "", jf0Var.Y().f410646a, this);
                }
                if (f0Var == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return f0Var;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.live.plugin.jf0 jf0Var2 = gVar.f428801f;
        if (jf0Var2 != null) {
            this.f428706d = 2;
            com.tencent.mm.plugin.finder.live.plugin.oo0.Z(jf0Var2, null, null, new com.tencent.mm.plugin.finder.live.plugin.ef0(jf0Var2, null), 3, null);
            if (f0Var == aVar) {
                return aVar;
            }
        }
        return f0Var;
    }
}
