package q53;

/* loaded from: classes8.dex */
public final class a extends com.tencent.mm.plugin.game.luggage.page.l {
    /* JADX WARN: Multi-variable type inference failed */
    public a(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle, java.lang.String str) {
        super(xVar, o0Var, bundle);
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = this.f182186t;
        kotlin.jvm.internal.o.e(y1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar");
        final q53.f fVar = (q53.f) y1Var;
        fVar.B1 = str;
        android.os.Bundle bundle2 = fVar.W;
        com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2 = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2) bundle2.getParcelable("game_tab_data");
        java.lang.String str4 = fVar.B1;
        boolean z18 = false;
        if (str4 == null || str4.length() == 0) {
            fVar.f360201z1 = true;
            str2 = bundle2.getString("game_tab_key");
        } else {
            str2 = fVar.B1;
        }
        if (gameTabData2 != null) {
            if (str2 == null || str2.length() == 0) {
                return;
            }
            fVar.a(true);
            com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem = (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) gameTabData2.f141151d.get(str2);
            com.tencent.mm.plugin.game.luggage.page.x0 x0Var = fVar.V;
            if (x0Var.f406657n.getBoolean("from_find_more_friend", false) && com.tencent.mm.plugin.game.commlib.i.k() != null && !com.tencent.mm.plugin.game.commlib.i.k().f323978g && tabItem != null && !tabItem.G) {
                fVar.k();
            }
            if (tabItem != null) {
                java.util.List list = tabItem.F;
                if (list == null || ((java.util.ArrayList) list).isEmpty()) {
                    return;
                }
                java.util.List topCornerSettings = tabItem.F;
                kotlin.jvm.internal.o.f(topCornerSettings, "topCornerSettings");
                java.util.Iterator it = ((java.util.ArrayList) topCornerSettings).iterator();
                while (it.hasNext()) {
                    com.tencent.mm.plugin.game.model.LocalTabCornerSetting localTabCornerSetting = (com.tencent.mm.plugin.game.model.LocalTabCornerSetting) it.next();
                    android.view.LayoutInflater b17 = com.tencent.mm.ui.id.b(fVar.getContext());
                    android.widget.LinearLayout linearLayout = fVar.f182700o;
                    android.view.View inflate = b17.inflate(com.tencent.mm.R.layout.bdp, linearLayout, z18);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f485402hk5);
                    fVar.f360199y0.add(imageView);
                    boolean b18 = kotlin.jvm.internal.o.b(localTabCornerSetting.f140176d, "chat");
                    java.lang.String str5 = localTabCornerSetting.f140178f;
                    java.lang.String str6 = localTabCornerSetting.f140177e;
                    if (b18) {
                        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(""), com.tencent.mm.plugin.game.ui.chat_tab.GameTabWidget2.b.class, null);
                        fVar.f360195p0 = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.gii);
                        fVar.f360197x0 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.avs);
                        android.content.Context context = x0Var.f406610d;
                        if (context instanceof androidx.fragment.app.FragmentActivity) {
                            ((androidx.fragment.app.FragmentActivity) context).mo133getLifecycle().a(new androidx.lifecycle.x() { // from class: com.tencent.mm.plugin.game.ui.web.GameWebSettingActionBar$initChatTab$1
                                @androidx.lifecycle.l0(androidx.lifecycle.m.ON_RESUME)
                                public final void onResume() {
                                    q53.f.this.getGetUnreadGameMsgListener().alive();
                                }
                            });
                        }
                        com.tencent.mm.plugin.game.model.LocalJumpInfo localJumpInfo = localTabCornerSetting.f140179g;
                        if (localJumpInfo != null && localJumpInfo.f140172d == 4) {
                            android.net.Uri parse = android.net.Uri.parse(localJumpInfo.f140173e);
                            if (kotlin.jvm.internal.o.b(parse.getPath(), "chat")) {
                                try {
                                    fVar.f360196p1 = java.lang.Integer.parseInt(parse.getQueryParameter("sourceSence"));
                                } catch (java.lang.NumberFormatException unused) {
                                    com.tencent.mars.xlog.Log.e("GameWebSettingActionBar", "gamelog parse reportSourceScene error");
                                }
                            }
                        }
                        if (com.tencent.mm.ui.bk.C()) {
                            if (str5 == null || str5.length() == 0) {
                                kotlin.jvm.internal.o.d(imageView);
                                fVar.m(imageView, com.tencent.mm.R.raw.game_msg_top_tip);
                                z17 = true;
                            }
                        }
                        if (!com.tencent.mm.ui.bk.C()) {
                            if (str6 == null || str6.length() == 0) {
                                kotlin.jvm.internal.o.d(imageView);
                                fVar.m(imageView, com.tencent.mm.R.raw.game_msg_top_tip);
                                z17 = true;
                            }
                        }
                        vo0.a aVar = vo0.e.f438468b;
                        str5 = com.tencent.mm.ui.bk.C() ? str5 : str6;
                        str3 = str5 != null ? str5 : "";
                        kotlin.jvm.internal.o.d(imageView);
                        yo0.f fVar2 = new yo0.f();
                        fVar2.f464078b = true;
                        fVar2.f464077a = true;
                        aVar.h(str3, imageView, fVar2.a(), new q53.c(localTabCornerSetting, imageView, fVar));
                        z17 = true;
                    } else {
                        vo0.a aVar2 = vo0.e.f438468b;
                        str5 = com.tencent.mm.ui.bk.C() ? str5 : str6;
                        str3 = str5 != null ? str5 : "";
                        kotlin.jvm.internal.o.d(imageView);
                        yo0.f fVar3 = new yo0.f();
                        z17 = true;
                        fVar3.f464078b = true;
                        fVar3.f464077a = true;
                        aVar2.h(str3, imageView, fVar3.a(), new q53.d(localTabCornerSetting, imageView));
                    }
                    inflate.setOnClickListener(new q53.e(fVar, localTabCornerSetting));
                    linearLayout.addView(inflate, 0);
                    z18 = false;
                }
            }
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.l
    public void W(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        super.W(str);
        com.tencent.mm.plugin.game.luggage.page.x0 x0Var = (com.tencent.mm.plugin.game.luggage.page.x0) ((java.util.concurrent.ConcurrentHashMap) this.f139910j2).get(str);
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = x0Var != null ? x0Var.f182186t : null;
        if (y1Var == null || !(y1Var instanceof q53.f)) {
            return;
        }
        q53.f fVar = (q53.f) y1Var;
        if (kotlin.jvm.internal.o.b(str, fVar.B1)) {
            fVar.f360201z1 = true;
            if (fVar.f360194l1 || !fVar.A1) {
                return;
            }
            fVar.f360194l1 = true;
            fVar.o(false, str);
        }
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.l
    public void a0(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return;
        }
        java.util.Map mTabPageMap = this.f139910j2;
        if (((java.util.concurrent.ConcurrentHashMap) mTabPageMap).containsKey(str) || this.f139913m2 == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("GameTabSettingWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(this.f406657n);
        bundle.putString("rawUrl", str2);
        q53.a aVar = new q53.a(this.f406612f, null, bundle, str);
        com.tencent.mm.plugin.webview.luggage.y1 y1Var = aVar.f182186t;
        if (y1Var != null) {
            y1Var.b();
        }
        aVar.V1 = this;
        aVar.W1 = z17;
        com.tencent.mm.ui.MMActivity mMActivity = this.f139918r2;
        if (mMActivity != null && mMActivity.isPaused() && z17) {
            aVar.Y1 = true;
            com.tencent.mars.xlog.Log.i("GameTabSettingWebPage", "mockFetchFcp, url:%s", str2);
        }
        c0(aVar, str);
        this.f139913m2.addView(aVar.f406654h, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        aVar.b(str2, bundle);
        kotlin.jvm.internal.o.f(mTabPageMap, "mTabPageMap");
        ((java.util.concurrent.ConcurrentHashMap) mTabPageMap).put(str, aVar);
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.l
    public void b0() {
        android.content.Context context = this.f406610d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
        intent.putExtra("game_need_bottom_tab", false);
        com.tencent.mars.xlog.Log.i("GameTabSettingWebPage", "jumpToChat chatClassName = " + com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/game/ui/web/GameTabSettingWebPage", "jumpToChat", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.x0, com.tencent.mm.plugin.webview.luggage.e0
    public android.view.View m() {
        android.os.Bundle bundle = this.f406657n;
        kotlin.jvm.internal.o.f(bundle, "getParams(...)");
        this.f182186t = new q53.f(this, bundle);
        com.tencent.mars.xlog.Log.i("GameTabSettingWebPage", "createActionBar GameWebSettingActionBar");
        com.tencent.mm.plugin.webview.luggage.y1 mActionBar = this.f182186t;
        kotlin.jvm.internal.o.f(mActionBar, "mActionBar");
        return mActionBar;
    }
}
