package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class oq implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI f170117d;

    public oq(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI) {
        this.f170117d = snsSingleTextViewUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI snsSingleTextViewUI = this.f170117d;
        if (itemId == 0) {
            if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                if (com.tencent.mm.sdk.platformtools.b0.f(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText())) {
                    db5.e1.T(snsSingleTextViewUI.getContext(), snsSingleTextViewUI.getContext().getString(com.tencent.mm.R.string.f490361st));
                    if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI) != null) {
                        w04.a.INSTANCE.A9(2, com.tencent.mm.sdk.platformtools.t8.r0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_snsId), com.tencent.mm.sdk.platformtools.t8.o0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText().toString()));
                    }
                } else {
                    db5.e1.T(snsSingleTextViewUI.getContext(), snsSingleTextViewUI.getContext().getString(com.tencent.mm.R.string.f490360ss));
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
            return;
        }
        int i18 = 0;
        if (itemId == 1) {
            if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
                java.lang.String X6 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.X6(snsSingleTextViewUI);
                java.lang.CharSequence text = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                qb4.a.f(doFavoriteEvent, X6, text, 0, 0);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillEventInfoText", "com.tencent.mm.plugin.sns.transmit.GetFavDataSource");
                am.c4 c4Var = doFavoriteEvent.f54090g;
                c4Var.f6323i = snsSingleTextViewUI;
                c4Var.f6327m = 18;
                doFavoriteEvent.e();
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
            return;
        }
        if (itemId == 6) {
            if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                android.content.Intent intent = new android.content.Intent();
                com.tencent.mm.plugin.sns.storage.SnsInfo k17 = com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.X6(snsSingleTextViewUI));
                intent.putExtra("k_username", k17 != null ? k17.field_userName : "");
                intent.putExtra("k_expose_msg_id", k17 == null ? 0 : k17.getSnsId());
                intent.putExtra("showShare", false);
                intent.putExtra("rawUrl", java.lang.String.format(com.tencent.mm.ui.n2.f209398a, 33));
                j45.l.j(snsSingleTextViewUI, "webview", ".ui.tools.WebViewUI", intent, null);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
            return;
        }
        if (itemId == 12) {
            if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null && !com.tencent.mm.sdk.platformtools.t8.K0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText().toString())) {
                java.lang.String charSequence = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText().toString();
                ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
                java.lang.String l17 = o13.n.l(77);
                su4.j2 j2Var = new su4.j2();
                j2Var.f412942e = l17;
                j2Var.f412938a = snsSingleTextViewUI.getContext();
                j2Var.f412941d = charSequence;
                j2Var.f412939b = 77;
                j2Var.f412943f = true;
                j2Var.f412945h = true;
                j2Var.f412946i = false;
                j2Var.f412958u = true;
                j2Var.f412952o = i65.a.d(snsSingleTextViewUI.getContext(), com.tencent.mm.R.color.aaw);
                j2Var.f412953p = false;
                ((java.util.HashMap) j2Var.f412944g).put("chatSearch", "1");
                ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                long j17 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI) != null ? com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_snsId : 0L;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                int i19 = snsSingleTextViewUI.f167402n;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                if (i19 == 2) {
                    i18 = 7;
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    int i27 = snsSingleTextViewUI.f167402n;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI");
                    if (i27 == 1) {
                        i18 = 6;
                    }
                }
                tg0.v1 v1Var = (tg0.v1) i95.n0.c(tg0.v1.class);
                java.lang.String t07 = ca4.z0.t0(j17);
                long length = charSequence.length();
                ((sg0.q3) v1Var).getClass();
                su4.k3.d(2, l17, 77, 0, "", "", t07, "", 3, "", 0L, length, i18, "", "", -1, 0);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
            return;
        }
        if (itemId == 37) {
            if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI) != null) {
                r45.l86 f17 = com.tencent.mm.plugin.sns.ui.widget.x1.f171306a.f(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_snsId, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI));
                if (f17 == null || f17.f379230d == null || f17.f379231e == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SnsSingleTextViewUI", "add emoticon info md5 is null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                    return;
                }
                final com.tencent.mm.api.IEmojiInfo wi6 = ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).wi(((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Bi(f17.f379230d, f17.f379231e.f371841f));
                com.tencent.mm.plugin.sns.ui.widget.r2.f171259a.h(wi6, 1, ca4.z0.t0(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_snsId), com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI).f373132m + "");
                final int i28 = 1000078;
                ((com.tencent.mm.feature.emoji.r4) ((com.tencent.mm.feature.emoji.api.t6) i95.n0.c(com.tencent.mm.feature.emoji.api.t6.class))).Ni(wi6, new yz5.l(wi6, i28) { // from class: com.tencent.mm.plugin.sns.ui.oq$$a

                    /* renamed from: e, reason: collision with root package name */
                    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f170119e;

                    @Override // yz5.l
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        com.tencent.mm.plugin.sns.ui.oq oqVar = com.tencent.mm.plugin.sns.ui.oq.this;
                        oqVar.getClass();
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsSingleTextViewUI", "CONTEXT_MENU_ID_COPY_COMMENT >> loadEmoticonFileFromIEmojiInfo: %b", (java.lang.Boolean) obj);
                        ((com.tencent.mm.feature.emoji.s0) ((com.tencent.mm.feature.emoji.api.y5) i95.n0.c(com.tencent.mm.feature.emoji.api.y5.class))).wi(oqVar.f170117d.getContext(), this.f170119e, 1000078, null);
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$onMMMenuItemSelected$0", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                        return null;
                    }
                });
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
            return;
        }
        com.tencent.mm.sdk.platformtools.f9 f9Var = com.tencent.mm.sdk.platformtools.f9.ContextTranslate;
        switch (itemId) {
            case 14:
                if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                    if (!f9Var.k(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getContext(), null)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                        return;
                    }
                    com.tencent.mm.plugin.sns.model.s6.m(com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.X6(snsSingleTextViewUI)));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                return;
            case 15:
                if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                    if (!f9Var.k(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getContext(), null)) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                        return;
                    }
                    com.tencent.mm.plugin.sns.model.s6.l(new com.tencent.mm.plugin.sns.ui.u1(null, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getSnsId(), com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI), null, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI).f373130h, null, 1, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_userName, com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getTimeLine() != null ? com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getTimeLine().Id : null));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                return;
            case 16:
                if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                    com.tencent.mm.plugin.sns.model.s6.n(com.tencent.mm.plugin.sns.model.l4.Fj().k1(com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.X6(snsSingleTextViewUI)));
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                return;
            case 17:
                if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI) != null && com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.W6(snsSingleTextViewUI).getText() != null) {
                    java.lang.String snsId = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getSnsId();
                    r45.e86 Y6 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI);
                    java.lang.String str = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.Y6(snsSingleTextViewUI).f373130h;
                    java.lang.String str2 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).field_userName;
                    if (com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getTimeLine() != null) {
                        java.lang.String str3 = com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI.U6(snsSingleTextViewUI).getTimeLine().Id;
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    int i29 = Y6.f373132m;
                    sb6.append(i29 != 0 ? i29 : Y6.f373137r);
                    sb6.append("");
                    java.lang.String e17 = com.tencent.mm.plugin.sns.model.s6.e(snsId, sb6.toString());
                    com.tencent.mm.plugin.sns.model.s6.p(com.tencent.mm.plugin.sns.model.s6.f(e17));
                    com.tencent.mm.autogen.events.SnsUnTranslateEvent snsUnTranslateEvent = new com.tencent.mm.autogen.events.SnsUnTranslateEvent();
                    am.gx gxVar = snsUnTranslateEvent.f54850g;
                    gxVar.f6796a = 2;
                    gxVar.f6797b = e17;
                    snsUnTranslateEvent.e();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                return;
            default:
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onMMMenuItemSelected", "com.tencent.mm.plugin.sns.ui.SnsSingleTextViewUI$9");
                return;
        }
    }
}
