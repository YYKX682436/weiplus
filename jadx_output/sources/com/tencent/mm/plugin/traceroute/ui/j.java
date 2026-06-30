package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI f175327d;

    public j(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI) {
        this.f175327d = networkDiagnoseIntroUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean E = c01.d9.b().E();
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI = this.f175327d;
        if (!E) {
            db5.t7.k(networkDiagnoseIntroUI, null);
            yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (c01.d9.e().n() == 0) {
            dp.a.makeText(networkDiagnoseIntroUI, networkDiagnoseIntroUI.getString(com.tencent.mm.R.string.f490500wu), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        android.content.Intent intent = new android.content.Intent(networkDiagnoseIntroUI, (java.lang.Class<?>) com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI.class);
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseIntroUI networkDiagnoseIntroUI2 = this.f175327d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(networkDiagnoseIntroUI2, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseIntroUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(networkDiagnoseIntroUI2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseIntroUI.finish();
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
