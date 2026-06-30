package jd0;

@j95.b
/* loaded from: classes15.dex */
public final class l2 extends i95.w implements kd0.w2 {
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        if ((r3 == null || r3.length() == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.qbar.QbarNative$QbarAiModelParam Ai(int r6, boolean r7) {
        /*
            r5 = this;
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            com.tencent.qbar.QbarNative$QbarAiModelParam r0 = pt5.a.a(r0)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2a
            java.lang.String r3 = r0.detect_model_bin_path_
            if (r3 == 0) goto L17
            int r3 = r3.length()
            if (r3 != 0) goto L15
            goto L17
        L15:
            r3 = r1
            goto L18
        L17:
            r3 = r2
        L18:
            if (r3 != 0) goto L2a
            java.lang.String r3 = r0.superresolution_model_bin_path_
            if (r3 == 0) goto L27
            int r3 = r3.length()
            if (r3 != 0) goto L25
            goto L27
        L25:
            r3 = r1
            goto L28
        L27:
            r3 = r2
        L28:
            if (r3 == 0) goto L3d
        L2a:
            int r0 = rl.b.f397143a
            java.lang.String r0 = "MicroMsg.ScanQBarAiModelManager"
            java.lang.String r3 = "getScanQBarAiModel model path error, and try init again"
            r4 = 0
            com.tencent.mars.xlog.Log.e(r0, r3, r4)
            e04.f2.f()
            android.content.Context r0 = com.tencent.mm.sdk.platformtools.x2.f193071a
            com.tencent.qbar.QbarNative$QbarAiModelParam r0 = pt5.a.a(r0)
        L3d:
            if (r7 == 0) goto L42
            e04.f2.a(r0)
        L42:
            if (r6 != r2) goto L49
            if (r0 != 0) goto L47
            goto L49
        L47:
            r0.det_model_use_fp16 = r1
        L49:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jd0.l2.Ai(int, boolean):com.tencent.qbar.QbarNative$QbarAiModelParam");
    }

    public ry3.s wi(int i17, boolean z17) {
        ry3.s sVar = new ry3.s(i17);
        sVar.f401556b = Ai(0, z17);
        sVar.f401558d = 6;
        sVar.f401560f = zs5.f0.a();
        sVar.f401561g = zs5.f0.f475357d;
        sVar.f401565k = ((java.lang.Boolean) ((jz5.n) bz3.h.f36789p).getValue()).booleanValue();
        return sVar;
    }
}
