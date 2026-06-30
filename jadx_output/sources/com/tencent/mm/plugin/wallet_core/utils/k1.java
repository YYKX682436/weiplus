package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class k1 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f180913a;

    public k1(android.view.View view) {
        this.f180913a = view;
    }

    @Override // al5.c2
    public void onStatusChange(boolean z17) {
        android.view.View view = this.f180913a;
        if (view != null) {
            view.setEnabled(z17);
        }
    }
}
