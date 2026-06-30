package dn;

/* loaded from: classes12.dex */
public class m {
    public long B1;
    public byte[] P;
    public com.tencent.mars.cdn.proto.UploadRequest Q;
    public com.tencent.mars.cdn.proto.DownloadRequest R;
    public byte[] V;
    public int Y;

    /* renamed from: e, reason: collision with root package name */
    public boolean f241786e;

    /* renamed from: f, reason: collision with root package name */
    public dn.k f241787f;
    public byte[] field_aes_aad;
    public byte[] field_aes_enc_key;
    public byte[] field_aes_nounce;
    public byte[] field_aes_tag;
    public java.lang.String field_authKey;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f241792m;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f241794o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.FileInfo[] f241795p;

    /* renamed from: p0, reason: collision with root package name */
    public dn.l f241796p0;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241785d = "task_default";
    public java.lang.String field_talker = "";
    public java.lang.String field_mediaId = "";
    public java.lang.String field_fileId = "";
    public long field_totalLen = 0;
    public int field_wxamTotalLen = 0;
    public java.lang.String field_aesKey = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f241788g = "";
    public int field_priority = 0;
    public boolean field_needStorage = false;
    public boolean field_isStreamMedia = false;
    public java.lang.String field_videoFileId = "";
    public int field_arg = 0;
    public long field_lastProgressCallbackTime = 0;
    public long field_startTime = 0;
    public int field_appType = 0;
    public int field_bzScene = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f241789h = 0;
    public boolean field_cdnUseSM4 = false;
    public int field_smallVideoFlag = 0;
    public boolean field_sendmsg_viacdn = false;
    public java.lang.String field_wxmsgparam = "";
    public int field_chattype = 0;
    public boolean field_autostart = false;

    /* renamed from: i, reason: collision with root package name */
    public int f241790i = 0;
    public int field_limitrate = 0;
    public int field_advideoflag = 0;
    public boolean field_force_aeskeycdn = false;
    public boolean field_trysafecdn = false;
    public int field_largesvideo = 0;
    public int field_videosource = 0;
    public boolean field_isSilentTask = false;
    public boolean field_needCompressImage = false;
    public int field_requestVideoFormat = 1;
    public int[] field_supportFormats = {1};
    public int field_fileType = 0;
    public int field_fileFormat = 0;
    public java.lang.String field_fullpath = "";
    public java.lang.String field_filemd5 = "";
    public java.lang.String field_midimgpath = "";
    public int field_midFileLength = 0;
    public int field_midFormat = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f241793n = 0;
    public java.lang.String field_thumbpath = "";
    public java.lang.String field_signalQuality = "";
    public java.lang.String field_snsScene = "";

    /* renamed from: q, reason: collision with root package name */
    public boolean f241798q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f241799r = false;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f241800s = "";

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f241801t = "";

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f241802u = "";
    public boolean field_enable_hitcheck = true;
    public java.lang.String field_fake_bigfile_signature = "";
    public java.lang.String field_fake_bigfile_signature_aeskey = "";
    public java.lang.String field_svr_signature = "";
    public boolean field_onlycheckexist = false;

    /* renamed from: v, reason: collision with root package name */
    public int f241803v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f241804w = -1;
    public int field_preloadRatio = 30;

    /* renamed from: x, reason: collision with root package name */
    public long f241805x = 0;

    /* renamed from: y, reason: collision with root package name */
    public boolean f241808y = false;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f241811z = "";
    public int A = 0;
    public int B = 0;
    public boolean C = true;
    public int D = 5;
    public boolean E = false;
    public boolean F = false;
    public boolean G = false;
    public boolean H = false;
    public java.lang.String I = "";

    /* renamed from: J, reason: collision with root package name */
    public java.util.Map f241784J = null;
    public boolean K = false;
    public java.lang.String L = "";
    public boolean M = true;
    public java.lang.String N = "";
    public java.lang.String S = "";
    public int T = 0;
    public boolean U = false;
    public java.lang.String W = "";
    public long X = 0;
    public int Z = 1;

    /* renamed from: x0, reason: collision with root package name */
    public int f241806x0 = 1;

    /* renamed from: y0, reason: collision with root package name */
    public int f241809y0 = 1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f241791l1 = false;

    /* renamed from: p1, reason: collision with root package name */
    public int f241797p1 = 0;

    /* renamed from: x1, reason: collision with root package name */
    public int f241807x1 = 5;

    /* renamed from: y1, reason: collision with root package name */
    public int f241810y1 = 0;

    /* renamed from: z1, reason: collision with root package name */
    public int f241812z1 = 0;
    public int A1 = 0;
    public boolean C1 = false;

    public boolean h() {
        return this.Z == 1;
    }

    public boolean i() {
        return this.Z == 2;
    }

    public void j(java.lang.String str, java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (java.util.Map.Entry entry : map.entrySet()) {
            sb6.append(java.lang.String.format("%s:%s\r\n", entry.getKey(), entry.getValue()));
        }
        java.lang.String sb7 = sb6.toString();
        if (com.tencent.mm.sdk.platformtools.t8.K0(sb7)) {
            return;
        }
        this.N = sb7;
        com.tencent.mars.xlog.Log.i(str, "setCustomHeader %s", sb7);
    }
}
