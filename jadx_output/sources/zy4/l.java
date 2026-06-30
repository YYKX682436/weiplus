package zy4;

/* loaded from: classes15.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.welab.ui.WelabMainUI f477683d;

    public l(com.tencent.mm.plugin.welab.ui.WelabMainUI welabMainUI) {
        this.f477683d = welabMainUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag instanceof yy4.a) {
            yy4.a aVar = (yy4.a) tag;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("para_appid", aVar.field_LabsAppId);
            az4.h hVar = az4.h.f16179c;
            intent.putExtra("para_from_with_red_point", hVar.a(aVar) ? 1 : 0);
            intent.setClass(this.f477683d, com.tencent.mm.plugin.welab.ui.WelabAppInfoUI.class);
            com.tencent.mm.plugin.welab.ui.WelabMainUI welabMainUI = this.f477683d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(welabMainUI, arrayList2.toArray(), "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            welabMainUI.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(welabMainUI, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            java.lang.String str = aVar.field_LabsAppId;
            ((java.util.HashMap) hVar.f16180a).put(str, 1);
            hVar.f16181b += "&" + str + "=1";
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WELAB_REDPOINT_STRING, hVar.f16181b);
            hVar.c();
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) com.tencent.mm.plugin.welab.ui.WelabMainUI.f188099q).get(aVar.field_LabsAppId);
            if (!android.text.TextUtils.isEmpty(str2)) {
                rn3.i.Di().a(com.tencent.mm.plugin.newtips.model.i.c(str2));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WelabMainUI", "click " + aVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/welab/ui/WelabMainUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
