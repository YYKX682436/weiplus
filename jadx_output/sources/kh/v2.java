package kh;

/* loaded from: classes12.dex */
public final class v2 extends kh.w2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f307935f;

    /* renamed from: g, reason: collision with root package name */
    public final int f307936g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v2(java.lang.String r1, java.lang.String r2, int r3, int r4, kotlin.jvm.internal.i r5) {
        /*
            r0 = this;
            r2 = r4 & 4
            if (r2 == 0) goto L5
            r3 = 1
        L5:
            java.lang.String r2 = "soName"
            kotlin.jvm.internal.o.g(r1, r2)
            java.lang.String r2 = "native"
            r0.<init>(r2, r3)
            r0.f307935f = r1
            r0.f307936g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.v2.<init>(java.lang.String, java.lang.String, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // kh.b3
    public int a(kh.f3 threadIdCard) {
        jz5.l Di;
        kotlin.jvm.internal.o.g(threadIdCard, "threadIdCard");
        com.tencent.mm.feature.performance.api.a aVar = (com.tencent.mm.feature.performance.api.a) i95.n0.c(com.tencent.mm.feature.performance.api.a.class);
        if (aVar == null || (Di = ((cr0.a5) aVar).Di(threadIdCard.f307800b)) == null) {
            return 0;
        }
        if (kotlin.jvm.internal.o.b(this.f307935f, com.tencent.tinker.loader.shareutil.ShareConstants.SO_PATH + ((java.lang.String) Di.f302833d) + ".so")) {
            return this.f307936g;
        }
        return 0;
    }
}
