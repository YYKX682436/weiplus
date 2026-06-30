package pk2;

/* loaded from: classes3.dex */
public final class s7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356237d;

    /* renamed from: e, reason: collision with root package name */
    public int f356238e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f356239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f356240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(com.tencent.mm.ui.MMActivity mMActivity, pk2.o9 o9Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f356240g = mMActivity;
        this.f356241h = o9Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        pk2.s7 s7Var = new pk2.s7(this.f356240g, this.f356241h, continuation);
        s7Var.f356239f = obj;
        return s7Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.s7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pk2.s7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
