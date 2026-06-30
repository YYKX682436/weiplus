package us2;

/* loaded from: classes5.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f430543d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430544e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f430545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f430546g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f430547h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, int i18, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f430545f = i17;
        this.f430546g = i18;
        this.f430547h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        us2.t tVar = new us2.t(this.f430545f, this.f430546g, this.f430547h, continuation);
        tVar.f430544e = obj;
        return tVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((us2.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: us2.t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
