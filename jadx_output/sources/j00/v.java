package j00;

/* loaded from: classes11.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f296911d;

    /* renamed from: e, reason: collision with root package name */
    public int f296912e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f296913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f296914g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.Map map, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f296913f = map;
        this.f296914g = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j00.v(this.f296913f, this.f296914g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j00.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f296912e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ecs", null, false, null, 28, null);
            l1Var.f354649h = true;
            this.f296911d = l1Var;
            this.f296912e = 1;
            if (l1Var.o("give_gift", this.f296913f, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                j00.y yVar = j00.y.f296946a;
                return jz5.f0.f302826a;
            }
            l1Var = (pi0.l1) this.f296911d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new j00.d0(), ((r03.e) ((s03.g) i95.n0.c(s03.g.class))).wi(null)));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f296914g;
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        kotlin.jvm.internal.o.d(context);
        this.f296911d = null;
        this.f296912e = 2;
        if (l1Var.s(context, flutterPageStyle, com.tencent.mm.feature.ecs.ui.EcsGiftFlutterUI.class, null, this) == aVar) {
            return aVar;
        }
        j00.y yVar2 = j00.y.f296946a;
        return jz5.f0.f302826a;
    }
}
