package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class i2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f206776d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.j2 f206777e;

    public i2(com.tencent.mm.ui.contact.j2 j2Var, java.util.LinkedList linkedList) {
        this.f206777e = j2Var;
        this.f206776d = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.j2 j2Var = this.f206777e;
        java.util.ArrayList arrayList = j2Var.f206955a.E;
        if (arrayList != null && arrayList.size() != 0) {
            java.util.Iterator it = this.f206776d.iterator();
            while (it.hasNext()) {
                j2Var.f206955a.f206392y.add((r45.fu) it.next());
            }
        }
        com.tencent.mm.ui.contact.ContactRemarkInfoModUI contactRemarkInfoModUI = j2Var.f206955a;
        c01.d9.e().g(new i21.a(contactRemarkInfoModUI.f206385t, contactRemarkInfoModUI.f206392y));
    }
}
