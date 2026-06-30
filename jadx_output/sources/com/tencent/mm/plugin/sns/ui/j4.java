package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class j4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.SnsInfo f169479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.c4 f169480e;

    public j4(com.tencent.mm.plugin.sns.ui.c4 c4Var, com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo) {
        this.f169480e = c4Var;
        this.f169479d = snsInfo;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$6");
        this.f169480e.g(this.f169479d);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.ui.GalleryTitleManager$6");
    }
}
