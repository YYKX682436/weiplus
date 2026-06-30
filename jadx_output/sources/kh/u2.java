package kh;

/* loaded from: classes12.dex */
public final class u2 extends kh.w2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f307929f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f307930g;

    /* renamed from: h, reason: collision with root package name */
    public final int f307931h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public u2(java.lang.String r1, java.lang.String r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r5 = r4 & 2
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r4 = r4 & 4
            if (r4 == 0) goto La
            r3 = 1
        La:
            java.lang.String r4 = "className"
            kotlin.jvm.internal.o.g(r1, r4)
            java.lang.String r4 = "java"
            r0.<init>(r4, r3)
            r0.f307929f = r1
            r0.f307930g = r2
            r0.f307931h = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.u2.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        jz5.l Bi;
        kotlin.jvm.internal.o.g(threadIdCard, "threadIdCard");
        com.tencent.mm.feature.performance.api.a aVar = (com.tencent.mm.feature.performance.api.a) i95.n0.c(com.tencent.mm.feature.performance.api.a.class);
        if (aVar == null || (Bi = ((cr0.a5) aVar).Bi(threadIdCard.f307800b)) == null || !kotlin.jvm.internal.o.b(this.f307929f, Bi.f302833d)) {
            return 0;
        }
        java.lang.String str = this.f307930g;
        if (str == null || kotlin.jvm.internal.o.b(str, Bi.f302834e)) {
            return this.f307931h;
        }
        return 0;
    }
}
