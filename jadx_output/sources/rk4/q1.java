package rk4;

/* loaded from: classes11.dex */
public final class q1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396917d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396918e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f396919f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f396920g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f396921h;

    /* renamed from: i, reason: collision with root package name */
    public int f396922i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ bw5.y0[] f396923m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396924n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(bw5.y0[] y0VarArr, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396923m = y0VarArr;
        this.f396924n = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.q1(this.f396923m, this.f396924n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.q1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b5 A[Catch: Exception -> 0x0122, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, blocks: (B:12:0x00af, B:14:0x00b5, B:19:0x0112), top: B:11:0x00af }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112 A[Catch: Exception -> 0x0122, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x0122, blocks: (B:12:0x00af, B:14:0x00b5, B:19:0x0112), top: B:11:0x00af }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00f4 -> B:8:0x00f9). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.q1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
