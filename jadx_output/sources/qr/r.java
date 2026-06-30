package qr;

/* loaded from: classes12.dex */
public class r extends qr.l {

    /* renamed from: g, reason: collision with root package name */
    public int f366039g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f366040h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f366041i;

    public r(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, qr.i iVar) {
        this(emojiInfo, z17, null, 0, null, null, null, false, iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(qr.r r9, qr.s r10) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qr.r.e(qr.r, qr.s):void");
    }

    public r(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, boolean z17, java.util.List list, int i17, r45.uu6 uu6Var, r45.sj0 sj0Var, java.util.List list2, boolean z18, qr.i iVar) {
        super(emojiInfo, z17, iVar);
        this.f366039g = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiUploadCDN", "prepare: %s", emojiInfo.field_md5);
        new gr.h(emojiInfo, z17, list, i17, uu6Var, sj0Var, list2).l().K(new qr.p(this, uu6Var, z18));
    }
}
