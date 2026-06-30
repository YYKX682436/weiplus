package ky0;

/* loaded from: classes5.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313458d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f313459e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f313460f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f313461g;

    /* renamed from: h, reason: collision with root package name */
    public int f313462h;

    /* renamed from: i, reason: collision with root package name */
    public int f313463i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f313464m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.List f313465n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ly0.p f313466o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f313467p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ ly0.o f313468q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.List list, ly0.p pVar, java.util.Map map, ly0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313465n = list;
        this.f313466o = pVar;
        this.f313467p = map;
        this.f313468q = oVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ky0.f fVar = new ky0.f(this.f313465n, this.f313466o, this.f313467p, this.f313468q, continuation);
        fVar.f313464m = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky0.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x01d5 -> B:5:0x01d8). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 627
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky0.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
