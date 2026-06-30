package com.tencent.mm.plugin.remittance.ui;

/* loaded from: classes3.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f157639d;

    public b(android.view.View view) {
        this.f157639d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f157639d;
        boolean performLongClick = view.performLongClick();
        while (!performLongClick) {
            view = (android.view.View) view.getParent();
            if (view == null) {
                return;
            } else {
                performLongClick = view.performLongClick();
            }
        }
    }
}
