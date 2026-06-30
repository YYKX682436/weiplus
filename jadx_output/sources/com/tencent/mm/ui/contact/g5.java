package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class g5 implements rd0.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.h5 f206720a;

    public g5(com.tencent.mm.ui.contact.h5 h5Var) {
        this.f206720a = h5Var;
    }

    @Override // rd0.b1
    public void a(java.util.List list) {
        com.tencent.mm.ui.contact.h5 h5Var = this.f206720a;
        if (h5Var.f206753n.size() > 0) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (!h5Var.f206753n.contains(((p13.y) list.get(size)).f351187e)) {
                    list.remove(size);
                }
            }
        }
    }
}
