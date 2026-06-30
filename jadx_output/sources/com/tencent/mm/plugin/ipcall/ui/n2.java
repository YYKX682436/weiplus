package com.tencent.mm.plugin.ipcall.ui;

/* loaded from: classes4.dex */
public class n2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ipcall.ui.o2 f142946d;

    public n2(com.tencent.mm.plugin.ipcall.ui.o2 o2Var) {
        this.f142946d = o2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f142946d.f142972d.f142633e) {
            this.f142946d.f142972d.f142633e.onNotifyChange(null, null);
        }
    }
}
