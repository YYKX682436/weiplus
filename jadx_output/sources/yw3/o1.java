package yw3;

/* loaded from: classes11.dex */
public final class o1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466831d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f466832e;

    /* renamed from: f, reason: collision with root package name */
    public int f466833f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466834g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Class f466835h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI, java.lang.Class cls, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466834g = repairerFlutterHybridNavigatorDemoUI;
        this.f466835h = cls;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.o1(this.f466834g, this.f466835h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.o1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466833f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "leak_monitor", null, false, null, 28, null);
            flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            flutterPageStyle.f68125o = false;
            flutterPageStyle.f68117d = 1;
            flutterPageStyle.f68118e = -1;
            this.f466831d = l1Var;
            this.f466832e = flutterPageStyle;
            this.f466833f = 1;
            if (l1Var.o("/", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle2 = (com.tencent.mm.flutter.ui.FlutterPageStyle) this.f466832e;
            pi0.l1 l1Var2 = (pi0.l1) this.f466831d;
            kotlin.ResultKt.throwOnFailure(obj);
            flutterPageStyle = flutterPageStyle2;
            l1Var = l1Var2;
        }
        androidx.appcompat.app.AppCompatActivity context = this.f466834g.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.Class cls = this.f466835h;
        this.f466831d = null;
        this.f466832e = null;
        this.f466833f = 2;
        if (pi0.l1.v(l1Var, context, flutterPageStyle, cls, null, null, this, 24, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
