package yy0;

/* loaded from: classes4.dex */
public final class b8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.ib f468033d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(dm.ib ibVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468033d = ibVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.b8(this.f468033d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.b8 b8Var = (yy0.b8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        b8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        g65.a aVar2 = (g65.a) i95.n0.c(g65.a.class);
        dm.ib ibVar = this.f468033d;
        java.lang.String str = ibVar.field_work_id;
        long j17 = ibVar.field_confirm_remux_time_stamp;
        long j18 = ibVar.field_confirm_publish_video_time_stamp;
        long j19 = ibVar.field_start_remux_time_stamp;
        long j27 = ibVar.field_remux_success_time_stamp;
        int i17 = ibVar.field_is_killed_process_restart;
        int i18 = ibVar.field_work_code;
        kotlin.jvm.internal.o.d(aVar2);
        kotlin.jvm.internal.o.d(str);
        g65.a.hg(aVar2, 34, 4, str, 0, 0, i18, j19, j27, j17, j18, i17, null, null, null, null, 30744, null);
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = ibVar.field_post_session_id;
        kotlin.jvm.internal.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(6, field_post_session_id, 0L, 0L);
        return jz5.f0.f302826a;
    }
}
