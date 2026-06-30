package com.tencent.mm.ui;

/* loaded from: classes9.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.AppBrandNotifySettingsUI.AnonymousClass1 f209756d;

    public s0(com.tencent.mm.ui.AppBrandNotifySettingsUI.AnonymousClass1 anonymousClass1) {
        this.f209756d = anonymousClass1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.AppBrandNotifySettingsUI.this.f196581e.notifyDataSetChanged();
    }
}
