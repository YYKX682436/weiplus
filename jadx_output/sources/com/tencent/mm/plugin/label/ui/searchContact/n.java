package com.tencent.mm.plugin.label.ui.searchContact;

/* loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI f143376d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI) {
        super(0);
        this.f143376d = contactManagerUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI contactManagerUI = this.f143376d;
        com.tencent.mm.plugin.label.ui.searchContact.ContactDataItemList U6 = contactManagerUI.U6();
        if (U6 == null) {
            return null;
        }
        xm3.t0 t0Var = new xm3.t0(U6, new in5.s() { // from class: com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI$buildItemConvertFactory$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new com.tencent.mm.plugin.label.ui.searchContact.e(com.tencent.mm.plugin.label.ui.searchContact.ContactManagerUI.this.U6());
            }
        }, false);
        t0Var.setHasStableIds(true);
        return t0Var;
    }
}
