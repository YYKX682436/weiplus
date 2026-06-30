package va4;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final va4.b f434401a = new va4.b();

    public final boolean a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        boolean z17 = false;
        if (!gm0.j1.a()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return false;
        }
        int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_SNS_FLUTTER_SELF_PAGE_INT_SYNC, 0);
        if (r17 == 1) {
            z17 = true;
        } else if (r17 != 2) {
            z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_sns_flutter_self_page, false);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("enableFlutterSNSPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        return z17;
    }

    public final void b(android.content.Context context, xc4.p pVar, boolean z17, boolean z18) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsRouter", "jumpToFoldPage v3:" + z17);
        if (pVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null info");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        if (pVar.j1() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null wsGroupStruct");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        if (pVar.i1() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with null wsFoldDetail");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        r45.qb6 j17 = pVar.j1();
        if (j17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        com.tencent.mm.plugin.sns.storage.s2 i17 = pVar.i1();
        if (i17 == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        java.util.LinkedList<java.lang.Long> snsIds = j17.f383810d;
        if (snsIds.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SnsRouter", "jumpToFoldPage fail with empty snsIds");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
            return;
        }
        kotlin.jvm.internal.o.f(snsIds, "snsIds");
        for (java.lang.Long l17 : snsIds) {
            yc4.b0 b0Var = yc4.b0.f460839a;
            kotlin.jvm.internal.o.d(l17);
            b0Var.d(ca4.z0.t0(l17.longValue()));
        }
        android.content.Intent intent = new android.content.Intent();
        if (z17) {
            intent.setClass(context, com.tencent.mm.plugin.sns.ui.wsfold.SnsWsFoldDetailUIV3.class);
            intent.putExtra("key_ws_include_feed_id", z18);
            intent.putExtra("key_ws_feed_id", pVar.y0());
            intent.putExtra("key_ws_detail_username", pVar.h1().UserName);
            java.util.ArrayList arrayList = new java.util.ArrayList(snsIds);
            pm0.v.b0(arrayList, new va4.a(pVar));
            intent.putExtra("key_ws_feed_count", arrayList.size());
        } else {
            intent.setClass(context, com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI.class);
            intent.putExtra("key_ws_group_id", i17.field_groupId);
            java.lang.Object obj = snsIds.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            intent.putExtra("key_ws_detail_max_id", ((java.lang.Number) obj).longValue());
            java.lang.Object obj2 = snsIds.get(snsIds.size() - 1);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            intent.putExtra("key_ws_detail_min_id", ((java.lang.Number) obj2).longValue());
            intent.putExtra("key_ws_detail_username", pVar.h1().UserName);
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.Iterator it = snsIds.iterator();
        while (it.hasNext()) {
            java.lang.Long l18 = (java.lang.Long) it.next();
            kotlin.jvm.internal.o.d(l18);
            arrayList2.add(ca4.z0.s0(l18.longValue()));
        }
        intent.putStringArrayListExtra("key_ws_str_sns_id_list", arrayList2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToFoldPage", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToFoldPage", "(Landroid/content/Context;Lcom/tencent/mm/plugin/sns/ui/improve/model/ImproveSnsInfo;ZZ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.tencent.mm.plugin.sns.statistics.s0 s0Var = com.tencent.mm.plugin.sns.statistics.s0.f164937k0;
        s0Var.i(snsIds, i17.field_groupId, pVar.h1().UserName);
        s0Var.V(i17.field_groupId, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToFoldPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }

    public final void c(android.content.Context context, java.lang.String username, int i17, java.lang.String str, java.lang.String source) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToUserPage$default", "com.tencent.mm.plugin.sns.router.SnsRouter");
        d(context, username, i17, str, source, null);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUserPage$default", "com.tencent.mm.plugin.sns.router.SnsRouter");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }

    public final void d(android.content.Context context, java.lang.String username, int i17, java.lang.String str, java.lang.String source, java.lang.String str2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(source, "source");
        if (a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsRouter", "jumpToUserPage use flutter");
            java.lang.String str3 = str2 == null ? ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true).V : str2;
            kotlin.jvm.internal.o.d(str3);
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new oi0.d(username, str3, source, context, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsRouter", "jumpToUserPage use native");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.sns.ui.SnsUserUI.class);
            intent.putExtra("sns_userName", username);
            intent.putExtra("sns_rpt_scene", i17);
            if (str != null) {
                intent.putExtra("INTENT_ALBUM_COMMENT_SESSION_ID", str);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToUserPage", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/sns/router/SnsRouter", "jumpToUserPage", "(Landroid/content/Context;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("jumpToUserPage", "com.tencent.mm.plugin.sns.router.SnsRouter");
    }
}
