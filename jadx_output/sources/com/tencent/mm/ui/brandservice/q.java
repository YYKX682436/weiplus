package com.tencent.mm.ui.brandservice;

/* loaded from: classes4.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f198062d;

    public q(android.view.View view) {
        this.f198062d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.material.bottomsheet.BottomSheetBehavior A = com.google.android.material.bottomsheet.BottomSheetBehavior.A(this.f198062d);
        A.f44444q = true;
        A.D(3);
    }
}
