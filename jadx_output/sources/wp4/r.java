package wp4;

/* loaded from: classes4.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.x f448435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n55.e f448436h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, int i18, wp4.x xVar, n55.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448433e = i17;
        this.f448434f = i18;
        this.f448435g = xVar;
        this.f448436h = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.r(this.f448433e, this.f448434f, this.f448435g, this.f448436h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wp4.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f448432d;
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
        int i18 = this.f448433e;
        int i19 = this.f448434f;
        dm.q0 c17 = eVar.c(i18, i19);
        n55.e eVar2 = this.f448436h;
        wp4.x xVar = this.f448435g;
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e(xVar.f448453d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ", is not find");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            wp4.q qVar = new wp4.q(eVar2, null);
            this.f448432d = 2;
            return kotlinx.coroutines.l.g(g3Var, qVar, this) == aVar ? aVar : f0Var;
        }
        com.tencent.mars.xlog.Log.i(xVar.f448453d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ",  is find");
        int i27 = c17.field_work_type;
        java.lang.String field_work_id = c17.field_work_id;
        kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
        long j17 = c17.field_confirm_remux_time_stamp;
        java.lang.String field_output_video_path = c17.field_output_video_path;
        kotlin.jvm.internal.o.f(field_output_video_path, "field_output_video_path");
        java.lang.String field_output_thumb_path = c17.field_output_thumb_path;
        kotlin.jvm.internal.o.f(field_output_thumb_path, "field_output_thumb_path");
        o55.a aVar2 = new o55.a(i27, field_work_id, j17, field_output_video_path, field_output_thumb_path, c17.field_work_code, c17.field_remux_success_time_stamp, 0, c17.field_sns_ext_info, 128, null);
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        wp4.p pVar = new wp4.p(eVar2, aVar2, null);
        this.f448432d = 1;
        return kotlinx.coroutines.l.g(g3Var2, pVar, this) == aVar ? aVar : f0Var;
    }
}
