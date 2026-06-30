package wp4;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f448437d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(dm.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448437d = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.s(this.f448437d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wp4.s sVar = (wp4.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        sVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        dm.q0 info = this.f448437d;
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut, " + currentTimeMillis);
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.f60551d = 4;
        snsFakeVideoLogStruct.f60556i = info.field_confirm_remux_time_stamp;
        snsFakeVideoLogStruct.f60557j = info.field_confirm_publish_video_time_stamp;
        snsFakeVideoLogStruct.f60558k = info.field_start_remux_time_stamp;
        snsFakeVideoLogStruct.f60559l = info.field_remux_success_time_stamp;
        snsFakeVideoLogStruct.f60561n = snsFakeVideoLogStruct.b("EncodeConfig", r26.i0.v(new st3.r(info.field_encode_target_width, info.field_encode_target_height, info.field_encode_video_bitrate, 0, info.field_encode_frame_rate, info.field_source_video_rotate, 0, 0, false, false, 0, 0, info.field_encode_qp_switch, 0, 12232, null).toString(), ",", ";", false, 4, null), true);
        snsFakeVideoLogStruct.f60562o = info.field_is_sns_double_check;
        snsFakeVideoLogStruct.f60564q = info.field_is_killed_process_restart;
        snsFakeVideoLogStruct.f60553f = info.field_work_code;
        snsFakeVideoLogStruct.f60565r = info.field_tec_enter_scene;
        snsFakeVideoLogStruct.k();
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportWorkTimeOut >> " + snsFakeVideoLogStruct.f60556i + ", " + snsFakeVideoLogStruct.f60557j + ", " + snsFakeVideoLogStruct.f60558k + ", " + snsFakeVideoLogStruct.f60559l);
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = info.field_post_session_id;
        kotlin.jvm.internal.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(6, field_post_session_id, 0L, 0L);
        return jz5.f0.f302826a;
    }
}
