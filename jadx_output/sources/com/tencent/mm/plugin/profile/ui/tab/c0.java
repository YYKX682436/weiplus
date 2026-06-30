package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var) {
        super(0);
        this.f154260d = l0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.h32 h32Var;
        java.lang.String string;
        r45.j32 j32Var;
        java.util.LinkedList list;
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154260d;
        java.lang.String b17 = x51.j1.b(l0Var.f154388b.f389245s.f370126d);
        r45.j32 j32Var2 = l0Var.f154396j;
        if (j32Var2 != null) {
            int i17 = 0;
            java.util.LinkedList list2 = j32Var2.getList(0);
            if (list2 != null && (h32Var = (r45.h32) kz5.n0.Z(list2)) != null && (string = h32Var.getString(4)) != null) {
                com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
                kotlin.jvm.internal.o.d(b17);
                r45.h32 e17 = i1Var.e(b17, string);
                if (e17 != null && (j32Var = l0Var.f154396j) != null && (list = j32Var.getList(0)) != null) {
                    for (java.lang.Object obj : list) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.h32 h32Var2 = (r45.h32) obj;
                        if (kotlin.jvm.internal.o.b(h32Var2.getString(4), string)) {
                            h32Var2.set(1, java.lang.Integer.valueOf(e17.getInteger(1)));
                            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "sync notice to list: index=" + i17 + ", noticeId=" + string + ", status=" + e17.getInteger(1));
                        }
                        i17 = i18;
                    }
                }
            }
        }
        if (l0Var.f() == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveUtilsService is null!");
        } else if (l0Var.f154396j == null) {
            com.tencent.mars.xlog.Log.e("ContactBizHeaderLiveNoticeLogicV2", "liveNoticeListInfo is null!");
        } else {
            java.lang.String b18 = x51.j1.b(l0Var.f154388b.f389245s.f370126d);
            if (l0Var.f154394h == null) {
                r45.qt2 qt2Var = new r45.qt2();
                vd2.i5 f17 = l0Var.f();
                kotlin.jvm.internal.o.d(f17);
                kotlin.jvm.internal.o.d(b18);
                zy2.ic T6 = vd2.i5.T6(f17, b18, l0Var.f154387a, l0Var.f154391e.a(), qt2Var, 0, 16, null);
                l0Var.f154394h = T6;
                ((com.tencent.mm.plugin.finder.profile.widget.s4) T6).H = 102;
                zy2.ic icVar = l0Var.f154394h;
                kotlin.jvm.internal.o.d(icVar);
                ((com.tencent.mm.plugin.finder.profile.widget.s4) icVar).f124770x = new com.tencent.mm.plugin.profile.ui.tab.i0(l0Var);
            }
            kotlinx.coroutines.r2 r2Var = l0Var.f154402p;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            l0Var.f154402p = kotlinx.coroutines.l.d(l0Var.f154400n, null, null, new com.tencent.mm.plugin.profile.ui.tab.k0(b18, l0Var, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
