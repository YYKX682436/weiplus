package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes4.dex */
public class g0 implements w64.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f169782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w64.x f169783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169784c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.listener.i f169785d;

    public g0(com.tencent.mm.plugin.sns.ui.listener.i iVar, java.lang.Object obj, w64.x xVar, android.view.View view) {
        this.f169785d = iVar;
        this.f169782a = obj;
        this.f169783b = xVar;
        this.f169784c = view;
    }

    @Override // w64.l
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        java.lang.Object obj = this.f169782a;
        boolean z17 = obj instanceof com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
        w64.x xVar = this.f169783b;
        com.tencent.mm.plugin.sns.ui.listener.i iVar = this.f169785d;
        if (z17) {
            iVar.P((com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder) obj, xVar);
        } else if (obj instanceof dc4.v) {
            iVar.L((dc4.v) obj, xVar);
        } else if (xVar != null) {
            if (com.tencent.mm.plugin.sns.ui.listener.i.n(iVar) == 0) {
                iVar.P(null, xVar);
            } else {
                iVar.L(null, xVar);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPrepareOpenCanvasAnim", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
    }

    @Override // w64.l
    public android.view.View b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onGetAnimContentView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$2");
        return this.f169784c;
    }
}
