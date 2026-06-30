package com.tencent.mm.plugin.game.ui.tab;

/* loaded from: classes8.dex */
public class GameTabWidget extends android.widget.LinearLayout {

    /* renamed from: f, reason: collision with root package name */
    public static int f141771f;

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f141772d;

    /* renamed from: e, reason: collision with root package name */
    public p53.c f141773e;

    /* loaded from: classes7.dex */
    public static class a implements com.tencent.mm.ipcinvoker.j {
        @Override // com.tencent.mm.ipcinvoker.j
        public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
            android.os.Bundle bundle = (android.os.Bundle) obj;
            if (rVar != null) {
                rVar.a(bundle);
            }
        }
    }

    public GameTabWidget(android.content.Context context) {
        super(context);
        b(context);
    }

    public static void a(com.tencent.mm.plugin.game.ui.tab.GameTabWidget gameTabWidget) {
        int count = gameTabWidget.f141773e.getCount();
        if (count == 0) {
            return;
        }
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.B(gameTabWidget.f141772d) / count, -1);
        for (int i17 = 0; i17 < count; i17++) {
            android.view.View view = gameTabWidget.f141773e.getView(i17, null, gameTabWidget);
            view.setOnClickListener(new p53.m(gameTabWidget));
            view.setLayoutParams(layoutParams);
            gameTabWidget.addView(view);
        }
    }

    public static void c(android.app.Activity activity, com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem, boolean z17, boolean z18, boolean z19) {
        boolean z27;
        java.lang.String str;
        com.tencent.mm.plugin.game.model.GameTabData.StatusBar statusBar;
        if (activity == null || tabItem == null || r53.f.c(activity, tabItem.f140157f)) {
            return;
        }
        java.lang.String stringExtra = activity.getIntent().getStringExtra("tab_key");
        java.lang.String str2 = tabItem.f140155d;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.equals(stringExtra)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget", "current_page:%s, next_page:%s, hasAnimation:%b", activity.getClass().getSimpleName(), tabItem.f140164p, java.lang.Boolean.valueOf(z17));
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(activity, tabItem.f140164p);
        android.os.Bundle extras = activity.getIntent().getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        } else {
            extras = new android.os.Bundle();
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("tab_key", tabItem.f140155d);
        com.tencent.mm.plugin.game.model.GameTabData gameTabData = (com.tencent.mm.plugin.game.model.GameTabData) extras.getParcelable("tab_data");
        if (gameTabData != null) {
            java.util.LinkedHashMap linkedHashMap = gameTabData.f140151d;
            if (stringExtra == null) {
                stringExtra = "";
            }
            com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem2 = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) linkedHashMap.get(stringExtra);
            if (tabItem2 != null) {
                tabItem2.f140165q = true;
            }
            com.tencent.mm.plugin.game.model.GameTabData.TabItem tabItem3 = (com.tencent.mm.plugin.game.model.GameTabData.TabItem) gameTabData.f140151d.get(tabItem.f140155d);
            boolean z28 = tabItem3 != null ? tabItem3.f140165q : false;
            bundle.putParcelable("tab_data", gameTabData);
            z27 = z28;
        } else {
            z27 = false;
        }
        if (z19) {
            str = "game_report_from_scene";
        } else {
            str = "game_report_from_scene";
            com.tencent.mm.game.report.l.f(activity, 18, tabItem.f140166r, tabItem.f140167s, 2, null, activity.getIntent().getIntExtra("game_report_from_scene", 0), n53.a.e(tabItem.f140168t));
        }
        if (!tabItem.f140159h) {
            bundle.putString("rawUrl", tabItem.f140157f);
            bundle.putBoolean("KRightBtn", true);
            bundle.putBoolean("isWebwx", true);
            bundle.putBoolean("show_bottom", false);
            bundle.putString(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, activity.getString(com.tencent.mm.R.string.fq7));
            bundle.putBoolean("forceHideShare", true);
            bundle.putBoolean("disable_swipe_back", true);
            bundle.putBoolean("show_native_web_view", true);
            bundle.putBoolean("disable_progress_bar", true);
            bundle.putBoolean("disable_bounce_scroll", true);
            bundle.putInt("screen_orientation", 1);
            bundle.putString("KPublisherId", "game_center_entrance");
            bundle.putInt("geta8key_scene", 32);
            if (gameTabData != null && (statusBar = gameTabData.f140152e) != null) {
                bundle.putString("status_bar_style", statusBar.f140153d);
                bundle.putInt("customize_status_bar_color", gameTabData.f140152e.f140154e);
            }
            bundle.putBoolean("game_check_float", z19);
            java.lang.String string = bundle.getString("rawUrl");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(string)) {
                if (z19) {
                    boolean booleanExtra = intent.getBooleanExtra("from_find_more_friend", false);
                    int intExtra = intent.getIntExtra(str, 0);
                    if (booleanExtra) {
                        com.tencent.mm.plugin.game.model.e1 k17 = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai().k();
                        bundle.putString("rawUrl", com.tencent.mm.plugin.game.model.d0.a(string, k17, null, true));
                        if (k17 != null) {
                            k17.t0();
                            com.tencent.mm.plugin.game.model.h0 h0Var = k17.f140291p2;
                            if (h0Var.f140326d) {
                                bundle.putString("game_transparent_float_url", h0Var.f140323a);
                            }
                            bundle.putInt("game_sourceScene", intExtra);
                        }
                    }
                } else {
                    bundle.remove("game_transparent_float_url");
                    bundle.remove("game_sourceScene");
                }
            }
        }
        intent.putExtras(bundle);
        d(activity, intent, z17, z18, z27, tabItem.f140159h);
    }

    public static void d(android.app.Activity activity, android.content.Intent intent, boolean z17, boolean z18, boolean z19, boolean z27) {
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = intent.getComponent() == null ? "" : intent.getComponent().getClassName();
        objArr[1] = java.lang.Boolean.valueOf(z19);
        objArr[2] = java.lang.Boolean.valueOf(z17);
        objArr[3] = java.lang.Boolean.valueOf(z18);
        objArr[4] = java.lang.Boolean.valueOf(z27);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget", "(%s isActivityExist):%b, hasAnimation:%b, forceFinish:%b, isNative:%b", objArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.GameTabWidget", (z19 || z27) ? "straight to jump" : "jump to bridge");
        if (!z19 && z27) {
            ((h80.k) ((com.tencent.mm.ipcinvoker.wx_extension.j0) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.j0.class))).getClass();
            com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService.f68462e, null, com.tencent.mm.plugin.game.ui.tab.GameTabWidget.a.class, null, null);
        }
        if (z19 || z27) {
            f141771f = 0;
            intent.addFlags(131072);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            android.content.Intent intent2 = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.tab.GameTabBridgeUI.class);
            intent2.putExtras(intent.getExtras());
            intent2.putExtra("next_tab_component", intent.getComponent());
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activity, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/game/ui/tab/GameTabWidget", "turnPage", "(Landroid/app/Activity;Landroid/content/Intent;ZZZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        if (z18 && !activity.isDestroyed() && !activity.isFinishing()) {
            activity.finish();
        }
        if (z17) {
            activity.overridePendingTransition(com.tencent.mm.ui.uc.f211078a, com.tencent.mm.ui.uc.f211079b);
        } else {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477815c9, com.tencent.mm.R.anim.f477815c9);
        }
    }

    public final void b(android.content.Context context) {
        this.f141772d = (android.app.Activity) context;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        setBackgroundResource(com.tencent.mm.R.color.f479188sc);
        setOrientation(0);
    }

    public void setAdapter(p53.c cVar) {
        this.f141773e = cVar;
        cVar.registerDataSetObserver(new p53.l(this));
        cVar.notifyDataSetChanged();
    }

    public GameTabWidget(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public GameTabWidget(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        b(context);
    }
}
