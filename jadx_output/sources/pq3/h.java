package pq3;

/* loaded from: classes12.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357630e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f357631f;

    /* renamed from: g, reason: collision with root package name */
    public int f357632g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pq3.j f357633h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f357634i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(pq3.j jVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f357633h = jVar;
        this.f357634i = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pq3.h(this.f357633h, this.f357634i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pq3.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0143, code lost:
    
        if (r9 != false) goto L30;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0013. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0154  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pq3.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
