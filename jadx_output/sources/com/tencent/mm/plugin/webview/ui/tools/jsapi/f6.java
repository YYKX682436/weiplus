package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class f6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f185107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185108f;

    public f6(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var, java.lang.String str, nw4.y2 y2Var) {
        this.f185108f = c1Var;
        this.f185106d = str;
        this.f185107e = y2Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + this.f185106d));
        intent.addFlags(268435456);
        boolean z17 = false;
        try {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/webview/ui/tools/jsapi/MsgHandler$6", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10112, "1");
            dialogInterface.dismiss();
            z17 = true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHandler", e17, "", new java.lang.Object[0]);
        }
        nw4.y2 y2Var = this.f185107e;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185108f;
        if (z17) {
            c1Var.i5(y2Var, "makePhoneCall:succ", null);
        } else {
            c1Var.i5(y2Var, "makePhoneCall:fail", null);
        }
    }
}
