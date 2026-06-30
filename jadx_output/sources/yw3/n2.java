package yw3;

/* loaded from: classes11.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466822d;

    /* renamed from: e, reason: collision with root package name */
    public int f466823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f466824f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466824f = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.n2(this.f466824f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.n2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466823e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            if (this.f466824f.e != null) {
                return f0Var;
            }
            l1Var = new pi0.l1(Ui, "flutter_magic_brush_demo", null, false, null, 28, null);
            this.f466822d = l1Var;
            this.f466823e = 1;
            if (l1Var.o("/", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l1Var = (pi0.l1) this.f466822d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        ((com.tencent.mm.plugin.magicbrush.h5) ((jc3.d0) i95.n0.c(jc3.d0.class))).getClass();
        dq0.q qVar = new dq0.q(false);
        cd3.c cVar = new cd3.c(qVar);
        ((dq0.c0) ((dq0.i) i95.n0.c(dq0.i.class))).Ai("MagicSclDemo", cVar);
        i95.m c17 = i95.n0.c(dq0.i.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        l1Var.a(kz5.n0.S0(kz5.p1.d(qVar, cVar, c17)));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f466824f;
        this.f466822d = null;
        this.f466823e = 2;
        return pi0.l1.v(l1Var, repairerFlutterWeUIDemoUI, flutterPageStyle, null, null, null, this, 28, null) == aVar ? aVar : f0Var;
    }
}
