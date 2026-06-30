package zv;

/* loaded from: classes11.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476146d;

    /* renamed from: e, reason: collision with root package name */
    public int f476147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f476148f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f476148f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zv.z1(this.f476148f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv.z1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f476147e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "brand_service_conversation", null, false, null, 28, null);
            this.f476146d = l1Var;
            this.f476147e = 1;
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
            l1Var = (pi0.l1) this.f476146d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new com.tencent.mm.feature.brandecs.FlutterBrandEcsPlugin(), new ew.m()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f476148f;
        this.f476146d = null;
        this.f476147e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
