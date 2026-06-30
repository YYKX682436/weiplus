package qr;

/* loaded from: classes12.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.storage.emotion.EmojiInfo f366019a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f366020b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f366021c;

    /* renamed from: d, reason: collision with root package name */
    public final long f366022d;

    /* renamed from: e, reason: collision with root package name */
    public qr.i f366023e;

    /* renamed from: f, reason: collision with root package name */
    public dn.h f366024f = null;

    public l(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, qr.i iVar) {
        this.f366019a = emojiInfo;
        this.f366020b = z17;
        this.f366023e = iVar;
        boolean g17 = com.tencent.mm.sdk.platformtools.y1.g(emojiInfo.N0());
        this.f366021c = g17;
        this.f366022d = java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUpload", "EmojiUpload: %s, %s, %s", emojiInfo.field_md5, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(g17));
    }

    public void a(int i17) {
        b(i17, null, "", "");
    }

    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        qr.i iVar = this.f366023e;
        if (iVar != null) {
            if (iVar instanceof qr.j) {
                ((qr.j) iVar).a(i17, str, this.f366024f);
            } else if (iVar instanceof qr.k) {
                ((qr.k) iVar).a(i17, str, str2, str3);
            } else {
                iVar.onResult(i17, str);
            }
        }
    }

    public void c() {
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            a(5);
        } else if (com.tencent.mars.comm.NetStatusUtil.isWifi(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            a(6);
        } else {
            a(7);
        }
    }

    public void d(java.lang.String str) {
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = this.f366019a;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUpload", "save emoji gif md5, wxam %b, md5 %s, %s", java.lang.Boolean.valueOf(!com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_wxamMd5)), str, emojiInfo.field_wxamMd5);
        if (!this.f366021c || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            emojiInfo.field_captureStatus = 0;
            ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().G2(emojiInfo);
            return;
        }
        java.lang.String N0 = emojiInfo.N0();
        java.lang.String h07 = emojiInfo.h0();
        com.tencent.mm.vfs.w6.c(N0, rr.s.f399149a.c() + str);
        java.lang.String str2 = emojiInfo.field_md5;
        emojiInfo.field_md5 = str;
        emojiInfo.field_externMd5 = emojiInfo.field_wxamMd5;
        emojiInfo.field_captureStatus = 0;
        com.tencent.mm.vfs.w6.c(h07, emojiInfo.h0());
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().J0(emojiInfo);
        if (com.tencent.mm.sdk.platformtools.t8.D0(str2, emojiInfo.field_md5)) {
            return;
        }
        ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).Ai().c().f1(str2);
    }
}
