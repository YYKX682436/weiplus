package j93;

/* loaded from: classes.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f298383d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f298384e;

    /* renamed from: f, reason: collision with root package name */
    public int f298385f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f298386g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f298387h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j93.n f298388i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.l f298389m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, j93.n nVar, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f298386g = arrayList;
        this.f298387h = arrayList2;
        this.f298388i = nVar;
        this.f298389m = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new j93.g(this.f298386g, this.f298387h, this.f298388i, this.f298389m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((j93.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0155 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j93.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
