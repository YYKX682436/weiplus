package com.tencent.mm.plugin.finder.member.preview;

/* loaded from: classes2.dex */
public final class n implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.member.preview.c0 f121257a;

    public n(com.tencent.mm.plugin.finder.member.preview.c0 c0Var) {
        this.f121257a = c0Var;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String str;
        r45.j32 j32Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var;
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        com.tencent.mm.plugin.finder.member.preview.c0 c0Var = this.f121257a;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) c0Var.f121189p1.get(c0Var.U);
        kk.l lVar = c0Var.f121189p1;
        if (l2Var2 != null && (h32Var = l2Var2.f123916e) != null) {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var2 = (r45.h32) it.next();
                if (kotlin.jvm.internal.o.b(h32Var.getString(4), h32Var2.getString(4)) && (l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(c0Var.U)) != null) {
                    l2Var.f123916e = h32Var2;
                }
            }
        }
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = c0Var.L;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str2 = c0Var.U;
        ya2.b2 b17 = ya2.h.f460484a.b(str2);
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(c0Var.U);
        if (l2Var3 == null || (j32Var = l2Var3.f123923l) == null || (str = j32Var.getString(5)) == null) {
            str = c0Var.f121202y1;
        }
        java.lang.String str3 = str;
        kotlin.jvm.internal.o.d(str3);
        s1Var.a("moreLiveListWidget-onDismiss", str2, false, false, false, b17, str3);
        android.view.View view = c0Var.D;
        if (view == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var2 = c0Var.L;
            if (s1Var2 != null) {
                s1Var2.j(c0Var.U);
            } else {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
        }
    }
}
