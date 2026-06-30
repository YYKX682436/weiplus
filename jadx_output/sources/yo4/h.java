package yo4;

/* loaded from: classes5.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f464221d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f464222e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f464223f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f464224g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f464225h;

    /* renamed from: i, reason: collision with root package name */
    public int f464226i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f464227m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f464228n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ yo4.p f464229o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, com.tencent.mm.protocal.protobuf.FinderObject finderObject, yo4.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f464227m = str;
        this.f464228n = finderObject;
        this.f464229o = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yo4.h(this.f464227m, this.f464228n, this.f464229o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yo4.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0239  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 728
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yo4.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
