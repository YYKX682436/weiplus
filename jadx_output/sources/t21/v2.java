package t21;

/* loaded from: classes12.dex */
public class v2 {
    public long K;
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String O;
    public r45.xz6 Q;
    public java.lang.String S;
    public int T;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f415001a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f415003b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f415005c0;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f415020r;
    public java.lang.String B = "";
    public java.lang.String C = "";
    public java.lang.String D = "";
    public boolean P = false;
    public java.lang.String R = "";
    public int U = -1;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f415000a = "";

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f415002b = "";

    /* renamed from: c, reason: collision with root package name */
    public long f415004c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f415006d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f415007e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f415008f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f415009g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f415010h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f415011i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f415012j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f415013k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f415014l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f415015m = 0;

    /* renamed from: n, reason: collision with root package name */
    public long f415016n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f415017o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f415018p = 0;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f415019q = "";

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f415021s = "";

    /* renamed from: t, reason: collision with root package name */
    public int f415022t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f415023u = 0;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f415024v = "";

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f415025w = "";

    /* renamed from: x, reason: collision with root package name */
    public int f415026x = 0;

    /* renamed from: y, reason: collision with root package name */
    public long f415027y = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f415028z = "";
    public java.lang.String A = "";
    public r45.uf6 E = new r45.uf6();
    public java.lang.String F = "";
    public int G = 0;
    public r45.vh4 H = new r45.vh4();
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public int f414999J = 0;

    public v2() {
        this.Q = null;
        this.Q = null;
    }

    public static java.lang.String c(java.lang.String str) {
        try {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
            return d17 != null ? (java.lang.String) d17.get(".msg.videomsg.$cdnvideourl") : "";
        } catch (java.lang.Exception unused) {
            return "";
        }
    }

    public void a(android.database.Cursor cursor) {
        this.f415000a = cursor.getString(0);
        this.f415002b = cursor.getString(1);
        this.f415004c = cursor.getLong(2);
        this.f415006d = cursor.getInt(3);
        this.f415007e = cursor.getInt(4);
        this.f415008f = cursor.getInt(5);
        this.f415009g = cursor.getInt(6);
        this.f415010h = cursor.getInt(7);
        this.f415011i = cursor.getInt(8);
        this.f415012j = cursor.getLong(9);
        this.f415013k = cursor.getLong(10);
        this.f415014l = cursor.getLong(11);
        this.f415015m = cursor.getInt(12);
        this.f415016n = cursor.getLong(13);
        this.f415017o = cursor.getInt(14);
        this.f415018p = cursor.getInt(15);
        this.f415019q = cursor.getString(16);
        this.f415021s = cursor.getString(17);
        this.f415022t = cursor.getInt(18);
        this.f415023u = cursor.getInt(19);
        this.f415024v = cursor.getString(20);
        this.f415025w = cursor.getString(21);
        this.f415026x = cursor.getInt(22);
        this.f415027y = cursor.getLong(23);
        this.f415028z = cursor.getString(24);
        this.A = cursor.getString(25);
        byte[] blob = cursor.getBlob(26);
        r45.uf6 uf6Var = new r45.uf6();
        this.E = uf6Var;
        try {
            uf6Var.parseFrom(blob);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoInfo", e17, "", new java.lang.Object[0]);
        }
        this.F = cursor.getString(27);
        this.G = cursor.getInt(28);
        byte[] blob2 = cursor.getBlob(29);
        r45.vh4 vh4Var = new r45.vh4();
        this.H = vh4Var;
        try {
            vh4Var.parseFrom(blob2);
        } catch (java.lang.Exception unused) {
        }
        this.I = cursor.getInt(30);
        this.f414999J = cursor.getInt(31);
        this.K = cursor.getInt(32);
        this.M = cursor.getString(33);
        this.N = cursor.getString(34);
        this.S = cursor.getString(35);
        this.T = cursor.getInt(36);
        this.O = cursor.getString(37);
        this.B = cursor.getString(38);
        this.C = cursor.getString(39);
        this.D = cursor.getString(40);
        byte[] blob3 = cursor.getBlob(41);
        r45.xz6 xz6Var = new r45.xz6();
        this.Q = xz6Var;
        try {
            xz6Var.parseFrom(blob3);
        } catch (java.lang.Exception unused2) {
        }
        this.R = cursor.getString(42);
        this.f415020r = cursor.getString(43);
        this.L = cursor.getString(44);
    }

