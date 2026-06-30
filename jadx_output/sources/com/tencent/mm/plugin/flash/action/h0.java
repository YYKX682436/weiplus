package com.tencent.mm.plugin.flash.action;

/* loaded from: classes2.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.flash.action.h0 f137143a = new com.tencent.mm.plugin.flash.action.h0();

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if ((r0 != null && r0.f385838e == 0) == false) goto L13;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r5) {
        /*
            r4 = this;
            com.tencent.mm.modelbase.f r5 = (com.tencent.mm.modelbase.f) r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[RecordExtraVideo] cgi resp: "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FaceFlashActionRecordUIC"
            com.tencent.mars.xlog.Log.i(r1, r0)
            int r0 = r5.f70615a
            if (r0 != 0) goto L2c
            int r0 = r5.f70616b
            if (r0 != 0) goto L2c
            com.tencent.mm.protobuf.f r0 = r5.f70618d
            r45.sl5 r0 = (r45.sl5) r0
            if (r0 == 0) goto L29
            int r0 = r0.f385838e
            if (r0 != 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            if (r0 != 0) goto L70
        L2c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[RecordExtraVideo] cgi fail, errType: "
            r0.<init>(r2)
            int r2 = r5.f70615a
            r0.append(r2)
            java.lang.String r2 = ", errCode: "
            r0.append(r2)
            int r2 = r5.f70616b
            r0.append(r2)
            java.lang.String r2 = ", ret_code: "
            r0.append(r2)
            com.tencent.mm.protobuf.f r2 = r5.f70618d
            r45.sl5 r2 = (r45.sl5) r2
            r3 = 0
            if (r2 == 0) goto L55
            int r2 = r2.f385838e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L56
        L55:
            r2 = r3
        L56:
            r0.append(r2)
            java.lang.String r2 = ", ret_msg: "
            r0.append(r2)
            com.tencent.mm.protobuf.f r5 = r5.f70618d
            r45.sl5 r5 = (r45.sl5) r5
            if (r5 == 0) goto L66
            java.lang.String r3 = r5.f385839f
        L66:
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            com.tencent.mars.xlog.Log.e(r1, r5)
        L70:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.flash.action.h0.call(java.lang.Object):java.lang.Object");
    }
}
