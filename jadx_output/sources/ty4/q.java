package ty4;

@j95.b
/* loaded from: classes11.dex */
public class q extends i95.w implements uy4.x {
    public boolean Ai() {
        az4.h.f16179c.getClass();
        if (com.tencent.mm.sdk.platformtools.x2.d().getBoolean("key_has_enter_welab", false)) {
            return false;
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().b(266267, 266241);
    }

    public void Bi(android.content.Context context, android.content.Intent intent) {
        intent.setClass(context, com.tencent.mm.plugin.welab.ui.WelabMainUI.class);
        intent.putExtra("para_from_with_red_point", (wi() || Ai()) ? 1 : 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/welab/api/LabUIExporter", "startWelabUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/welab/api/LabUIExporter", "startWelabUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public boolean wi() {
        az4.h.f16179c.getClass();
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        return bk0.a.g().b(266267, 266241) && !Ai();
    }
}
