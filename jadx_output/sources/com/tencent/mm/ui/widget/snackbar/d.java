package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.e f212465d;

    public d(com.tencent.mm.ui.widget.snackbar.e eVar) {
        this.f212465d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212465d.f212466d.f212472a;
        java.lang.Runnable runnable = snackContainer.f212461f;
        snackContainer.removeCallbacks(runnable);
        ((com.tencent.mm.ui.widget.snackbar.k) runnable).run();
    }
}
