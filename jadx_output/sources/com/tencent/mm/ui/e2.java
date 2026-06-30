package com.tencent.mm.ui;

/* loaded from: classes12.dex */
public class e2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ClearCacheUI f208360d;

    public e2(com.tencent.mm.ui.ClearCacheUI clearCacheUI) {
        this.f208360d = clearCacheUI;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        this.f208360d.finish();
    }
}
