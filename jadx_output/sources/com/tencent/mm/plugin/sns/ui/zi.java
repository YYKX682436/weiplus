package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class zi implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.SnsHeader f171696d;

    public zi(com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader) {
        this.f171696d = snsHeader;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$8");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsHeader", "needShowChangeAlbumDialog = true");
        com.tencent.mm.plugin.sns.ui.SnsHeader snsHeader = this.f171696d;
        if (com.tencent.mm.plugin.sns.ui.SnsHeader.b(snsHeader) != null) {
            com.tencent.mm.plugin.sns.ui.SnsHeader.c(snsHeader);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.SnsHeader$8");
    }
}
