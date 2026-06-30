package im2;

/* loaded from: classes3.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f292457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292458e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292458e = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new im2.n5(this.f292458e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.n5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f292457d;
        im2.h6 h6Var = this.f292458e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f292457d = 1;
            ya2.b2 b17 = h6Var.Y().f410646a != null ? ya2.h.f460484a.b(h6Var.Y().f410646a) : null;
            if (com.tencent.mm.sdk.platformtools.t8.K0(b17 != null ? b17.y0() : null)) {
                com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "update bg fail,contact is null!");
                h6Var.f292371r.setVisibility(8);
                h6Var.G.setVisibility(0);
            } else {
                h6Var.i((b17 == null || (finderAuthInfo = b17.field_authInfo) == null) ? null : finderAuthInfo.getAuthProfession(), h6Var.Y().f410647b, b17 != null ? b17.field_authInfo : null);
                h6Var.m(b17 != null ? b17.y0() : "", h6Var.Y().f410646a, b17, this);
            }
            if (f0Var == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f292457d = 2;
        h6Var.l(this);
        return f0Var == aVar ? aVar : f0Var;
    }
}
