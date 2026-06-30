package ub2;

/* loaded from: classes4.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f426076d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f426077e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f426078f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f426079g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f426080h;

    /* renamed from: i, reason: collision with root package name */
    public int f426081i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.List f426082m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f426082m = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ub2.l(this.f426082m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ub2.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007a -> B:5:0x0083). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ub2.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
