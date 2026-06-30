package yw3;

/* loaded from: classes11.dex */
public final class p2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466845d;

    /* renamed from: e, reason: collision with root package name */
    public int f466846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f466847f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466847f = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.p2(this.f466847f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.p2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pi0.l1 l1Var2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466846e;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f466847f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            pi0.q Ui = ((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui();
            if (repairerFlutterWeUIDemoUI.e != null) {
                return f0Var;
            }
            l1Var = new pi0.l1(Ui, "flutter_demo", null, false, null, 28, null);
            this.f466845d = l1Var;
            this.f466846e = 1;
            if (l1Var.o("view_demo_activity", null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                l1Var2 = (pi0.l1) this.f466845d;
                kotlin.ResultKt.throwOnFailure(obj);
                repairerFlutterWeUIDemoUI.e = l1Var2;
                l1Var2.b(repairerFlutterWeUIDemoUI);
                return f0Var;
            }
            l1Var = (pi0.l1) this.f466845d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        pi0.l1 l1Var3 = l1Var;
        l1Var3.a(kz5.b0.c(new yw3.m(repairerFlutterWeUIDemoUI, l1Var3)));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68118e = -1;
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI2 = this.f466847f;
        this.f466845d = l1Var3;
        this.f466846e = 2;
        if (pi0.l1.v(l1Var3, repairerFlutterWeUIDemoUI2, flutterPageStyle, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        l1Var2 = l1Var3;
        repairerFlutterWeUIDemoUI.e = l1Var2;
        l1Var2.b(repairerFlutterWeUIDemoUI);
        return f0Var;
    }
}
