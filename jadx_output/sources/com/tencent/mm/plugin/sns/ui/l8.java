package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes.dex */
public class l8 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI f169732d;

    public l8(com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI settingSnsBackgroundUI) {
        this.f169732d = settingSnsBackgroundUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$5");
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.appcompat.app.AppCompatActivity context = this.f169732d.getContext();
        ((sb0.f) jVar).getClass();
        j35.u.g(context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SettingSnsBackgroundUI$5");
    }
}
