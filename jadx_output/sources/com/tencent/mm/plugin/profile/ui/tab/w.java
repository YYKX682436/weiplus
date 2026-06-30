package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes10.dex */
public final class w implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.b0 f154676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154677b;

    public w(com.tencent.mm.plugin.profile.ui.tab.b0 b0Var, java.lang.String str) {
        this.f154676a = b0Var;
        this.f154677b = str;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String finderUserName;
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        java.util.Iterator it = noticeList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            finderUserName = this.f154677b;
            if (!hasNext) {
                break;
            }
            r45.h32 h32Var = (r45.h32) it.next();
            com.tencent.mm.plugin.finder.feed.model.i1 i1Var = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
            kotlin.jvm.internal.o.d(finderUserName);
            java.lang.String string = h32Var.getString(4);
            r45.h32 e17 = i1Var.e(finderUserName, string != null ? string : "");
            if (e17 != null) {
                e17.set(1, java.lang.Integer.valueOf(h32Var.getInteger(1)));
            }
        }
        com.tencent.mm.plugin.profile.ui.tab.b0 b0Var = this.f154676a;
        r45.f32 f32Var = b0Var.f154233b.f389251y;
        int i18 = f32Var != null ? f32Var.f373980d : 0;
        if (i17 >= i18) {
            if (f32Var != null) {
                f32Var.f373981e = i18;
            }
        } else if (f32Var != null) {
            f32Var.f373981e = i17;
        }
        r45.mk mkVar = b0Var.f154245n;
        java.lang.String str = mkVar != null ? mkVar.f380599g : null;
        com.tencent.mm.plugin.finder.feed.model.i1 i1Var2 = com.tencent.mm.plugin.finder.feed.model.i1.f107930a;
        kotlin.jvm.internal.o.f(finderUserName, "$finderUserName");
        r45.h32 e18 = i1Var2.e(finderUserName, str != null ? str : "");
        b0Var.e(e18 != null && e18.getInteger(1) == 0);
    }
}
