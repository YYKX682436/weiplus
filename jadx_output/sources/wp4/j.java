package wp4;

/* loaded from: classes4.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448413d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448414e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448415f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448416g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, int i18, wp4.x xVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448414e = i17;
        this.f448415f = i18;
        this.f448416g = xVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.j(this.f448414e, this.f448415f, this.f448416g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.j) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448413d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            zp4.e eVar = zp4.e.f474954a;
            int i18 = this.f448415f;
            int i19 = this.f448414e;
            dm.q0 c17 = eVar.c(i19, i18);
            wp4.x xVar = this.f448416g;
            if (c17 == null) {
                com.tencent.mars.xlog.Log.e(xVar.f448453d, "deleteTimeLineFeedFakeVideo get info is null " + i19);
                return f0Var;
            }
            com.tencent.mars.xlog.Log.i(xVar.f448453d, "deleteTimeLineFeedFakeVideo >> workType: " + c17.field_work_type);
            if (c17.field_work_type != 4007) {
                java.lang.String field_work_id = c17.field_work_id;
                kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
                eVar.f(field_work_id, 4010);
            }
            aq4.a.f13201a.a(c17.field_work_id);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.i iVar = new wp4.i(c17, null);
            this.f448413d = 1;
            if (kotlinx.coroutines.l.g(g3Var, iVar, this) == aVar) {
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
