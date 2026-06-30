package com.tencent.mm.plugin.subapp.jdbiz;

/* loaded from: classes8.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog f172121d;

    public i(com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog jDRemindDialog) {
        this.f172121d = jDRemindDialog;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.subapp.jdbiz.JDRemindDialog jDRemindDialog = this.f172121d;
        if (jDRemindDialog.getIntent() == null || jDRemindDialog.getIntent().getExtras() == null) {
            str = "";
            str2 = null;
        } else {
            str2 = jDRemindDialog.getIntent().getExtras().getString("alertjumpurl");
            str = jDRemindDialog.getIntent().getExtras().getString("alert_activityid");
        }
        if (str.equals(com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b) && com.tencent.mm.plugin.subapp.jdbiz.q.Di().bj()) {
            com.tencent.mm.plugin.subapp.jdbiz.q.Di().wi();
            com.tencent.mm.plugin.subapp.jdbiz.q.Di().Ai();
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str2);
            intent.putExtra("useJs", true);
            intent.putExtra("vertical_scroll", true);
            j45.l.j(jDRemindDialog, "webview", ".ui.tools.WebViewUI", intent, null);
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11179, str2, com.tencent.mm.plugin.subapp.jdbiz.q.Di().Zi().f172133b, 5);
        }
        jDRemindDialog.finish();
    }
}
