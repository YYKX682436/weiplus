package cr;

/* loaded from: classes12.dex */
public final class d implements cr.h {

    /* renamed from: a, reason: collision with root package name */
    public cr.i f221557a;

    /* renamed from: b, reason: collision with root package name */
    public yz5.l f221558b;

    /* renamed from: c, reason: collision with root package name */
    public long f221559c;

    /* renamed from: d, reason: collision with root package name */
    public int f221560d;

    /* renamed from: e, reason: collision with root package name */
    public int f221561e;

    /* renamed from: f, reason: collision with root package name */
    public final cr.c f221562f = new cr.c(this);

    @Override // cr.h
    public void a(cr.i fetcherConfig, yz5.l lVar) {
        kotlin.jvm.internal.o.g(fetcherConfig, "fetcherConfig");
        this.f221557a = fetcherConfig;
        this.f221558b = lVar;
        java.lang.String str = fetcherConfig.f221570c;
        com.tencent.mm.vfs.r6 s17 = new com.tencent.mm.vfs.r6(str).s();
        if (s17 != null) {
            s17.J();
        }
        this.f221560d = fetcherConfig.f221572e == 2 ? 20403 : 20401;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f221559c = java.lang.System.currentTimeMillis();
        com.tencent.mars.cdn.CdnManager.C2CDownloadRequest c2CDownloadRequest = new com.tencent.mars.cdn.CdnManager.C2CDownloadRequest();
        c2CDownloadRequest.queueTimeoutSeconds = 60;
        c2CDownloadRequest.transforTimeoutSeconds = 60;
        c2CDownloadRequest.taskStartTime = this.f221559c;
        c2CDownloadRequest.fileType = this.f221560d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downemoji_");
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = fetcherConfig.f221568a;
        sb6.append(emojiInfo.getMd5());
        c2CDownloadRequest.fileKey = sb6.toString();
        java.lang.String str2 = fetcherConfig.f221569b;
        c2CDownloadRequest.url = str2;
        c2CDownloadRequest.setSavePath(str);
        com.tencent.mars.cdn.CdnManager cdnManager = (com.tencent.mars.cdn.CdnManager) com.tencent.mars.MarsContext.getContext().getManager(com.tencent.mars.cdn.CdnManager.class);
        this.f221561e = cdnManager != null ? cdnManager.startHttpsDownload(c2CDownloadRequest, this.f221562f) : com.tencent.mm.hardcoder.HardCoderJNI.CLIENT_DISCONNECT;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCdnHttpsFetcher", "fetch: start " + emojiInfo.getMd5() + ' ' + this.f221561e + ", url:" + str2 + ", path:" + str + " [" + com.tencent.mm.vfs.w6.i(str, true) + ']');
        h12.f.a(20L, 1L);
        cr.i iVar = this.f221557a;
        if (iVar != null) {
            int i17 = iVar.f221572e;
            if (i17 == 0) {
                h12.f.a(1L, 1L);
            } else if (i17 == 1) {
                h12.f.a(6L, 1L);
            } else if (i17 == 2) {
                h12.f.a(10L, 1L);
            }
        }
        if (this.f221561e != 0) {
            yz5.l lVar2 = this.f221558b;
            if (lVar2 != null) {
                lVar2.invoke(java.lang.Boolean.FALSE);
            }
            b(false);
        }
    }

    public final void b(boolean z17) {
        cr.i iVar = this.f221557a;
        if (iVar != null) {
            if (z17) {
                h12.f.a(21L, 1L);
                h12.f.a(2L, 1L);
                return;
            }
            h12.f.a(22L, 1L);
            h12.f.a(3L, 1L);
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = iVar.f221568a;
            int i17 = iVar.f221572e;
            if (i17 == 0) {
                h12.f.b(emojiInfo.getMd5(), 4, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            } else if (i17 == 1) {
                h12.f.b(emojiInfo.getMd5(), 2, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            } else {
                if (i17 != 2) {
                    return;
                }
                h12.f.b(emojiInfo.getMd5(), 4, 1, 1, emojiInfo.field_groupId, 1, emojiInfo.field_designerID);
            }
        }
    }
}
