package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143383d;

    public u(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143383d = contactManagerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f143383d.finish();
    }
}
