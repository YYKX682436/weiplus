package yy0;

/* loaded from: classes4.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f468013e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f468014f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468015g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n55.e f468016h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(int i17, int i18, yy0.g8 g8Var, n55.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468013e = i17;
        this.f468014f = i18;
        this.f468015g = g8Var;
        this.f468016h = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.a8(this.f468013e, this.f468014f, this.f468015g, this.f468016h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.a8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468012d;
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
        iz0.d dVar = iz0.d.f296044a;
        int i18 = this.f468013e;
        int i19 = this.f468014f;
        dm.ib c17 = dVar.c(i18, i19);
        n55.e eVar = this.f468016h;
        yy0.g8 g8Var = this.f468015g;
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e(g8Var.f468112d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ", is not find");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yy0.z7 z7Var = new yy0.z7(eVar, null);
            this.f468012d = 2;
            return kotlinx.coroutines.l.g(g3Var, z7Var, this) == aVar ? aVar : f0Var;
        }
        com.tencent.mars.xlog.Log.i(g8Var.f468112d, "getBackgroundVideoBasicInfoBySnsLocalId >> snsLocalId: " + i18 + ", createTime: " + i19 + ", workType: " + c17.field_work_type + ", is find");
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
        yy0.y7 y7Var = new yy0.y7(eVar, aVar2, null);
        this.f468012d = 1;
        return kotlinx.coroutines.l.g(g3Var2, y7Var, this) == aVar ? aVar : f0Var;
    }
}
