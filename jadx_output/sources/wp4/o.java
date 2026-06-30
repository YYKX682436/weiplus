package wp4;

/* loaded from: classes4.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448425d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448426e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448427f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n55.e f448428g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, wp4.x xVar, n55.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448426e = str;
        this.f448427f = xVar;
        this.f448428g = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.o(this.f448426e, this.f448427f, this.f448428g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448425d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (i17 == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        zp4.e eVar = zp4.e.f474954a;
        java.lang.String str = this.f448426e;
        dm.q0 d17 = eVar.d(str);
        n55.e eVar2 = this.f448428g;
        wp4.x xVar = this.f448427f;
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(xVar.f448453d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is not find");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.n nVar = new wp4.n(eVar2, null);
            this.f448425d = 2;
            return kotlinx.coroutines.l.g(g3Var, nVar, this) == aVar ? aVar : f0Var;
        }
        com.tencent.mars.xlog.Log.i(xVar.f448453d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is find");
        int i18 = d17.field_work_type;
        java.lang.String field_work_id = d17.field_work_id;
        kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
        long j17 = d17.field_confirm_remux_time_stamp;
        java.lang.String field_output_video_path = d17.field_output_video_path;
        kotlin.jvm.internal.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = d17.field_output_thumb_path;
        kotlin.jvm.internal.o.f(field_output_thumb_path, "field_output_thumb_path");
        o55.a aVar2 = new o55.a(i18, field_work_id, j17, field_output_video_path, field_output_thumb_path, 0, 0L, 0, null, 480, null);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        wp4.m mVar = new wp4.m(eVar2, aVar2, null);
        this.f448425d = 1;
        return kotlinx.coroutines.l.g(g3Var2, mVar, this) == aVar ? aVar : f0Var;
    }
}
