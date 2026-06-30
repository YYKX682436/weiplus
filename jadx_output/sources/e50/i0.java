package e50;

/* loaded from: classes11.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f249501d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e50.z0 f249502e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b03.a0 f249503f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e50.z0 z0Var, b03.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f249502e = z0Var;
        this.f249503f = a0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new e50.i0(this.f249502e, this.f249503f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((e50.i0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        io.flutter.embedding.engine.FlutterEngine flutterEngine;
        io.flutter.embedding.engine.plugins.PluginRegistry plugins;
        io.flutter.embedding.engine.FlutterEngine flutterEngine2;
        io.flutter.embedding.engine.plugins.PluginRegistry plugins2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f249501d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q qVar = this.f249502e.f249558e;
            if (qVar != null) {
                this.f249501d = 1;
                if (qVar.b(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        this.f249502e.bj(false);
        pi0.q qVar2 = this.f249502e.f249558e;
        if (qVar2 != null && (flutterEngine2 = qVar2.f354701e) != null && (plugins2 = flutterEngine2.getPlugins()) != null) {
            plugins2.add(new c61.ha());
        }
        pi0.q qVar3 = this.f249502e.f249558e;
        if (qVar3 != null && (flutterEngine = qVar3.f354701e) != null && (plugins = flutterEngine.getPlugins()) != null) {
            plugins.add(new j03.d());
        }
        ((ku5.t0) ku5.t0.f312615d).B(new e50.g0(this.f249502e));
        ku5.u0 u0Var = ku5.t0.f312615d;
        e50.h0 h0Var = new e50.h0(this.f249503f);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(h0Var, 1000L, false);
        return jz5.f0.f302826a;
    }
}
