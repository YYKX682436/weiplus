package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class ra0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f127476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.ua0 f127477e;

    public ra0(java.util.List list, com.tencent.mm.plugin.finder.storage.ua0 ua0Var) {
        this.f127476d = list;
        this.f127477e = ua0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        java.util.LinkedList linkedList;
        gm0.j1.n().f273288b.q(3990, this);
        if (m1Var instanceof w11.h0) {
            com.tencent.mm.plugin.finder.storage.ua0 ua0Var = this.f127477e;
            if (i17 != 0 || i18 != 0) {
                java.util.Iterator it = this.f127476d.iterator();
                while (it.hasNext()) {
                    ua0Var.p((java.lang.String) it.next(), false);
                }
                return;
            }
            r45.hg H = ((w11.h0) m1Var).H();
            if (H == null || (linkedList = H.f376127e) == null) {
                return;
            }
            java.util.Iterator it6 = linkedList.iterator();
            while (it6.hasNext()) {
                java.lang.String UserName = ((r45.vn4) it6.next()).f388397e.f387494d;
                kotlin.jvm.internal.o.f(UserName, "UserName");
                ua0Var.p(UserName, true);
            }
        }
    }
}
