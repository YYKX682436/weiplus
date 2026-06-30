package vp4;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439025d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439026e;

    /* renamed from: f, reason: collision with root package name */
    public int f439027f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vp4.j f439028g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ og3.d f439029h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(vp4.j jVar, og3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f439028g = jVar;
        this.f439029h = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vp4.h(this.f439028g, this.f439029h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vp4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vp4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
