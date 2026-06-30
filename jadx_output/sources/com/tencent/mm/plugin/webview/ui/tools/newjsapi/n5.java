package com.tencent.mm.plugin.webview.ui.tools.newjsapi;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/n5;", "Lcom/tencent/mm/ipcinvoker/j;", "", "", "", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes.dex */
final class n5 implements com.tencent.mm.ipcinvoker.j {
    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        if (rVar != null) {
            if ((c01.z1.j() & 2097152) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToTabFind", "jumpToTabFind, force open SearchOneSearch!");
                ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).getClass();
                com.tencent.mm.plugin.setting.ui.setting.x3 x3Var = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
                java.lang.Object l17 = gm0.j1.u().c().l(147457, null);
                java.lang.Long l18 = l17 instanceof java.lang.Long ? (java.lang.Long) l17 : null;
                gm0.j1.u().c().w(147457, java.lang.Long.valueOf((l18 != null ? l18.longValue() : 0L) & (-2097153)));
                r45.p53 p53Var = new r45.p53();
                p53Var.f382761d = 50;
                p53Var.f382762e = 1;
                ((e21.z0) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).fj()).c(new xg3.p0(23, p53Var));
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switchChange, switch  " + p53Var.f382761d + ' ' + p53Var.f382762e);
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.sdk.platformtools.u3.i(com.tencent.mm.plugin.webview.ui.tools.newjsapi.p5.f186428d, 300L);
            if (context instanceof com.tencent.mm.ui.MMActivity) {
                ((com.tencent.mm.ui.MMActivity) context).hideVKB();
            }
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(268435456);
            intent.addFlags(67108864);
            intent.putExtra("LauncherUI.switch.tab", "tab_find_friend");
            intent.putExtra("LauncherUI.FindMore.HighLightPreference", "find_friends_by_search");
            intent.setClassName(context, "com.tencent.mm.ui.LauncherUI");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiJumpToTabFind", "jumpToTabFind", "(Ljava/util/Map;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/newjsapi/JsApiJumpToTabFind", "jumpToTabFind", "(Ljava/util/Map;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            rVar.a(new com.tencent.mm.ipcinvoker.type.IPCBoolean(true));
        }
    }
}
