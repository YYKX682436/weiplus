package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes11.dex */
public class lr implements lz.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsTagDetailUI f169874a;

    public lr(com.tencent.mm.plugin.sns.ui.SnsTagDetailUI snsTagDetailUI) {
        this.f169874a = snsTagDetailUI;
    }

    @Override // lz.i
    public boolean a(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$4");
        lz.f fVar = this.f169874a.f167445f.M;
        if (fVar != null) {
            ((r35.u1) fVar).f369274f.a(i17);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemLongClick", "com.tencent.mm.plugin.sns.ui.SnsTagDetailUI$4");
        return true;
    }
}
