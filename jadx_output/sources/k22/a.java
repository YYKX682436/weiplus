package k22;

/* loaded from: classes12.dex */
public final class a implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k22.g f303475a;

    public a(k22.g gVar) {
        this.f303475a = gVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        k22.g gVar = this.f303475a;
        gVar.getClass();
        ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
        z85.l c17 = com.tencent.mm.storage.n5.f().c();
        com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = gVar.f303484e;
        com.tencent.mm.storage.emotion.EmojiInfo u17 = c17.u1(emojiInfo.field_md5);
        java.lang.String str = gVar.D;
        if (u17 == null) {
            com.tencent.mars.xlog.Log.i(str, "sendEmoji: db info is null");
            l75.e0 e0Var = com.tencent.mm.storage.emotion.EmojiInfo.L2;
            emojiInfo.field_catalog = 65;
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("entranceScene ");
        int i17 = gVar.f303487h;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        qk.z6 z6Var = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_PREVIEW_RECOMMEND;
        emojiInfo.K2 = z6Var;
        if (i17 != 0) {
            qk.z6 z6Var2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_ALBUM_DETAIL_RECOMMEND;
            if (i17 == 59) {
                emojiInfo.K2 = z6Var2;
            } else if (i17 == 100009) {
                emojiInfo.K2 = z6Var;
            } else if (i17 != 100041) {
                switch (i17) {
                    case 71:
                        emojiInfo.K2 = z6Var2;
                        break;
                    case 72:
                        emojiInfo.K2 = z6Var;
                        break;
                    case com.tencent.mm.plugin.appbrand.jsapi.share.k.CTRL_INDEX /* 73 */:
                        emojiInfo.K2 = z6Var;
                        break;
                }
            } else {
                emojiInfo.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_FINDER_COMMENT;
            }
        } else {
            emojiInfo.K2 = qk.z6.SEND_FROM_SCENE_FORWARD_FROM_ALBUM_DETAIL;
        }
        new lb5.a().n(emojiInfo.getMd5());
        com.tencent.mm.feature.emoji.api.s5 s5Var = (com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class);
        ((com.tencent.mm.feature.emoji.b0) s5Var).hj(gVar.f303483d, emojiInfo.getMd5(), emojiInfo);
        gVar.f303488i.B();
        yz5.a aVar = gVar.f303499w;
        if (aVar != null) {
            aVar.invoke();
        }
        j22.a.d(gVar.f303484e, 2, gVar.f303502z, gVar.A, gVar.f303487h);
        k22.g.a(gVar, "transportClick");
    }
}
