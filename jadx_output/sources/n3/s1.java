package n3;

/* loaded from: classes14.dex */
public final class s1 extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f334400f;

    /* renamed from: g, reason: collision with root package name */
    public int f334401g;

    /* renamed from: h, reason: collision with root package name */
    public int f334402h;

    /* renamed from: i, reason: collision with root package name */
    public int f334403i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334404m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f334405n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(android.view.ViewGroup viewGroup, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f334405n = viewGroup;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        n3.s1 s1Var = new n3.s1(this.f334405n, continuation);
        s1Var.f334404m = obj;
        return s1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((n3.s1) create((q26.p) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00af -> B:6:0x00b1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00b8 -> B:7:0x00bc). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 194
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n3.s1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
