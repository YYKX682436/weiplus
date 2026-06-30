package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class te implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MainTabUnreadMgr$2 f209899d;

    public te(com.tencent.mm.ui.MainTabUnreadMgr$2 mainTabUnreadMgr$2) {
        this.f209899d = mainTabUnreadMgr$2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.MainTabUnreadMgr$2 mainTabUnreadMgr$2 = this.f209899d;
        com.tencent.mm.ui.he heVar = mainTabUnreadMgr$2.f196942d;
        heVar.f208868i = true;
        com.tencent.mm.sdk.platformtools.u3.l(heVar.f208869m);
        com.tencent.mm.sdk.platformtools.u3.h(mainTabUnreadMgr$2.f196942d.f208869m);
    }
}
