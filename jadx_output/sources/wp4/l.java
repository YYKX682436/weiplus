package wp4;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448421f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, wp4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448420e = str;
        this.f448421f = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.l(this.f448420e, this.f448421f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448419d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zp4.e eVar = zp4.e.f474954a;
            java.lang.String str = this.f448420e;
            dm.q0 d17 = eVar.d(str);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.e(this.f448421f.f448453d, "deleteWork get info is null " + str);
                return f0Var;
            }
            b5.w.c(com.tencent.mm.sdk.platformtools.x2.f193071a).b(str);
            aq4.a.f13201a.a(d17.field_work_id);
            eVar.f(str, 4002);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.k kVar = new wp4.k(str, d17, null);
            this.f448419d = 1;
            if (kotlinx.coroutines.l.g(g3Var, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return f0Var;
    }
}
