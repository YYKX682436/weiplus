package k72;

/* loaded from: classes14.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f304711a;

    /* renamed from: b, reason: collision with root package name */
    public final float f304712b;

    /* renamed from: c, reason: collision with root package name */
    public final int f304713c;

    /* renamed from: d, reason: collision with root package name */
    public final int f304714d;

    /* renamed from: e, reason: collision with root package name */
    public final int f304715e;

    /* renamed from: f, reason: collision with root package name */
    public k72.b0 f304716f;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f304717g;

    /* renamed from: h, reason: collision with root package name */
    public long f304718h = java.lang.System.currentTimeMillis();

    public d0(java.lang.String str, float f17, int i17, int i18, int i19) {
        this.f304711a = str;
        this.f304712b = f17;
        this.f304713c = i17;
        this.f304714d = i18;
        this.f304715e = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "create FaceCheckVideoRecordMgr, reductionRatio: %s, orientation: %s, cameraFrameWidth: %s, cameraFrameHeight: %s", java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
    }

    public final void a(java.lang.String str) {
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "MD5ForSignatureString：%s", p17);
        byte[] bytes = p17.getBytes();
        com.tencent.mm.pointers.PByteArray pByteArray = new com.tencent.mm.pointers.PByteArray();
        if (fo3.s.INSTANCE.f4(1, bytes, 0, bytes.length, pByteArray)) {
            this.f304717g = pByteArray.value;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "digitalSignature failed");
            this.f304717g = bytes;
        }
    }

    public final void b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceCheckVideoRecordMgr", "doUploadVideoFile: %s", str);
        this.f304718h = java.lang.System.currentTimeMillis();
        dn.m mVar = new dn.m();
        mVar.f241785d = "task_FaceCheckVideoRecordMgr";
        mVar.f241787f = new k72.c0(this, str, this.f304711a, null);
        mVar.field_mediaId = com.tencent.mm.plugin.facedetect.model.s0.f(str);
        mVar.field_fullpath = str;
        mVar.field_thumbpath = "";
        mVar.field_fileType = 5;
        mVar.field_talker = "";
        mVar.field_priority = 2;
        mVar.field_needStorage = false;
        mVar.field_isStreamMedia = false;
        mVar.field_appType = 1;
        mVar.field_bzScene = 0;
        mVar.field_largesvideo = 0;
        mVar.f241789h = 5;
        vz2.c.j("reqCdn");
        if (((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Bi(mVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceCheckVideoRecordMgr", "hy: video task info failed. clientid:%s", mVar.field_mediaId);
        com.tencent.mm.vfs.w6.h(str);
        vz2.c.j("cdnFailTask");
        k72.b0 b0Var = this.f304716f;
        if (b0Var != null) {
            ((k72.r) b0Var).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "AES"
            com.tencent.mm.vfs.r6 r1 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r7 = com.tencent.mm.vfs.z7.a(r7)
            r1.<init>(r7)
            com.tencent.mm.vfs.r6 r7 = new com.tencent.mm.vfs.r6
            com.tencent.mm.vfs.z7 r8 = com.tencent.mm.vfs.z7.a(r8)
            r7.<init>(r8)
            boolean r8 = r1.m()
            if (r8 == 0) goto Lbd
            boolean r8 = r1.A()
            if (r8 == 0) goto Lbd
            com.tencent.mm.vfs.r6 r8 = r7.s()
            boolean r8 = r8.m()
            if (r8 != 0) goto L31
            com.tencent.mm.vfs.r6 r8 = r7.s()
            r8.J()
        L31:
            r7.k()
            r8 = 0
            java.io.InputStream r1 = com.tencent.mm.vfs.w6.C(r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La6
            java.io.OutputStream r7 = com.tencent.mm.vfs.w6.H(r7)     // Catch: java.lang.Throwable -> L96 java.lang.Exception -> L9b
            java.lang.String r2 = "UTF-8"
            byte[] r2 = r6.getBytes(r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r2 = r3.getEncoded()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r3.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            java.lang.String r0 = "AES/CBC/PKCS7Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.spec.IvParameterSpec r2 = new javax.crypto.spec.IvParameterSpec     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            byte[] r6 = r6.getBytes()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6 = 1
            r0.init(r6, r3, r2)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            javax.crypto.CipherInputStream r6 = new javax.crypto.CipherInputStream     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r6.<init>(r1, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L91
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r8 = new byte[r8]     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
        L6d:
            int r0 = r6.read(r8)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r2 = -1
            if (r0 == r2) goto L7c
            r2 = 0
            r7.write(r8, r2, r0)     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            r7.flush()     // Catch: java.lang.Exception -> L8a java.lang.Throwable -> Lac
            goto L6d
        L7c:
            if (r7 == 0) goto L81
            r7.close()
        L81:
            r6.close()
            if (r1 == 0) goto Lbd
            r1.close()
            goto Lbd
        L8a:
            r8 = move-exception
            goto Lab
        L8c:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lad
        L91:
            r6 = move-exception
            r4 = r8
            r8 = r6
            r6 = r4
            goto Lab
        L96:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lad
        L9b:
            r6 = move-exception
            r7 = r8
            r8 = r6
            r6 = r7
            goto Lab
        La0:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
            goto Lad
        La6:
            r6 = move-exception
            r7 = r8
            r1 = r7
            r8 = r6
            r6 = r1
        Lab:
            throw r8     // Catch: java.lang.Throwable -> Lac
        Lac:
            r8 = move-exception
        Lad:
            if (r7 == 0) goto Lb2
            r7.close()
        Lb2:
            if (r6 == 0) goto Lb7
            r6.close()
        Lb7:
            if (r1 == 0) goto Lbc
            r1.close()
        Lbc:
            throw r8
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k72.d0.c(java.lang.String, java.lang.String, java.lang.String):void");
    }
}
