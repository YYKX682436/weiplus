package com.tencent.mm.plugin.lite.logic;

/* loaded from: classes9.dex */
public class z implements vg3.q4 {
    public static int b(java.lang.String str, int i17) {
        if (str != null && !str.isEmpty()) {
            try {
                return java.lang.Integer.parseInt(str);
            } catch (java.lang.NumberFormatException e17) {
                com.tencent.mars.xlog.Log.e("GlobalMsgNewXmlConsumer", "Failed to parse integer: ".concat(str), e17);
            }
        }
        return i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x026d, code lost:
    
        if (r14.contains("Voip") == false) goto L130;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0294 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f0  */
    @Override // vg3.q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.modelbase.q0 k7(java.lang.String r12, java.util.Map r13, com.tencent.mm.modelbase.p0 r14) {
        /*
            Method dump skipped, instructions count: 712
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.logic.z.k7(java.lang.String, java.util.Map, com.tencent.mm.modelbase.p0):com.tencent.mm.modelbase.q0");
    }
}
