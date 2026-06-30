package yx0;

/* loaded from: classes5.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467147d;

    /* renamed from: e, reason: collision with root package name */
    public int f467148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f467149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467150g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f467151h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f467152i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f467153m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ bs0.h f467154n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f467155o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(java.lang.String str, yx0.b8 b8Var, long j17, pp0.p0 p0Var, int i17, bs0.h hVar, java.util.List list, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f467149f = str;
        this.f467150g = b8Var;
        this.f467151h = j17;
        this.f467152i = p0Var;
        this.f467153m = i17;
        this.f467154n = hVar;
        this.f467155o = list;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new yx0.b2(this.f467149f, this.f467150g, this.f467151h, this.f467152i, this.f467153m, this.f467154n, this.f467155o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0007. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.b2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
