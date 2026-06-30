package y75;

/* loaded from: classes15.dex */
public final class c extends lr.p {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.search.data.SimilarEmojiQueryModel f459789i;

    public c(int i17) {
        super(i17, null, null, 6, null);
    }

    @Override // lr.p, lr.k0
    public void b(android.view.View view, android.content.Context context, int i17, ir.u0 u0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        if (u0Var == null) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.f9.ContextSearch.k(context, null)) {
            boolean z17 = u0Var instanceof ir.g;
            com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "onClick: " + i17 + ", md5 :" + (z17 ? ((ir.g) u0Var).f293836b.getMd5() : ""));
            if (z17) {
                ir.g gVar = (ir.g) u0Var;
                if (gVar.f293837c == 102) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.B(1257L, 4L);
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo = gVar.f293836b;
                    kotlin.jvm.internal.o.e(iEmojiInfo, "null cannot be cast to non-null type com.tencent.mm.storage.emotion.EmojiInfo");
                    ((ku5.t0) ku5.t0.f312615d).g(new z75.a(i17, (com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo));
                    if (gVar.f293836b.B0() == 1) {
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(gVar.f293836b.getGroupId())) {
                            if (((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).S(gVar.f293836b.getGroupId())) {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "buy and resend emoji");
                            }
                        }
                        com.tencent.mm.api.IEmojiInfo iEmojiInfo2 = gVar.f293836b;
                        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
                        aVar.f211709a = "";
                        aVar.f211729s = context.getString(com.tencent.mm.R.string.j5f);
                        aVar.A = true;
                        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.bup);
                        aVar.E = new y75.b(iEmojiInfo2, context);
                        aVar.f211733w = of5.b.a(context).getString(com.tencent.mm.R.string.f490347sg);
                        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                        j0Var.e(aVar);
                        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
                        if (d0Var != null) {
                            d0Var.a(j0Var.f211837r);
                        }
                        android.view.Window window = j0Var.getWindow();
                        if (window != null) {
                            window.setSoftInputMode(48);
                            window.setFlags(131072, 131072);
                        }
                        j0Var.show();
                        return;
                    }
                    com.tencent.mm.api.IEmojiInfo iEmojiInfo3 = gVar.f293836b;
                    if (com.tencent.mm.storage.n5.f().c().u1(iEmojiInfo3.getMd5()) == null) {
                        com.tencent.mm.storage.n5.f().c().insert((com.tencent.mm.storage.emotion.EmojiInfo) iEmojiInfo3);
                    }
                    iEmojiInfo3.v1(qk.z6.SEND_FROM_SCENE_RELATED);
                    com.tencent.mm.pluginsdk.ui.chat.v9 v9Var = this.f320568d;
                    if (v9Var != null) {
                        v9Var.b(iEmojiInfo3);
                        return;
                    }
                    return;
                }
            }
            if ((u0Var instanceof ir.z0) && ((ir.z0) u0Var).f293922b == 101) {
                if (this.f459789i == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SimilarEmoji", "can not jump for null data!");
                    return;
                }
                com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct relatedEmoticonActionStruct = new com.tencent.mm.autogen.mmdata.rpt.RelatedEmoticonActionStruct();
                relatedEmoticonActionStruct.f59953d = z75.c.f470622a;
                relatedEmoticonActionStruct.f59954e = 5L;
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo = z75.c.f470623b;
                relatedEmoticonActionStruct.r(emojiInfo != null ? emojiInfo.field_groupId : null);
                com.tencent.mm.storage.emotion.EmojiInfo emojiInfo2 = z75.c.f470623b;
                relatedEmoticonActionStruct.q(emojiInfo2 != null ? emojiInfo2.getMd5() : null);
                relatedEmoticonActionStruct.f59960k = 4L;
                relatedEmoticonActionStruct.p(z75.c.f470624c);
                relatedEmoticonActionStruct.k();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_NET_PARAM", this.f459789i);
                j45.l.n(((com.tencent.mm.ui.xb) context).getBaseContext(), "webview", ".emojistore.ui.SosSimilarUI", intent, 229);
            }
        }
    }
}
