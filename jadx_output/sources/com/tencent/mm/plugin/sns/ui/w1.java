package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class w1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f170729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f170730e;

    public w1(com.tencent.mm.plugin.sns.ui.v1 v1Var, java.util.List list, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f170729d = list;
        this.f170730e = snsInfo;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
        if (this.f170729d.contains(2)) {
            com.tencent.mars.xlog.Log.i("MiscroMsg.CommentDetailMenuManager", "[dismiss] didShow edit sns group");
            com.tencent.mm.plugin.sns.statistics.s0.f164937k0.G(2, false, ca4.z0.T(this.f170730e));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDismiss", "com.tencent.mm.plugin.sns.ui.CommentDetailMenuManager$1");
    }
}
