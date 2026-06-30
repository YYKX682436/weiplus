package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ny implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI f170059d;

    public ny(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI) {
        this.f170059d = videoAdPlayerUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI videoAdPlayerUI = this.f170059d;
        int i18 = videoAdPlayerUI.f167673x;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (i18 != 0) {
            i64.n1 n1Var = i64.n1.DetailInVideo;
            java.lang.String str3 = videoAdPlayerUI.f167671v;
            java.lang.String str4 = videoAdPlayerUI.f167670u;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i19 = videoAdPlayerUI.f167672w;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            int i27 = videoAdPlayerUI.f167673x;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str5 = videoAdPlayerUI.f167674y;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1800", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str6 = videoAdPlayerUI.f167675z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$1900", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str7 = videoAdPlayerUI.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2000", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            long j17 = videoAdPlayerUI.B;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4";
            int i28 = videoAdPlayerUI.C;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2200", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            str = "onClick";
            int i29 = videoAdPlayerUI.D;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2300", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            i64.s1.b(n1Var, str3, str4, i19, i27, str5, str6, str7, j17, i28, i29);
        } else {
            str = "onClick";
            str2 = "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI$4";
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        int i37 = videoAdPlayerUI.L;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (i37 != 0) {
            int i38 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297911c;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            boolean z17 = videoAdPlayerUI.P;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            if (z17 && com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297915g != 0) {
                long j18 = com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.T6(videoAdPlayerUI).f289121i.f297915g;
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                i38 += (int) ((android.os.SystemClock.elapsedRealtime() - j18) / 1000);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("1,1,");
            sb6.append(i38);
            sb6.append(",");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str8 = videoAdPlayerUI.M;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            sb6.append(str8);
            sb6.append(",");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str9 = videoAdPlayerUI.N;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            sb6.append(str9);
            sb6.append(",");
            sb6.append(com.tencent.mm.sdk.platformtools.t8.i1());
            sb6.append(",");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            java.lang.String str10 = videoAdPlayerUI.K;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            sb6.append(str10);
            sb6.append(",");
            sb6.append(com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI.V6(videoAdPlayerUI));
            com.tencent.mm.modelstat.r rVar = new com.tencent.mm.modelstat.r(13228, sb6.toString(), (int) com.tencent.mm.sdk.platformtools.t8.i1());
            gm0.j1.i();
            gm0.j1.n().f273288b.g(rVar);
        }
        videoAdPlayerUI.finish();
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        java.lang.String str11 = videoAdPlayerUI.I;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2400", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        bundle.putString("key_snsad_statextstr", str11);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        java.lang.String str12 = videoAdPlayerUI.f167669t;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2500", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        boolean z19 = videoAdPlayerUI.f167665p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (z19 && !android.text.TextUtils.isEmpty(videoAdPlayerUI.f167670u)) {
            str12 = ca4.z0.b(str12, videoAdPlayerUI.f167670u);
        }
        intent.putExtra("jsapiargs", bundle);
        intent.putExtra("rawUrl", str12);
        intent.putExtra("useJs", true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        boolean z27 = videoAdPlayerUI.f167665p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2600", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
        if (z27) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = videoAdPlayerUI.S;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$2700", "com.tencent.mm.plugin.sns.ui.VideoAdPlayerUI");
            ca4.z0.x0(new com.tencent.mm.modelsns.SnsAdClick(0, 6, snsInfo.field_snsId, 18, 0));
        }
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.plugin.sns.ui.my(this, intent));
        java.lang.String str13 = str;
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/VideoAdPlayerUI$4", "android/view/View$OnClickListener", str13, "(Landroid/view/View;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str13, str2);
    }
}
