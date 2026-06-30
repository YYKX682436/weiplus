package jq5;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f301258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(0);
        this.f301258d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f301258d;
        kotlin.jvm.internal.o.g(context, "context");
        try {
            android.content.Intent intent = new android.content.Intent("android.settings.WIFI_SETTINGS");
            intent.setFlags(268435456);
            if (intent.resolveActivity(context.getPackageManager()) != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                context.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpSystemWifiPage] success with ACTION_WIFI_SETTINGS");
            } else {
                android.content.Intent intent2 = new android.content.Intent("android.settings.WIRELESS_SETTINGS");
                intent2.setFlags(268435456);
                if (intent2.resolveActivity(context.getPackageManager()) != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpSystemWifiPage] success with ACTION_WIRELESS_SETTINGS");
                } else {
                    android.content.Intent intent3 = new android.content.Intent("android.settings.SETTINGS");
                    intent3.setFlags(268435456);
                    if (intent3.resolveActivity(context.getPackageManager()) != null) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        arrayList3.add(intent3);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        context.startActivity((android.content.Intent) arrayList3.get(0));
                        yj0.a.f(context, "com/tencent/mm/wedrop/utils/WeDropPermissionManager$Companion", "jumpSystemWifiPage", "(Landroid/content/Context;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpSystemWifiPage] success with ACTION_SETTINGS");
                    } else {
                        com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpSystemWifiPage] all intents failed to resolve");
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WeDrop.WeDropPermissionManager", "[jumpSystemWifiPage] error: " + e17);
        }
        return jz5.f0.f302826a;
    }
}
