package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.sa f209605d;

    public ra(com.tencent.mm.ui.sa saVar) {
        this.f209605d = saVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.sa saVar = this.f209605d;
        saVar.f209778d.onMenuItemClick(new db5.h4(saVar.f209779e.f208672u, 0, 0));
    }
}
