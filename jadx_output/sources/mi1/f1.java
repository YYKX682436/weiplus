package mi1;

/* loaded from: classes7.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326548d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326549e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f326550f;

    /* renamed from: g, reason: collision with root package name */
    public int f326551g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f326552h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f326553i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f326554m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(mi1.q1 q1Var, mi1.r1 r1Var, android.widget.LinearLayout linearLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f326552h = q1Var;
        this.f326553i = r1Var;
        this.f326554m = linearLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mi1.f1(this.f326552h, this.f326553i, this.f326554m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mi1.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 432
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi1.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
