package vh0;

@j95.b
/* loaded from: classes8.dex */
public final class p3 extends jm0.o implements vh0.o1 {

    /* renamed from: p, reason: collision with root package name */
    public volatile com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo f436941p;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f436938m = jz5.h.b(vh0.h3.f436879d);

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f436939n = jz5.h.b(vh0.k3.f436893d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f436940o = jz5.h.b(vh0.l3.f436900d);

    /* renamed from: q, reason: collision with root package name */
    public final kotlinx.coroutines.sync.d f436942q = kotlinx.coroutines.sync.l.a(false, 1, null);

    /* JADX WARN: Code restructure failed: missing block: B:37:0x005f, code lost:
    
        if (r9.b(null, r0) == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Type inference failed for: r7v10, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r7v14, types: [kotlinx.coroutines.sync.d] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Zi(vh0.p3 r7, boolean r8, kotlin.coroutines.Continuation r9) {
        /*
            r7.getClass()
            boolean r0 = r9 instanceof vh0.n3
            if (r0 == 0) goto L16
            r0 = r9
            vh0.n3 r0 = (vh0.n3) r0
            int r1 = r0.f436923i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f436923i = r1
            goto L1b
        L16:
            vh0.n3 r0 = new vh0.n3
            r0.<init>(r7, r9)
        L1b:
            java.lang.Object r9 = r0.f436921g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f436923i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r7 = r0.f436918d
            kotlinx.coroutines.sync.d r7 = (kotlinx.coroutines.sync.d) r7
            kotlin.ResultKt.throwOnFailure(r9)     // Catch: java.lang.Throwable -> L32
            goto L7d
        L32:
            r8 = move-exception
            goto L86
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            boolean r8 = r0.f436920f
            java.lang.Object r7 = r0.f436919e
            kotlinx.coroutines.sync.d r7 = (kotlinx.coroutines.sync.d) r7
            java.lang.Object r2 = r0.f436918d
            vh0.p3 r2 = (vh0.p3) r2
            kotlin.ResultKt.throwOnFailure(r9)
            r9 = r7
            r7 = r2
            goto L62
        L4c:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlinx.coroutines.sync.d r9 = r7.f436942q
            r0.f436918d = r7
            r0.f436919e = r9
            r0.f436920f = r8
            r0.f436923i = r4
            kotlinx.coroutines.sync.k r9 = (kotlinx.coroutines.sync.k) r9
            java.lang.Object r2 = r9.b(r5, r0)
            if (r2 != r1) goto L62
            goto L85
        L62:
            vh0.o3 r2 = new vh0.o3     // Catch: java.lang.Throwable -> L88
            if (r8 == 0) goto L67
            goto L68
        L67:
            r4 = 0
        L68:
            r2.<init>(r7, r4, r5)     // Catch: java.lang.Throwable -> L88
            r0.f436918d = r9     // Catch: java.lang.Throwable -> L88
            r0.f436919e = r5     // Catch: java.lang.Throwable -> L88
            r0.f436923i = r3     // Catch: java.lang.Throwable -> L88
            r7 = 6000(0x1770, double:2.9644E-320)
            java.lang.Object r7 = kotlinx.coroutines.a4.c(r7, r2, r0)     // Catch: java.lang.Throwable -> L88
            if (r7 != r1) goto L7a
            goto L85
        L7a:
            r6 = r9
            r9 = r7
            r7 = r6
        L7d:
            r1 = r9
            com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo r1 = (com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) r1     // Catch: java.lang.Throwable -> L32
            kotlinx.coroutines.sync.k r7 = (kotlinx.coroutines.sync.k) r7
            r7.d(r5)
        L85:
            return r1
        L86:
            r9 = r7
            goto L8a
        L88:
            r7 = move-exception
            r8 = r7
        L8a:
            kotlinx.coroutines.sync.k r9 = (kotlinx.coroutines.sync.k) r9
            r9.d(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vh0.p3.Zi(vh0.p3, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void aj() {
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.internal.b0.f310484a), null, null, new vh0.j3(this, null), 3, null);
    }

    public com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo bj(boolean z17) {
        com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo iYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo = (com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) kotlinx.coroutines.l.f(null, new vh0.m3(this, z17, null), 1, null);
        if (iYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo != null) {
            return iYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.YuanBaoUnifiedAgreementFeatureService", "backend has no unified agreement or timeout");
        return (com.tencent.mm.feature.yuanbao.IYuanBaoUnifiedAgreementFeatureService$ExtendedAgreementInfo) ((jz5.n) this.f436939n).getValue();
    }
}
