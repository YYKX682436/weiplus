package mx0;

/* loaded from: classes3.dex */
public final class a5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ py0.f0 f331825d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331826e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f331827f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(py0.f0 f0Var, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331825d = f0Var;
        this.f331826e = shootComposingPluginLayout;
        this.f331827f = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.a5(this.f331825d, this.f331826e, this.f331827f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.a5 a5Var = (mx0.a5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a5Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String r17 = i65.a.r(this.f331826e.getContext(), com.tencent.mm.R.string.m6h);
        kotlin.jvm.internal.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Integer(this.f331827f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f331825d.c(format);
        return jz5.f0.f302826a;
    }
}
