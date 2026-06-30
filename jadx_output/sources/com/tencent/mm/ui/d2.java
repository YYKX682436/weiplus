package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public class d2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f208323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ClearCacheUI f208324e;

    public d2(com.tencent.mm.ui.ClearCacheUI clearCacheUI, long j17) {
        this.f208324e = clearCacheUI;
        this.f208323d = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        int i18 = com.tencent.mm.ui.ClearCacheUI.f196631e;
        com.tencent.mm.ui.ClearCacheUI clearCacheUI = this.f208324e;
        clearCacheUI.getClass();
        s75.d.b(new com.tencent.mm.ui.g2(clearCacheUI, this.f208323d), "CleanCacheUIThread");
        clearCacheUI.finish();
    }
}
