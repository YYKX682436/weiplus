package f93;

/* loaded from: classes.dex */
public final class q5 {

    /* renamed from: a, reason: collision with root package name */
    public static final f93.q5 f260441a = new f93.q5();

    public final boolean a(android.content.Context context, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.g96);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            c(context, string);
            return false;
        }
        if (com.tencent.mm.ui.tools.v4.d(36, str) > 0) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.f489830cy);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.String format = java.lang.String.format(string2, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(com.tencent.mm.ui.tools.v4.b(18, ""))}, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            c(context, format);
            return false;
        }
        if (!(com.tencent.mm.sdk.platformtools.t8.K0(str) ? false : !com.tencent.mm.sdk.platformtools.t8.K0(b93.r.wi().p1(str)))) {
            return true;
        }
        java.lang.String string3 = context.getString(com.tencent.mm.R.string.f489826cu);
        kotlin.jvm.internal.o.f(string3, "getString(...)");
        c(context, string3);
        return false;
    }

    public final boolean b() {
        return j62.e.g().c(new com.tencent.mm.repairer.config.global.RepairerConfigNewSelectLabel()) == 1;
    }

    public final void c(android.content.Context context, java.lang.String text) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(text, "text");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = text;
        e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
        e4Var.c();
    }

    public final void d(android.app.Activity activity, java.lang.String labelID, java.lang.String labelName) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(labelID, "labelID");
        kotlin.jvm.internal.o.g(labelName, "labelName");
        if (b()) {
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.tencent.mm.ui.mvvm.MvvmContactListUI.class);
            java.util.ArrayList P1 = b93.r.wi().P1(labelID);
            com.tencent.mars.xlog.Log.i("MicroMsg.LabelHelper", "startLabelEditUIV2() called with: activity = " + activity + ", labelID = " + labelID + ", mLabelName = " + labelName + " size:" + (P1 != null ? P1.size() : 0));
            intent.putExtra("key_label_click_source", 2);
            intent.putExtra("list_type", 0);
            com.tencent.mm.ui.contact.i5.e();
            intent.putExtra("list_attr", com.tencent.mm.ui.contact.i5.g(com.tencent.mm.ui.contact.i5.f206784e, 256, 512));
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 7);
            intent.putExtra("menu_mode", 2);
            intent.putExtra("block_contact", com.tencent.mm.sdk.platformtools.t8.J1(com.tencent.mm.ui.contact.i5.c(), ","));
            intent.putExtra("always_select_contact", c01.z1.r());
            intent.putExtra("need_show_multiSelect_bottom", true);
            intent.putExtra("label_id", labelID);
            intent.putExtra("label_name", labelName);
            intent.putExtra("key_confirm_menu_name", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.mbg));
            intent.putExtra("key_confirm_menu_color", 1);
            intent.putExtra("need_show_expand_btn", true);
            intent.putExtra("INTENT_KEY_KEEP_ACTIVITY_WHEN_BACK_PRESSED", true);
            pf5.j0.a(intent, bj5.d1.class);
            pf5.j0.a(intent, j93.x0.class);
            pf5.j0.a(intent, j93.e2.class);
            pf5.j0.a(intent, cj5.d1.class);
            pf5.j0.a(intent, j93.w1.class);
            if (!com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
                intent.putExtra("INTENT_KEY_SEARCH_LABEL_USERNAME_LIST", com.tencent.mm.sdk.platformtools.t8.c1(P1, ","));
            }
            pf5.j0.a(intent, bj5.k0.class);
            pf5.j0.a(intent, cj5.k4.class);
            pf5.j0.a(intent, cj5.s.class);
            pf5.j0.a(intent, cj5.h3.class);
            pf5.j0.a(intent, cj5.n3.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            pf5.j0.a(intent, cj5.c5.class);
            pf5.j0.a(intent, j93.p2.class);
            pf5.j0.a(intent, j93.g0.class);
            pf5.j0.a(intent, cj5.n.class);
            pf5.j0.a(intent, cj5.k.class);
            pf5.j0.a(intent, cj5.a0.class);
            pf5.j0.a(intent, j93.v2.class);
            pf5.j0.a(intent, cj5.n1.class);
            pf5.j0.a(intent, cj5.o.class);
            pf5.j0.a(intent, bj5.c0.class);
            pf5.j0.a(intent, j93.a2.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(9001);
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/LabelHelper", "startLabelEditUIV2", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
    }
}
