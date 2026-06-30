package yx0;

/* loaded from: classes5.dex */
public final class a6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f467131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f467133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f467134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f467135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f467136i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(yx0.b8 b8Var, boolean z17, boolean z18, boolean z19, kotlin.coroutines.Continuation continuation, kotlin.coroutines.Continuation continuation2) {
        super(2, continuation2);
        this.f467132e = b8Var;
        this.f467133f = z17;
        this.f467134g = z18;
        this.f467135h = z19;
        this.f467136i = continuation;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.a6(this.f467132e, this.f467133f, this.f467134g, this.f467135h, this.f467136i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.a6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.a6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
