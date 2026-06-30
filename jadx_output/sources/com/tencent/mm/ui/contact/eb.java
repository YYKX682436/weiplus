package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class eb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.fb f206692d;

    public eb(com.tencent.mm.ui.contact.fb fbVar) {
        this.f206692d = fbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.fb fbVar = this.f206692d;
        if (fbVar.f206710d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        fbVar.f206710d.moveTaskToBack(true);
    }
}
