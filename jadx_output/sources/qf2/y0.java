package qf2;

/* loaded from: classes.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362651d;

    /* renamed from: e, reason: collision with root package name */
    public int f362652e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.m f362653f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ km2.c f362654g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.y1 f362655h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f362656i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(dk2.m mVar, km2.c cVar, qf2.y1 y1Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f362653f = mVar;
        this.f362654g = cVar;
        this.f362655h = y1Var;
        this.f362656i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new qf2.y0(this.f362653f, this.f362654g, this.f362655h, this.f362656i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qf2.y0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x01aa  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qf2.y0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
