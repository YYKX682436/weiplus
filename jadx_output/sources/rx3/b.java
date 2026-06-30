package rx3;

/* loaded from: classes10.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f401007d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f401008e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f401009f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f401010g;

    /* renamed from: h, reason: collision with root package name */
    public int f401011h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ox3.a f401012i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.k f401013m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ rx3.h f401014n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ox3.a aVar, kotlinx.coroutines.flow.k kVar, rx3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f401012i = aVar;
        this.f401013m = kVar;
        this.f401014n = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rx3.b(this.f401012i, this.f401013m, this.f401014n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx3.b) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0177 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0176 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rx3.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
