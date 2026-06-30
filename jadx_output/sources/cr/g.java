package cr;

/* loaded from: classes12.dex */
public final class g {
    public final void a(com.tencent.mm.storage.emotion.EmojiInfo emojiInfo, yz5.l lVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(emojiInfo.field_thumbUrl)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by gif " + emojiInfo.getMd5());
            zq.h.f474972a.f(emojiInfo, false, new cr.f(emojiInfo, lVar));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: load by url " + emojiInfo.getMd5());
        q11.b b17 = new r12.b().b(emojiInfo.field_thumbUrl);
        if ((b17 != null ? b17.f359533c : null) == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCoverFetcher", "loadDataImp: thumbUrl download failed, fallback to loadFile " + emojiInfo.getMd5());
            zq.h.f474972a.f(emojiInfo, false, new cr.f(emojiInfo, lVar));
            return;
        }
        ar.c.f13356a.b(emojiInfo.getMd5(), com.tencent.mm.sdk.platformtools.x.G(b17.f359533c));
        com.tencent.mm.vfs.w6.R(emojiInfo.h0(), b17.f359533c);
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.TRUE);
        }
    }
}
