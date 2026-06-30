package vw;

/* loaded from: classes11.dex */
public final class f2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440637d;

    /* renamed from: e, reason: collision with root package name */
    public int f440638e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f440639f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f440640g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440641h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(int i17, int i18, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440639f = i17;
        this.f440640g = i18;
        this.f440641h = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.f2(this.f440639f, this.f440640g, this.f440641h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.f2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pi0.l1 l1Var;
        java.lang.Object s17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f440638e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "biz", null, false, null, 28, null);
            java.util.Map l17 = kz5.c1.l(new jz5.l("enterScene", new java.lang.Integer(this.f440639f)), new jz5.l("serviceType", new java.lang.Integer(this.f440640g)));
            this.f440637d = l1Var;
            this.f440638e = 1;
            if (l1Var.o("notify_msg_list", l17, this) == aVar) {
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
            l1Var = (pi0.l1) this.f440637d;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        l1Var.a(kz5.c0.i(new lx.q5(), new lx.n2(0), new lx.y5(), new lx.b5()));
        com.tencent.mm.flutter.ui.FlutterPageStyle flutterPageStyle = new com.tencent.mm.flutter.ui.FlutterPageStyle(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        android.content.Context context = this.f440641h;
        this.f440637d = null;
        this.f440638e = 2;
        s17 = l1Var.s(context, flutterPageStyle, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, this);
        if (s17 == aVar) {
            return aVar;
        }
        return jz5.f0.f302826a;
    }
}
