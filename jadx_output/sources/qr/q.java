package qr;

/* loaded from: classes12.dex */
public class q implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.s f366034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qr.r f366035f;

    public q(qr.r rVar, java.lang.String str, qr.s sVar) {
        this.f366035f = rVar;
        this.f366033d = str;
        this.f366034e = sVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        qr.r rVar = this.f366035f;
        rVar.f366024f = hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback: %s, %s", str, java.lang.Integer.valueOf(i17));
        if (i17 != 0) {
            if (com.tencent.mm.vfs.w6.j(rVar.f366040h)) {
                com.tencent.mm.vfs.w6.h(rVar.f366040h);
            }
            if (com.tencent.mm.vfs.w6.j(rVar.f366041i)) {
                com.tencent.mm.vfs.w6.h(rVar.f366041i);
            }
            rVar.a(11);
            return 0;
        }
        if (gVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback progress: %s, %s, %s", java.lang.Integer.valueOf(gVar.field_status), java.lang.Long.valueOf(gVar.field_finishedLength), java.lang.Long.valueOf(gVar.field_toltalLength));
        }
        if (hVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = java.lang.Integer.valueOf(hVar.field_retCode);
            objArr[1] = hVar.f241772g;
            java.lang.String str2 = hVar.field_fileUrl;
            if (str2 == null) {
                str2 = "no url";
            }
            objArr[2] = str2;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "cdn callback result: %s, %s, %s", objArr);
            if (com.tencent.mm.vfs.w6.j(rVar.f366040h)) {
                com.tencent.mm.vfs.w6.h(rVar.f366040h);
            }
            if (com.tencent.mm.vfs.w6.j(rVar.f366041i)) {
                com.tencent.mm.vfs.w6.h(rVar.f366041i);
            }
            java.lang.String str3 = hVar.f241772g;
            int i18 = hVar.field_retCode;
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = rVar.f366019a;
            if (i18 != 0 || com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                int i19 = hVar.field_retCode;
                if (i19 <= -20000 || i19 >= 0) {
                    if (i19 == -5109012) {
                        final qr.s sVar = this.f366034e;
                        if (!sVar.f366044c) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "try fetch original image %s", emojiInfo.field_md5);
                            final com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo(emojiInfo);
                            emojiInfo2.field_externUrl = "";
                            new cr.k(emojiInfo2, new cr.l(emojiInfo2, new yz5.l() { // from class: qr.q$$a
                                @Override // yz5.l
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    qr.q qVar = qr.q.this;
                                    qVar.getClass();
                                    boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
                                    qr.r rVar2 = qVar.f366035f;
                                    if (booleanValue) {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo3 = emojiInfo2;
                                        sb6.append(emojiInfo3.N0());
                                        sb6.append("_origin_");
                                        sb6.append(java.lang.System.currentTimeMillis());
                                        java.lang.String path = sb6.toString();
                                        fr.b bVar = new fr.b();
                                        fr.c a17 = fr.d.f265687a.a(emojiInfo3);
                                        kotlin.jvm.internal.o.g(path, "path");
                                        boolean z18 = a17.f265682c;
                                        int i27 = a17.f265686g;
                                        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo4 = a17.f265680a;
                                        kotlin.jvm.internal.o.g(emojiInfo4, "emojiInfo");
                                        java.lang.String verifyMd5 = a17.f265681b;
                                        kotlin.jvm.internal.o.g(verifyMd5, "verifyMd5");
                                        java.lang.String aesKey = a17.f265683d;
                                        kotlin.jvm.internal.o.g(aesKey, "aesKey");
                                        java.lang.String tempPath = a17.f265685f;
                                        kotlin.jvm.internal.o.g(tempPath, "tempPath");
                                        if (bVar.b(new fr.c(emojiInfo4, verifyMd5, z18, aesKey, path, tempPath, i27))) {
                                            qr.s sVar2 = sVar;
                                            sVar2.f366044c = true;
                                            sVar2.f366045d = path;
                                            rVar2.f366041i = path;
                                            qr.r.e(rVar2, sVar2);
                                            return jz5.f0.f302826a;
                                        }
                                    }
                                    rVar2.a(11);
                                    return jz5.f0.f302826a;
                                }
                            }));
                            return 0;
                        }
                    }
                    rVar.a(11);
                } else if (i19 == -447) {
                    rVar.a(2);
                } else if (i19 == -448) {
                    rVar.a(8);
                } else {
                    rVar.c();
                }
            } else {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - rVar.f366022d;
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "complete cost %d, size %d, rate %d", java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(emojiInfo.field_size), java.lang.Long.valueOf(emojiInfo.field_size / currentTimeMillis));
                java.lang.String str4 = this.f366033d;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = hVar.field_fileUrl;
                rVar.b(0, str3, str4, str5 != null ? str5 : "");
            }
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
