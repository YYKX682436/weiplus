package jn2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f300745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.c1 f300746e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ay1 f300747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jn2.w0 f300748g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ jn2.b1 f300749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(jn2.c1 c1Var, r45.ay1 ay1Var, jn2.w0 w0Var, jn2.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f300746e = c1Var;
        this.f300747f = ay1Var;
        this.f300748g = w0Var;
        this.f300749h = b1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jn2.x0(this.f300746e, this.f300747f, this.f300748g, this.f300749h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.x0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f3 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:7:0x00e6, B:8:0x00ef, B:10:0x00f3, B:12:0x0111, B:14:0x0115, B:18:0x0129, B:20:0x012d, B:21:0x0158, B:23:0x0170, B:24:0x0179, B:25:0x015c, B:26:0x0166, B:28:0x0184, B:49:0x00df), top: B:48:0x00df }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0129 A[Catch: Exception -> 0x00e9, TryCatch #0 {Exception -> 0x00e9, blocks: (B:7:0x00e6, B:8:0x00ef, B:10:0x00f3, B:12:0x0111, B:14:0x0115, B:18:0x0129, B:20:0x012d, B:21:0x0158, B:23:0x0170, B:24:0x0179, B:25:0x015c, B:26:0x0166, B:28:0x0184, B:49:0x00df), top: B:48:0x00df }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
