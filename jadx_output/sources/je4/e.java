package je4;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final je4.e f299318a = new je4.e();

    public final void a(android.app.Activity activity, java.lang.String url) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        kotlin.jvm.internal.o.g(url, "url");
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", android.net.Uri.parse(url));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/sns/util/SnsTextProcessingUtils", "openWebLink", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/plugin/sns/util/SnsTextProcessingUtils", "openWebLink", "(Landroid/app/Activity;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("openWebLink", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }

    public final void b(android.app.Activity activity, java.lang.String text) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performFavorite", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("fillTextEventInfo", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        r45.bq0 bq0Var = new r45.bq0();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.g(2);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        bq0Var.o(jq0Var);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        c4Var.f6319e = text;
        c4Var.f6315a = bq0Var;
        c4Var.f6317c = 1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("fillTextEventInfo", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        c4Var.f6323i = activity;
        c4Var.f6327m = 2;
        doFavoriteEvent.e();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performFavorite", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }

    public final void c(android.app.Activity activity, java.lang.String text) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
        kotlin.jvm.internal.o.g(text, "text");
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
            return;
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(77);
        su4.j2 j2Var = new su4.j2();
        j2Var.f412942e = l17;
        j2Var.f412938a = activity;
        j2Var.f412941d = text;
        j2Var.f412939b = 77;
        j2Var.f412943f = true;
        j2Var.f412945h = true;
        j2Var.f412946i = false;
        j2Var.f412958u = true;
        j2Var.f412953p = false;
        java.util.Map extParams = j2Var.f412944g;
        kotlin.jvm.internal.o.f(extParams, "extParams");
        extParams.put("chatSearch", "1");
        ((com.tencent.mm.plugin.websearch.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("performWebSearch", "com.tencent.mm.plugin.sns.util.SnsTextProcessingUtils");
    }
}
