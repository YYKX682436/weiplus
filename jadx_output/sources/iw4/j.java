package iw4;

/* loaded from: classes15.dex */
public final class j implements lr.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI f295263a;

    public j(com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI) {
        this.f295263a = sosSimilarUI;
    }

    @Override // lr.k0
    public void a(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = this.f295263a;
        ir.u0 y17 = ((lr.z) sosSimilarUI.f182051e).y(i17);
        if (y17 instanceof ir.g) {
            ir.g gVar = (ir.g) y17;
            com.tencent.mm.api.IEmojiInfo Bi = ((com.tencent.mm.feature.emoji.k0) ((com.tencent.mm.feature.emoji.api.v5) i95.n0.c(com.tencent.mm.feature.emoji.api.v5.class))).Bi(gVar.f293836b.getMd5());
            boolean z17 = (Bi != null ? ((com.tencent.mm.storage.emotion.EmojiInfo) Bi).field_catalog : 0) == 81;
            com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct similarEmoticonSearchLongpressStruct = new com.tencent.mm.autogen.mmdata.rpt.SimilarEmoticonSearchLongpressStruct();
            iw4.d dVar = sosSimilarUI.f182050d;
            similarEmoticonSearchLongpressStruct.f60412f = dVar.c() ? 59 : 78;
            similarEmoticonSearchLongpressStruct.f60410d = similarEmoticonSearchLongpressStruct.b("SessionId", dVar.f295248h, true);
            similarEmoticonSearchLongpressStruct.f60411e = similarEmoticonSearchLongpressStruct.b("SearchId", dVar.f295249i, true);
            similarEmoticonSearchLongpressStruct.f60413g = similarEmoticonSearchLongpressStruct.b("ClickMD5", gVar.f293836b.getMd5(), true);
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = dVar.f295245e;
            if (similarEmojiQueryModel == null || (str = similarEmojiQueryModel.f193150e) == null) {
                str = "";
            }
            similarEmoticonSearchLongpressStruct.f60414h = similarEmoticonSearchLongpressStruct.b("QueryMD5", str, true);
            similarEmoticonSearchLongpressStruct.f60415i = dVar.f295246f;
            similarEmoticonSearchLongpressStruct.f60416j = i17;
            similarEmoticonSearchLongpressStruct.f60417k = java.lang.System.currentTimeMillis();
            similarEmoticonSearchLongpressStruct.f60418l = similarEmoticonSearchLongpressStruct.b("RequestId", dVar.f295249i, true);
            similarEmoticonSearchLongpressStruct.f60419m = 1L;
            similarEmoticonSearchLongpressStruct.f60420n = z17 ? 1L : 0L;
            similarEmoticonSearchLongpressStruct.k();
            su4.k3.m(similarEmoticonSearchLongpressStruct);
            if (z17) {
                return;
            }
            new rl5.r(sosSimilarUI).g(view, 0, 0L, new iw4.a(gVar), new iw4.b(sosSimilarUI, gVar, dVar, i17), com.tencent.mm.view.TouchableLayout.f213511d, com.tencent.mm.view.TouchableLayout.f213512e);
        }
    }

    @Override // lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        ir.g gVar;
        java.lang.String str;
        android.content.Context context2 = context;
        kotlin.jvm.internal.o.g(context2, "context");
        if (u0Var == null || !(u0Var instanceof ir.g)) {
            return;
        }
        ir.g gVar2 = (ir.g) u0Var;
        if (gVar2.f293837c != 103) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.webview.emojistore.ui.SosSimilarUI sosSimilarUI = this.f295263a;
        if (currentTimeMillis - sosSimilarUI.f182054h < 500) {
            return;
        }
        sosSimilarUI.f182054h = java.lang.System.currentTimeMillis();
        ((com.tencent.mm.feature.emoji.u0) ((com.tencent.mm.feature.emoji.api.a6) i95.n0.c(com.tencent.mm.feature.emoji.api.a6.class))).getClass();
        y75.d dVar = y75.a.f459786a;
        if (dVar != null) {
            dVar.b(view, context2, i17, u0Var);
        }
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = gVar2.f293836b;
        java.lang.String str2 = "";
        if (sosSimilarUI.f182050d.c()) {
            o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel = sosSimilarUI.f182050d.f295245e;
            java.lang.String str3 = similarEmojiQueryModel != null ? similarEmojiQueryModel.f193154i : null;
            java.lang.String md52 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5();
            ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).p();
            iw4.g gVar3 = new iw4.g(h0Var, sosSimilarUI, context2);
            ((r35.k1) q1Var).getClass();
            com.tencent.mm.storage.n5.f().c().u1(md52);
            ((n13.b0) i95.n0.c(n13.b0.class)).getClass();
            if (context2 instanceof com.tencent.mm.ui.xb) {
                context2 = ((com.tencent.mm.ui.xb) context2).getBaseContext();
            }
            lb5.a aVar = new lb5.a();
            aVar.n(md52);
            n13.a0 a0Var = (n13.a0) i95.n0.c(n13.a0.class);
            n13.t a17 = n13.t.a(gVar3);
            a17.f334138f.f334139a = 5;
            ((dk5.y) a0Var).wi(context2, aVar, str3, a17);
            gVar = gVar2;
        } else if (sosSimilarUI.getIntent().getBooleanExtra("KEY_GET_EMOJI_INFO_DIRECTLY", false)) {
            o25.q1 q1Var2 = (o25.q1) i95.n0.c(o25.q1.class);
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel2 = sosSimilarUI.f182050d.f295245e;
            java.lang.String md53 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5();
            java.lang.String X0 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).X0();
            java.lang.String l17 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).l();
            iw4.h hVar = new iw4.h(sosSimilarUI, h0Var);
            ((r35.k1) q1Var2).getClass();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u17 = com.tencent.mm.storage.n5.f().c().u1(md53);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String p17 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", md53);
            if (u17 == null) {
                int i18 = com.tencent.mm.sdk.platformtools.y1.c(p17) ? 2 : 1;
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = new com.tencent.mm.storage.emotion.EmojiInfo();
                emojiInfo.field_md5 = md53;
                emojiInfo.field_catalog = 65;
                emojiInfo.field_type = i18;
                gVar = gVar2;
                emojiInfo.field_size = (int) com.tencent.mm.vfs.w6.k(p17);
                emojiInfo.field_temp = 1;
                emojiInfo.field_designerID = X0;
                emojiInfo.field_thumbUrl = l17;
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().J0(emojiInfo);
                u17 = emojiInfo;
            } else {
                gVar = gVar2;
            }
            r35.i1 i1Var = new r35.i1(context2);
            i1Var.f(u17, "");
            i1Var.g(java.lang.Boolean.FALSE);
            i1Var.f369137d = context2.getString(com.tencent.mm.R.string.f490352sk);
            i1Var.a(hVar);
            i1Var.k();
        } else {
            gVar = gVar2;
            o25.q1 q1Var3 = (o25.q1) i95.n0.c(o25.q1.class);
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel3 = sosSimilarUI.f182050d.f295245e;
            java.lang.String str4 = similarEmojiQueryModel3 != null ? similarEmojiQueryModel3.f193154i : null;
            java.lang.String md54 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5();
            java.lang.String X02 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).X0();
            java.lang.String l18 = ((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).l();
            iw4.i iVar = new iw4.i(sosSimilarUI, h0Var, context2);
            ((r35.k1) q1Var3).getClass();
            ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
            com.tencent.mm.storage.emotion.EmojiInfo u18 = com.tencent.mm.storage.n5.f().c().u1(md54);
            ((com.tencent.mm.feature.emoji.h2) ((com.tencent.mm.feature.emoji.api.j6) i95.n0.c(com.tencent.mm.feature.emoji.api.j6.class))).getClass();
            java.lang.String p18 = com.tencent.mm.plugin.emoji.model.EmojiLogic.p(n22.m.g(), "", md54);
            if (u18 == null) {
                int i19 = com.tencent.mm.sdk.platformtools.y1.c(p18) ? 2 : 1;
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = new com.tencent.mm.storage.emotion.EmojiInfo();
                emojiInfo2.field_md5 = md54;
                emojiInfo2.field_catalog = 65;
                emojiInfo2.field_type = i19;
                emojiInfo2.field_size = (int) com.tencent.mm.vfs.w6.k(p18);
                emojiInfo2.field_temp = 1;
                emojiInfo2.field_designerID = X02;
                emojiInfo2.field_thumbUrl = l18;
                ((com.tencent.mm.feature.emoji.b0) i95.n0.c(com.tencent.mm.feature.emoji.b0.class)).getClass();
                com.tencent.mm.storage.n5.f().c().J0(emojiInfo2);
                u18 = emojiInfo2;
            }
            r35.i1 i1Var2 = new r35.i1(context2);
            i1Var2.l(str4);
            i1Var2.f(u18, "");
            i1Var2.g(java.lang.Boolean.TRUE);
            i1Var2.f369137d = context2.getString(com.tencent.mm.R.string.f490551ya);
            i1Var2.a(iVar);
            i1Var2.k();
        }
        r45.lq5 lq5Var = new r45.lq5();
        if (sosSimilarUI.f182050d.c()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("logid=17372&sessionid=");
            sb6.append(sosSimilarUI.f182050d.f295249i);
            sb6.append("&searchid=");
            sb6.append(sosSimilarUI.f182050d.f295249i);
            sb6.append("&scene=59&clickmd5=");
            sb6.append(((com.tencent.mm.api.IEmojiInfo) h0Var.f310123d).getMd5());
            sb6.append("&querymd5=");
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel4 = sosSimilarUI.f182050d.f295245e;
            sb6.append(similarEmojiQueryModel4 != null ? similarEmojiQueryModel4.f193150e : null);
            sb6.append("&offset=");
            sb6.append(sosSimilarUI.f182050d.f295246f);
            sb6.append("&pos=");
            sb6.append(i17);
            sb6.append("&clienttimestamp=");
            sb6.append(java.lang.System.currentTimeMillis());
            sb6.append("&tab=0&requestid=");
            sb6.append(sosSimilarUI.f182050d.f295249i);
            lq5Var.f379756t = sb6.toString();
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("scene=78&searchid=");
            sb7.append(sosSimilarUI.f182050d.f295249i);
            sb7.append("&businesstype=256&docid=");
            ir.g gVar4 = gVar;
            sb7.append(gVar4.f293838d);
            sb7.append("&docpos=");
            sb7.append(i17);
            sb7.append("&typepos=0&ishomepage=0&clienttimestamp=");
            sb7.append(c01.id.c());
            sb7.append("&sceneactiontype=1&query=");
            com.tencent.mm.search.data.SimilarEmojiQueryModel similarEmojiQueryModel5 = sosSimilarUI.f182050d.f295245e;
            if (similarEmojiQueryModel5 != null && (str = similarEmojiQueryModel5.f193149d) != null) {
                str2 = str;
            }
            sb7.append(str2);
            sb7.append("&sessionid=");
            sb7.append(sosSimilarUI.f182050d.f295248h);
            sb7.append("&nettype=");
            sb7.append(com.tencent.mm.plugin.websearch.l2.b());
            sb7.append("&requestid=");
            sb7.append(sosSimilarUI.f182050d.f295249i);
            sb7.append("&reqbusinesstype=256&pageno=");
            sb7.append(gVar4.f293839e);
            lq5Var.f379756t = sb7.toString();
        }
        ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).getClass();
        gm0.j1.d().g(new su4.a2(lq5Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.SosSimilarUI", lq5Var.f379756t);
    }
}
