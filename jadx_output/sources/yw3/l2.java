package yw3;

/* loaded from: classes11.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f466793d;

    /* renamed from: e, reason: collision with root package name */
    public int f466794e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI f466795f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f466795f = repairerFlutterWeUIDemoUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yw3.l2(this.f466795f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yw3.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f466794e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "flutter_weui_demo", null, false, null, 28, null);
            this.f466793d = l1Var;
            this.f466794e = 1;
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
            l1Var = (pi0.l1) this.f466793d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerFlutterWeUIDemoUI repairerFlutterWeUIDemoUI = this.f466795f;
        this.f466793d = null;
        this.f466794e = 2;
        if (pi0.l1.v(l1Var, repairerFlutterWeUIDemoUI, flutterPageStyle, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
