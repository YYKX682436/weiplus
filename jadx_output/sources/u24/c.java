package u24;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final u24.c f424118a = new u24.c();

    public final void a(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsSwitchAccountUI.class);
        intent.putExtra("key_scene", 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/util/AccountUtil", "jumpToSwitchAccount", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/setting/ui/setting_new/util/AccountUtil", "jumpToSwitchAccount", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
