package ya2;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.i1 f460495a = new ya2.i1();

    public com.tencent.mm.ui.widget.dialog.j0 a(android.content.Context context, r45.xa5 xa5Var) {
        boolean wi6;
        kotlin.jvm.internal.o.g(context, "context");
        if (xa5Var == null || com.tencent.mm.sdk.platformtools.t8.K0(xa5Var.getString(9))) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 1, "post_actionsheet_miaojian", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
            return null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(xa5Var.getString(9))) {
            wi6 = false;
        } else {
            ci0.s sVar = (ci0.s) i95.n0.c(ci0.s.class);
            java.lang.String string = xa5Var.getString(9);
            if (string == null) {
                string = "";
            }
            java.lang.String string2 = xa5Var.getString(10);
            if (string2 == null) {
                string2 = "";
            }
            wi6 = ((pc0.k) sVar).wi(context, string, string2);
        }
        if (wi6) {
            i95.m c18 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var2 = (com.tencent.mm.plugin.finder.report.o3) c18;
            java.lang.String string3 = xa5Var.getString(7);
            java.lang.String str = string3 == null ? "" : string3;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var2, 1, "post_actionsheet_miaojian", str, nyVar2 != null ? nyVar2.V6() : null, null, 16, null);
            i95.m c19 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var3 = (com.tencent.mm.plugin.finder.report.o3) c19;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar3 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var3, 0, "miaojian_post_tips", "{\"if_has_set\": 1}", nyVar3 != null ? nyVar3.V6() : null, null, 16, null);
        } else {
            i95.m c27 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c27, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var4 = (com.tencent.mm.plugin.finder.report.o3) c27;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar4 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var4, 1, "post_actionsheet_miaojian", "", nyVar4 != null ? nyVar4.V6() : null, null, 16, null);
            i95.m c28 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
            kotlin.jvm.internal.o.f(c28, "getService(...)");
            com.tencent.mm.plugin.finder.report.o3 o3Var5 = (com.tencent.mm.plugin.finder.report.o3) c28;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar5 = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
            com.tencent.mm.plugin.finder.report.o3.ij(o3Var5, 0, "miaojian_post_tips", "{\"if_has_set\": 0}", nyVar5 != null ? nyVar5.V6() : null, null, 16, null);
        }
        java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(context, xa5Var.getString(4));
        java.lang.String str2 = Zi != null ? Zi : "";
        return db5.e1.A(context, wi6 ? context.getString(com.tencent.mm.R.string.f3a, str2) : context.getString(com.tencent.mm.R.string.f3_, str2), "", context.getString(com.tencent.mm.R.string.f490507x1), context.getString(com.tencent.mm.R.string.f490347sg), new ya2.g1(wi6, context, xa5Var), ya2.h1.f460487d);
    }

    public void b(int i17, java.util.HashMap actionMap, db5.g4 g4Var, android.app.Activity context) {
        java.util.LinkedList list;
        kotlin.jvm.internal.o.g(actionMap, "actionMap");
        kotlin.jvm.internal.o.g(context, "context");
        m92.b I1 = g92.a.I1(g92.b.f269769e, false, 1, null);
        r45.ya5 ya5Var = I1 != null ? (r45.ya5) I1.u0().getCustom(5) : null;
        if (ya5Var != null && (list = ya5Var.getList(0)) != null) {
            int i18 = 0;
            for (java.lang.Object obj : list) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                r45.xa5 xa5Var = (r45.xa5) obj;
                int i27 = i17 + i18;
                actionMap.put(java.lang.Integer.valueOf(i27), xa5Var);
                if (g4Var != null) {
                    g4Var.f(i27, xa5Var.getString(0));
                }
                i18 = i19;
            }
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.o3.ij(o3Var, 0, "post_actionsheet_miaojian", "", nyVar != null ? nyVar.V6() : null, null, 16, null);
    }

    public void c(android.content.Context context, java.lang.String uri, java.lang.String packageName, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(uri, "uri");
        kotlin.jvm.internal.o.g(packageName, "packageName");
        com.tencent.mars.xlog.Log.i("Finder.FinderSdkShareApi", "startPostAction " + packageName + ", " + uri);
        android.content.Intent intent = new android.content.Intent();
        intent.setData(android.net.Uri.parse(uri + "&finderScene=" + i17));
        intent.setPackage(packageName);
        intent.setAction("android.intent.action.VIEW");
        intent.setFlags(268435456);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/api/FinderSdkShareApi", "startPostAction", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/api/FinderSdkShareApi", "startPostAction", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("Finder.FinderSdkShareApi", "startPostAction: error " + e17.getMessage());
        }
    }
}
