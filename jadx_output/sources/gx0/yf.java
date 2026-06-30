package gx0;

/* loaded from: classes5.dex */
public final class yf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277240d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f277241e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f277242f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f277243g;

    /* renamed from: h, reason: collision with root package name */
    public int f277244h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pu0.e f277245i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f277246m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.maas.moviecomposing.segments.ClipSegment f277247n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ gx0.gg f277248o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf(pu0.e eVar, java.lang.String str, com.tencent.maas.moviecomposing.segments.ClipSegment clipSegment, gx0.gg ggVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f277245i = eVar;
        this.f277246m = str;
        this.f277247n = clipSegment;
        this.f277248o = ggVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.yf(this.f277245i, this.f277246m, this.f277247n, this.f277248o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.yf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b9  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.yf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
