package g80;

/* loaded from: classes12.dex */
public final class b implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final s70.g f269410d;

    /* renamed from: e, reason: collision with root package name */
    public final j15.d f269411e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f269412f;

    public b(s70.g params, j15.d imgMsg) {
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(imgMsg, "imgMsg");
        this.f269410d = params;
        this.f269411e = imgMsg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    @Override // dn.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O(java.lang.String r31, java.io.ByteArrayOutputStream r32) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g80.b.O(java.lang.String, java.io.ByteArrayOutputStream):void");
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        com.tencent.mm.network.o G;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("decodePrepareResponse[");
        s70.g gVar = this.f269410d;
        sb6.append(gVar.f403944a);
        sb6.append("] mediaId:");
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", sb6.toString());
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        r45.qs qsVar = new r45.qs();
        byte[] bArr2 = null;
        try {
            com.tencent.mm.network.s sVar = gm0.j1.d().f70764d;
            byte[] d17 = com.tencent.mm.modelbase.y2.d(110, bArr, (sVar == null || (G = sVar.G()) == null) ? null : G.r(1), pInt, qsVar);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f403944a + "] aeskey[%s], fileid[%s], clientimgid[%s]", qsVar.f384240i, qsVar.f384241m, qsVar.f384235d);
            this.f269412f = qsVar.f384240i;
            ((com.tencent.mm.plugin.messenger.foundation.PluginMessengerFoundation) ((vg3.f4) i95.n0.c(vg3.f4.class))).Di(qsVar.f384243o);
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f403944a + "].ActionFlag:%s", java.lang.Integer.valueOf(qsVar.f384243o));
            bArr2 = d17;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImgUpload.MsgImgUploadFSC", "decodePrepareResponse[" + gVar.f403944a + "] Exception:%s", e17);
            gVar.f403951h.put("up_resp_decode_err", 1);
            this.f269412f = null;
        }
        java.lang.String str2 = "decodePrepareResponse[" + gVar.f403944a + "] clientmediaid:%s, ret:%d result:%b aesKey:%s";
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = str;
        objArr[1] = java.lang.Integer.valueOf(pInt.value);
        objArr[2] = java.lang.Boolean.valueOf(bArr2 == null);
        objArr[3] = this.f269412f;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.MsgImgUploadFSC", str2, objArr);
        return bArr2;
    }
}
