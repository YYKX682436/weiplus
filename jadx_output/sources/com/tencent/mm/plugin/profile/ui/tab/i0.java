package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class i0 implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.l0 f154356a;

    public i0(com.tencent.mm.plugin.profile.ui.tab.l0 l0Var) {
        this.f154356a = l0Var;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.util.LinkedList list;
        java.lang.Object obj;
        java.util.LinkedList list2;
        r45.h32 h32Var;
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        com.tencent.mm.plugin.profile.ui.tab.l0 l0Var = this.f154356a;
        java.lang.String b17 = x51.j1.b(l0Var.f154388b.f389245s.f370126d);
        int i18 = 0;
        if ((!noticeList.isEmpty()) && z17) {
            r45.h32 h32Var2 = (r45.h32) kz5.n0.X(noticeList);
            r45.j32 j32Var = l0Var.f154396j;
            if (j32Var != null && (list2 = j32Var.getList(0)) != null && (h32Var = (r45.h32) kz5.n0.Z(list2)) != null) {
                h32Var.set(1, java.lang.Integer.valueOf(h32Var2.getInteger(1)));
                h32Var.set(0, java.lang.Integer.valueOf(h32Var2.getInteger(0)));
                h32Var.set(3, h32Var2.getString(3));
            }
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            kotlin.jvm.internal.o.d(b17);
            java.lang.String string = h32Var2.getString(4);
            i1Var.a(b17, string != null ? string : "", h32Var2);
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update first notice: noticeId=" + h32Var2.getString(4) + ", status=" + h32Var2.getInteger(1));
        } else {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var3 = (r45.h32) it.next();
                com.tencent.mm.plugin.finder.feed.model.i1 i1Var2 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
                kotlin.jvm.internal.o.d(b17);
                java.lang.String string2 = h32Var3.getString(4);
                if (string2 == null) {
                    string2 = "";
                }
                r45.h32 e17 = i1Var2.e(b17, string2);
                if (e17 != null) {
                    e17.set(1, java.lang.Integer.valueOf(h32Var3.getInteger(1)));
                }
                r45.j32 j32Var2 = l0Var.f154396j;
                if (j32Var2 != null && (list = j32Var2.getList(i18)) != null) {
                    java.util.Iterator it6 = list.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            obj = null;
                            break;
                        } else {
                            obj = it6.next();
                            if (kotlin.jvm.internal.o.b(((r45.h32) obj).getString(4), h32Var3.getString(4))) {
                                break;
                            }
                        }
                    }
                    r45.h32 h32Var4 = (r45.h32) obj;
                    if (h32Var4 != null) {
                        h32Var4.set(1, java.lang.Integer.valueOf(h32Var3.getInteger(1)));
                    }
                }
                i18 = 0;
            }
        }
        r45.j32 j32Var3 = l0Var.f154396j;
        if (j32Var3 != null) {
            int integer = j32Var3.getInteger(2);
            if (i17 <= integer) {
                integer = i17;
            }
            j32Var3.set(3, java.lang.Integer.valueOf(integer));
        }
        if (c32Var != null) {
            l0Var.f154397k = c32Var;
            com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "update nextLiveNotificationInfo");
        }
        kotlin.jvm.internal.o.d(b17);
        l0Var.j(b17);
        l0Var.i();
        com.tencent.mars.xlog.Log.i("ContactBizHeaderLiveNoticeLogicV2", "more list dismissed, totalReserveCnt=" + i17 + ", hasTopOperation=" + z17);
    }
}
