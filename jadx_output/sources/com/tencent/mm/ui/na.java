package com.tencent.mm.ui;

/* loaded from: classes14.dex */
public class na implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.ga f209409d;

    public na(com.tencent.mm.ui.ga gaVar) {
        this.f209409d = gaVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        androidx.appcompat.app.b bVar = this.f209409d.G;
        if (bVar != null) {
            bVar.L();
        }
    }
}
