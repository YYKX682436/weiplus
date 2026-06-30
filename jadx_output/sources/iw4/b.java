package iw4;

/* loaded from: classes15.dex */
public final class b implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f295239d;

    /* renamed from: e, reason: collision with root package name */
    public final ir.g f295240e;

    /* renamed from: f, reason: collision with root package name */
    public final iw4.d f295241f;

    /* renamed from: g, reason: collision with root package name */
    public final int f295242g;

    public b(android.content.Context context, ir.g gVar, iw4.d data, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(data, "data");
        this.f295239d = context;
        this.f295240e = gVar;
        this.f295241f = data;
        this.f295242g = i17;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        ir.g gVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        if (menuItem == null || menuItem.getItemId() != 0 || (gVar = this.f295240e) == null) {
            return;
        }
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar.f293836b;
        java.lang.String md52 = iEmojiInfo.getMd5();
        java.lang.String str5 = "";
        if (md52 == null) {
            md52 = "";
        }
        java.lang.String X0 = iEmojiInfo.X0();
        if (X0 == null) {
            X0 = "";
        }
        java.lang.String l17 = iEmojiInfo.l();
        if (l17 == null) {
            l17 = "";
        }
        java.lang.String S0 = iEmojiInfo.S0();
        if (S0 == null) {
            S0 = "";
        }
        com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct = new com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct();
        iw4.d dVar = this.f295241f;
        similarEmoticonSearchLongpressStruct.f60412f = dVar.c() ? 59L : 78L;
        similarEmoticonSearchLongpressStruct.f60410d = similarEmoticonSearchLongpressStruct.b("SessionId", dVar.f295248h, true);
        similarEmoticonSearchLongpressStruct.f60411e = similarEmoticonSearchLongpressStruct.b("SearchId", dVar.f295249i, true);
        if (iEmojiInfo == null || (str = iEmojiInfo.getMd5()) == null) {
            str = "";
        }
        similarEmoticonSearchLongpressStruct.f60413g = similarEmoticonSearchLongpressStruct.b("ClickMD5", str, true);
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = dVar.f295245e;
        if (similarEmojiQueryModel == null || (str2 = similarEmojiQueryModel.f193150e) == null) {
            str2 = "";
        }
        similarEmoticonSearchLongpressStruct.f60414h = similarEmoticonSearchLongpressStruct.b("QueryMD5", str2, true);
        similarEmoticonSearchLongpressStruct.f60415i = dVar.f295246f;
        long j17 = this.f295242g;
        similarEmoticonSearchLongpressStruct.f60416j = j17;
        similarEmoticonSearchLongpressStruct.f60417k = java.lang.System.currentTimeMillis();
        similarEmoticonSearchLongpressStruct.f60418l = similarEmoticonSearchLongpressStruct.b("RequestId", dVar.f295249i, true);
        similarEmoticonSearchLongpressStruct.f60419m = 2L;
        similarEmoticonSearchLongpressStruct.k();
        su4.k3.m(similarEmoticonSearchLongpressStruct);
        com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(md52);
        com.tencent.mm.feature.emoji.api.x5 x5Var = (com.tencent.mm.feature.emoji.api.x5) i95.n0.c(com.tencent.mm.feature.emoji.api.x5.class);
        ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
        java.lang.String g17 = n22.m.g();
        ((com.tencent.mm.feature.emoji.o0) x5Var).getClass();
        java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(g17, "", md52);
        if (Bi == null) {
            int i18 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
            emojiInfo.field_md5 = md52;
            emojiInfo.field_catalog = 65;
            emojiInfo.field_type = i18;
            emojiInfo.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
            emojiInfo.field_temp = 1;
            emojiInfo.field_designerID = X0;
            emojiInfo.field_thumbUrl = l17;
            emojiInfo.field_activityid = S0;
            ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).wi(emojiInfo);
            Bi = emojiInfo;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosSimilarUI", "doAddAction %b", java.lang.Boolean.valueOf(((com.tencent.mm.feature.emoji.s0) ((com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class))).wi(this.f295239d, Bi, 18, c01.z1.r())));
        com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct2 = new com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct();
        similarEmoticonSearchLongpressStruct2.f60412f = dVar.c() ? 59L : 78L;
        similarEmoticonSearchLongpressStruct2.f60410d = similarEmoticonSearchLongpressStruct2.b("SessionId", dVar.f295249i, true);
        similarEmoticonSearchLongpressStruct2.f60411e = similarEmoticonSearchLongpressStruct2.b("SearchId", dVar.f295249i, true);
        if (iEmojiInfo == null || (str3 = iEmojiInfo.getMd5()) == null) {
            str3 = "";
        }
        similarEmoticonSearchLongpressStruct2.f60413g = similarEmoticonSearchLongpressStruct2.b("ClickMD5", str3, true);
        com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel2 = dVar.f295245e;
        if (similarEmojiQueryModel2 != null && (str4 = similarEmojiQueryModel2.f193150e) != null) {
            str5 = str4;
        }
        similarEmoticonSearchLongpressStruct2.f60414h = similarEmoticonSearchLongpressStruct2.b("QueryMD5", str5, true);
        similarEmoticonSearchLongpressStruct2.f60415i = dVar.f295246f;
        similarEmoticonSearchLongpressStruct2.f60416j = j17;
        similarEmoticonSearchLongpressStruct2.f60417k = java.lang.System.currentTimeMillis();
        similarEmoticonSearchLongpressStruct2.f60418l = similarEmoticonSearchLongpressStruct2.b("RequestId", dVar.f295249i, true);
        similarEmoticonSearchLongpressStruct2.f60419m = 3L;
        similarEmoticonSearchLongpressStruct2.k();
        su4.k3.m(similarEmoticonSearchLongpressStruct2);
    }
}
