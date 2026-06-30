package yx0;

/* loaded from: classes5.dex */
public final class t7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f467665e;

    /* renamed from: f, reason: collision with root package name */
    public int f467666f;

    /* renamed from: g, reason: collision with root package name */
    public int f467667g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467668h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467669i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f467670m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f467671n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467672o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation, boolean z17, java.lang.String str, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f467669i = b8Var;
        this.f467670m = continuation;
        this.f467671n = z17;
        this.f467672o = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        yx0.t7 t7Var = new yx0.t7(this.f467669i, this.f467670m, this.f467671n, this.f467672o, continuation);
        t7Var.f467668h = obj;
        return t7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.t7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01fa  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.t7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
