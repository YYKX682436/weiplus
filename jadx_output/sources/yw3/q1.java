package yw3;

/* loaded from: classes11.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f466854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pi0.l1 f466855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI f466856f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(pi0.l1 l1Var, com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterHybridNavigatorDemoUI repairerFlutterHybridNavigatorDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466855e = l1Var;
        this.f466856f = repairerFlutterHybridNavigatorDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.q1(this.f466855e, this.f466856f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466854d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            java.util.Map l17 = kz5.c1.l(new jz5.l("user_info", "test_user"));
            this.f466854d = 1;
            if (this.f466855e.o("home", l17, this) == aVar) {
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
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pi0.l1 l1Var = this.f466855e;
        androidx.appcompat.app.AppCompatActivity context = this.f466856f.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        this.f466854d = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
