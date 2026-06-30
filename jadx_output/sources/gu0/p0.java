package gu0;

/* loaded from: classes5.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f275786f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(gu0.k2 k2Var, yz5.p pVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275785e = k2Var;
        this.f275786f = pVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.p0(this.f275785e, this.f275786f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.p0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003c A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:6:0x0014, B:7:0x0083, B:9:0x0087, B:12:0x008c, B:15:0x00a4, B:19:0x0021, B:20:0x0062, B:22:0x0066, B:24:0x006e, B:28:0x002b, B:30:0x0030, B:35:0x003c, B:37:0x0044, B:39:0x0048, B:42:0x0051, B:44:0x0059), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044 A[Catch: Exception -> 0x0025, TryCatch #0 {Exception -> 0x0025, blocks: (B:6:0x0014, B:7:0x0083, B:9:0x0087, B:12:0x008c, B:15:0x00a4, B:19:0x0021, B:20:0x0062, B:22:0x0066, B:24:0x006e, B:28:0x002b, B:30:0x0030, B:35:0x003c, B:37:0x0044, B:39:0x0048, B:42:0x0051, B:44:0x0059), top: B:2:0x000e }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.p0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
