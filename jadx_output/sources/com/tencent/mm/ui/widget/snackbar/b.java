package com.tencent.mm.ui.widget.snackbar;

/* loaded from: classes10.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.snackbar.c f212463d;

    public b(com.tencent.mm.ui.widget.snackbar.c cVar) {
        this.f212463d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.widget.snackbar.SnackContainer snackContainer = this.f212463d.f212464d.f212472a;
        java.lang.Runnable runnable = snackContainer.f212461f;
        snackContainer.removeCallbacks(runnable);
        ((com.tencent.mm.ui.widget.snackbar.k) runnable).run();
    }
}
