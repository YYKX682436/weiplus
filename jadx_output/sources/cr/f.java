package cr;

/* loaded from: classes12.dex */
public final class f implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.emotion.EmojiInfo f221566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f221567b;

    public f(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, yz5.l lVar) {
        this.f221566a = emojiInfo;
        this.f221567b = lVar;
    }

    @Override // dr.q
    public void a(boolean z17) {
        android.graphics.Bitmap frame;
        java.lang.String D;
        boolean z18;
        byte[] bj6;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onResult: ");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f221566a;
        sb6.append(emojiInfo.getMd5());
        sb6.append(", ");
        sb6.append(z17);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", sb6.toString());
        yz5.l lVar = this.f221567b;
        if (!z17) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
                return;
            }
            return;
        }
        kotlin.jvm.internal.o.g(emojiInfo, "emojiInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "createThumb: " + emojiInfo.getMd5());
        com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion companion = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE;
        wq.d decoder = companion.getDecoder(emojiInfo);
        boolean z19 = false;
        if (companion.isValid(decoder)) {
            if ((decoder instanceof wq.h) && decoder.d() == 1) {
                decoder.destroy();
                byte[] z27 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(emojiInfo);
                frame = (z27 == null || (bj6 = ((h12.z) ((k12.u) i95.n0.c(k12.u.class))).bj(z27, 6)) == null) ? null : com.tencent.mm.sdk.platformtools.x.G(bj6);
            } else {
                decoder.c();
                frame = decoder.getFrame();
                decoder.destroy();
            }
            if (frame == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EmojiCoverFetcher", "bitmap is null");
            } else {
                try {
                    com.tencent.mm.sdk.platformtools.x.D0(frame, 100, android.graphics.Bitmap.CompressFormat.PNG, emojiInfo.h0(), false);
                    if ((frame.getWidth() <= 120 && frame.getHeight() <= 120) || (frame = com.tencent.mm.sdk.platformtools.x.S(frame, 120, 120, false, true)) != null) {
                        ar.c.f13356a.b(emojiInfo.getMd5(), frame);
                        z19 = true;
                    }
                } catch (java.io.IOException e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiCoverFetcher", e17, "saveBitmapToImage failed", new java.lang.Object[0]);
                    java.lang.String h07 = emojiInfo.h0();
                    kotlin.jvm.internal.o.f(h07, "getCoverPath(...)");
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[2];
                        objArr[0] = e17.getMessage();
                        java.lang.Throwable cause = e17.getCause();
                        objArr[1] = cause != null ? cause.getMessage() : null;
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "error message: %s, cause: %s", objArr);
                        for (com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(h07)); r6Var != null; r6Var = r6Var.s()) {
                            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                            sb7.append("path: ");
                            sb7.append(r6Var.u());
                            sb7.append(", exist: ");
                            sb7.append(r6Var.m());
                            sb7.append(", canRead: ");
                            sb7.append(r6Var.h());
                            sb7.append(", canWrite: ");
                            sb7.append(r6Var.i());
                            sb7.append(", canExecute: ");
                            com.tencent.mm.vfs.z2 M = r6Var.M();
                            if (M.a()) {
                                com.tencent.mm.vfs.q2 q2Var = M.f213266a;
                                if ((q2Var.o() & 2) != 0 && (D = q2Var.D(M.f213267b, false)) != null && new java.io.File(D).canExecute()) {
                                    z18 = true;
                                    sb7.append(z18);
                                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", sb7.toString());
                                }
                            }
                            z18 = false;
                            sb7.append(z18);
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", sb7.toString());
                        }
                        try {
                            com.tencent.mm.vfs.u6 u6Var = new com.tencent.mm.vfs.u6(h07);
                            try {
                                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "read-only open OK");
                                vz5.b.a(u6Var, null);
                            } catch (java.lang.Throwable th6) {
                                try {
                                    throw th6;
                                } catch (java.lang.Throwable th7) {
                                    vz5.b.a(u6Var, th6);
                                    throw th7;
                                }
                            }
                        } catch (java.io.IOException e18) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "read-only open fail, " + e18.getMessage());
                        }
                    } catch (java.lang.Exception e19) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "logFileAccessDiagnostics fail, " + e19.getMessage());
                    }
                }
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.EmojiCoverFetcher", "createThumb: invalid decoder");
            decoder.destroy();
        }
        if (z19) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.TRUE);
            }
        } else if (lVar != null) {
            lVar.invoke(java.lang.Boolean.FALSE);
        }
    }
}
