package n22;

/* loaded from: classes12.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.ArrayList f334295a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f334296b;

    static {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        f334295a = arrayList;
        f334296b = false;
        arrayList.add("9bd1281af3a31710a45b84d736363691");
        arrayList.add("08f223fa83f1ca34e143d1e580252c7c");
    }

    public static void a(r45.ri0 ri0Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_md5) || emojiInfo.field_md5.equals(ri0Var.f384886d)) {
            emojiInfo.field_md5 = c(ri0Var.f384886d, emojiInfo.field_md5);
            emojiInfo.field_cdnUrl = c(ri0Var.f384887e, emojiInfo.field_cdnUrl);
            emojiInfo.field_thumbUrl = c(ri0Var.f384888f, emojiInfo.field_thumbUrl);
            emojiInfo.field_designerID = c(ri0Var.f384889g, emojiInfo.field_designerID);
            emojiInfo.field_encrypturl = c(ri0Var.f384890h, emojiInfo.field_encrypturl);
            emojiInfo.field_aeskey = c(ri0Var.f384891i, emojiInfo.field_aeskey);
            emojiInfo.field_groupId = c(ri0Var.f384892m, emojiInfo.field_groupId);
            emojiInfo.field_externUrl = c(ri0Var.f384893n, emojiInfo.field_externUrl);
            emojiInfo.field_externMd5 = c(ri0Var.f384894o, emojiInfo.field_externMd5);
            emojiInfo.field_activityid = c(ri0Var.f384895p, emojiInfo.field_activityid);
            emojiInfo.field_attachedText = c(ri0Var.f384896q, emojiInfo.field_attachedText);
            emojiInfo.field_attachTextColor = c(ri0Var.f384897r, emojiInfo.field_attachTextColor);
            emojiInfo.field_lensId = c(ri0Var.f384898s, emojiInfo.field_lensId);
            emojiInfo.field_linkId = c(ri0Var.f384900u, emojiInfo.field_linkId);
            java.lang.String a17 = n22.b.a(ri0Var);
            if (!android.text.TextUtils.isEmpty(a17)) {
                emojiInfo.field_meanings = a17;
            }
            if (emojiInfo.field_meanings == null) {
                emojiInfo.field_isOcrProcessed = 0;
            }
            emojiInfo.field_attr = c(ri0Var.f384899t, emojiInfo.field_attr);
            java.util.LinkedList linkedList = ri0Var.f384903x;
            if (linkedList != null && linkedList.size() > 0) {
                emojiInfo.field_custom_meaning = (java.lang.String) linkedList.get(0);
            }
            emojiInfo.I2 = c(ri0Var.A, emojiInfo.I2);
            emojiInfo.field_emojiFlag = ri0Var.f384902w;
        }
    }

    public static void b(com.tencent.mm.storage.g5 g5Var, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        emojiInfo.field_md5 = c(g5Var.f193954d, emojiInfo.field_md5);
        emojiInfo.field_svrid = c(g5Var.f193953c, emojiInfo.field_svrid);
        emojiInfo.field_type = g5Var.f193955e;
        emojiInfo.field_size = g5Var.f193956f;
        emojiInfo.field_groupId = c(g5Var.f193957g, emojiInfo.field_groupId);
        emojiInfo.field_designerID = c(g5Var.f193962l, emojiInfo.field_designerID);
        emojiInfo.field_thumbUrl = c(g5Var.f193963m, emojiInfo.field_thumbUrl);
        emojiInfo.field_width = g5Var.f193972v;
        emojiInfo.field_height = g5Var.f193973w;
        emojiInfo.field_activityid = c(g5Var.f193976z, emojiInfo.field_activityid);
        emojiInfo.field_tpurl = c(g5Var.f193974x, emojiInfo.field_tpurl);
        emojiInfo.field_tpauthkey = c(g5Var.f193975y, emojiInfo.field_tpauthkey);
        boolean z17 = (com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193966p) && com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193964n) && com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193961k)) ? false : true;
        if (!(true ^ com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193974x))) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_externUrl) && com.tencent.mm.sdk.platformtools.t8.K0(g5Var.f193966p)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "%s, wxam url delete, origin: %s", emojiInfo.getMd5(), emojiInfo.field_externUrl);
                if (com.tencent.mm.vfs.w6.j(emojiInfo.N0()) && com.tencent.mm.sdk.platformtools.y1.g(emojiInfo.N0())) {
                    emojiInfo.w();
                    com.tencent.mm.vfs.w6.h(emojiInfo.h0());
                }
            }
            emojiInfo.field_cdnUrl = g5Var.f193961k;
            emojiInfo.field_encrypturl = g5Var.f193964n;
            emojiInfo.field_externUrl = g5Var.f193966p;
            emojiInfo.field_externMd5 = g5Var.f193967q;
            emojiInfo.field_aeskey = g5Var.f193965o;
        } else if (!z17) {
            emojiInfo.field_aeskey = g5Var.f193965o;
        }
        emojiInfo.field_attachedText = c(g5Var.B, emojiInfo.field_attachedText);
        emojiInfo.field_lensId = c(g5Var.C, emojiInfo.field_lensId);
        emojiInfo.field_attachTextColor = c(g5Var.D, emojiInfo.field_attachTextColor);
        emojiInfo.field_linkId = c(g5Var.A, emojiInfo.field_linkId);
        emojiInfo.field_storeUnique = g5Var.F;
    }

    public static java.lang.String c(java.lang.String str, java.lang.String str2) {
        return com.tencent.mm.sdk.platformtools.t8.K0(str) ? str2 == null ? "" : str2 : str;
    }

    public static java.lang.String d(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        for (int i17 = 0; i17 < str.length(); i17++) {
            com.tencent.mm.smiley.h1 d17 = com.tencent.mm.smiley.t1.a().d(str, i17);
            if (d17 != null) {
                linkedList.add(d17);
            }
        }
        if (linkedList.size() == 1) {
            return ((com.tencent.mm.smiley.h1) linkedList.get(0)).f193267b;
        }
        return null;
    }

    public static int e(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo == null) {
            return -1;
        }
        return (p(iEmojiInfo) || !com.tencent.mm.sdk.platformtools.t8.K0(iEmojiInfo.X0())) ? 17 : 14;
    }

    public static void f() {
        gr.v vVar = gr.v.f274696a;
        vVar.a(false);
        if (vVar.b().getBoolean("game_to_custom", false)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "gameToCustom: done");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "do gameToCustom");
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1("9bd1281af3a31710a45b84d736363691");
        com.tencent.mm.storage.emotion.EmojiInfo u18 = com.tencent.mm.storage.n5.f().c().u1("08f223fa83f1ca34e143d1e580252c7c");
        if (u17 == null || u18 == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUtils", "gameToCustom: no game emoji!");
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("9bd1281af3a31710a45b84d736363691");
        arrayList.add("08f223fa83f1ca34e143d1e580252c7c");
        new pr.b(0, 1, arrayList).l().K(new n22.n(u17, u18));
    }

    public static java.lang.String g() {
        return rr.s.f399149a.c();
    }

    public static int h(byte[] bArr) {
        if (bArr != null && bArr.length >= 4) {
            byte b17 = bArr[1];
            if (b17 == 80 && bArr[2] == 78 && bArr[3] == 71) {
                return 1;
            }
            if (bArr[0] == 71 && b17 == 73 && bArr[2] == 70) {
                return 2;
            }
            if (bArr[6] == 74 && bArr[7] == 70 && bArr[8] == 73 && bArr[9] == 70) {
                return 3;
            }
        }
        return -1;
    }

    public static com.tencent.mm.storage.emotion.EmojiInfo i(r45.ri0 ri0Var) {
        com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(ri0Var.f384886d);
        if (u17 != null) {
            return u17;
        }
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
        emojiInfo.field_catalog = 84;
        emojiInfo.field_reserved4 |= 1;
        java.lang.String str = ri0Var.f384901v;
        a(ri0Var, emojiInfo);
        emojiInfo.H2 = str;
        return emojiInfo;
    }

    public static boolean j(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        return com.tencent.mm.sdk.platformtools.t8.D0(iEmojiInfo.getGroupId(), "capture");
    }

    public static boolean k(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        int group = iEmojiInfo.getGroup();
        l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
        if (group == 81) {
            return true;
        }
        java.util.Iterator it = gr.t.g().a().iterator();
        while (it.hasNext()) {
            if (com.tencent.mm.sdk.platformtools.t8.D0(((com.tencent.mm.storage.emotion.EmojiInfo) it.next()).field_md5, iEmojiInfo.H0())) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo == null) {
            return false;
        }
        return m(iEmojiInfo.getMd5());
    }

    public static boolean m(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return com.tencent.mm.sdk.platformtools.t8.D0(str, "9bd1281af3a31710a45b84d736363691") || com.tencent.mm.sdk.platformtools.t8.D0(str, "08f223fa83f1ca34e143d1e580252c7c");
    }

    public static boolean n(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        return f334295a.contains(str);
    }

    public static java.lang.String o(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        com.tencent.mm.smiley.h1 d17 = com.tencent.mm.smiley.t1.a().d(str, 0);
        if (d17 != null && com.tencent.mm.sdk.platformtools.t8.D0(d17.f193268c, str)) {
            return d17.f193267b;
        }
        if (com.tencent.mm.smiley.e1.b().a(str)) {
            return str;
        }
        return null;
    }

    public static boolean p(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        return iEmojiInfo != null && q(iEmojiInfo.getGroupId());
    }

    public static boolean q(java.lang.String str) {
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.D0(str, "capture") || com.tencent.mm.sdk.platformtools.t8.D0(str, "17")) ? false : true;
    }

    public static boolean r(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo) {
        java.lang.String str;
        if (emojiInfo == null) {
            return false;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ForbiddenEmotionSpringFestivalMsgTail", 0) <= 0) {
            return j(emojiInfo) || ((str = emojiInfo.field_activityid) != null && str.startsWith("Selfie"));
        }
        return false;
    }

    public static void s(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2) {
        emojiInfo2.field_cdnUrl = emojiInfo.field_cdnUrl;
        emojiInfo2.field_thumbUrl = emojiInfo.field_thumbUrl;
        emojiInfo2.field_designerID = emojiInfo.field_designerID;
        emojiInfo2.field_encrypturl = emojiInfo.field_encrypturl;
        emojiInfo2.field_aeskey = emojiInfo.field_aeskey;
        emojiInfo2.field_groupId = emojiInfo.field_groupId;
        emojiInfo2.field_externUrl = emojiInfo.field_externUrl;
        emojiInfo2.field_externMd5 = emojiInfo.field_externMd5;
        emojiInfo2.field_activityid = emojiInfo.field_activityid;
        emojiInfo2.field_attachedText = emojiInfo.field_attachedText;
        emojiInfo2.field_attachTextColor = emojiInfo.field_attachTextColor;
        emojiInfo2.field_lensId = emojiInfo.field_lensId;
    }
}
