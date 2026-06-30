package vw;

/* loaded from: classes11.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440628d;

    /* renamed from: e, reason: collision with root package name */
    public long f440629e;

    /* renamed from: f, reason: collision with root package name */
    public int f440630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vw.m2 f440631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f440632h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rv.l3 f440633i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(vw.m2 m2Var, android.content.Context context, rv.l3 l3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f440631g = m2Var;
        this.f440632h = context;
        this.f440633i = l3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new vw.e2(this.f440631g, this.f440632h, this.f440633i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((vw.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x021f, code lost:
    
        if ((r1.getType() == 24 && kotlin.jvm.internal.o.b(r1.I0("FinderPhotoCardEntry"), r12)) != false) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x03a0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 1008
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vw.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
