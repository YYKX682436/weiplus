package yb0;

@j95.b
/* loaded from: classes5.dex */
public class c extends i95.w implements zb0.y {
    public boolean wi(android.content.Context context, java.lang.String str) {
        android.content.pm.PackageInfo packageInfo;
        android.net.Uri parse = android.net.Uri.parse(str);
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW", parse);
        intent.addFlags(268435456);
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.vending", 0);
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ApplicationUtil", "app not installed, packageName = ".concat("com.android.vending"));
            packageInfo = null;
        }
        if (packageInfo != null) {
            intent.setPackage("com.android.vending");
        }
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ApplicationUtil", "installAppWithGP first, ex = %s", e17.getMessage());
            try {
                android.content.Intent intent2 = new android.content.Intent("android.intent.action.VIEW", parse);
                intent2.addFlags(268435456);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(context, "com/tencent/mm/pluginsdk/model/app/ApplicationUtil", "installAppWithGP", "(Landroid/content/Context;Ljava/lang/String;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ApplicationUtil", "installAppWithGP second, ex = %s", e18.getMessage());
                return false;
            }
        }
        return true;
    }
}
