package n34;

/* loaded from: classes.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334550e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334549d = u3Var;
        this.f334550e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        n34.a5 a5Var = new n34.a5(this.f334549d, this.f334550e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        return a5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        n34.a5 a5Var = (n34.a5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a5Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334549d.dismiss();
        android.content.Context context = this.f334550e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f493242jf0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.g(context, string);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.TimelineStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }
}
