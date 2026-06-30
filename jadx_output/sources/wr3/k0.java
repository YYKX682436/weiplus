package wr3;

/* loaded from: classes11.dex */
public final class k0 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment f448827d;

    public k0(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment) {
        this.f448827d = bizProfileTabCommonFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        r45.gl glVar;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.gl glVar4;
        r45.gl glVar5;
        java.util.LinkedList linkedList;
        r45.gl glVar6;
        java.util.LinkedList linkedList2;
        r45.l5 l5Var;
        vr3.f fVar = (vr3.f) obj;
        if (fVar == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabCommonFragment bizProfileTabCommonFragment = this.f448827d;
        bizProfileTabCommonFragment.getClass();
        r45.tj6 t07 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        int i17 = fVar.f439628a;
        if (t07 != null && (glVar6 = t07.f386509e) != null && (linkedList2 = glVar6.f375323d) != null) {
            java.util.Iterator it = linkedList2.iterator();
            kotlin.jvm.internal.o.f(it, "iterator(...)");
            while (it.hasNext()) {
                r45.p5 p5Var = ((r45.s5) it.next()).f385514i;
                if (((p5Var == null || (l5Var = p5Var.f382753d) == null || l5Var.f379138d != i17) ? false : true) && p5Var.f382754e.size() == 1) {
                    com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "delete msg " + i17 + " and index " + fVar.f439629b);
                    it.remove();
                }
            }
        }
        r45.tj6 t08 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        if (t08 != null && (glVar5 = t08.f386509e) != null && (linkedList = glVar5.f375327h) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                r45.s5 s5Var = (r45.s5) it6.next();
                java.util.LinkedList linkedList3 = s5Var.f385514i.f382754e;
                kotlin.jvm.internal.o.d(linkedList3);
                java.util.Iterator it7 = linkedList3.iterator();
                int i18 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i18 = -1;
                        break;
                    }
                    r45.z5 z5Var = ((r45.o5) it7.next()).R;
                    if (z5Var != null && z5Var.f391718e == i17) {
                        break;
                    } else {
                        i18++;
                    }
                }
                if (i18 != -1) {
                    if (linkedList3.size() == 1) {
                        com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), "delete featured msg " + i17 + " from " + bizProfileTabCommonFragment.u0() + ".FeaturedList (single detail)");
                        it6.remove();
                    } else if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.h(bizProfileTabCommonFragment.n0(), s5Var, java.lang.Integer.valueOf(i17), null, 4, null)) {
                        com.tencent.mars.xlog.Log.i(bizProfileTabCommonFragment.getF154424w(), bizProfileTabCommonFragment.u0() + " feature list delete detail appMsgId=" + i17);
                    } else {
                        com.tencent.mars.xlog.Log.e(bizProfileTabCommonFragment.getF154424w(), bizProfileTabCommonFragment.u0() + " removeDetailInfoFromMsg failed");
                    }
                }
            }
        }
        r45.tj6 t09 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        r45.ul ulVar = null;
        java.util.List list = (t09 == null || (glVar4 = t09.f386509e) == null) ? null : glVar4.f375323d;
        if (list == null) {
            list = kz5.p0.f313996d;
        }
        java.util.List list2 = list;
        r45.tj6 t010 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        java.util.LinkedList linkedList4 = (t010 == null || (glVar3 = t010.f386509e) == null) ? null : glVar3.f375327h;
        r45.tj6 t011 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        java.lang.Integer valueOf = (t011 == null || (glVar2 = t011.f386509e) == null) ? null : java.lang.Integer.valueOf(glVar2.f375328i);
        r45.tj6 t012 = bizProfileTabCommonFragment.t0(bizProfileTabCommonFragment.m0());
        if (t012 != null && (glVar = t012.f386509e) != null) {
            ulVar = glVar.f375326g;
        }
        r45.ul ulVar2 = ulVar;
        java.lang.String c17 = com.tencent.mm.plugin.profile.ui.tab.b.c(bizProfileTabCommonFragment.m0(), bizProfileTabCommonFragment.getContext());
        if (c17 == null) {
            c17 = "";
        }
        this.f448827d.H0(list2, linkedList4, ulVar2, c17, valueOf);
    }
}
