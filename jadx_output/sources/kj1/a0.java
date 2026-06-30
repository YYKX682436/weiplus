package kj1;

@j95.b(dependencies = {com.tencent.mm.plugin.appbrand.app.r9.class})
/* loaded from: classes9.dex */
public final class a0 extends i95.w implements l81.r0 {
    public void wi(android.content.Context context, java.lang.String url, java.lang.String senderUsername, com.tencent.mm.pluginsdk.ui.span.l1 scene, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(senderUsername, "senderUsername");
        kotlin.jvm.internal.o.g(scene, "scene");
        int i18 = com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI.f89329g;
        if (r26.n0.N(url)) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI.class);
        intent.putExtra("url", url);
        intent.putExtra("senderUsername", senderUsername);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, scene.name());
        intent.putExtra("need_check", true);
        intent.putExtra("chatType", i17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion", "startCheckLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/appbrand/ui/AppBrandCheckWxaShortLinkUI$Companion", "startCheckLink", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/ui/span/WxaShortLinkScene$SCENE;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
