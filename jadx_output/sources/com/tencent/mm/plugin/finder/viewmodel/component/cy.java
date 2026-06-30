package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class cy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f134042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f134043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f134044f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f134045g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f134046h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy(java.lang.String str, android.content.Context context, int i17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f134043e = str;
        this.f134044f = context;
        this.f134045g = i17;
        this.f134046h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.viewmodel.component.cy(this.f134043e, this.f134044f, this.f134045g, this.f134046h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.viewmodel.component.cy) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f134042d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.viewmodel.component.dy dyVar = com.tencent.mm.plugin.finder.viewmodel.component.dy.f134172a;
            this.f134042d = 1;
            obj = com.tencent.mm.plugin.finder.viewmodel.component.dy.a(dyVar, this.f134043e, this);
            if (obj == aVar) {
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.plugin.finder.viewmodel.component.tx txVar = (com.tencent.mm.plugin.finder.viewmodel.component.tx) obj;
        com.tencent.mars.xlog.Log.i("Finder.PublishSecurityCheck", "[safeVerify] ret=" + txVar);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
        com.tencent.mm.plugin.finder.viewmodel.component.ay ayVar = new com.tencent.mm.plugin.finder.viewmodel.component.ay(txVar, this.f134044f, this.f134045g, this.f134046h, null);
        this.f134042d = 2;
        if (kotlinx.coroutines.l.g(g3Var, ayVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
