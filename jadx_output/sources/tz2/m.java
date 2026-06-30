package tz2;

/* loaded from: classes2.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tz2.q f423306a;

    public m(tz2.q qVar) {
        this.f423306a = qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        if ((r1 != null && r1.f385838e == 0) == false) goto L13;
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
            tz2.q r0 = r4.f423306a
            tz2.q.a(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[RecordExtraVideo] cgi resp: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.FaceFlashRecordManagerForPay"
            com.tencent.mars.xlog.Log.i(r2, r1)
            int r1 = r5.f70615a
            if (r1 != 0) goto L31
            int r1 = r5.f70616b
            if (r1 != 0) goto L31
            com.tencent.mm.protobuf.f r1 = r5.f70618d
            r45.sl5 r1 = (r45.sl5) r1
            if (r1 == 0) goto L2e
            int r1 = r1.f385838e
            if (r1 != 0) goto L2e
            r1 = 1
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 != 0) goto L78
        L31:
            tz2.q.a(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[RecordExtraVideo] cgi fail, errType: "
            r0.<init>(r1)
            int r1 = r5.f70615a
            r0.append(r1)
            java.lang.String r1 = ", errCode: "
            r0.append(r1)
            int r1 = r5.f70616b
            r0.append(r1)
            java.lang.String r1 = ", ret_code: "
            r0.append(r1)
            com.tencent.mm.protobuf.f r1 = r5.f70618d
            r45.sl5 r1 = (r45.sl5) r1
            r3 = 0
            if (r1 == 0) goto L5d
            int r1 = r1.f385838e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L5e
        L5d:
            r1 = r3
        L5e:
            r0.append(r1)
            java.lang.String r1 = ", ret_msg: "
            r0.append(r1)
            com.tencent.mm.protobuf.f r5 = r5.f70618d
            r45.sl5 r5 = (r45.sl5) r5
            if (r5 == 0) goto L6e
            java.lang.String r3 = r5.f385839f
        L6e:
            r0.append(r3)
            java.lang.String r5 = r0.toString()
            com.tencent.mars.xlog.Log.e(r2, r5)
        L78:
            jz5.f0 r5 = jz5.f0.f302826a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: tz2.m.call(java.lang.Object):java.lang.Object");
    }
}
