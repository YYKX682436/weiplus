package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class be implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI f167910d;

    public be(com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI) {
        this.f167910d = snsAdStreamVideoPlayUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI.K;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI snsAdStreamVideoPlayUI = this.f167910d;
        int i18 = snsAdStreamVideoPlayUI.f166790w;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (i18 != 0) {
            i64.n1 n1Var = i64.n1.DetailInVideo;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str3 = snsAdStreamVideoPlayUI.f166788u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str4 = snsAdStreamVideoPlayUI.f166787t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            int i19 = snsAdStreamVideoPlayUI.f166789v;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            int i27 = snsAdStreamVideoPlayUI.f166790w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str5 = snsAdStreamVideoPlayUI.f166791x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1000", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str6 = snsAdStreamVideoPlayUI.f166792y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1100", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str7 = snsAdStreamVideoPlayUI.f166793z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1200", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            long j17 = snsAdStreamVideoPlayUI.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1300", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7";
            int i28 = snsAdStreamVideoPlayUI.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1400", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            str = "onClick";
            int i29 = snsAdStreamVideoPlayUI.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1500", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            i64.s1.b(n1Var, str3, str4, i19, i27, str5, str6, str7, j17, i28, i29);
        } else {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI$7";
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        java.lang.String str8 = snsAdStreamVideoPlayUI.E;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        bundle.putString("key_snsad_statextstr", str8);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        java.lang.String str9 = snsAdStreamVideoPlayUI.H;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        boolean z17 = snsAdStreamVideoPlayUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (z17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            java.lang.String str10 = snsAdStreamVideoPlayUI.f166787t;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            if (!android.text.TextUtils.isEmpty(str10)) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                java.lang.String str11 = snsAdStreamVideoPlayUI.f166787t;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
                str9 = ca4.z0.b(str9, str11);
            }
        }
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str9);
        intent.putExtra("useJs", true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        boolean z18 = snsAdStreamVideoPlayUI.D;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
        if (z18) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = snsAdStreamVideoPlayUI.I;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.SnsAdStreamVideoPlayUI");
            ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, snsInfo.field_snsId, 18, 0));
        }
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.D(intent, snsAdStreamVideoPlayUI);
        snsAdStreamVideoPlayUI.finish();
        java.lang.String str12 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/SnsAdStreamVideoPlayUI$7", "android/view/View$OnClickListener", str12, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str12, str2);
    }
}
