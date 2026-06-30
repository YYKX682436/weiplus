package qz0;

/* loaded from: classes.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.test.TemplateTestUI f367811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my0.g f367812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI, my0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367811d = templateTestUI;
        this.f367812e = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qz0.b(this.f367811d, this.f367812e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        qz0.b bVar = (qz0.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        bVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        int i17 = com.tencent.mm.mj_template.test.TemplateTestUI.f70356e;
        com.tencent.mm.mj_template.test.TemplateTestUI templateTestUI = this.f367811d;
        android.widget.TextView T6 = templateTestUI.T6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task id ");
        my0.g gVar = this.f367812e;
        sb6.append(gVar.f332662a);
        sb6.append('\n');
        T6.append(sb6.toString());
        templateTestUI.T6().append("local path " + gVar.f332663b + '\n');
        return jz5.f0.f302826a;
    }
}
