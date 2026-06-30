package yy0;

/* loaded from: classes4.dex */
public final class x7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f468412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f468413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yy0.g8 f468414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n55.e f468415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(java.lang.String str, yy0.g8 g8Var, n55.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468413e = str;
        this.f468414f = g8Var;
        this.f468415g = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.x7(this.f468413e, this.f468414f, this.f468415g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yy0.x7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f468412d;
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
        java.lang.String str = this.f468413e;
        dm.ib d17 = dVar.d(str);
        n55.e eVar = this.f468415g;
        yy0.g8 g8Var = this.f468414f;
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e(g8Var.f468112d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", is not find");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            yy0.w7 w7Var = new yy0.w7(eVar, null);
            this.f468412d = 2;
            return kotlinx.coroutines.l.g(g3Var, w7Var, this) == aVar ? aVar : f0Var;
        }
        com.tencent.mars.xlog.Log.i(g8Var.f468112d, "getBackgroundVideoBasicInfo >> workTagId: " + str + ", workType: " + d17.field_work_type + ", is find");
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
        yy0.v7 v7Var = new yy0.v7(eVar, aVar2, null);
        this.f468412d = 1;
        return kotlinx.coroutines.l.g(g3Var2, v7Var, this) == aVar ? aVar : f0Var;
    }
}
