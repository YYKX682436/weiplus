package sw;

/* loaded from: classes.dex */
public abstract class a {
    public static final void a(android.content.Context context, yz5.l lVar) {
        kotlin.jvm.internal.o.g(context, "context");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.ui.container.MMCommonActivity.class);
        pf5.j0.a(intent, tw.i.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (lVar != null) {
            lVar.invoke(intent);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/feature/brandecs/ui/BrandEcsNotifySettingLauncher", "start", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/feature/brandecs/ui/BrandEcsNotifySettingLauncher", "start", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
