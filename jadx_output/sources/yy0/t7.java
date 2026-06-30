package yy0;

/* loaded from: classes4.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.ib f468343d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(dm.ib ibVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f468343d = ibVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yy0.t7(this.f468343d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        yy0.t7 t7Var = (yy0.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        t7Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        i95.m c17 = i95.n0.c(g65.a.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        dm.ib ibVar = this.f468343d;
        java.lang.String field_work_id = ibVar.field_work_id;
        kotlin.jvm.internal.o.f(field_work_id, "field_work_id");
        g65.a.hg((g65.a) c17, 34, 8, field_work_id, ibVar.field_work_type, 4002, 0, 0L, 0L, 0L, 0L, 0, null, null, null, null, 32736, null);
        return jz5.f0.f302826a;
    }
}
