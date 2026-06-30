package fo5;

/* loaded from: classes14.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265057d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f265058e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f265059f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265060g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ er4.r f265061h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f265062i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f265063m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f265064n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f265065o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(java.lang.String str, boolean z17, android.content.Context context, er4.r rVar, int i17, long j17, long j18, java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265058e = str;
        this.f265059f = z17;
        this.f265060g = context;
        this.f265061h = rVar;
        this.f265062i = i17;
        this.f265063m = j17;
        this.f265064n = j18;
        this.f265065o = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.p1(this.f265058e, this.f265059f, this.f265060g, this.f265061h, this.f265062i, this.f265063m, this.f265064n, this.f265065o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.p1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01bc, code lost:
    
        if ((!r2 && r5) == false) goto L60;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.p1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
