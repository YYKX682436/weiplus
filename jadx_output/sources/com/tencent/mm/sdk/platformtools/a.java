package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.accessibility.AccessibilityManager f192437d;

    public a(android.view.accessibility.AccessibilityManager accessibilityManager) {
        this.f192437d = accessibilityManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.b.a(this.f192437d);
    }
}
