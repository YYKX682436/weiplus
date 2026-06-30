package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        super(0);
        this.f143375d = contactManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143375d;
        com.tencent.mm.plugin.label.ui.searchContact.f T6 = contactManagerUI.T6();
        if (T6 != null) {
            return new com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList(T6, new xm3.n0(), contactManagerUI);
        }
        return null;
    }
}
