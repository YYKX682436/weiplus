package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class i4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f168554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f168555e;

    public i4(com.tencent.mm.plugin.sns.ui.c4 c4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f168555e = c4Var;
        this.f168554d = snsInfo;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$5");
        this.f168555e.g(this.f168554d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$5");
    }
}
