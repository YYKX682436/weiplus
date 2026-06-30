package wr3;

/* loaded from: classes11.dex */
public final class c2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment f448765d;

    public c2(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment) {
        this.f448765d = bizProfileTabVideoFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.ul ulVar;
        java.util.LinkedList linkedList;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        r45.wl wlVar2 = new r45.wl();
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment = this.f448765d;
        bizProfileTabVideoFragment.getClass();
        bizProfileTabVideoFragment.f154413f = wlVar2;
        bizProfileTabVideoFragment.m0().f389237h = wlVar.f389237h;
        r45.gl glVar = bizProfileTabVideoFragment.m0().f389237h;
        if ((glVar == null || (linkedList = glVar.f375323d) == null || !(linkedList.isEmpty() ^ true)) ? false : true) {
            java.util.List list = bizProfileTabVideoFragment.f154448s;
            ((java.util.ArrayList) list).clear();
            java.util.LinkedList Msg = wlVar.f389237h.f375323d;
            kotlin.jvm.internal.o.f(Msg, "Msg");
            ((java.util.ArrayList) list).addAll(Msg);
            wr3.z1 z1Var = bizProfileTabVideoFragment.f154447r;
            if (z1Var == null) {
                kotlin.jvm.internal.o.o("mVideoAdapter");
                throw null;
            }
            z1Var.notifyDataSetChanged();
            r45.gl glVar2 = bizProfileTabVideoFragment.m0().f389237h;
            if (glVar2 != null && (ulVar = glVar2.f375326g) != null) {
                wr3.z1 z1Var2 = bizProfileTabVideoFragment.f154447r;
                if (z1Var2 == null) {
                    kotlin.jvm.internal.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var2.x(ulVar.f387453e == 0);
            }
        } else {
            wr3.z1 z1Var3 = bizProfileTabVideoFragment.f154447r;
            if (z1Var3 == null) {
                kotlin.jvm.internal.o.o("mVideoAdapter");
                throw null;
            }
            z1Var3.x(false);
        }
        java.lang.String b17 = com.tencent.mm.plugin.profile.ui.tab.b.b(bizProfileTabVideoFragment.getContext(), 64, wlVar);
        wr3.z1 z1Var4 = bizProfileTabVideoFragment.f154447r;
        if (z1Var4 == null) {
            kotlin.jvm.internal.o.o("mVideoAdapter");
            throw null;
        }
        if (b17 == null) {
            b17 = "";
        }
        z1Var4.f448930m = b17;
    }
}
