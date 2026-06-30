package pr0;

/* loaded from: classes14.dex */
public abstract class g0 extends pr0.r {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f357839v = 0;

    /* renamed from: u, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f357840u = kotlinx.coroutines.flow.i3.a(new jz5.l(bs0.g.f23787d, new android.os.Bundle()));

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object p(pr0.g0 r5, int r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof pr0.z
            if (r0 == 0) goto L13
            r0 = r7
            pr0.z r0 = (pr0.z) r0
            int r1 = r0.f357929f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f357929f = r1
            goto L18
        L13:
            pr0.z r0 = new pr0.z
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f357927d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f357929f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            kotlin.ResultKt.throwOnFailure(r7)
            goto L40
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.ResultKt.throwOnFailure(r7)
            sr0.i r5 = r5.f357834e
            if (r5 == 0) goto L49
            r0.f357929f = r4
            java.lang.Object r7 = r5.f(r6, r0)
            if (r7 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r5 = r7.booleanValue()
            if (r5 == 0) goto L49
            r3 = r4
        L49:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.g0.p(pr0.g0, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object q(pr0.g0 r8, int r9, int r10, int r11, java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof pr0.f0
            if (r0 == 0) goto L13
            r0 = r14
            pr0.f0 r0 = (pr0.f0) r0
            int r1 = r0.f357832h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f357832h = r1
            goto L18
        L13:
            pr0.f0 r0 = new pr0.f0
            r0.<init>(r8, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.f357830f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f357832h
            r7 = 1
            if (r1 == 0) goto L39
            if (r1 != r7) goto L31
            java.lang.Object r8 = r6.f357829e
            r12 = r8
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r8 = r6.f357828d
            pr0.g0 r8 = (pr0.g0) r8
            kotlin.ResultKt.throwOnFailure(r14)
            goto L51
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            kotlin.ResultKt.throwOnFailure(r14)
            r6.f357828d = r8
            r6.f357829e = r12
            r6.f357832h = r7
            r8.getClass()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r13
            java.lang.Object r14 = r(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L51
            return r0
        L51:
            jz5.l r14 = (jz5.l) r14
            java.lang.Object r9 = r14.f302833d
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            if (r9 != 0) goto L8c
            java.lang.Object r9 = r14.f302834e
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            r10 = 100
            android.graphics.Bitmap$CompressFormat r11 = android.graphics.Bitmap.CompressFormat.JPEG
            com.tencent.mm.sdk.platformtools.x.D0(r9, r10, r11, r12, r7)
            long r9 = com.tencent.mm.vfs.w6.k(r12)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "takePicture size:"
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            java.lang.String r12 = "MicroMsg.Camera.CameraKit"
            com.tencent.mars.xlog.Log.i(r12, r11)
            as0.a r11 = as0.a.f13425a
            int r8 = r8.f357833d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r8 = r11.a(r8)
            if (r8 == 0) goto L8c
            int r9 = (int) r9
            r8.A = r9
        L8c:
            java.lang.Object r8 = r14.f302833d
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.g0.q(pr0.g0, int, int, int, java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object r(pr0.g0 r9, int r10, int r11, int r12, boolean r13, kotlin.coroutines.Continuation r14) {
        /*
            boolean r0 = r14 instanceof pr0.e0
            if (r0 == 0) goto L13
            r0 = r14
            pr0.e0 r0 = (pr0.e0) r0
            int r1 = r0.f357826h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f357826h = r1
            goto L18
        L13:
            pr0.e0 r0 = new pr0.e0
            r0.<init>(r9, r14)
        L18:
            r6 = r0
            java.lang.Object r14 = r6.f357824f
            pz5.a r0 = pz5.a.f359186d
            int r1 = r6.f357826h
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            long r9 = r6.f357823e
            java.lang.Object r11 = r6.f357822d
            pr0.g0 r11 = (pr0.g0) r11
            kotlin.ResultKt.throwOnFailure(r14)
            r7 = r9
            r9 = r11
            goto L61
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            kotlin.ResultKt.throwOnFailure(r14)
            sr0.i r1 = r9.f357834e
            if (r1 != 0) goto L4c
            jz5.l r9 = new jz5.l
            java.lang.Integer r10 = new java.lang.Integer
            r11 = -2
            r10.<init>(r11)
            r11 = 0
            r9.<init>(r10, r11)
            return r9
        L4c:
            long r7 = java.lang.System.currentTimeMillis()
            r6.f357822d = r9
            r6.f357823e = r7
            r6.f357826h = r2
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.l(r2, r3, r4, r5, r6)
            if (r14 != r0) goto L61
            return r0
        L61:
            android.graphics.Bitmap r14 = (android.graphics.Bitmap) r14
            as0.a r10 = as0.a.f13425a
            int r11 = r9.f357833d
            r12 = 0
            if (r14 == 0) goto L6f
            int r13 = r14.getWidth()
            goto L70
        L6f:
            r13 = r12
        L70:
            if (r14 == 0) goto L77
            int r0 = r14.getHeight()
            goto L78
        L77:
            r0 = r12
        L78:
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r11 = r10.a(r11)
            if (r11 == 0) goto L82
            r11.B = r13
            r11.C = r0
        L82:
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r7
            int r9 = r9.f357833d
            com.tencent.mm.autogen.mmdata.rpt.CameraReportStruct r9 = r10.a(r9)
            if (r9 == 0) goto L91
            r9.f55572u = r0
        L91:
            if (r14 != 0) goto L94
            r12 = -1
        L94:
            jz5.l r9 = new jz5.l
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r12)
            r9.<init>(r10, r14)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.g0.r(pr0.g0, int, int, int, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nr0.b0
    public void setCustomRender(nr0.c cVar) {
        k().setCustomRender(cVar);
    }
}
