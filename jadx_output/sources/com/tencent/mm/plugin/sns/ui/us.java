package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class us implements kotlin.coroutines.Continuation {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f170595d;

    public us(com.tencent.mm.ui.MMActivity mMActivity) {
        this.f170595d = mMActivity;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$3");
        oz5.m mVar = oz5.m.f350329d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$3");
        return mVar;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$3");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        if (obj instanceof qc0.m1) {
            qc0.m1 m1Var = (qc0.m1) obj;
            if (m1Var.f361411b == -1 && m1Var.f361412c == 0) {
                qc0.l1 a17 = m1Var.a();
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_extra_data", m1Var.f361414e);
                if (a17.a()) {
                    intent.putExtra("key_req_result", new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, a17.f361396b));
                } else {
                    r45.vh4 vh4Var = new r45.vh4();
                    vh4Var.f388235e = true;
                    vh4Var.f388234d = false;
                    java.lang.String str = a17.f361396b;
                    intent.putExtra("key_req_result", new com.tencent.mm.plugin.mmsight.SightCaptureResult(true, str, a17.f361397c, com.tencent.mm.vfs.w6.q(str), by5.x.c(str), (int) (a17.f361398d / 1000), vh4Var));
                }
                this.f170595d.triggerActivityResult(17, m1Var.f361411b, intent);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$3");
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMediaOptResult", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$000", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("resumeWith", "com.tencent.mm.plugin.sns.ui.SnsTimelineUIUtil$3");
    }
}
