package mx0;

/* loaded from: classes5.dex */
public final class e9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331967d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f331968e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f331967d = shootComposingPluginLayout;
        this.f331968e = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.e9(this.f331967d, this.f331968e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.e9 e9Var = (mx0.e9) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        e9Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.j3 recordTimePlugin;
        mx0.g3 recordPlugin;
        mx0.g3 recordPlugin2;
        mx0.g3 recordPlugin3;
        mx0.j3 recordTimePlugin2;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        this.f331967d.s0();
        if (this.f331968e) {
            recordTimePlugin = this.f331967d.getRecordTimePlugin();
            recordTimePlugin.getClass();
            recordTimePlugin.f332065g = java.lang.System.currentTimeMillis();
            recordTimePlugin.f332066h = ((ku5.t0) ku5.t0.f312615d).e(new mx0.h3(recordTimePlugin), 0L, 50L);
        } else {
            this.f331967d.R0();
            recordPlugin = this.f331967d.getRecordPlugin();
            recordPlugin.b(false);
            recordPlugin2 = this.f331967d.getRecordPlugin();
            recordPlugin2.reset();
            recordPlugin3 = this.f331967d.getRecordPlugin();
            recordPlugin3.b(true);
            recordTimePlugin2 = this.f331967d.getRecordTimePlugin();
            recordTimePlugin2.b();
        }
        return jz5.f0.f302826a;
    }
}
