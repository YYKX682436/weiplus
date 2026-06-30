package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class qb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.rb f207145d;

    public qb(com.tencent.mm.ui.contact.rb rbVar) {
        this.f207145d = rbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.rb rbVar = this.f207145d;
        if (rbVar.f207161d.getIntent().getBooleanExtra("stay_in_wechat", true)) {
            return;
        }
        rbVar.f207161d.moveTaskToBack(true);
    }
}
