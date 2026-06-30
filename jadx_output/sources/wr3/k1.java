package wr3;

/* loaded from: classes11.dex */
public final class k1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment f448828d;

    public k1(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        this.f448828d = bizProfileTabMsgFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int i17 = 0;
        boolean z17 = arrayList == null || arrayList.isEmpty();
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f448828d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(bizProfileTabMsgFragment.f154435q, "bizProfileUpdateData: received no update messages");
            return;
        }
        java.lang.String str = bizProfileTabMsgFragment.f154435q;
        java.lang.String str2 = bizProfileTabMsgFragment.f154435q;
        com.tencent.mars.xlog.Log.i(str, "bizProfileUpdateData: received " + arrayList.size() + " update messages");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            r45.gl glVar = bizProfileTabMsgFragment.f154440v;
            if (!hasNext) {
                try {
                    wr3.t0 t0Var = bizProfileTabMsgFragment.f154439u;
                    if (t0Var == null) {
                        kotlin.jvm.internal.o.o("mAdapter");
                        throw null;
                    }
                    r45.gl glVar2 = bizProfileTabMsgFragment.m0().f389235f;
                    java.lang.Integer valueOf = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f375328i) : null;
                    r45.gl glVar3 = bizProfileTabMsgFragment.m0().f389235f;
                    t0Var.N(glVar, valueOf, glVar3 != null ? glVar3.f375327h : null, bizProfileTabMsgFragment.f154441w);
                    com.tencent.mars.xlog.Log.i(str2, "bizProfileUpdateData: Adapter updated successfully");
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(str2, "bizProfileUpdateData: Failed to update adapter: " + e17, e17);
                    return;
                }
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.s5 s5Var = (r45.s5) next;
            bizProfileTabMsgFragment.n0().i(glVar.f375323d, s5Var, "Msg");
            bizProfileTabMsgFragment.n0().i(bizProfileTabMsgFragment.m0().f389235f.f375327h, s5Var, "FeaturedList");
            i17 = i18;
        }
    }
}
