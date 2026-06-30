package vr;

/* loaded from: classes5.dex */
public final class u implements com.tencent.mm.pluginsdk.ui.chat.v9 {

    /* renamed from: a, reason: collision with root package name */
    public yz5.l f439438a;

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void a(boolean z17, int i17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void b(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo != null) {
            java.lang.String md52 = iEmojiInfo.getMd5();
            kotlin.jvm.internal.o.d(md52);
            if (md52.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "selected emoticon with empty md5");
                return;
            }
            byte[] byteArray = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Ai(iEmojiInfo).toByteArray();
            if (byteArray != null) {
                if (!(byteArray.length == 0)) {
                    java.lang.String wi6 = ((com.tencent.mm.feature.emoji.n4) ((com.tencent.mm.feature.emoji.api.s6) i95.n0.c(com.tencent.mm.feature.emoji.api.s6.class))).wi(iEmojiInfo);
                    vr.s sVar = new vr.s(md52, false, wi6 == null ? "" : wi6, this, byteArray);
                    java.lang.String md53 = iEmojiInfo.getMd5();
                    if (iEmojiInfo.E0()) {
                        java.lang.String T = iEmojiInfo.T();
                        sVar.invoke(T != null ? T : "");
                        return;
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "local emoticon file missing, start load. md5=" + md53);
                        ((com.tencent.mm.feature.emoji.m0) ((com.tencent.mm.feature.emoji.api.w5) i95.n0.c(com.tencent.mm.feature.emoji.api.w5.class))).wi(iEmojiInfo, new vr.t(md53, sVar, iEmojiInfo));
                        return;
                    }
                }
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.EmoticonBoardNativeViewCallbackHandler", "failed to serialize EmojiInfo for md5: ".concat(md52));
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.chat.v9
    public void c() {
    }
}
