package yx0;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f467502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467503f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467504g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z17, java.lang.String str, yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467502e = z17;
        this.f467503f = str;
        this.f467504g = b8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.o3(this.f467502e, this.f467503f, this.f467504g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.o3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f467501d;
        java.lang.String str = this.f467503f;
        yx0.b8 b8Var = this.f467504g;
        boolean z17 = this.f467502e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = z17 ? 1 : 2;
            if (!(str.length() > 0)) {
                ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).H0(str, z17, false);
                return jz5.f0.f302826a;
            }
            rt3.j jVar = rt3.j.f399540a;
            java.lang.String str2 = this.f467503f;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            r45.h53 h53Var = r45.h53.FromScene_PostPage;
            java.lang.String selfFinderUsername = b8Var.f467177d.getSelfFinderUsername();
            this.f467501d = 1;
            obj = jVar.a(str2, i18, currentTimeMillis, h53Var, selfFinderUsername, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) b8Var.f467177d).H0(str, z17, ((java.lang.Boolean) obj).booleanValue());
        return jz5.f0.f302826a;
    }
}
