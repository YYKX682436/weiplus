package qz0;

/* loaded from: classes.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.test.TemplateTestUI f367816d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny0.e f367817e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI, ny0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367816d = templateTestUI;
        this.f367817e = eVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qz0.d(this.f367816d, this.f367817e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qz0.d dVar = (qz0.d) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        dVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.mj_template.test.TemplateTestUI.f70356e;
        com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI = this.f367816d;
        android.widget.TextView T6 = templateTestUI.T6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task id ");
        ny0.e eVar = this.f367817e;
        sb6.append(eVar.f341392a);
        sb6.append('\n');
        T6.append(sb6.toString());
        for (java.lang.String str : eVar.f341393b) {
            templateTestUI.T6().append("local path " + str + '\n');
        }
        return jz5.f0.f302826a;
    }
}
