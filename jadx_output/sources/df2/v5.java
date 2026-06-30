package df2;

/* loaded from: classes3.dex */
public final class v5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231583d;

    /* renamed from: e, reason: collision with root package name */
    public int f231584e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.w5 f231585f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231586g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(df2.w5 w5Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231585f = w5Var;
        this.f231586g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.v5(this.f231585f, this.f231586g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.v5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0122 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x011a -> B:6:0x011e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x011d -> B:6:0x011e). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.v5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
