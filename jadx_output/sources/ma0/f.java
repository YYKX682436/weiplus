package ma0;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f325134d;

    /* renamed from: e, reason: collision with root package name */
    public int f325135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f325136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f325136f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ma0.f(this.f325136f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ma0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f325135e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "music_chat", kz5.b0.c(new zl3.o()), false, null, 24, null);
            this.f325134d = l1Var;
            this.f325135e = 1;
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
            l1Var = (pi0.l1) this.f325134d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.b0.c(new zl3.n()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        flutterPageStyle.f68125o = false;
        flutterPageStyle.f68117d = 1;
        flutterPageStyle.f68118e = -1;
        android.content.Context context = this.f325136f;
        this.f325134d = null;
        this.f325135e = 2;
        if (pi0.l1.t(l1Var, context, flutterPageStyle, null, null, this, 12, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
