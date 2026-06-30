package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ma implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f207027d;

    public ma(com.tencent.mm.ui.contact.SelectContactUI selectContactUI, com.tencent.mm.ui.contact.SelectContactUI.AnonymousClass1 anonymousClass1) {
        this.f207027d = new java.lang.ref.WeakReference(selectContactUI);
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.SelectContactUI selectContactUI = (com.tencent.mm.ui.contact.SelectContactUI) this.f207027d.get();
        if (selectContactUI == null) {
            return;
        }
        selectContactUI.moveTaskToBack(true);
    }
}
