package cq2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f221423d;

    /* renamed from: e, reason: collision with root package name */
    public int f221424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ys5.e f221425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f221426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f221427h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ys5.e eVar, boolean z17, float f17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f221425f = eVar;
        this.f221426g = z17;
        this.f221427h = f17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cq2.p(this.f221425f, this.f221426g, this.f221427h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cq2.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cq2.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
