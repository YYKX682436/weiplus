package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class fa implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f173873d;

    public fa(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f173873d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        int i17;
        int i18;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.textstatus.ui.fa faVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity context = this.f173873d;
        androidx.appcompat.app.AppCompatActivity context2 = context.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context2, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.C++;
        }
        if (context.f173616y1 == 1 || bk4.i.a().J() || bk4.i.a().G()) {
            context.getClass();
            java.lang.String string = context.getString((bk4.i.a().G() || bk4.i.a().J()) ? com.tencent.mm.R.string.itf : com.tencent.mm.R.string.itg);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            context.O7(string);
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (bk4.i.a().z() || bk4.i.a().y()) {
            str = "android/view/View$OnClickListener";
            pj4.h2 h2Var2 = (pj4.h2) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 8, pj4.h2.class);
            if (h2Var2 != null) {
                i17 = (int) h2Var2.F1;
                i18 = (int) h2Var2.G1;
            } else {
                i17 = 0;
                i18 = 0;
            }
            com.tencent.mm.plugin.textstatus.ui.h6 h6Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.C1;
            int i19 = context.B1;
            java.lang.String str4 = context.e7().f354975g.f355218i;
            java.lang.String str5 = context.e7().f354975g.f355214e;
            bi4.d1 d1Var = context.f173613x1;
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivityV2.class);
            intent.putExtra("KEY_DEFAULT_BACKGROUND_ID", i19);
            intent.putExtra("KEY_CUSTOM_TITLE", str4);
            intent.putExtra("KEY_ICON_ID", str5);
            intent.putExtra("KEY_CLK_USER_DEFINE_ICON_COUNT", i17);
            intent.putExtra("KEY_CLK_ADD_ICON_TO_CUSTOM_TITLE_COUNT", i18);
            if (d1Var != null) {
                intent.putExtra("KEY_SET_STATUS_PARAM_FROM_EDIT", d1Var.toByteArray());
                intent.putExtra("KEY_SWITCH_ICON_BREATH_ANIM_PLAY_COUNT", d1Var.K);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(3);
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            java.lang.Object[] array2 = arrayList2.toArray();
            str2 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12";
            str3 = "onClick";
            yj0.a.k(context, array2, "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivityV2$Companion", "startForResultInEdit", "(Landroid/app/Activity;ILjava/lang/String;Ljava/lang/String;IILcom/tencent/mm/plugin/textstatus/api/SetStatusParam;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            faVar = this;
        } else {
            com.tencent.mm.plugin.textstatus.ui.t5 t5Var = com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.C;
            int i27 = context.B1;
            java.lang.String str6 = context.e7().f354975g.f355218i;
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusDoWhatActivity.class);
            intent2.putExtra("KEY_DEFAULT_BACKGROUND_ID", i27);
            intent2.putExtra("KEY_CUSTOM_TITLE", str6);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(3);
            arrayList3.add(intent2);
            java.util.Collections.reverse(arrayList3);
            str = "android/view/View$OnClickListener";
            yj0.a.k(context, arrayList3.toArray(), "com/tencent/mm/plugin/textstatus/ui/TextStatusDoWhatActivity$Companion", "startForResultInEdit", "(Landroid/app/Activity;ILjava/lang/String;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            context.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
            faVar = this;
            str2 = "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$12";
            str3 = "onClick";
        }
        yj0.a.h(faVar, str2, str, str3, "(Landroid/view/View;)V");
    }
}
