package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ho {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.activity.ComponentActivity f168523a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.SnsUIAction f168524b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.lo f168525c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f168526d = null;

    public ho(androidx.activity.ComponentActivity componentActivity, com.tencent.mm.plugin.sns.ui.SnsUIAction snsUIAction) {
        this.f168523a = componentActivity;
        this.f168524b = snsUIAction;
    }

    public static /* synthetic */ androidx.activity.ComponentActivity a(com.tencent.mm.plugin.sns.ui.ho hoVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        androidx.activity.ComponentActivity componentActivity = hoVar.f168523a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        return componentActivity;
    }

    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        if (iq.b.v(c())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return;
        }
        if (iq.b.e(c())) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        androidx.activity.ComponentActivity c17 = c();
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a(c17, "android.permission.CAMERA", 18, "", "");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        c();
        if (!a17) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return;
        }
        com.tencent.mm.plugin.mmsight.SightParams sightParams = new com.tencent.mm.plugin.mmsight.SightParams(2, 0);
        java.lang.String k17 = ai3.d.k(t21.o2.Bi().Ai());
        java.lang.String m17 = ai3.d.m(k17);
        com.tencent.mm.plugin.sns.statistics.h hVar = com.tencent.mm.plugin.sns.statistics.h.f164856a;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = sightParams.f148819f;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider b17 = hVar.b(k17, m17, videoTransPara, videoTransPara.f71195h * 1000, 49);
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_sns_ignore_remux_without_edit, false)) {
            b17.f155669d = 2;
        }
        com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo videoCaptureReportInfo = new com.tencent.mm.plugin.recordvideo.jumper.VideoCaptureReportInfo();
        videoCaptureReportInfo.f155690d = 2;
        b17.I = videoCaptureReportInfo;
        ((pc0.e2) ((qc0.c1) i95.n0.c(qc0.c1.class))).wi(c(), b17, new com.tencent.mm.plugin.sns.ui.ko(this));
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("doCaptureMMSight", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
    }

    public final androidx.activity.ComponentActivity c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        return this.f168523a;
    }

    public void d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
        com.tencent.mm.plugin.sns.model.l4.Dj().y0(false);
        com.tencent.mm.plugin.sns.storage.b2 D0 = com.tencent.mm.plugin.sns.model.l4.Dj().D0("draft_normal");
        xa4.b bVar = xa4.b.f452821a;
        bVar.c(false, "view_clk", 2);
        androidx.activity.ComponentActivity componentActivity = this.f168523a;
        if (D0 != null) {
            byte[] bArr = D0.field_draft;
            if (!com.tencent.mm.sdk.platformtools.t8.M0(bArr)) {
                gm0.j1.i();
                java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING, "");
                com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct snsEditDraftStruct = new com.tencent.mm.autogen.mmdata.rpt.SnsEditDraftStruct();
                snsEditDraftStruct.f60539e = snsEditDraftStruct.i();
                snsEditDraftStruct.f60538d = snsEditDraftStruct.b("SessionId", str, true);
                snsEditDraftStruct.k();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                    intent.addFlags(268435456);
                    intent.setClass(componentActivity, com.tencent.mm.plugin.sns.ui.SnsUploadUI.class);
                    intent.putExtra("KSessionID", str);
                    intent.putExtra("Kis_from_sns_drafg_stg", true);
                    if (intent.getBooleanExtra("is_spring", false) && xa4.g.v()) {
                        xa4.h[] hVarArr = xa4.h.f452837d;
                        xa4.g.d(componentActivity, intent, intent.getIntExtra("spring_feed_type", 0));
                    }
                    androidx.activity.ComponentActivity componentActivity2 = this.f168523a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(componentActivity2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/SnsProfilePublishManager", "selectImageOrVideo", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    componentActivity2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(componentActivity2, "com/tencent/mm/plugin/sns/ui/SnsProfilePublishManager", "selectImageOrVideo", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
                    return;
                } catch (java.lang.Exception unused) {
                    com.tencent.mm.plugin.sns.model.l4.Dj().J0("draft_normal", null, 0);
                    gm0.j1.i();
                    gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SNS_OPEN_UPLOAD_DRAFT_LAST_SESSIONID_STRING, "");
                }
            }
        }
        if (com.tencent.mm.plugin.sns.ui.ws.a()) {
            long c17 = c01.id.c();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13822, 2, 2, ca4.z0.l(), java.lang.Long.valueOf(c17));
            this.f168524b.o(1, 3);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) componentActivity, 1, false);
        this.f168526d = k0Var;
        k0Var.f211872n = new com.tencent.mm.plugin.sns.ui.io(this);
        k0Var.f211881s = new com.tencent.mm.plugin.sns.ui.jo(this);
        k0Var.C = new com.tencent.mm.plugin.sns.ui.ho$$a();
        bVar.b(false, 2);
        this.f168526d.v();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectImageOrVideo", "com.tencent.mm.plugin.sns.ui.SnsProfilePublishManager");
    }
}
