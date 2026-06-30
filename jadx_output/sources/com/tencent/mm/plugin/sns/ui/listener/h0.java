package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f169791d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.g9 f169792e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169793f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.TimeLineObject f169794g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f169795h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i0 f169796i;

    public h0(com.tencent.mm.plugin.sns.ui.listener.i0 i0Var, r45.jj4 jj4Var, com.tencent.mm.plugin.sns.ui.g9 g9Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo, com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject, boolean z17) {
        this.f169796i = i0Var;
        this.f169791d = jj4Var;
        this.f169792e = g9Var;
        this.f169793f = snsInfo;
        this.f169794g = timeLineObject;
        this.f169795h = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.g9 g9Var;
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$30$1");
        if (com.tencent.mm.plugin.sns.model.l4.hj().E(this.f169791d) && (videoSightView = (g9Var = this.f169792e).f168415e) != null) {
            videoSightView.d(null, false, 0);
            com.tencent.mm.plugin.sns.model.i1 hj6 = com.tencent.mm.plugin.sns.model.l4.hj();
            com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f169793f;
            r45.jj4 jj4Var = this.f169791d;
            com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView2 = g9Var.f168415e;
            com.tencent.mm.plugin.sns.ui.listener.i0 i0Var = this.f169796i;
            int hashCode = com.tencent.mm.plugin.sns.ui.listener.i.e(i0Var.f169825d).hashCode();
            int i17 = g9Var.f168413c;
            com.tencent.mm.storage.s7 c17 = com.tencent.mm.storage.s7.c();
            c17.f195313b = this.f169794g.CreateTime;
            hj6.j0(snsInfo, jj4Var, videoSightView2, -1, hashCode, i17, c17, this.f169795h);
            g9Var.f168415e.start();
            g9Var.f168419i.setVisibility(0);
            g9Var.f168420j.setVisibility(8);
            g9Var.f168419i.setImageDrawable(i65.a.i(com.tencent.mm.plugin.sns.ui.listener.i.e(i0Var.f169825d), com.tencent.mm.R.raw.shortvideo_play_btn));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$30$1");
    }
}
