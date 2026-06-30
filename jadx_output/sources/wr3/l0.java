package wr3;

/* loaded from: classes11.dex */
public final class l0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment f448832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher f448833e;

    public l0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment, com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher) {
        this.f448832d = bizProfileTabCommonFragment;
        this.f448833e = bizProfileDataFetcher;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.gl glVar5;
        r45.gl glVar6;
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        int i17 = 0;
        boolean z17 = arrayList == null || arrayList.isEmpty();
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment = this.f448832d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "bizProfileUpdateData: received no update messages");
            return;
        }
        com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "bizProfileUpdateData: received " + arrayList.size() + " update messages");
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            r45.ul ulVar = null;
            r3 = null;
            java.util.LinkedList linkedList = null;
            ulVar = null;
            if (!it.hasNext()) {
                try {
                    r45.tj6 t07 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
                    java.util.List list = (t07 == null || (glVar4 = t07.f386509e) == null) ? null : glVar4.f375323d;
                    if (list == null) {
                        list = kz5.p0.f313996d;
                    }
                    java.util.List list2 = list;
                    r45.tj6 t08 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
                    java.util.LinkedList linkedList2 = (t08 == null || (glVar3 = t08.f386509e) == null) ? null : glVar3.f375327h;
                    r45.tj6 t09 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
                    java.lang.Integer valueOf = (t09 == null || (glVar2 = t09.f386509e) == null) ? null : java.lang.Integer.valueOf(glVar2.f375328i);
                    r45.tj6 t010 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
                    if (t010 != null && (glVar = t010.f386509e) != null) {
                        ulVar = glVar.f375326g;
                    }
                    r45.ul ulVar2 = ulVar;
                    java.lang.String c17 = com.tencent.mm.plugin.profile.ui.tab.b.c(bizProfileTabCommonFragment.m0(), bizProfileTabCommonFragment.getContext());
                    if (c17 == null) {
                        c17 = "";
                    }
                    this.f448832d.H0(list2, linkedList2, ulVar2, c17, valueOf);
                    com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "bizProfileUpdateData: Adapter updated successfully");
                    return;
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e(bizProfileTabCommonFragment.getF154424w(), "bizProfileUpdateData: Failed to update adapter: " + e17, e17);
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
            r45.tj6 t011 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
            java.util.LinkedList linkedList3 = (t011 == null || (glVar6 = t011.f386509e) == null) ? null : glVar6.f375323d;
            r45.tj6 t012 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
            if (t012 != null && (glVar5 = t012.f386509e) != null) {
                linkedList = glVar5.f375327h;
            }
            java.lang.String u07 = bizProfileTabCommonFragment.u0();
            com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = this.f448833e;
            bizProfileDataFetcher.i(linkedList3, s5Var, u07 + ".Msg");
            bizProfileDataFetcher.i(linkedList, s5Var, u07 + ".Msg.featuredList");
            i17 = i18;
        }
    }
}
