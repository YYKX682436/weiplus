package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.AtContactWidget f170607d;

    public v0(com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget) {
        this.f170607d = atContactWidget;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.AtContactWidget.f166238p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        final com.tencent.mm.plugin.sns.ui.AtContactWidget atContactWidget = this.f170607d;
        android.view.View view2 = atContactWidget.f166240e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.a5n);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.tencent.mm.plugin.sns.model.j4.b() || com.tencent.mm.plugin.sns.model.j4.c()) {
            com.tencent.mm.sdk.platformtools.o4.L().A("sns_with_together_at_contact_red", 1);
            com.tencent.mm.sdk.platformtools.o4.L().A("sns_with_together_at_contact_red_second_version", 1);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        if (atContactWidget.f166246n == null) {
            atContactWidget.f166246n = new java.util.LinkedList();
        }
        com.tencent.mm.plugin.sns.ui.SnsUploadConfigView snsUploadConfigView = atContactWidget.f166245m;
        if (snsUploadConfigView == null || snsUploadConfigView.getPrivated() <= 0) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            android.content.Intent intent = new android.content.Intent();
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_withta_select_conversation, 0);
            if (com.tencent.mm.plugin.sns.model.j4.a() && Ni == 1) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_withta_show_teach_dialog, false)) {
                    atContactWidget.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else if (com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").getBoolean("SnsMMKVWithTaTeachDialog", true)) {
                    com.tencent.mm.sdk.platformtools.o4.M("SnsMMKV").G("SnsMMKVWithTaTeachDialog", false);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AtContactWiget", "showTeachDialog");
                    com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(atContactWidget.getContext(), 2, 3);
                    z2Var.y(atContactWidget.getResources().getString(com.tencent.mm.R.string.f490454vi));
                    z2Var.F = new v61.a0$$a(z2Var);
                    z2Var.l(new com.tencent.mm.ui.widget.dialog.q3() { // from class: com.tencent.mm.plugin.sns.ui.AtContactWidget$$a
                        @Override // com.tencent.mm.ui.widget.dialog.q3
                        public final void dismiss() {
                            int i18 = com.tencent.mm.plugin.sns.ui.AtContactWidget.f166238p;
                            com.tencent.mm.plugin.sns.ui.AtContactWidget.this.c();
                        }
                    });
                    z2Var.x(1);
                    z2Var.z(atContactWidget.getResources().getColor(com.tencent.mm.R.color.aax));
                    z2Var.i(com.tencent.mm.R.layout.cte);
                    z2Var.t(android.view.LayoutInflater.from(atContactWidget.getContext()).inflate(com.tencent.mm.R.layout.ctf, (android.view.ViewGroup) null));
                    z2Var.C();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                } else {
                    atContactWidget.c();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showTeachDialog", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
                }
            } else {
                intent.putExtra("Contact_Compose", true);
                intent.putExtra("List_Type", 1);
                if (com.tencent.mm.plugin.sns.model.j4.a()) {
                    intent.putExtra("Add_address_titile", atContactWidget.f166239d.getString(com.tencent.mm.R.string.jgi));
                    intent.putExtra("address_ui_sub_title", atContactWidget.f166239d.getString(com.tencent.mm.R.string.jhh));
                    intent.putExtra("footer_tip", atContactWidget.f166239d.getString(com.tencent.mm.R.string.jhf));
                    intent.putExtra("no_result_tip", atContactWidget.f166239d.getString(com.tencent.mm.R.string.j8y));
                } else {
                    intent.putExtra("Add_address_titile", atContactWidget.f166239d.getString(com.tencent.mm.R.string.jhl));
                }
                intent.putExtra("Contact_GroupFilter_Type", "@micromsg.qq.com");
                intent.putExtra("Block_list", c01.z1.r());
                intent.putExtra("Select_Contact", com.tencent.mm.sdk.platformtools.t8.c1(atContactWidget.f166246n, ","));
                intent.putExtra("sns_address_count", 0);
                com.tencent.mm.app.y7 y7Var = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d;
                android.app.Activity activity = atContactWidget.f166239d;
                y7Var.getClass();
                if (activity != null) {
                    intent.setClassName(activity, "com.tencent.mm.ui.contact.SnsAddressUI");
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(6);
                    arrayList3.add(intent);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.k(activity, arrayList3.toArray(), "com/tencent/mm/app/WorkerUICallbackImpl", "startSnsAddressUIForResult", "(Landroid/content/Intent;Landroid/app/Activity;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealAddWithContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        } else {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(atContactWidget.getContext());
            u1Var.u(atContactWidget.f166239d.getString(com.tencent.mm.R.string.jdy));
            u1Var.m(com.tencent.mm.R.string.l_e);
            u1Var.q(false);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addContact", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.AtContactWidget");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/AtContactWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.AtContactWidget$1");
    }
}
