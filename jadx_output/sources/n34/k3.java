package n34;

/* loaded from: classes.dex */
public final class k3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f334653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f334654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334653d = u3Var;
        this.f334654e = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        n34.k3 k3Var = new n34.k3(this.f334653d, this.f334654e, continuation);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        return k3Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        n34.k3 k3Var = (n34.k3) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        k3Var.invokeSuspend(f0Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f334653d.dismiss();
        android.content.Context context = this.f334654e;
        java.lang.String string = context.getString(com.tencent.mm.R.string.f493242jf0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        db5.t7.g(context, string);
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.SnsGalleryStarHelper$doChangeStarInternal$1$2");
        return f0Var;
    }
}
