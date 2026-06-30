package ht;

@j95.b
/* loaded from: classes8.dex */
public class a extends i95.w implements jt.v {
    public boolean Ai(long j17, java.lang.String str, boolean z17, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i17, r45.w60 w60Var) {
        java.util.List list = com.tencent.mm.pluginsdk.ui.tools.f.f191612a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str2 == null ? "" : str2));
        com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "startAppChooserWhenOnCreate path:%s, isExisted:%b, size:%d fileExt: %s", str2, java.lang.Boolean.valueOf(r6Var.m()), java.lang.Long.valueOf(r6Var.C()), str3);
        if (r6Var.m()) {
            java.lang.String e17 = com.tencent.mm.pluginsdk.ui.tools.f.e(str3);
            if (((java.util.ArrayList) com.tencent.mm.pluginsdk.ui.tools.f.f191612a).contains(str2) || !com.tencent.mm.pluginsdk.model.t3.k(str3, e17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "startAppChooserWhenOnCreate open file fileExt can not open");
            } else {
                if (i17 != 7) {
                    com.tencent.mm.pluginsdk.ui.tools.f.g(context, j17, str, z17, str2, str3, str4, "", i17, e17, w60Var);
                    return false;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppChooserIntentUtil", "startAppChooserWhenOnCreate SCENE_APPBRAND_CHOOSE_FILE");
            }
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppChooserIntentUtil", "Cannot open file not existed!");
        }
        return true;
    }

    public boolean Bi(java.lang.String str, java.lang.String str2, int i17) {
        return com.tencent.mm.pluginsdk.ui.tools.f.j(0L, "", str, str2, "", i17, null);
    }

    public boolean Di(android.app.Activity activity, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.pluginsdk.ui.tools.f.l(activity, str, str2, str3, i17, 0);
        return true;
    }

    public boolean Ni(android.content.Context context, android.content.Intent intent) {
        java.util.List list = com.tencent.mm.pluginsdk.ui.tools.f.f191612a;
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startDefaultPkgSafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/ui/tools/AppChooserIntentUtil", "startDefaultPkgSafely", "(Landroid/content/Context;Landroid/content/Intent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (android.content.ActivityNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppChooserIntentUtil", e17, "", new java.lang.Object[0]);
            return false;
        }
    }

    public void wi(android.app.Activity activity, java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.pluginsdk.ui.tools.f.i(activity, 0L, "", str, str2, "", i17);
    }
}
