package yx0;

/* loaded from: classes5.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467292d;

    /* renamed from: e, reason: collision with root package name */
    public int f467293e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467294f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f467295g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(yx0.b8 b8Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467294f = b8Var;
        this.f467295g = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.f1(this.f467294f, this.f467295g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005c A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:7:0x0015, B:8:0x0058, B:10:0x005c, B:11:0x005f, B:59:0x0025, B:61:0x0045, B:66:0x002f), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f1  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
