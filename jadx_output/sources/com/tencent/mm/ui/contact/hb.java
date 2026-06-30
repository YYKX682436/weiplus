package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class hb implements com.tencent.mm.pluginsdk.ui.a2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsAddressUI f206758d;

    public hb(com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI) {
        this.f206758d = snsAddressUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.a2
    public void M3(int i17, java.lang.String str) {
        if (i17 != 1 || str == null) {
            return;
        }
        com.tencent.mm.ui.contact.SnsAddressUI snsAddressUI = this.f206758d;
        snsAddressUI.C.remove(str);
        snsAddressUI.w7();
    }
}
