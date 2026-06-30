package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class c0 implements com.tencent.mm.ui.contact.e8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206637a;

    public c0(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206637a = addressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.e8
    public void a(int i17) {
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment = this.f206637a;
        com.tencent.mm.ui.contact.g8 g8Var = addressUIFragment.F;
        if (g8Var == null || addressUIFragment.f206318z == null) {
            return;
        }
        if (i17 <= 0) {
            g8Var.setVisibility(8);
            addressUIFragment.f206318z.c(true);
        } else {
            g8Var.setVisibility(0);
            addressUIFragment.f206318z.c(false);
        }
    }
}
