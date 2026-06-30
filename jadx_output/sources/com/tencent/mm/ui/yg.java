package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public final class yg implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.zg f212589d;

    public yg(com.tencent.mm.ui.zg zgVar) {
        this.f212589d = zgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.multitalk.model.c3 c3Var = (com.tencent.mm.plugin.multitalk.model.c3) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("value is ");
        sb6.append(c3Var);
        sb6.append(" and ");
        sb6.append(c3Var != null ? java.lang.Long.valueOf(c3Var.f149903c) : null);
        sb6.append(" and ");
        sb6.append(c3Var != null ? c3Var.f149902b : null);
        sb6.append(" and ");
        sb6.append(c3Var != null ? c3Var.f149901a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProfileReadyPluginUI", sb6.toString());
        boolean z17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().z();
        com.tencent.mm.ui.zg zgVar = this.f212589d;
        if (!z17) {
            android.content.Context context = zgVar.f212621a;
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getString(com.tencent.mm.R.string.ibg);
            e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
            zgVar.f212631k = e4Var.c();
            return;
        }
        if (c3Var == null) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = zgVar.f212632l;
            if (u3Var != null) {
                u3Var.dismiss();
                return;
            }
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(c3Var.f149901a, com.tencent.mm.vfs.w6.p(zgVar.f212622b));
        java.lang.String str = zgVar.f212622b;
        android.content.Context context2 = zgVar.f212621a;
        if (!b17) {
            sj3.n3 n3Var = sj3.o3.f408666e;
            java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
            kotlin.jvm.internal.o.f(p17, "getFileMD5String(...)");
            n3Var.b(p17, null);
            zgVar.f212632l = com.tencent.mm.ui.widget.dialog.u3.f(context2, context2.getString(com.tencent.mm.R.string.f490898b73), false, 3, null);
            return;
        }
        if (kotlin.jvm.internal.o.b(c3Var.f149902b, java.lang.Boolean.TRUE) || (java.lang.System.currentTimeMillis() - c3Var.f149903c >= 3000 && c3Var.f149902b == null)) {
            com.tencent.mm.ui.widget.dialog.f4 f4Var = zgVar.f212631k;
            if (f4Var != null) {
                f4Var.cancel();
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = zgVar.f212632l;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            androidx.lifecycle.j0 j0Var = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1;
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            j0Var.removeObservers((com.tencent.mm.ui.MMActivity) context2);
            android.content.Intent intent = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
            intent.setFlags(603979776);
            intent.putExtra(com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH, str);
            intent.putExtra("fileExt", zgVar.f212623c);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markStartProjectDuringProfileUI");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 3L, 1L);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context2, arrayList.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context2, "com/tencent/mm/ui/ScreenProfileReadyPluginUI", "goToScreenCastShow", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!kotlin.jvm.internal.o.b(c3Var.f149902b, java.lang.Boolean.FALSE)) {
            if (java.lang.System.currentTimeMillis() - c3Var.f149903c < 3000) {
                com.tencent.mm.ui.widget.dialog.f4 f4Var2 = zgVar.f212631k;
                if (f4Var2 != null) {
                    f4Var2.cancel();
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var3 = zgVar.f212632l;
                if (u3Var3 != null) {
                    u3Var3.dismiss();
                }
                zgVar.f212632l = com.tencent.mm.ui.widget.dialog.u3.f(context2, context2.getString(com.tencent.mm.R.string.f490898b73), false, 3, null);
                return;
            }
            com.tencent.mm.ui.widget.dialog.f4 f4Var3 = zgVar.f212631k;
            if (f4Var3 != null) {
                f4Var3.cancel();
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var4 = zgVar.f212632l;
            if (u3Var4 != null) {
                u3Var4.dismiss();
                return;
            }
            return;
        }
        com.tencent.mm.ui.widget.dialog.f4 f4Var4 = zgVar.f212631k;
        if (f4Var4 != null) {
            f4Var4.cancel();
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var5 = zgVar.f212632l;
        if (u3Var5 != null) {
            u3Var5.dismiss();
        }
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var2.f211776c = context2.getString(com.tencent.mm.R.string.cf6);
        e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
        zgVar.f212631k = e4Var2.c();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        ((com.tencent.mm.ui.MMActivity) context2).setRequestedOrientation(1);
        androidx.lifecycle.j0 j0Var2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150183x1;
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        j0Var2.removeObservers((com.tencent.mm.ui.MMActivity) context2);
        android.content.Intent intent2 = new android.content.Intent(context2, (java.lang.Class<?>) com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI.class);
        intent2.setFlags(603979776);
        android.content.Context context3 = zgVar.f212621a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent2);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context3, arrayList2.toArray(), "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context3.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context3, "com/tencent/mm/ui/ScreenProfileReadyPluginUI$mSecurityObserver$1", "onChanged", "(Lcom/tencent/mm/plugin/multitalk/model/SecurityParamsData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
