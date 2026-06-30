package mz0;

/* loaded from: classes5.dex */
public final class p1 extends qz5.l implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f333021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c f333022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f333023f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(3, continuation);
        this.f333022e = cVar;
        this.f333023f = str;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mz0.p1 p1Var = new mz0.p1(this.f333022e, this.f333023f, (kotlin.coroutines.Continuation) obj3);
        p1Var.f333021d = (java.lang.Throwable) obj2;
        jz5.f0 f0Var = jz5.f0.f302826a;
        p1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.Throwable th6 = (java.lang.Throwable) this.f333021d;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Template.TemplateControlUIC", th6, "maas error", new java.lang.Object[0]);
        com.tencent.mm.plugin.recordvideo.ui.editor.music.component.c cVar = this.f333022e;
        if (cVar != null) {
            ((com.tencent.mm.plugin.recordvideo.ui.editor.music.component.k1) cVar).a(new cw3.e(th6), this.f333023f);
        }
        return jz5.f0.f302826a;
    }
}