    public android.content.ContentValues b() {
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.U & 1) != 0) {
            contentValues.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_FILENAME, d());
        }
        if ((this.U & 2) != 0) {
            java.lang.String str = this.f415002b;
            if (str == null) {
                str = "";
            }
            contentValues.put("clientid", str);
        }
        if ((this.U & 4) != 0) {
            contentValues.put("msgsvrid", java.lang.Long.valueOf(this.f415004c));
        }
        if ((this.U & 8) != 0) {
            contentValues.put("netoffset", java.lang.Integer.valueOf(this.f415006d));
        }
        if ((this.U & 16) != 0) {
            contentValues.put("filenowsize", java.lang.Integer.valueOf(this.f415007e));
        }
        if ((this.U & 32) != 0) {
            contentValues.put("totallen", java.lang.Integer.valueOf(this.f415008f));
        }
        if ((this.U & 64) != 0) {
            contentValues.put("thumbnetoffset", java.lang.Integer.valueOf(this.f415009g));
        }
        if ((this.U & 128) != 0) {
            contentValues.put("thumblen", java.lang.Integer.valueOf(this.f415010h));
        }
        if ((this.U & 256) != 0) {
            contentValues.put("status", java.lang.Integer.valueOf(this.f415011i));
        }
        if ((this.U & 512) != 0) {
            contentValues.put("createtime", java.lang.Long.valueOf(this.f415012j));
        }
        if ((this.U & 1024) != 0) {
            contentValues.put("lastmodifytime", java.lang.Long.valueOf(this.f415013k));
        }
        if ((this.U & 2048) != 0) {
            contentValues.put("downloadtime", java.lang.Long.valueOf(this.f415014l));
        }
        if ((this.U & 4096) != 0) {
            contentValues.put("videolength", java.lang.Integer.valueOf(this.f415015m));
        }
        if ((this.U & 8192) != 0) {
            contentValues.put("msglocalid", java.lang.Long.valueOf(this.f415016n));
        }
        if ((this.U & 16384) != 0) {
            contentValues.put("nettimes", java.lang.Integer.valueOf(this.f415017o));
        }
        if ((this.U & 32768) != 0) {
            contentValues.put("cameratype", java.lang.Integer.valueOf(this.f415018p));
        }
        if ((this.U & 65536) != 0) {
            contentValues.put("user", h());
        }
        if ((this.U & 131072) != 0) {
            contentValues.put("human", e());
        }
        if ((this.U & 262144) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f415022t));
        }
        if ((this.U & 524288) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.f415023u));
        }
        if ((this.U & 1048576) != 0) {
            contentValues.put("reserved3", f());
        }
        if ((this.U & 2097152) != 0) {
            contentValues.put("reserved4", g());
        }
        if ((this.U & 4194304) != 0) {
            contentValues.put("videofuncflag", java.lang.Integer.valueOf(this.f415026x));
        }
        if ((this.U & 8388608) != 0) {
            contentValues.put("masssendid", java.lang.Long.valueOf(this.f415027y));
        }
        if ((this.U & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCMainTierLevel62) != 0) {
            contentValues.put("masssendlist", this.f415028z);
        }
        if ((this.U & com.tencent.thumbplayer.core.common.TPMediaCodecProfileLevel.HEVCHighTierLevel62) != 0) {
            contentValues.put("videomd5", this.A);
        }
        if ((this.U & 67108864) != 0) {
            byte[] bArr = new byte[0];
            try {
                bArr = this.E.toByteArray();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.VideoInfo", e17, "", new java.lang.Object[0]);
            }
            contentValues.put("streamvideo", bArr);
        }
        if ((this.U & 134217728) != 0) {
            contentValues.put("statextstr", this.F);
        }
        if ((this.U & 268435456) != 0) {
            contentValues.put("downloadscene", java.lang.Integer.valueOf(this.G));
        }
        if ((this.U & com.tencent.wcdb.database.SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            byte[] bArr2 = new byte[0];
            try {
                bArr2 = this.H.toByteArray();
            } catch (java.lang.Exception unused) {
            }
            contentValues.put("mmsightextinfo", bArr2);
        }
        if ((this.U & 1) != 0) {
            contentValues.put("preloadsize", java.lang.Integer.valueOf(this.I));
        }
        if ((this.U & 2) != 0) {
            contentValues.put("videoformat", java.lang.Integer.valueOf(this.f414999J));
        }
        if (this.V) {
            contentValues.put("forward_msg_local_id", java.lang.Long.valueOf(this.K));
        }
        if (this.W) {
            contentValues.put("msg_uuid", this.M);
        }
        if (this.X) {
            contentValues.put("share_app_info", this.N);
        }
        if (this.Y) {
            contentValues.put("origin_file_name", this.S);
        }
        if (this.Z) {
            contentValues.put("had_clicked_video", java.lang.Boolean.valueOf(this.T == 1));
        }
        if (this.P) {
            contentValues.put("media_id", this.O);
        }
        if (!android.text.TextUtils.isEmpty(this.B)) {
            contentValues.put("media_flag", this.B);
        }
        if (!android.text.TextUtils.isEmpty(this.C)) {
            contentValues.put("video_path", this.C);
        }
        if (!android.text.TextUtils.isEmpty(this.D)) {
            contentValues.put("media_cdnid", this.D);
        }
        r45.xz6 xz6Var = this.Q;
        if (xz6Var != null) {
            byte[] bArr3 = new byte[0];
            try {
                bArr3 = xz6Var.toByteArray();
            } catch (java.lang.Exception unused2) {
            }
            contentValues.put("video_wxa_info", bArr3);
        }
        if (this.f415001a0) {
            contentValues.put("weapp_source_username", this.R);
        }
        if (this.f415003b0) {
            contentValues.put("msg_talker", this.f415020r);
        }
        if (this.f415005c0) {
            contentValues.put("forward_msg_talker", this.L);
        }
        return contentValues;
    }

    public java.lang.String d() {
        java.lang.String str = this.f415000a;
        return str == null ? "" : str;
    }

    public java.lang.String e() {
        java.lang.String str = this.f415021s;
        return str == null ? "" : str;
    }

    public java.lang.String f() {
        java.lang.String str = this.f415024v;
        return str == null ? "" : str;
    }

    public java.lang.String g() {
        java.lang.String str = this.f415025w;
        return str == null ? "" : str;
    }

    public java.lang.String h() {
        java.lang.String str = this.f415019q;
        return str == null ? "" : str;
    }

    public boolean i() {
        int i17 = this.f415011i;
        if (i17 != 199 && i17 != 199 && i17 != 143) {
            return false;
        }
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_video_info_error_repair, true) && !android.text.TextUtils.isEmpty(this.C) && !android.text.TextUtils.isEmpty(this.f415000a) && this.f415000a.contains("sns_table")) {
            if (com.tencent.mm.vfs.w6.k(this.C) <= 0) {
                return false;
            }
            if (this.f415008f > 0 && com.tencent.mm.vfs.w6.k(this.C) < this.f415008f) {
                return false;
            }
        }
        return true;
    }

    public boolean j() {
        int i17 = this.f415011i;
        return i17 == 121 || i17 == 122 || i17 == 120 || i17 == 123;
    }

    public boolean k() {
        int i17 = this.f415011i;
        return i17 == 140 || i17 == 141 || i17 == 142 || i17 == 144;
    }

    public void l(com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker) {
        if (msgIdTalker != null) {
            this.K = msgIdTalker.f149480d;
            this.V = true;
            this.L = msgIdTalker.a();
            this.f415005c0 = true;
        }
    }

    public void m(long j17) {
        this.f415016n = j17;
    }

    public void n(java.lang.String str) {
        this.f415020r = str;
        this.f415003b0 = true;
    }

    public void o(java.lang.String str) {
        this.S = str;
        this.Y = true;
    }

    public void p(java.lang.String str, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (this.E == null) {
            this.E = new r45.uf6();
        }
        r45.uf6 uf6Var = this.E;
        uf6Var.f387337h = str2;
        uf6Var.f387334e = i17;
        uf6Var.f387333d = str;
        uf6Var.f387335f = str3;
        uf6Var.f387336g = str4;
        uf6Var.f387339m = str5;
        uf6Var.f387340n = str6;
    }

    public java.lang.String toString() {
        return "VideoInfo{fileName='" + this.f415000a + "', clientId='" + this.f415002b + "', msgSvrId=" + this.f415004c + ", netOffset=" + this.f415006d + ", fileNowSize=" + this.f415007e + ", totalLen=" + this.f415008f + ", thumbNetOffset=" + this.f415009g + ", thumbLen=" + this.f415010h + ", status=" + this.f415011i + ", createTime=" + this.f415012j + ", lastModifyTime=" + this.f415013k + ", priorityTime=" + this.f415014l + ", videoLength=" + this.f415015m + ", msgLocalId=" + this.f415016n + ", netTimes=" + this.f415017o + ", cameraType=" + this.f415018p + ", user='" + this.f415019q + "', human='" + this.f415021s + "', msgTalker=" + this.f415020r + ", isExport=" + this.f415022t + ", isUseCdn=" + this.f415023u + ", importPath='" + this.f415024v + "', recvXml='" + this.f415025w + "', videoFuncFlag=" + this.f415026x + ", massSendId=" + this.f415027y + ", massSendList='" + this.f415028z + "', videoMD5='" + this.A + "', streamVideoProto=" + this.E + ", statextstr='" + this.F + "', downloadScene=" + this.G + ", mmSightExtInfo=" + this.H + ", preloadSize=" + this.I + ", videoFormat=" + this.f414999J + ", flag=" + this.U + ", mediaId=" + this.O + ", videoFlag=" + this.B + ", videoPath=" + this.C + ", cdnId=" + this.D + ", forwardMsgLocalId=" + this.K + ", forwardMsgTalker=" + this.L + ", extCommonInfoXml= null}";
    }
}
