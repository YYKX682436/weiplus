package mx0;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final pp0.p0 f331934a;

    /* renamed from: b, reason: collision with root package name */
    public volatile mx0.d0 f331935b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f331936c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f331937d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f331938e;

    /* renamed from: f, reason: collision with root package name */
    public mx0.c0 f331939f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f331940g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f331941h;

    public e1(pp0.p0 camMaasManager) {
        kotlin.jvm.internal.o.g(camMaasManager, "camMaasManager");
        this.f331934a = camMaasManager;
        this.f331935b = mx0.d0.f331893d;
        this.f331938e = kotlinx.coroutines.z0.a(kotlinx.coroutines.w3.a(1, "MaterialImportHelper-Thread").J(1).plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(mx0.e1 r8, com.tencent.maas.instamovie.base.asset.MJAssetInfo r9, java.lang.String r10, com.tencent.maas.instamovie.MJRecordingSettings r11, com.tencent.maas.camerafun.MJAuditCaptureSettings r12, kotlin.coroutines.Continuation r13) {
        /*
            r8.getClass()
            boolean r0 = r13 instanceof mx0.e0
            if (r0 == 0) goto L16
            r0 = r13
            mx0.e0 r0 = (mx0.e0) r0
            int r1 = r0.f331933n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f331933n = r1
            goto L1b
        L16:
            mx0.e0 r0 = new mx0.e0
            r0.<init>(r8, r13)
        L1b:
            java.lang.Object r13 = r0.f331931i
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f331933n
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r13)
            goto L5f
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.ResultKt.throwOnFailure(r13)
            r0.f331926d = r8
            r0.f331927e = r9
            r0.f331928f = r10
            r0.f331929g = r11
            r0.f331930h = r12
            r0.f331933n = r3
            oz5.n r13 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r13.<init>(r0)
            pp0.p0 r2 = r8.f331934a
            mx0.f0 r7 = new mx0.f0
            r7.<init>(r13)
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r2.z(r3, r4, r5, r6, r7)
            java.lang.Object r13 = r13.a()
            if (r13 != r1) goto L5f
            goto L69
        L5f:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r8 = r13.booleanValue()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
        L69:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.e1.a(mx0.e1, com.tencent.maas.instamovie.base.asset.MJAssetInfo, java.lang.String, com.tencent.maas.instamovie.MJRecordingSettings, com.tencent.maas.camerafun.MJAuditCaptureSettings, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(mx0.e1 r6, kotlin.coroutines.Continuation r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof mx0.i0
            if (r0 == 0) goto L16
            r0 = r7
            mx0.i0 r0 = (mx0.i0) r0
            int r1 = r0.f332039g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f332039g = r1
            goto L1b
        L16:
            mx0.i0 r0 = new mx0.i0
            r0.<init>(r6, r7)
        L1b:
            java.lang.Object r7 = r0.f332037e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f332039g
            jz5.f0 r3 = jz5.f0.f302826a
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L30
            java.lang.Object r6 = r0.f332036d
            mx0.e1 r6 = (mx0.e1) r6
            kotlin.ResultKt.throwOnFailure(r7)
            goto L8b
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            kotlin.ResultKt.throwOnFailure(r7)
            mx0.d0 r7 = r6.f331935b
            mx0.d0 r2 = mx0.d0.f331897h
            if (r7 == r2) goto L43
        L41:
            r1 = r3
            goto L9c
        L43:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "cancelExportingVideoForMaterialImport: importPreviewState "
            r7.<init>(r2)
            mx0.d0 r2 = r6.f331935b
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "MicroMsg.MaterialImportHelper"
            com.tencent.mars.xlog.Log.i(r2, r7)
            mx0.d0 r7 = mx0.d0.f331898i
            r6.f(r7)
            mx0.c0 r7 = r6.f331939f
            r2 = 0
            if (r7 == 0) goto L6b
            yx0.w5 r7 = (yx0.w5) r7
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            yz5.p r7 = r7.f467743b
            r7.invoke(r2, r5)
        L6b:
            r6.f331939f = r2
            r0.f332036d = r6
            r0.f332039g = r4
            oz5.n r7 = new oz5.n
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r7.<init>(r0)
            mx0.h0 r0 = new mx0.h0
            r0.<init>(r7)
            pp0.p0 r2 = r6.f331934a
            r2.X(r0)
            java.lang.Object r7 = r7.a()
            if (r7 != r1) goto L8b
            goto L9c
        L8b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L96
            mx0.d0 r7 = mx0.d0.f331895f
            goto L98
        L96:
            mx0.d0 r7 = mx0.d0.f331897h
        L98:
            r6.f(r7)
            goto L41
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.e1.b(mx0.e1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final java.lang.Object c(mx0.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "pauseImportPreview: importPreviewState " + e1Var.f331935b + ' ');
        int ordinal = e1Var.f331935b.ordinal();
        return (ordinal == 6 || ordinal == 7 || ordinal == 8) ? java.lang.Boolean.FALSE : pp0.p0.w(e1Var.f331934a, false, continuation, 1, null);
    }

    public final boolean d() {
        return kz5.z.D0(new mx0.d0[]{mx0.d0.f331895f, mx0.d0.f331903q}).contains(this.f331935b);
    }

    public final boolean e() {
        return kz5.z.D0(new mx0.d0[]{mx0.d0.f331894e, mx0.d0.f331895f, mx0.d0.f331896g, mx0.d0.f331897h, mx0.d0.f331898i, mx0.d0.f331899m, mx0.d0.f331900n, mx0.d0.f331901o}).contains(this.f331935b);
    }

    public final void f(mx0.d0 d0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "update importPreviewState : state " + this.f331935b + " -> " + d0Var);
        this.f331935b = d0Var;
    }
}
