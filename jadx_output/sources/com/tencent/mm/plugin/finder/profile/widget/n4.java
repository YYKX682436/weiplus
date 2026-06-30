package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class n4 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124649a;

    public n4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var) {
        this.f124649a = s4Var;
    }

    @Override // qn5.c
    public void a(boolean z17) {
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124649a;
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = (com.tencent.mm.plugin.finder.profile.widget.m3) kz5.n0.Z(s4Var.f124760n);
        int integer = (m3Var == null || (h32Var = m3Var.f124624a) == null) ? 0 : h32Var.getInteger(0);
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f124760n).iterator();
        int i17 = integer;
        while (it.hasNext()) {
            i17 = java.lang.Math.min(((com.tencent.mm.plugin.finder.profile.widget.m3) it.next()).f124624a.getInteger(0), i17);
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var2 = this.f124649a;
        com.tencent.mm.plugin.finder.profile.widget.s4.d(s4Var2, true, null, s4Var2.f124747a, i17, 2, null);
    }

    @Override // qn5.c
    public boolean onLoadMore() {
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124649a;
        com.tencent.mm.plugin.finder.profile.widget.m3 m3Var = (com.tencent.mm.plugin.finder.profile.widget.m3) kz5.n0.Z(s4Var.f124760n);
        int integer = (m3Var == null || (h32Var = m3Var.f124624a) == null) ? 0 : h32Var.getInteger(0);
        java.util.Iterator it = ((java.util.ArrayList) s4Var.f124760n).iterator();
        int i17 = integer;
        while (it.hasNext()) {
            i17 = java.lang.Math.max(((com.tencent.mm.plugin.finder.profile.widget.m3) it.next()).f124624a.getInteger(0), i17);
        }
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var2 = this.f124649a;
        com.tencent.mm.plugin.finder.profile.widget.s4.d(s4Var2, false, null, s4Var2.f124747a, i17, 2, null);
        return true;
    }
}
