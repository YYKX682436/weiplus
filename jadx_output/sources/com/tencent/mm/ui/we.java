package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class we implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f211223d;

    public we(com.tencent.mm.ui.he heVar) {
        this.f211223d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.he heVar = this.f211223d;
        heVar.f208868i = true;
        com.tencent.mm.sdk.platformtools.u3.l(heVar.f208869m);
        com.tencent.mm.sdk.platformtools.u3.i(heVar.f208869m, 300L);
    }
}
