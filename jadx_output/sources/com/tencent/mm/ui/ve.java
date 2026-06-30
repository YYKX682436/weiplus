package com.tencent.mm.ui;

/* loaded from: classes8.dex */
public class ve implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.he f211154d;

    public ve(com.tencent.mm.ui.he heVar) {
        this.f211154d = heVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.he heVar = this.f211154d;
        heVar.f208868i = true;
        com.tencent.mm.sdk.platformtools.u3.l(heVar.f208869m);
        com.tencent.mm.sdk.platformtools.u3.h(heVar.f208869m);
    }
}
