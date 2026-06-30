package wr3;

/* loaded from: classes11.dex */
public final class d2 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment f448768d;

    public d2(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment) {
        this.f448768d = bizProfileTabVideoFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.ul ulVar;
        r45.wl wlVar = (r45.wl) obj;
        if (wlVar == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabVideoFragment bizProfileTabVideoFragment = this.f448768d;
        if (bizProfileTabVideoFragment.m0().f389237h == null) {
            wlVar.f389237h = wlVar.f389237h;
        } else {
            r45.gl glVar = wlVar.f389237h;
            if (glVar != null && (ulVar = glVar.f375326g) != null) {
                bizProfileTabVideoFragment.m0().f389237h.f375326g = ulVar;
            }
        }
        r45.gl glVar2 = wlVar.f389237h;
        if (glVar2 != null) {
            java.util.LinkedList linkedList = glVar2.f375323d;
            if (linkedList != null && (!linkedList.isEmpty())) {
                java.util.List list = bizProfileTabVideoFragment.f154448s;
                int size = ((java.util.ArrayList) list).size();
                ((java.util.ArrayList) list).addAll(linkedList);
                wr3.z1 z1Var = bizProfileTabVideoFragment.f154447r;
                if (z1Var == null) {
                    kotlin.jvm.internal.o.o("mVideoAdapter");
                    throw null;
                }
                z1Var.notifyItemRangeInserted(size, linkedList.size());
            }
            wr3.z1 z1Var2 = bizProfileTabVideoFragment.f154447r;
            if (z1Var2 == null) {
                kotlin.jvm.internal.o.o("mVideoAdapter");
                throw null;
            }
            r45.ul ulVar2 = glVar2.f375326g;
            z1Var2.x(ulVar2 != null && ulVar2.f387453e == 0);
        }
    }
}
