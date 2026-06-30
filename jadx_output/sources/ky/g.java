package ky;

/* loaded from: classes14.dex */
public final class g extends qz5.k implements yz5.p {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f313356e;

    /* renamed from: f, reason: collision with root package name */
    public long f313357f;

    /* renamed from: g, reason: collision with root package name */
    public int f313358g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313359h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f313360i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f313361m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(kotlinx.coroutines.y0 y0Var, n0.v2 v2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313360i = y0Var;
        this.f313361m = v2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ky.g gVar = new ky.g(this.f313360i, this.f313361m, continuation);
        gVar.f313359h = obj;
        return gVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky.g) create((p1.c) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        r11 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:6:0x007c). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
