package n34;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334648d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n34.p f334649e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.ui.widget.dialog.u3 u3Var, n34.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334648d = u3Var;
        this.f334649e = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        n34.k kVar = new n34.k(this.f334648d, this.f334649e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        return kVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        n34.k kVar = (n34.k) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        kVar.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334648d.dismiss();
        n34.p pVar = this.f334649e;
        java.lang.String string = pVar.c().getString(com.tencent.mm.R.string.f493242jf0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.g(pVar.c(), string);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.CommentDetailStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }
}
