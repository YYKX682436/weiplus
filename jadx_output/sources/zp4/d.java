package zp4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f474953d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dm.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474953d = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zp4.d(this.f474953d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        zp4.d dVar = (zp4.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        l75.k0 a17 = zp4.e.f474954a.a();
        dm.q0 q0Var = this.f474953d;
        p75.n0 n0Var = dm.q0.R;
        com.tencent.mars.xlog.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "insertVideoInfo result >> workTagId: " + this.f474953d.field_work_id + ", result: " + new m75.c(q0Var, true, null, null, "MicroMsg.SDK.BaseBackgroundVideoInfo").a(a17));
        return jz5.f0.f302826a;
    }
}
