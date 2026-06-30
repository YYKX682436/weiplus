package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class x implements db5.b6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.AddressUI.AddressUIFragment f207241a;

    public x(com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment) {
        this.f207241a = addressUIFragment;
    }

    @Override // db5.b6
    public int a(android.view.View view) {
        com.tencent.mm.ui.contact.AddressUI.AddressUIFragment addressUIFragment;
        android.view.View view2 = view;
        while (true) {
            try {
                android.view.View view3 = (android.view.View) view2.getParent();
                addressUIFragment = this.f207241a;
                if (view3 == null || view3.equals(addressUIFragment.f206307o)) {
                    break;
                }
                view2 = view3;
            } catch (java.lang.ClassCastException unused) {
                return -1;
            }
        }
        if (view2.getParent() == null) {
            return -1;
        }
        return addressUIFragment.f206307o.getPositionForView(view);
    }
}
