package iz0;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.ib f296043d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dm.ib ibVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296043d = ibVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new iz0.c(this.f296043d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        iz0.c cVar = (iz0.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        l75.k0 a17 = iz0.d.f296044a.a();
        dm.ib ibVar = this.f296043d;
        p75.n0 n0Var = dm.ib.f237670y;
        com.tencent.mars.xlog.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "insertVideoInfo result >> workTagId: " + this.f296043d.field_work_id + ", result: " + new m75.c(ibVar, true, null, null, "MicroMsg.SDK.BaseTemplateBackgroundVideoInfo").a(a17));
        return jz5.f0.f302826a;
    }
}
