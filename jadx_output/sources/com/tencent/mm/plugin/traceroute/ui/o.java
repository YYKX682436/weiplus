package com.tencent.mm.plugin.traceroute.ui;

/* loaded from: classes.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI f175332d;

    public o(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI) {
        this.f175332d = networkDiagnoseReportUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
        intent.addFlags(268435456);
        intent.putExtra("android.intent.extra.EMAIL", new java.lang.String[]{"WeChat_Log@qq.com"});
        java.lang.String str = com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.f175304i;
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI = this.f175332d;
        java.lang.String string = networkDiagnoseReportUI.getString(com.tencent.mm.R.string.i1x);
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.f175304i);
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        if (!m17.a() ? false : m17.f213266a.F(m17.f213267b)) {
            java.lang.String str3 = a17.f213279f;
            int lastIndexOf = str3.lastIndexOf("/");
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                int indexOf = str3.indexOf(".");
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(string);
                sb6.append("_");
                if (indexOf <= 0) {
                    indexOf = str3.length();
                }
                sb6.append(str3.substring(0, indexOf));
                string = sb6.toString();
            }
        }
        intent.putExtra("android.intent.extra.SUBJECT", string);
        intent.putExtra("android.intent.extra.STREAM", com.tencent.mm.sdk.platformtools.i1.b(networkDiagnoseReportUI.getContext(), new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI.f175304i)));
        intent.setType("text/plain");
        com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseReportUI networkDiagnoseReportUI2 = this.f175332d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(networkDiagnoseReportUI2, arrayList2.toArray(), "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        networkDiagnoseReportUI2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(networkDiagnoseReportUI2, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/traceroute/ui/NetworkDiagnoseReportUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
