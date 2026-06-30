package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class i implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.m0 f214961d;

    public i(com.tencent.mm.zoomimage.subsampling.internal.m0 m0Var) {
        this.f214961d = m0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (java.lang.Math.abs(zq5.g.b(r9) - zq5.g.b(r3)) >= (zq5.g.b(r3) * (zq5.g.b(r9) <= zq5.g.b(r3) ? 0.5f : 1.0f))) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    @Override // kotlinx.coroutines.flow.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object emit(java.lang.Object r13, kotlin.coroutines.Continuation r14) {
        /*
            r12 = this;
            zq5.g r13 = (zq5.g) r13
            long r7 = r13.f475067a
            com.tencent.mm.zoomimage.subsampling.internal.m0 r13 = r12.f214961d
            long r3 = r13.f215003l
            int r14 = zq5.g.f475066c
            r14 = 32
            long r0 = r7 >> r14
            int r0 = (int) r0
            int r0 = r0 / 2
            int r1 = zq5.g.b(r7)
            int r1 = r1 / 2
            long r9 = zq5.h.a(r0, r1)
            boolean r0 = zq5.h.b(r9)
            if (r0 == 0) goto L22
            goto L6c
        L22:
            boolean r0 = zq5.h.b(r3)
            if (r0 == 0) goto L29
            goto L6a
        L29:
            long r0 = r9 >> r14
            int r0 = (int) r0
            long r1 = r3 >> r14
            int r14 = (int) r1
            int r1 = r0 - r14
            int r1 = java.lang.Math.abs(r1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r0 <= r14) goto L3d
            r0 = r2
            goto L3e
        L3d:
            r0 = r5
        L3e:
            float r14 = (float) r14
            float r14 = r14 * r0
            float r0 = (float) r1
            int r14 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r14 < 0) goto L46
            goto L6a
        L46:
            int r14 = zq5.g.b(r9)
            int r0 = zq5.g.b(r3)
            int r14 = r14 - r0
            int r14 = java.lang.Math.abs(r14)
            int r0 = zq5.g.b(r9)
            int r1 = zq5.g.b(r3)
            if (r0 <= r1) goto L5e
            goto L5f
        L5e:
            r2 = r5
        L5f:
            int r0 = zq5.g.b(r3)
            float r0 = (float) r0
            float r0 = r0 * r2
            float r14 = (float) r14
            int r14 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r14 < 0) goto L6c
        L6a:
            r14 = 1
            goto L6d
        L6c:
            r14 = 0
        L6d:
            com.tencent.mm.zoomimage.subsampling.internal.l0 r11 = new com.tencent.mm.zoomimage.subsampling.internal.l0
            r0 = r11
            r1 = r13
            r2 = r14
            r5 = r9
            r0.<init>(r1, r2, r3, r5, r7)
            zq5.k r0 = r13.f214993b
            r0.a(r11)
            if (r14 == 0) goto L85
            r13.f215003l = r9
            java.lang.String r14 = "preferredTileSizeChanged"
            r13.g(r14)
        L85:
            jz5.f0 r13 = jz5.f0.f302826a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.zoomimage.subsampling.internal.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
