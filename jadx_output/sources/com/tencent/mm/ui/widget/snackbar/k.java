package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.SnackContainer f212479d;

    public k(com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer) {
        this.f212479d = snackContainer;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212479d;
        if (snackContainer.getVisibility() == 0) {
            snackContainer.startAnimation(snackContainer.f212460e);
        }
    }
}
