package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143368d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        super(0);
        this.f143368d = contactManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143368d;
        java.lang.String str = contactManagerUI.f143324n;
        if (str != null) {
            return new com.tencent.mm.plugin.label.ui.searchContact.f(str, contactManagerUI.f143325o);
        }
        return null;
    }
}
