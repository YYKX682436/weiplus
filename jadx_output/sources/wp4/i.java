package wp4;

/* loaded from: classes4.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f448412d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(dm.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448412d = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.i(this.f448412d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wp4.i iVar = (wp4.i) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        iVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        dm.q0 q0Var = this.f448412d;
        java.lang.String field_work_id = q0Var.field_work_id;
        kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
        int i17 = q0Var.field_work_type;
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportUploadAction >> workTagId: " + field_work_id + ", action: 11, lastWorkType: " + i17 + ", currentWorkType: 4010");
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.p(field_work_id);
        snsFakeVideoLogStruct.f60551d = 11;
        snsFakeVideoLogStruct.f60554g = i17;
        snsFakeVideoLogStruct.f60555h = 4010;
        snsFakeVideoLogStruct.k();
        fe0.p4 p4Var = (fe0.p4) i95.n0.c(fe0.p4.class);
        java.lang.String field_post_session_id = q0Var.field_post_session_id;
        kotlin.jvm.internal.o.f(field_post_session_id, "field_post_session_id");
        ((ec4.h0) p4Var).wi(5, field_post_session_id, 0L, 0L);
        return jz5.f0.f302826a;
    }
}
