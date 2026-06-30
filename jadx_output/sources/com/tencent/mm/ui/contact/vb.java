package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class vb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.wb f207222d;

    public vb(com.tencent.mm.ui.contact.wb wbVar) {
        this.f207222d = wbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.wb wbVar = this.f207222d;
        if (wbVar.f207240d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        wbVar.f207240d.moveTaskToBack(true);
    }
}
