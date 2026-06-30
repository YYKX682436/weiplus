package com.tencent.mm.ui.conversation;

/* loaded from: classes3.dex */
public class g6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q5 f207700d;

    public g6(com.tencent.mm.ui.conversation.q5 q5Var) {
        this.f207700d = q5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207700d;
        q5Var.f208002e.dismiss();
        android.content.Intent intent = new android.content.Intent(q5Var.f208009o, (java.lang.Class<?>) com.tencent.mm.plugin.dbbackup.DBRecoveryUI.class);
        intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 0);
        android.app.Activity activity = q5Var.f208009o;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activity, "com/tencent/mm/ui/conversation/InitHelper$5", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
