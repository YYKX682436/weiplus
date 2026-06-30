package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class b0 implements com.tencent.mm.ui.contact.f8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206615a;

    public b0(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206615a = addressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.f8
    public void a(boolean z17) {
        com.tencent.mm.ui.contact.BizContactEntranceView bizContactEntranceView = this.f206615a.f206318z;
        if (bizContactEntranceView == null) {
            return;
        }
        bizContactEntranceView.c(!z17);
    }
}
