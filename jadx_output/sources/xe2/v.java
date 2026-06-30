package xe2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453911d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453912e;

    /* renamed from: f, reason: collision with root package name */
    public int f453913f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ug2.g f453914g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xe2.b0 f453915h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(ug2.g gVar, xe2.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f453914g = gVar;
        this.f453915h = b0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xe2.v(this.f453914g, this.f453915h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xe2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x022a  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 693
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xe2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
