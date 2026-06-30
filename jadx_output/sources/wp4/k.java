package wp4;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448417d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f448418e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(java.lang.String str, dm.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448417d = str;
        this.f448418e = q0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.k(this.f448417d, this.f448418e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wp4.k kVar = (wp4.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f448418e.field_work_type;
        java.lang.String workTagId = this.f448417d;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", "reportUploadAction >> workTagId: " + workTagId + ", action: 8, lastWorkType: " + i17 + ", currentWorkType: 4002");
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.p(workTagId);
        snsFakeVideoLogStruct.f60551d = 8;
        snsFakeVideoLogStruct.f60554g = i17;
        snsFakeVideoLogStruct.f60555h = 4002;
        snsFakeVideoLogStruct.k();
        return jz5.f0.f302826a;
    }
}
