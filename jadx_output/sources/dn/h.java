package dn;

/* loaded from: classes12.dex */
public class h {

    /* renamed from: s, reason: collision with root package name */
    public static final char[] f241765s = "0123456789ABCDEF".toCharArray();

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f241766a;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f241769d;
    public java.lang.String field_aesKey;
    public java.lang.String field_arg;
    public java.lang.String field_argInfo;
    public java.lang.String field_fileId;
    public long field_fileLength;
    public int field_filecrc;
    public int field_midimgLength;
    public int field_retCode;
    public byte[] field_sKeyrespbuf;
    public int field_thumbimgLength;
    public java.lang.String field_toUser;
    public java.lang.String field_transInfo;
    public boolean field_upload_by_safecdn;
    public java.lang.String[] field_usedSvrIps;
    public java.lang.String field_videoFileId;

    /* renamed from: h, reason: collision with root package name */
    public int f241773h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.BatchSnsReqImageData[] f241774i;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mars.cdn.proto.UploadResult f241783r;
    public java.lang.String field_sm4Key = "";
    public java.lang.String field_sm4Iv = "";
    public boolean field_cdnUseSM4 = false;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f241767b = "";
    public java.lang.String field_thumbUrl = "";
    public java.lang.String field_fileUrl = "";
    public java.lang.String field_filemd5 = "";
    public java.lang.String field_thumbfilemd5 = "";
    public java.lang.String field_mp4identifymd5 = "";
    public long field_recvedBytes = 0;
    public long field_recvedTotalBytes = 0;
    public int field_videoFormat = 0;
    public java.lang.String field_videoFlag = "";
    public java.lang.String field_videoCdnMsg = "";
    public long field_startTime = 0;
    public long field_endTime = 0;
    public long field_enQueueTime = 0;
    public int field_firstRequestCost = 0;
    public int field_firstRequestSize = 0;
    public int field_firstRequestDownloadSize = 0;
    public boolean field_firstRequestCompleted = false;
    public int field_averageSpeed = 0;
    public int field_averageConnectCost = 0;
    public int field_firstConnectCost = 0;
    public int field_netConnectTimes = 0;
    public int field_moovRequestTimes = 0;
    public int field_moovCost = 0;
    public int field_moovSize = 0;
    public boolean field_moovCompleted = false;
    public int field_moovFailReason = 0;
    public int field_previousCompletedSize = 0;
    public int field_averageRequestSize = 0;
    public int field_averageRequestCost = 0;
    public int field_requestTotalCount = 0;
    public int field_requestCompletedCount = 0;
    public int field_requestTimeoutCount = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f241768c = 0;
    public int field_httpStatusCode = 0;
    public boolean field_isVideoReduced = false;

    /* renamed from: e, reason: collision with root package name */
    public int f241770e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f241771f = -1;
    public java.lang.String field_httpResponseHeader = "";
    public int field_dnsCostTime = 0;
    public boolean field_isResume = false;
    public int field_delayTime = 0;
    public int field_connectCostTime = 0;
    public int field_waitResponseCostTime = 0;
    public int field_receiveCostTime = 0;
    public java.lang.String field_serverIP = "";
    public int field_clientHostIP = 0;
    public int field_serverHostIP = 0;
    public java.lang.String field_xErrorNo = "";
    public int field_cSeqCheck = 0;
    public boolean field_usePrivateProtocol = true;
    public boolean field_isCrossNet = false;
    public java.lang.String field_clientIP = "";
    public int field_detailErrorType = 0;
    public int field_detailErrorCode = 0;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f241772g = "";

    /* renamed from: j, reason: collision with root package name */
    public int f241775j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f241776k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f241777l = 0;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f241778m = "";

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.SNSVideoProfile f241779n = null;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.VideoInfo f241780o = null;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.C2CDownloadResult f241781p = null;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mars.cdn.CdnManager.C2CUploadResult f241782q = null;
    public int field_UploadHitCacheType = 0;
    public boolean field_needSendMsgField = true;
    public boolean field_convert2baseline = false;
    public boolean field_exist_whencheck = false;

    public java.lang.String a() {
        if (this.field_usedSvrIps == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (java.lang.String str : this.field_usedSvrIps) {
            stringBuffer.append(str);
            stringBuffer.append("|");
        }
        return stringBuffer.toString();
    }

    public boolean b() {
        int i17;
        return this.field_upload_by_safecdn && (2 == (i17 = this.field_UploadHitCacheType) || 3 == i17);
    }

    public java.lang.String toString() {
        java.lang.String format = java.lang.String.format("id:%s file:%s filelen:%d midlen:%d thlen:%d transInfo:%s retCode:%d toUser:%s arg:%s videoFileId:%s argInfo:%s hitcache:%d needsend:%b msgid:%d convert2baseline:%b thumbUrl:%s fileUrl:%s filemd5:%s thumbfilemd5:%s,mp4identifymd5:%s, exist_whencheck[%b], aesKey[%s], crc[%s], safecdn:%b field_recvedBytes:%d field_recvedTotalBytes:%d", this.f241766a, this.field_fileId, java.lang.Long.valueOf(this.field_fileLength), java.lang.Integer.valueOf(this.field_midimgLength), java.lang.Integer.valueOf(this.field_thumbimgLength), this.field_transInfo, java.lang.Integer.valueOf(this.field_retCode), this.field_toUser, this.field_arg, this.field_videoFileId, this.field_argInfo, java.lang.Integer.valueOf(this.field_UploadHitCacheType), java.lang.Boolean.valueOf(this.field_needSendMsgField), 0, java.lang.Boolean.valueOf(this.field_convert2baseline), this.field_thumbUrl, this.field_fileUrl, this.field_filemd5, this.field_thumbfilemd5, this.field_mp4identifymd5, java.lang.Boolean.valueOf(this.field_exist_whencheck), com.tencent.mm.sdk.platformtools.t8.G1(this.field_aesKey), java.lang.Integer.valueOf(this.field_filecrc), java.lang.Boolean.valueOf(this.field_upload_by_safecdn), java.lang.Long.valueOf(this.field_recvedBytes), java.lang.Long.valueOf(this.field_recvedTotalBytes));
        if (this.field_sKeyrespbuf == null) {
            return format;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(format);
        java.lang.Object[] objArr = new java.lang.Object[1];
        byte[] bArr = this.field_sKeyrespbuf;
        char[] cArr = new char[bArr.length * 2];
        for (int i17 = 0; i17 < bArr.length; i17++) {
            int i18 = bArr[i17] & 255;
            int i19 = i17 * 2;
            char[] cArr2 = f241765s;
            cArr[i19] = cArr2[i18 >>> 4];
            cArr[i19 + 1] = cArr2[i18 & 15];
        }
        objArr[0] = new java.lang.String(cArr);
        sb6.append(java.lang.String.format("skeyrespbuf:%s", objArr));
        return sb6.toString();
    }
}
