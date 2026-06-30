package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class ms implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.sns.ui.x4 f169946a;

    /* renamed from: b, reason: collision with root package name */
    public final int f169947b;

    public ms(com.tencent.mm.plugin.sns.ui.x4 x4Var, int i17) {
        this.f169946a = null;
        this.f169946a = x4Var;
        this.f169947b = i17;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
        if (z17) {
            gm0.j1.i();
            if (gm0.j1.b().m()) {
                com.tencent.mm.plugin.sns.model.l4.Tj().post(new com.tencent.mm.plugin.sns.ui.ls(this));
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContactCallBack", "com.tencent.mm.plugin.sns.ui.SnsTimeLineBaseAdapter$TimelineGetContactCallBack");
    }
}
