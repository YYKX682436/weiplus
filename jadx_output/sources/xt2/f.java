package xt2;

/* loaded from: classes3.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f456730d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f456731e;

    /* renamed from: f, reason: collision with root package name */
    public int f456732f;

    /* renamed from: g, reason: collision with root package name */
    public int f456733g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.y4 f456734h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xt2.m f456735i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f456736m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(dk2.y4 y4Var, xt2.m mVar, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f456734h = y4Var;
        this.f456735i = mVar;
        this.f456736m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new xt2.f(this.f456734h, this.f456735i, this.f456736m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.f) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x010e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fa  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x010f -> B:16:0x00e7). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
