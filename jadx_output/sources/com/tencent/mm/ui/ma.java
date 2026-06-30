package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209101d;

    public ma(com.tencent.mm.ui.ga gaVar) {
        this.f209101d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.ga gaVar = this.f209101d;
        gaVar.f208670t.getWindow().setFlags(1024, 1024);
        androidx.appcompat.app.b bVar = gaVar.G;
        if (bVar != null) {
            bVar.o();
        }
    }
}
