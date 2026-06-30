package m45;

/* loaded from: classes5.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(android.content.Context context, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.KillProcessHelperActivity", new java.lang.Throwable("killSelf"), "killAllProcessAndStartDstIntent() called with: context = " + context, new java.lang.Object[0]);
        com.tencent.mm.autogen.events.KillSelfEvent killSelfEvent = new com.tencent.mm.autogen.events.KillSelfEvent();
        killSelfEvent.f54453g.f6358a = 0;
        killSelfEvent.e();
        java.util.List n17 = sh.c.n(context);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = n17.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) ((m3.d) it.next()).f323092a;
            if (num != null) {
                arrayList.add(num);
            }
        }
        if (!arrayList.isEmpty()) {
            mm.g0.f328483a.d(arrayList);
        }
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.process.KillProcessHelperActivity.class);
        intent.addFlags(268435456);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(context, "com/tencent/mm/process/KillProcessHelperActivity$Companion", "killAllProcessAndRestartLauncher", "(Landroid/content/Context;Z)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        if (z17) {
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.f490468vx);
            e4Var.f211780g = 2;
            e4Var.c();
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            activity.overridePendingTransition(0, 0);
        }
    }
}
