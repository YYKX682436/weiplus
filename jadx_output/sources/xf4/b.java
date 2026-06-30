package xf4;

/* loaded from: classes4.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f454328d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f454329e;

    /* renamed from: f, reason: collision with root package name */
    public int f454330f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f454331g = new com.tencent.mm.sdk.platformtools.b4(new xf4.a(this), true);

    /* JADX WARN: Removed duplicated region for block: B:7:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b() {
        /*
            r9 = this;
            r9.<init>()
            r0 = 0
            r9.f454330f = r0
            com.tencent.mm.sdk.platformtools.b4 r1 = new com.tencent.mm.sdk.platformtools.b4
            xf4.a r2 = new xf4.a
            r2.<init>(r9)
            r3 = 1
            r1.<init>(r2, r3)
            r9.f454331g = r1
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.n3 r1 = r1.p()
            r2 = 66052(0x10204, float:9.2559E-41)
            r4 = 0
            java.lang.Object r1 = r1.l(r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = com.tencent.mm.sdk.platformtools.t8.q1(r1)
            c01.q8 r2 = c01.n8.b()
            r5 = 66053(0x10205, float:9.256E-41)
            if (r2 == 0) goto L73
            c01.q8 r2 = c01.n8.b()
            xf4.d r2 = (xf4.d) r2
            r2.getClass()
            if (r1 != 0) goto L3f
        L3d:
            r3 = r0
            goto L5f
        L3f:
            r6 = r0
        L40:
            r7 = 32
            if (r6 >= r7) goto L5f
            int r7 = r3 << r6
            r7 = r7 & r1
            java.lang.String r8 = r2.a(r7, r0)
            boolean r8 = com.tencent.mm.vfs.w6.j(r8)
            if (r8 == 0) goto L3d
            java.lang.String r7 = r2.a(r7, r3)
            boolean r7 = com.tencent.mm.vfs.w6.j(r7)
            if (r7 != 0) goto L5c
            goto L3d
        L5c:
            int r6 = r6 + 1
            goto L40
        L5f:
            if (r3 == 0) goto L73
            c01.f r0 = c01.d9.b()
            com.tencent.mm.storage.n3 r0 = r0.p()
            java.lang.Object r0 = r0.l(r5, r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = com.tencent.mm.sdk.platformtools.t8.q1(r0)
        L73:
            java.lang.Integer.toBinaryString(r1)
            c01.f r1 = c01.d9.b()
            com.tencent.mm.storage.n3 r1 = r1.p()
            java.lang.Object r1 = r1.l(r5, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.tencent.mm.sdk.platformtools.t8.q1(r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r45.yq3 r2 = new r45.yq3
            r2.<init>()
            r1.f70664a = r2
            r45.zq3 r2 = new r45.zq3
            r2.<init>()
            r1.f70665b = r2
            java.lang.String r2 = "/cgi-bin/micromsg-bin/getvuserinfo"
            r1.f70666c = r2
            r2 = 167(0xa7, float:2.34E-43)
            r1.f70667d = r2
            r2 = 60
            r1.f70668e = r2
            r2 = 1000000060(0x3b9aca3c, float:0.0047238152)
            r1.f70669f = r2
            com.tencent.mm.modelbase.o r1 = r1.a()
            r9.f454329e = r1
            com.tencent.mm.modelbase.m r1 = r1.f70710a
            com.tencent.mm.protobuf.f r1 = r1.f70684a
            r45.yq3 r1 = (r45.yq3) r1
            r1.f391307d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xf4.b.<init>():void");
    }

    public static boolean H(xf4.b bVar, int i17, boolean z17, byte[] bArr) {
        bVar.getClass();
        boolean z18 = false;
        if (c01.n8.b() != null) {
            java.io.OutputStream outputStream = null;
            try {
                try {
                    outputStream = com.tencent.mm.vfs.w6.K(((xf4.d) c01.n8.b()).a(i17, z17), false);
                    outputStream.write(bArr);
                    outputStream.close();
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                    z18 = true;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneGetVUserInfo", e17, "", new java.lang.Object[0]);
                    if (outputStream != null) {
                        try {
                            outputStream.close();
                        } catch (java.lang.Exception unused2) {
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused3) {
                    }
                }
                throw th6;
            }
        }
        return z18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f454328d = u0Var;
        return dispatch(sVar, this.f454329e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.thumbplayer.core.common.TPPixelFormat.TP_PIX_FMT_MEDIACODEC;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetVUserInfo", "errType:" + i18 + " errCode:" + i19);
            this.f454328d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.zq3 zq3Var = (r45.zq3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        int i27 = zq3Var.f392303d;
        com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) c01.d9.b().p().l(66053, null));
        java.util.LinkedList linkedList = zq3Var.f392305f;
        linkedList.size();
        c01.d9.b().p().w(66053, java.lang.Integer.valueOf(zq3Var.f392303d));
        if (linkedList.size() <= 0) {
            this.f454328d.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i28 = 0;
        for (int i29 = 0; i29 < linkedList.size(); i29++) {
            i28 |= ((r45.xw6) linkedList.get(i29)).f390563d;
        }
        c01.d9.b().p().w(66052, java.lang.Integer.valueOf(i28));
        this.f454328d.onSceneEnd(i18, i19, str, this);
        this.f454330f = linkedList.size() - 1;
        this.f454331g.c(50L, 50L);
    }
}
