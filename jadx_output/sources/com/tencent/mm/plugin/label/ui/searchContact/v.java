package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143384d;

    public v(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        this.f143384d = contactManagerUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143384d;
        com.tencent.mm.plugin.label.ui.searchContact.f T6 = contactManagerUI.T6();
        if (T6 != null) {
            java.lang.String str = contactManagerUI.f143324n;
            kotlin.jvm.internal.o.d(str);
            T6.d(str);
        }
    }
}
