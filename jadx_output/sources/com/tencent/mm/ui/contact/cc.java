package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class cc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.dc f206647d;

    public cc(com.tencent.mm.ui.contact.dc dcVar) {
        this.f206647d = dcVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.dc dcVar = this.f206647d;
        if (dcVar.f206670d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        dcVar.f206670d.moveTaskToBack(true);
    }
}
