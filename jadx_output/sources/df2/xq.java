package df2;

/* loaded from: classes3.dex */
public final class xq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231794d;

    /* renamed from: e, reason: collision with root package name */
    public int f231795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.lv1 f231796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.ar f231798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f231799i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xq(r45.lv1 lv1Var, boolean z17, df2.ar arVar, android.widget.FrameLayout frameLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231796f = lv1Var;
        this.f231797g = z17;
        this.f231798h = arVar;
        this.f231799i = frameLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.xq(this.f231796f, this.f231797g, this.f231798h, this.f231799i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.xq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x0702, code lost:
    
        if (r10.intValue() == 1) goto L155;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x032f  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) {
        /*
            Method dump skipped, instructions count: 1973
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.xq.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
