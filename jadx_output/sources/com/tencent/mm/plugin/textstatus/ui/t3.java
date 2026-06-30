package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class t3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f174309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.StatusIndicator f174310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f174311g;

    public t3(android.view.View view, boolean z17, com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator, android.view.View view2) {
        this.f174308d = view;
        this.f174309e = z17;
        this.f174310f = statusIndicator;
        this.f174311g = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f174309e;
        android.view.View view = this.f174311g;
        com.tencent.mm.plugin.textstatus.ui.StatusIndicator statusIndicator = this.f174310f;
        if (z17) {
            int i17 = com.tencent.mm.plugin.textstatus.ui.StatusIndicator.f173471i;
            statusIndicator.d(view);
        } else {
            int i18 = com.tencent.mm.plugin.textstatus.ui.StatusIndicator.f173471i;
            statusIndicator.c(view);
        }
    }
}
