package d22;

/* loaded from: classes12.dex */
public final class m implements d22.p, com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public long f225865d;

    @Override // d22.p
    public java.lang.String d(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (!(context instanceof d22.l)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "unable to cast emojiStore page context");
            return "";
        }
        d22.l lVar = (d22.l) context;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, lVar.f364115k);
        linkedHashMap.put("defaultTag", java.lang.Integer.valueOf(lVar.f364111g));
        linkedHashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, java.lang.Integer.valueOf(lVar.f364155a));
        linkedHashMap.put("enterTime", java.lang.Long.valueOf(lVar.f364158d));
        linkedHashMap.put("searchScene", java.lang.Long.valueOf(lVar.f364112h));
        java.lang.String gVar = new cl0.g(linkedHashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        return gVar;
    }

    @Override // d22.p
    public java.lang.String e() {
        return "pages/home/entry";
    }

    @Override // d22.p
    public void f(d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        if (!(liteAppContext instanceof d22.l)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "unable to cast page context");
            return;
        }
        d22.l lVar = (d22.l) liteAppContext;
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).bj(lVar.f364155a, 4, 100999, "");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_emoticon_home_liteapp_exttransfer, 0);
        if (((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tk("wxalited0b57585613a7551e08fc832ec6ab2e6")) {
            if (Ni == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "startRequestEmoticonList");
                this.f225865d = java.lang.System.currentTimeMillis();
                r45.gd5 gd5Var = new r45.gd5();
                gd5Var.f375141f = this.f225865d;
                z12.t tVar = new z12.t(5, gd5Var.toByteArray(), 2, false);
                gm0.j1.n().f273288b.a(411, this);
                gm0.j1.n().f273288b.g(tVar);
                return;
            }
            cl0.g gVar = new cl0.g();
            gVar.s(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
            gVar.s("entryTime", java.lang.Long.valueOf(lVar.f364158d));
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var != null) {
                ((com.tencent.mm.feature.lite.i) g0Var).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativeDispatchFetchEmotionList", gVar);
            }
        }
    }

    @Override // d22.p
    public com.tencent.mm.plugin.lite.s i(d22.v context) {
        kotlin.jvm.internal.o.g(context, "context");
        return new com.tencent.mm.plugin.lite.s();
    }

    @Override // d22.p
    public java.lang.String j() {
        return "wxaliteb6acd493f7e02b17d6b805ccf970be5b";
    }

    @Override // d22.p
    public void k(android.content.Context viewContext, d22.v liteAppContext) {
        kotlin.jvm.internal.o.g(viewContext, "viewContext");
        kotlin.jvm.internal.o.g(liteAppContext, "liteAppContext");
        if (!(liteAppContext instanceof d22.l)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "unable to cast reward page context, can't open native view");
            return;
        }
        d22.l lVar = (d22.l) liteAppContext;
        ((com.tencent.mm.feature.emoji.b0) ((com.tencent.mm.feature.emoji.api.s5) i95.n0.c(com.tencent.mm.feature.emoji.api.s5.class))).bj(lVar.f364155a, 4, 999, "");
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(viewContext, com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2UI.class);
        intent.putExtra("entrance_scene", lVar.f364113i);
        intent.putExtra("preceding_scence", lVar.f364155a);
        intent.putExtra("download_entrance_scene", lVar.f364112h);
        intent.putExtra("check_clickflag", false);
        intent.putExtra("emoji_tab", lVar.f364111g);
        intent.putExtra("to_talker_name", lVar.f364114j);
        if (lVar.f364156b) {
            j45.l.j(viewContext, "emoji", ".ui.v2.EmojiStoreV2UI", intent, null);
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(viewContext, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/liteapp/MMEmoticonEmojiStoreCreator", "openNativeView", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emoji/ui/liteapp/MMEmoticonLiteAppPageContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        viewContext.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(viewContext, "com/tencent/mm/plugin/emoji/ui/liteapp/MMEmoticonEmojiStoreCreator", "openNativeView", "(Landroid/content/Context;Lcom/tencent/mm/plugin/emoji/ui/liteapp/MMEmoticonLiteAppPageContext;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // d22.p
    public boolean l() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006d  */
    @Override // d22.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n(d22.v r7) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r7, r0)
            java.lang.Class<e42.e0> r0 = e42.e0.class
            i95.m r1 = i95.n0.c(r0)
            e42.e0 r1 = (e42.e0) r1
            e42.c0 r2 = e42.c0.clicfg_emoticon_home_liteapp_preload_cache_android
            h62.d r1 = (h62.d) r1
            r3 = 0
            int r1 = r1.Ni(r2, r3)
            i95.m r2 = i95.n0.c(r0)
            e42.e0 r2 = (e42.e0) r2
            e42.c0 r4 = e42.c0.clicfg_emoticon_home_liteapp_enable_android
            h62.d r2 = (h62.d) r2
            int r2 = r2.Ni(r4, r3)
            r4 = 1
            if (r2 != r4) goto L29
            r2 = r4
            goto L2a
        L29:
            r2 = r3
        L2a:
            boolean r5 = r7 instanceof d22.l
            if (r5 == 0) goto L4f
            d22.l r7 = (d22.l) r7
            int r7 = r7.f364155a
            r5 = 2
            if (r7 != r5) goto L4f
            if (r1 != r4) goto L48
            bm5.o1 r7 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonEmojiStoreLiteApp r0 = new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonEmojiStoreLiteApp
            r0.<init>()
            int r7 = r7.h(r0)
            if (r7 == r4) goto L46
            if (r2 == 0) goto L47
        L46:
            r3 = r4
        L47:
            return r3
        L48:
            if (r1 == r5) goto L4d
            r7 = 3
            if (r1 != r7) goto L4f
        L4d:
            r7 = r4
            goto L50
        L4f:
            r7 = r3
        L50:
            i95.m r0 = i95.n0.c(r0)
            e42.e0 r0 = (e42.e0) r0
            e42.c0 r1 = e42.c0.clicfg_emoticon_emojistore_liteapp_enable_android
            h62.d r0 = (h62.d) r0
            boolean r0 = r0.fj(r1, r3)
            bm5.o1 r1 = bm5.o1.f22719a
            com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonEmojiStoreLiteApp r5 = new com.tencent.mm.repairer.config.emoji.RepairerConfigEmoticonEmojiStoreLiteApp
            r5.<init>()
            int r1 = r1.h(r5)
            if (r1 != r4) goto L6d
            r1 = r4
            goto L6e
        L6d:
            r1 = r3
        L6e:
            if (r0 != 0) goto L76
            if (r1 != 0) goto L76
            if (r7 != 0) goto L76
            if (r2 == 0) goto L77
        L76:
            r3 = r4
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d22.m.n(d22.v):boolean");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "onSceneEnd errType:%d, errCode:%d, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        gm0.j1.n().f273288b.q(411, this);
        java.lang.Integer valueOf = m1Var != null ? java.lang.Integer.valueOf(m1Var.getType()) : null;
        if (valueOf == null || valueOf.intValue() != 411) {
            com.tencent.mars.xlog.Log.w("MicroMsg.emoji.MMEmoticonEmojiStoreCreator", "unknow scene type");
            q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var != null) {
                ((com.tencent.mm.feature.lite.i) g0Var).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativePreloadEmotionList", new cl0.g());
                return;
            }
            return;
        }
        if (!(m1Var instanceof z12.t)) {
            q80.g0 g0Var2 = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var2 != null) {
                ((com.tencent.mm.feature.lite.i) g0Var2).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativePreloadEmotionList", new cl0.g());
                return;
            }
            return;
        }
        z12.t tVar = (z12.t) m1Var;
        if (tVar.f469362f == 5) {
            r45.we3 J2 = tVar.J();
            com.tencent.mm.feature.emoji.api.p6 p6Var = (com.tencent.mm.feature.emoji.api.p6) i95.n0.c(com.tencent.mm.feature.emoji.api.p6.class);
            if (J2 == null || p6Var == null) {
                q80.g0 g0Var3 = (q80.g0) i95.n0.c(q80.g0.class);
                if (g0Var3 != null) {
                    ((com.tencent.mm.feature.lite.i) g0Var3).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativePreloadEmotionList", new cl0.g());
                    return;
                }
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = J2.f389086f.iterator();
            while (it.hasNext()) {
                r45.zj0 zj0Var = (r45.zj0) it.next();
                kotlin.jvm.internal.o.d(zj0Var);
                arrayList.add(((com.tencent.mm.feature.emoji.f4) p6Var).Di(zj0Var));
            }
            java.util.Iterator it6 = J2.f389093p.iterator();
            while (it6.hasNext()) {
                r45.kj0 kj0Var = (r45.kj0) it6.next();
                kotlin.jvm.internal.o.d(kj0Var);
                arrayList2.add(((com.tencent.mm.feature.emoji.f4) p6Var).Bi(kj0Var));
            }
            cl0.g gVar = new cl0.g();
            if (J2.f389084d != null) {
                gVar = new cl0.g();
                gVar.s("iLen", java.lang.Integer.valueOf(J2.f389084d.f371839d));
                gVar.s("Buffer", android.util.Base64.encodeToString(J2.f389084d.f371841f.g(), 0));
            }
            cl0.g gVar2 = new cl0.g();
            gVar2.s("emotionList", arrayList);
            gVar2.s("bannerSetList", arrayList2);
            gVar2.s("ReportRequestID", java.lang.String.valueOf(J2.f389102y));
            gVar2.s("ReqBuf", gVar.toString());
            q80.g0 g0Var4 = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var4 != null) {
                ((com.tencent.mm.feature.lite.i) g0Var4).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativePreloadEmotionList", gVar2);
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.putOpt("sessionid", java.lang.Long.valueOf(this.f225865d));
            q80.g0 g0Var5 = (q80.g0) i95.n0.c(q80.g0.class);
            if (g0Var5 != null) {
                ((com.tencent.mm.feature.lite.i) g0Var5).rj("wxalited0b57585613a7551e08fc832ec6ab2e6", "storeHome/nativeInitSessionId", jSONObject);
            }
        }
    }
}
