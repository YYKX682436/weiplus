package com.tencent.mm.storage.emotion;

/* loaded from: classes12.dex */
public class EmojiInfo extends dm.v2 implements com.tencent.mm.api.IEmojiInfo, android.os.Parcelable {
    public final java.lang.String C2;
    public java.lang.String D2;
    public java.lang.String E2;
    public int F2;
    public int G2;
    public java.lang.String H2;
    public java.lang.String I2;
    public com.tencent.mm.api.EmotionStrategyInfo J2;
    public qk.z6 K2;
    public static final l75.e0 L2 = dm.v2.initAutoDBInfo(com.tencent.mm.storage.emotion.EmojiInfo.class);
    public static final android.os.Parcelable.Creator<com.tencent.mm.storage.emotion.EmojiInfo> CREATOR = new z85.i();

    public EmojiInfo() {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = rr.s.f399149a.c();
        reset();
    }

    public static boolean y0(int i17) {
        return i17 == 50 || i17 == 49;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String A() {
        return this.field_custom_meaning;
    }

    public boolean A0() {
        return (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_app_id) || com.tencent.mm.sdk.platformtools.t8.K0(this.field_groupId) || this.field_groupId.equals(java.lang.String.valueOf(18)) || this.field_groupId.equals(java.lang.String.valueOf(17)) || this.field_groupId.equals(java.lang.String.valueOf(81)) || this.field_groupId.equals(java.lang.String.valueOf(65)) || this.field_groupId.equals("capture")) ? false : true;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int B0() {
        return this.F2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public boolean B1() {
        int i17 = this.field_type;
        return i17 == 2 || i17 == 10;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String C0() {
        return this.field_meanings;
    }

    public byte[] D0(int i17, int i18) {
        java.io.InputStream inputStream = null;
        if (i17 < 0 || i18 < 0) {
            return null;
        }
        int i19 = this.field_catalog;
        if (i19 == 17 || i19 == 50 || i19 == 49) {
            try {
                try {
                    inputStream = h12.e.a(com.tencent.mm.sdk.platformtools.x2.f193071a, getName());
                    inputStream.skip(i17);
                    byte[] bArr = new byte[i18];
                    inputStream.read(bArr, 0, i18);
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e17) {
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    }
                    return bArr;
                } catch (java.io.IOException e18) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e18));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (java.io.IOException e19) {
                            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (java.io.IOException e27) {
                        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfo", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e27));
                    }
                }
                throw th6;
            }
        }
        return com.tencent.mm.vfs.w6.N(N0(), this.field_start, i18);
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public boolean E0() {
        int i17;
        if (n22.m.n(this.field_md5) || (i17 = this.field_catalog) == 18 || i17 == 50 || i17 == 49) {
            return true;
        }
        java.lang.String N0 = N0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(N0)) {
            return false;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(N0);
        boolean z17 = r6Var.m() && r6Var.C() > 0;
        if (z17) {
            return z17;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.C2;
        sb6.append(str);
        sb6.append(this.field_md5);
        if (com.tencent.mm.vfs.w6.k(sb6.toString()) <= 0) {
            return z17;
        }
        com.tencent.mm.vfs.w6.c(str + this.field_md5, N0);
        return r6Var.m() && r6Var.C() > 0;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String E1() {
        return this.H2;
    }

    public void F0(java.lang.String str) {
        this.field_activityid = str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void F1(qk.x6 x6Var) {
        this.field_captureStatus = x6Var.ordinal();
    }

    public void G0(int i17) {
        this.field_reserved4 = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String G1() {
        return this.I2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String H0() {
        return this.field_md5;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String H1() {
        return this.field_lensId;
    }

    public void I0(int i17) {
        this.field_catalog = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public boolean I1() {
        int i17 = this.field_catalog;
        return i17 == 50 || i17 == 49 || i17 == 18;
    }

    public void J0(java.lang.String str) {
        this.field_groupId = str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String J1() {
        return this.field_encrypturl;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void K0(java.lang.String str, java.lang.String str2) {
        this.J2 = new com.tencent.mm.api.EmotionStrategyInfo(str, str2);
    }

    public void L0(int i17) {
        this.field_idx = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String N0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_groupId) && com.tencent.mm.sdk.platformtools.t8.K0(this.field_md5)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_md5)) {
            return null;
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.field_groupId);
        java.lang.String str = this.C2;
        if (!K0 && !com.tencent.mm.sdk.platformtools.t8.D0(this.field_groupId, "capture")) {
            str = str + this.field_groupId + "/";
        }
        com.tencent.mm.vfs.w6.u(str);
        return str + this.field_md5;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String N1() {
        return this.field_linkId;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void O0(int i17) {
        this.field_start = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int O1() {
        return this.field_reserved4;
    }

    public void P0(java.lang.String str) {
        this.field_md5 = str;
    }

    public void Q0(java.lang.String str) {
        this.field_name = str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public boolean Q1() {
        int i17 = this.field_catalog;
        if (i17 == 50 || i17 == 49) {
            return true;
        }
        java.lang.String N0 = N0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(N0)) {
            return false;
        }
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(N0);
        java.lang.String str = a17.f213279f;
        if (str != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (m17.a()) {
            return m17.f213266a.F(m17.f213267b);
        }
        return false;
    }

    public void R0(int i17) {
        this.field_size = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String S() {
        return this.field_app_id;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String S0() {
        return this.field_activityid;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String T() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_md5)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiInfo", "[cpan] get icon path failed. product id and md5 are null.");
            return null;
        }
        java.lang.String str = this.C2 + "decrypt/";
        java.lang.String str2 = str + this.field_md5;
        if (!com.tencent.mm.vfs.w6.j(str2) && com.tencent.mm.vfs.w6.j(N0())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "getDecryptPath decrypt %s", this.field_md5);
            byte[] c17 = wq.a.f().c(this);
            if (c17 != null) {
                com.tencent.mm.vfs.w6.u(str);
                com.tencent.mm.vfs.w6.S(str2, c17, 0, c17.length);
            }
        }
        return str2;
    }

    public void T0(int i17) {
        this.field_temp = i17;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int V() {
        return this.field_storeUnique;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public synchronized android.graphics.Bitmap W(android.content.Context context) {
        return t0(context, true);
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String X0() {
        return this.field_designerID;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String Z() {
        return this.field_externUrl;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public synchronized android.graphics.Bitmap a0(android.content.Context context, int i17) {
        int i18;
        int i19 = this.field_catalog;
        int i27 = 0;
        if (i19 != 18 && i19 != 50 && i19 != 49) {
            if (i19 == 17) {
                java.lang.String name = getName();
                if (com.tencent.mm.sdk.platformtools.t8.K0(name)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "name is null");
                } else {
                    name = (com.tencent.mm.sdk.platformtools.t8.K0(j()) ? getName() : j()).replaceAll(".png", "");
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] drawable name:%s", name);
                android.graphics.Bitmap K0 = com.tencent.mm.sdk.platformtools.x.K0(context.getResources().getDrawable(context.getResources().getIdentifier(name, "drawable", com.tencent.mm.sdk.platformtools.x2.f193072b)));
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", java.lang.Integer.valueOf(this.field_catalog), java.lang.Integer.valueOf(K0.getWidth()), java.lang.Integer.valueOf(K0.getHeight()));
                return K0;
            }
            java.lang.String h07 = h0();
            boolean j17 = com.tencent.mm.vfs.w6.j(h07);
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "[addEmoji] thumbPath:%s isExist:%s", h07, java.lang.Boolean.valueOf(j17));
            if (j17) {
                android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                com.tencent.mm.graphics.e.d(h07, options);
                int i28 = options.outHeight;
                android.graphics.Bitmap t17 = (i28 >= i17 || (i18 = options.outWidth) >= i17) ? com.tencent.mm.sdk.platformtools.x.t(h07, i17, i17, true, false) : com.tencent.mm.sdk.platformtools.x.t(h07, i28, i18, true, false);
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Integer.valueOf(this.field_catalog);
                objArr[1] = java.lang.Integer.valueOf(t17 == null ? 0 : t17.getWidth());
                if (t17 != null) {
                    i27 = t17.getHeight();
                }
                objArr[2] = java.lang.Integer.valueOf(i27);
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", objArr);
                return t17;
            }
            java.lang.String N0 = N0();
            boolean j18 = com.tencent.mm.vfs.w6.j(N0);
            if (!j18) {
                com.tencent.mars.xlog.Log.w("MicroMsg.emoji.EmojiInfo", "[addEmoji] Path:%s isExist:%s", N0, java.lang.Boolean.valueOf(j18));
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", this);
                return null;
            }
            byte[] z17 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Bi().z(this);
            if (z17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.emoji.EmojiInfo", "bytes is null!");
                return null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "bytes size:%s", java.lang.Integer.valueOf(z17.length));
            android.graphics.Bitmap a17 = com.tencent.mm.sdk.platformtools.y1.h(z17) ? com.tencent.mm.plugin.gif.v.a(z17) : com.tencent.mm.sdk.platformtools.x.I(z17, i17, i17, null);
            if (a17 != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s width:%s height:%s", this, java.lang.Integer.valueOf(a17.getWidth()), java.lang.Integer.valueOf(a17.getHeight()));
            }
            return a17;
        }
        java.lang.String name2 = getName();
        if (com.tencent.mm.sdk.platformtools.t8.K0(name2)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "name is null");
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "emoji:%s", this);
            return null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "#getBitmap, name = " + name2);
        java.lang.String replaceAll = name2.startsWith("jsb") ? "jsb" : name2.startsWith("dice") ? "dice" : name2.replaceAll(".png", "");
        try {
            int identifier = context.getResources().getIdentifier(replaceAll, "drawable", context.getPackageName());
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "#getBitmap, get res identifier, name = " + replaceAll + ", resId = " + identifier);
            android.graphics.Bitmap K02 = com.tencent.mm.sdk.platformtools.x.K0(context.getResources().getDrawable(identifier));
            com.tencent.mars.xlog.Log.i("MicroMsg.emoji.EmojiInfo", "id:%s width:%s height:%s", java.lang.Integer.valueOf(this.field_catalog), java.lang.Integer.valueOf(K02.getWidth()), java.lang.Integer.valueOf(K02.getHeight()));
            return K02;
        } catch (android.content.res.Resources.NotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfo", e17, "get res fail, name = " + replaceAll, new java.lang.Object[0]);
            return null;
        }
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int b0() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_attr)) {
            return 0;
        }
        try {
            byte[] decode = android.util.Base64.decode(this.field_attr, 0);
            r45.qi0 qi0Var = new r45.qi0();
            qi0Var.parseFrom(decode);
            return qi0Var.f384012e;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public long b1() {
        return this.field_captureEnterTime;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public qk.z6 c0() {
        return this.K2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof com.tencent.mm.storage.emotion.EmojiInfo) && ((com.tencent.mm.storage.emotion.EmojiInfo) obj).getMd5().equalsIgnoreCase(this.field_md5);
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String g1() {
        return this.field_externMd5;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String getAesKey() {
        return this.field_aeskey;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String getAuthKey() {
        return this.field_tpauthkey;
    }

    @Override // dm.v2, l75.f0
    public l75.e0 getDBInfo() {
        return L2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getGroup() {
        return this.field_catalog;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String getGroupId() {
        return this.field_groupId;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getHeight() {
        return this.field_height;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getIndex() {
        return this.field_idx;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String getMd5() {
        java.lang.String str = this.field_md5;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String getName() {
        java.lang.String str = this.field_name;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getSize() {
        return this.field_size;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getType() {
        return this.field_type;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int getWidth() {
        return this.field_width;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String h0() {
        java.lang.String N0 = N0();
        java.lang.String concat = N0 == null ? null : N0.concat("_cover");
        if (!n22.m.k(this)) {
            return concat;
        }
        return lp0.b.e() + "emoji/cover/" + getMd5() + "_cover";
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String j() {
        java.lang.String str = this.field_content;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public boolean k() {
        int i17 = this.field_catalog;
        return i17 == 50 || i17 == 49;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String k0() {
        return this.field_attachTextColor;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String l() {
        return this.field_thumbUrl;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String l0() {
        return this.field_cdnUrl;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public qk.x6 m1() {
        int i17 = this.field_captureStatus;
        qk.x6 x6Var = qk.x6.STATUS_SUCCESS;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? x6Var : qk.x6.STATUS_UPLOAD_FAIL : qk.x6.STATUS_UPLOADING : qk.x6.STATUS_MIX_FAIL : qk.x6.STATUS_MIXING : x6Var;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public com.tencent.mm.api.EmotionStrategyInfo o0() {
        return this.J2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String p() {
        return this.E2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int p0() {
        return this.field_captureStatus;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String q0() {
        return this.field_attachedText;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String r0() {
        return this.field_attr;
    }

    public void reset() {
        this.field_md5 = "";
        this.field_svrid = "";
        this.field_catalog = 65;
        this.field_type = 1;
        this.field_size = 0;
        this.field_start = 0;
        this.field_state = 0;
        this.field_name = "";
        this.field_content = "";
        this.field_reserved1 = "";
        this.field_reserved2 = "";
        this.field_reserved3 = 0;
        this.field_reserved4 = 0;
        this.field_app_id = "";
        this.field_temp = 0;
        this.field_captureStatus = 0;
        this.field_captureUploadErrCode = 0;
        this.field_captureUploadCounter = 0;
        this.field_imitateMd5 = "";
        this.field_attachedEmojiMD5 = new byte[0];
        this.H2 = "";
        this.J2 = null;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int s1() {
        return this.field_reserved3;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void setType(int i17) {
        this.field_type = i17;
    }

    public synchronized android.graphics.Bitmap t0(android.content.Context context, boolean z17) {
        android.graphics.Bitmap J2;
        if (com.tencent.mm.vfs.w6.j(h0()) && (J2 = com.tencent.mm.sdk.platformtools.x.J(h0(), null)) != null) {
            return J2;
        }
        android.graphics.Bitmap decodeThumb = com.tencent.mm.emoji.decode.MMGIFJNIFactory.INSTANCE.decodeThumb(this);
        if (decodeThumb != null) {
            try {
                com.tencent.mm.sdk.platformtools.x.D0(decodeThumb, 100, android.graphics.Bitmap.CompressFormat.PNG, h0(), false);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.emoji.EmojiInfo", e17, "save emoji thumb error", new java.lang.Object[0]);
            }
        }
        return decodeThumb;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int t1() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_attr)) {
            return 0;
        }
        try {
            byte[] decode = android.util.Base64.decode(this.field_attr, 0);
            r45.qi0 qi0Var = new r45.qi0();
            qi0Var.parseFrom(decode);
            return qi0Var.f384013f;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }

    public java.lang.String toString() {
        return "field_md5:" + this.field_md5 + "\nfield_svrid:" + this.field_svrid + "\nfield_catalog:" + this.field_catalog + "\nfield_type:" + this.field_type + "\nfield_size:" + this.field_size + "\nfield_start:" + this.field_start + "\nfield_state:" + this.field_state + "\nfield_name:" + this.field_name + "\nfield_content:" + this.field_content + "\nfield_reserved1:" + this.field_reserved1 + "\nfield_reserved2:" + this.field_reserved2 + "\nfield_reserved3:" + this.field_reserved3 + "\nfield_reserved4:" + this.field_reserved4 + "\nfield_app_id:" + this.field_app_id + "\nfield_groupId:" + this.field_groupId + "\nfield_lastUseTime:" + this.field_lastUseTime + "\nfield_framesInfo:" + this.field_framesInfo + "\nfield_idx:" + this.field_idx + "\nfield_temp:" + this.field_temp + "\nfield_source:" + this.field_source + "\nfield_needupload:" + this.field_needupload + "\nfield_designerID:" + this.field_designerID + "\nfield_thumbUrl:" + this.field_thumbUrl + "\nfield_captureStatus:" + this.field_captureStatus + "\nfield_captureUploadErrCode" + this.field_captureUploadErrCode + "\nfield_captureUploadCounter" + this.field_captureUploadCounter + "\n";
    }

    public java.lang.String u0() {
        java.lang.String str = this.field_svrid;
        return str == null ? "" : str;
    }

    public boolean v0() {
        return this.field_groupId.equalsIgnoreCase("com.tencent.xin.emoticon.tuzki2");
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void v1(qk.z6 z6Var) {
        this.K2 = z6Var;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void w() {
        int i17 = this.field_catalog;
        if (i17 == 50 || i17 == 49) {
            return;
        }
        java.lang.String N0 = N0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(N0)) {
            return;
        }
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(N0);
        if (r6Var.m()) {
            r6Var.l();
        }
    }

    public boolean w0() {
        if (n22.m.n(this.field_md5)) {
            return true;
        }
        java.lang.String h07 = h0();
        if (com.tencent.mm.sdk.platformtools.t8.K0(h07)) {
            return false;
        }
        return com.tencent.mm.vfs.w6.j(h07);
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public void w1(int i17) {
        this.field_state = i17;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.C2);
        parcel.writeString(this.field_md5);
        parcel.writeString(this.field_svrid);
        parcel.writeInt(this.field_catalog);
        parcel.writeInt(this.field_type);
        parcel.writeInt(this.field_size);
        parcel.writeInt(this.field_start);
        parcel.writeInt(this.field_state);
        parcel.writeString(this.field_name);
        parcel.writeString(this.field_content);
        parcel.writeString(this.field_reserved1);
        parcel.writeString(this.field_reserved2);
        parcel.writeInt(this.field_reserved3);
        parcel.writeInt(this.field_reserved4);
        parcel.writeString(this.field_app_id);
        parcel.writeString(this.field_groupId);
        parcel.writeLong(this.field_lastUseTime);
        parcel.writeString(this.field_framesInfo);
        parcel.writeInt(this.field_idx);
        parcel.writeInt(this.field_temp);
        parcel.writeInt(this.field_source);
        parcel.writeInt(this.field_needupload);
        parcel.writeString(this.field_designerID);
        parcel.writeString(this.field_thumbUrl);
        parcel.writeString(this.field_cdnUrl);
        parcel.writeString(this.field_encrypturl);
        parcel.writeString(this.field_aeskey);
        parcel.writeInt(this.field_width);
        parcel.writeInt(this.field_height);
        parcel.writeString(this.field_activityid);
        parcel.writeLong(this.systemRowid);
        parcel.writeString(this.field_wxamMd5);
        parcel.writeString(this.field_attachedText);
        parcel.writeInt(this.field_captureStatus);
        byte[] bArr = this.field_attachedEmojiMD5;
        if (bArr == null || bArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.field_attachedEmojiMD5);
        }
        parcel.writeString(this.field_imitateMd5);
        parcel.writeInt(this.field_captureUploadErrCode);
        parcel.writeInt(this.field_captureUploadCounter);
        parcel.writeLong(this.field_captureEnterTime);
        parcel.writeString(this.field_lensId);
        parcel.writeString(this.field_attachTextColor);
        parcel.writeInt(this.field_captureScene);
        parcel.writeString(this.field_externMd5);
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public java.lang.String x0() {
        return this.field_tpurl;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public int x1() {
        return this.G2;
    }

    @Override // com.tencent.mm.api.IEmojiInfo
    public qk.y6 y1() {
        int i17 = this.field_captureUploadErrCode;
        qk.y6 y6Var = qk.y6.ERR_OTHERS;
        switch (i17) {
            case 0:
                return qk.y6.ERR_SUCCESS;
            case 1:
                return qk.y6.ERR_NON_NETWORK;
            case 2:
                return qk.y6.ERR_WIFI_NETWORK;
            case 3:
                return qk.y6.ERR_MOBILE_NETWORK;
            case 4:
                return qk.y6.ERR_NOT_COMPLETED;
            case 5:
                return qk.y6.ERR_OVER_LIMIT;
            case 6:
            default:
                return y6Var;
            case 7:
                return qk.y6.ERR_LOCAL_FILE;
            case 8:
                return qk.y6.ERR_OVER_SIZE;
            case 9:
                return qk.y6.ERR_SPAM;
            case 10:
                return qk.y6.ERR_OVER_UPLOAD_TIME;
        }
    }

    public boolean z0() {
        return getMd5().length() == 32;
    }

    public EmojiInfo(java.lang.String str) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = str;
        reset();
    }

    public EmojiInfo(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = rr.s.f399149a.c();
        this.field_md5 = iEmojiInfo.getMd5();
        this.field_groupId = iEmojiInfo.getGroupId();
        this.field_name = iEmojiInfo.getName();
        this.field_app_id = iEmojiInfo.S();
        this.field_content = iEmojiInfo.j();
        this.field_type = iEmojiInfo.getType();
        this.field_size = iEmojiInfo.getSize();
        this.field_width = iEmojiInfo.getWidth();
        this.field_height = iEmojiInfo.getHeight();
        this.field_catalog = iEmojiInfo.getGroup();
        this.field_cdnUrl = iEmojiInfo.l0();
        this.field_aeskey = iEmojiInfo.getAesKey();
        this.field_externMd5 = iEmojiInfo.g1();
        this.field_externUrl = iEmojiInfo.Z();
        this.field_encrypturl = iEmojiInfo.J1();
        this.field_designerID = iEmojiInfo.X0();
        this.field_thumbUrl = iEmojiInfo.l();
        this.field_activityid = iEmojiInfo.S0();
        this.field_attachedText = iEmojiInfo.q0();
        this.field_attachTextColor = iEmojiInfo.k0();
        this.field_lensId = iEmojiInfo.H1();
        this.field_tpurl = iEmojiInfo.x0();
        this.field_tpauthkey = iEmojiInfo.getAuthKey();
    }

    public EmojiInfo(android.os.Parcel parcel) {
        this.G2 = 2;
        this.K2 = qk.z6.SEND_FROM_SCENE_DEFAULT;
        this.C2 = parcel.readString();
        this.field_md5 = parcel.readString();
        this.field_svrid = parcel.readString();
        this.field_catalog = parcel.readInt();
        this.field_type = parcel.readInt();
        this.field_size = parcel.readInt();
        this.field_start = parcel.readInt();
        this.field_state = parcel.readInt();
        this.field_name = parcel.readString();
        this.field_content = parcel.readString();
        this.field_reserved1 = parcel.readString();
        this.field_reserved2 = parcel.readString();
        this.field_reserved3 = parcel.readInt();
        this.field_reserved4 = parcel.readInt();
        this.field_app_id = parcel.readString();
        this.field_groupId = parcel.readString();
        this.field_lastUseTime = parcel.readLong();
        this.field_framesInfo = parcel.readString();
        this.field_idx = parcel.readInt();
        this.field_temp = parcel.readInt();
        this.field_source = parcel.readInt();
        this.field_needupload = parcel.readInt();
        this.field_designerID = parcel.readString();
        this.field_thumbUrl = parcel.readString();
        this.field_cdnUrl = parcel.readString();
        this.field_encrypturl = parcel.readString();
        this.field_aeskey = parcel.readString();
        this.field_width = parcel.readInt();
        this.field_height = parcel.readInt();
        this.field_activityid = parcel.readString();
        this.systemRowid = parcel.readLong();
        this.field_wxamMd5 = parcel.readString();
        this.field_attachedText = parcel.readString();
        this.field_captureStatus = parcel.readInt();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.field_attachedEmojiMD5 = bArr;
            parcel.readByteArray(bArr);
        }
        this.field_imitateMd5 = parcel.readString();
        this.field_captureUploadErrCode = parcel.readInt();
        this.field_captureUploadCounter = parcel.readInt();
        this.field_captureEnterTime = parcel.readLong();
        this.field_lensId = parcel.readString();
        this.field_attachTextColor = parcel.readString();
        this.field_captureScene = parcel.readInt();
        this.field_externMd5 = parcel.readString();
    }
}
