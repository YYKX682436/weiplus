package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class f implements com.tencent.mm.ui.contact.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f206693a;

    public f(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f206693a = addressUIFragment;
    }

    @Override // com.tencent.mm.ui.contact.p3
    public void a(int i17) {
        com.tencent.mm.ui.contact.q3 q3Var = this.f206693a.G;
        if (q3Var == null) {
            return;
        }
        if (i17 <= 0) {
            q3Var.setVisibility(8);
        } else {
            q3Var.setVisibility(0);
        }
    }
}
