package fr;

/* loaded from: classes12.dex */
public final class b {
    public final void a(fr.c cVar, boolean z17) {
        if (z17) {
            int i17 = cVar.f265686g;
            if (i17 == 1) {
                h12.f.a(7L, 1L);
                return;
            } else if (i17 == 2) {
                h12.f.a(11L, 1L);
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                h12.f.a(24L, 1L);
                return;
            }
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = cVar.f265680a;
        int i18 = cVar.f265686g;
        if (i18 == 1) {
            h12.f.a(8L, 1L);
            h12.f.b(emojiInfo.getMd5(), 3, 0, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
        } else if (i18 == 2) {
            h12.f.a(12L, 1L);
            h12.f.b(emojiInfo.getMd5(), 4, 0, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
        } else {
            if (i18 != 3) {
                return;
            }
            h12.f.a(25L, 1L);
        }
    }

    public final boolean b(fr.c verifyConfig) {
        kotlin.jvm.internal.o.g(verifyConfig, "verifyConfig");
        java.lang.String str = verifyConfig.f265683d;
        boolean z17 = verifyConfig.f265682c;
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = verifyConfig.f265680a;
        java.lang.String str2 = verifyConfig.f265684e;
        java.lang.String str3 = verifyConfig.f265685f;
        if (z17) {
            try {
                byte[] a17 = kk.b.a(com.tencent.mm.vfs.w6.N(str3, 0, -1), android.util.Base64.encodeToString(com.tencent.mm.sdk.platformtools.t8.h(str), 0));
                boolean z18 = a17 != null && com.tencent.mm.vfs.w6.S(str2, a17, 0, a17.length) == 0;
                com.tencent.mm.vfs.w6.h(str3);
                if (!z18) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EmojiLoader.EmojiFileVerify", "decrypt failed : " + str);
                    a(verifyConfig, false);
                    return false;
                }
                a(verifyConfig, true);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EmojiLoader.EmojiFileVerify", e17, "decrypt exception : " + str, new java.lang.Object[0]);
                a(verifyConfig, false);
                if (e17 instanceof javax.crypto.BadPaddingException) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFileVerify", "checkFixAesKey: " + str);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_tpurl)) {
                        emojiInfo.field_externUrl = "";
                        emojiInfo.field_encrypturl = "";
                        emojiInfo.field_cdnUrl = "";
                        emojiInfo.field_tpurl = "";
                        emojiInfo.field_aeskey = "";
                        new cr.k(emojiInfo, fr.a.f265679d);
                    }
                }
                return false;
            }
        } else {
            com.tencent.mm.vfs.w6.w(str3, str2);
        }
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("file md5 ");
        sb6.append(p17);
        sb6.append(", ");
        java.lang.String str4 = verifyConfig.f265681b;
        sb6.append(str4);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiLoader.EmojiFileVerify", sb6.toString());
        boolean z19 = !com.tencent.mm.sdk.platformtools.t8.K0(p17) && r26.i0.p(p17, str4, true);
        int i17 = verifyConfig.f265686g;
        if (z19) {
            if (i17 == 0) {
                h12.f.b(emojiInfo.getMd5(), 4, 0, 0, emojiInfo.field_groupId, 0, emojiInfo.field_designerID);
                h12.f.a(4L, 1L);
            } else if (i17 == 1) {
                h12.f.b(emojiInfo.getMd5(), 2, 0, 0, emojiInfo.field_groupId, 0, emojiInfo.field_designerID);
                h12.f.a(4L, 1L);
            } else if (i17 == 2) {
                h12.f.b(emojiInfo.getMd5(), 4, 0, 0, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
                h12.f.a(13L, 1L);
            } else if (i17 == 3) {
                h12.f.a(26L, 1L);
            }
        } else if (i17 == 0) {
            h12.f.b(emojiInfo.getMd5(), 4, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            h12.f.a(5L, 1L);
        } else if (i17 == 1) {
            h12.f.b(emojiInfo.getMd5(), 2, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            h12.f.a(5L, 1L);
        } else if (i17 == 2) {
            h12.f.b(emojiInfo.getMd5(), 4, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            h12.f.a(14L, 1L);
        } else if (i17 == 3) {
            h12.f.a(27L, 1L);
        }
        if (!z19 || !gm0.j1.b().m()) {
            return false;
        }
        ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).getClass();
        wq.a.f().d(emojiInfo, true);
        return true;
    }
}
