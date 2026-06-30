package dk5;

@j95.b
/* loaded from: classes.dex */
public final class b0 extends i95.w implements n13.b0 {
    public final void Ai(android.content.Context context, android.content.Intent intent) {
        if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ForwardFeatureService", "startActivity with non-Activity context, add FLAG_ACTIVITY_NEW_TASK. context=".concat(context.getClass().getSimpleName()));
            intent.addFlags(268435456);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/transmit/ForwardFeatureService", "startActivityCompat", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/transmit/ForwardFeatureService", "startActivityCompat", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Bi(android.content.Context context, co.a aVar, n13.r forwardActionInfo) {
        ek5.b bVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(forwardActionInfo, "forwardActionInfo");
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardFeatureService", "viewmodel is null, can not forward");
            return;
        }
        java.util.List list = ek5.g.f253690a;
        java.util.Iterator it = ek5.g.f253690a.iterator();
        while (true) {
            if (!it.hasNext()) {
                bVar = null;
                break;
            } else {
                bVar = (ek5.b) it.next();
                if (kotlin.jvm.internal.o.b(aVar.getClass(), bVar.h())) {
                    break;
                }
            }
        }
        if (bVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardFeatureService", "find no config, viewModel class: " + aVar.getClass() + ", please check newForward is open, or config is registered");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardFeatureService", "start forward, viewModel:" + aVar + " config:" + bVar);
        wi(context, aVar, bVar.e(), forwardActionInfo);
    }

    public void a(android.content.Context context, n13.r forwardActionInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(forwardActionInfo, "forwardActionInfo");
        wi(context, null, null, forwardActionInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void wi(android.content.Context context, co.a aVar, java.lang.Class cls, n13.r rVar) {
        android.content.Intent Ui = ((qd0.q0) ((rd0.e1) i95.n0.c(rd0.e1.class))).Ui(context, rVar.f334126j, false, rVar.f334122f);
        if (!rVar.f334123g) {
            Ui.removeExtra("KEY_IS_SUPPORT_FORWARD_TO_YUANBAO");
        }
        if (!rVar.f334124h) {
            Ui.removeExtra("KEY_IS_SUPPORT_FORWARD_TO_CLAWBOT");
        }
        pf5.j0.a(Ui, k50.b0.class);
        pf5.j0.a(Ui, k50.z.class);
        pf5.j0.a(Ui, gk5.m1.class);
        iy1.c cVar = iy1.c.MainUI;
        Ui.putExtra("key_select_contact_report_page_id", 50096);
        if (aVar != null) {
            int i17 = aVar.f43702d;
            Ui.putExtra("Retr_MsgTalker", aVar.getString(i17 + 1));
            Ui.putExtra("Retr_Msg_Id", aVar.getLong(i17 + 0));
            Ui.putExtra("Retr_Msg_Svr_Id", aVar.getLong(i17 + 2));
            Ui.putExtra("msg_forward_sns_obj_id", aVar.getString(i17 + 4));
            Ui.putExtra("msg_forward_exteral", aVar.getBoolean(i17 + 5));
            Ui.putExtra("Retr_Msg_view_model", aVar.toXml());
        }
        if (cls == null) {
            pf5.j0.a(Ui, m50.z.class);
        } else {
            pf5.j0.a(Ui, cls);
        }
        Ui.putExtra("ForwardParams_ForwardByUIC", rVar.f334117a);
        Ui.putExtra("Select_block_List", kz5.n0.g0(rVar.f334125i, ",", null, null, 0, null, null, 62, null));
        Ui.putExtra("ForwardParams_EnableContentClick", rVar.f334121e);
        Ui.putExtra("ForwardParams_ReportFromScene", rVar.f334120d.f334139a);
        Ui.putExtra("ForwardParams_ForwardMsgType", rVar.f334127k);
        Ui.putExtra("KEY_START_TIME", c01.id.c());
        java.util.List list = rVar.f334129m;
        if (list != null) {
            java.lang.String g07 = kz5.n0.g0(list, ",", null, null, 0, null, null, 62, null);
            if (g07.length() > 0) {
                if (kotlin.jvm.internal.o.b(rVar.f334130n, java.lang.Boolean.FALSE)) {
                    Ui.putExtra("always_select_contact", g07);
                }
                Ui.putExtra("KEY_PRE_SELECT_CONTACT_USERNAME_LIST_STRING", g07);
                pf5.j0.a(Ui, cj5.m0.class);
            }
        }
        java.lang.Integer num = rVar.f334131o;
        if (num != null) {
            Ui.putExtra("max_limit_num", num.intValue());
            java.lang.String str = rVar.f334132p;
            if (str != null) {
                Ui.putExtra("too_many_member_tip_string", str);
            }
        }
        n13.c0 c0Var = rVar.f334128l;
        if (c0Var != null) {
            c0Var.a(Ui);
        }
        com.tencent.mm.ui.da daVar = rVar.f334119c;
        int i18 = rVar.f334118b;
        if (i18 == -1) {
            Ai(context, Ui);
        } else if (!(context instanceof android.app.Activity)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ForwardFeatureService", "startActivityForResult, context is not an Activity");
        } else if (daVar == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(Ui);
            java.util.Collections.reverse(arrayList);
            yj0.a.k((android.app.Activity) context, arrayList.toArray(), "com/tencent/mm/ui/transmit/ForwardFeatureService", "startActivityForResult", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else if (context instanceof com.tencent.mm.ui.MMFragmentActivity) {
            ((com.tencent.mm.ui.MMFragmentActivity) context).mmStartActivityForResult(daVar, Ui, i18);
        } else if ((context instanceof q80.z) && (context instanceof com.tencent.mm.plugin.lite.LiteAppCenter.ILiteAppUICallback)) {
            ((q80.z) context).R1(new dk5.a0(daVar));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            arrayList2.add(Ui);
            java.util.Collections.reverse(arrayList2);
            yj0.a.k((android.app.Activity) context, arrayList2.toArray(), "com/tencent/mm/ui/transmit/ForwardFeatureService", "startActivityForResult", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(java.lang.Integer.valueOf(i18));
            arrayList3.add(Ui);
            java.util.Collections.reverse(arrayList3);
            yj0.a.k((android.app.Activity) context, arrayList3.toArray(), "com/tencent/mm/ui/transmit/ForwardFeatureService", "startActivityForResult", "(Landroid/content/Context;Landroid/content/Intent;ILcom/tencent/mm/ui/MMActivity$IMMOnActivityResult;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        }
    }
}
