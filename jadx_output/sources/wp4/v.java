package wp4;

/* loaded from: classes4.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f448446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f448447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f448448g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(int i17, java.lang.String str, int i18, kotlin.jvm.internal.f0 f0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f448445d = i17;
        this.f448446e = str;
        this.f448447f = i18;
        this.f448448g = f0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new wp4.v(this.f448445d, this.f448446e, this.f448447f, this.f448448g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        wp4.v vVar = (wp4.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        vVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = this.f448448g.f310116d;
        java.lang.String workTagId = this.f448446e;
        kotlin.jvm.internal.o.g(workTagId, "workTagId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportUploadAction >> workTagId: ");
        sb6.append(workTagId);
        sb6.append(", action: ");
        int i18 = this.f448445d;
        sb6.append(i18);
        sb6.append(", lastWorkType: ");
        int i19 = this.f448447f;
        sb6.append(i19);
        sb6.append(", currentWorkType: ");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.FakeVideoTecReporter", sb6.toString());
        com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct snsFakeVideoLogStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsFakeVideoLogStruct();
        snsFakeVideoLogStruct.p(workTagId);
        snsFakeVideoLogStruct.f60551d = i18;
        snsFakeVideoLogStruct.f60554g = i19;
        snsFakeVideoLogStruct.f60555h = i17;
        snsFakeVideoLogStruct.k();
        return jz5.f0.f302826a;
    }
}
