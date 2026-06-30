package yw3;

/* loaded from: classes11.dex */
public final class g2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f466748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466749e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466749e = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.g2(this.f466749e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.g2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466748d;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI = this.f466749e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            repairerFlutterHybridNavigatorDemoUI.e = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), repairerFlutterHybridNavigatorDemoUI.f, null, false, null, 28, null);
            pi0.l1 l1Var = repairerFlutterHybridNavigatorDemoUI.e;
            if (l1Var != null) {
                this.f466748d = 1;
                if (l1Var.o("/", null, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                return jz5.f0.f302826a;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pi0.l1 l1Var2 = repairerFlutterHybridNavigatorDemoUI.e;
        if (l1Var2 != null) {
            l1Var2.q(new yw3.o());
        }
        pi0.l1 l1Var3 = repairerFlutterHybridNavigatorDemoUI.e;
        if (l1Var3 != null) {
            androidx.appcompat.app.AppCompatActivity context = repairerFlutterHybridNavigatorDemoUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
            this.f466748d = 2;
            s17 = l1Var3.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
            if (s17 == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
