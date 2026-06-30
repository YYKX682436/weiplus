package wr3;

/* loaded from: classes11.dex */
public final class j1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment f448824d;

    public j1(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        this.f448824d = bizProfileTabMsgFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.lang.String str;
        int i17;
        java.util.LinkedList linkedList;
        vr3.f fVar = (vr3.f) obj;
        if (fVar == null) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f448824d;
        java.util.Iterator it = bizProfileTabMsgFragment.f154440v.f375323d.iterator();
        kotlin.jvm.internal.o.f(it, "iterator(...)");
        while (true) {
            boolean hasNext = it.hasNext();
            str = bizProfileTabMsgFragment.f154435q;
            boolean z17 = false;
            i17 = fVar.f439628a;
            if (!hasNext) {
                break;
            }
            r45.s5 s5Var = (r45.s5) it.next();
            r45.p5 p5Var = s5Var.f385514i;
            if (p5Var != null) {
                java.util.LinkedList linkedList2 = p5Var.f382754e;
                r45.l5 l5Var = p5Var.f382753d;
                if (l5Var != null && l5Var.f379138d == i17) {
                    z17 = true;
                }
                if (z17) {
                    int size = linkedList2.size();
                    int i18 = fVar.f439629b;
                    if (size == 1) {
                        com.tencent.mars.xlog.Log.i(str, "delete msg " + i17 + " and index " + i18);
                        it.remove();
                    } else if (!bizProfileTabMsgFragment.s0(s5Var, new wr3.g1(i18), new wr3.h1(i17))) {
                        com.tencent.mars.xlog.Log.i(str, "skip delete for msg " + i17 + " index " + i18 + " to avoid empty DetailInfo");
                    }
                } else if (linkedList2.size() > 1 && !bizProfileTabMsgFragment.s0(s5Var, new wr3.i1(i17), wr3.c1.f448764d)) {
                    com.tencent.mars.xlog.Log.i(str, "skip delete for slide msg " + i17 + " to avoid empty DetailInfo");
                }
            }
        }
        r45.gl glVar = bizProfileTabMsgFragment.m0().f389235f;
        if (glVar != null && (linkedList = glVar.f375327h) != null) {
            java.util.Iterator it6 = linkedList.iterator();
            kotlin.jvm.internal.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                r45.s5 s5Var2 = (r45.s5) it6.next();
                r45.p5 p5Var2 = s5Var2.f385514i;
                java.util.LinkedList linkedList3 = p5Var2 != null ? p5Var2.f382754e : null;
                if (linkedList3 == null) {
                    break;
                }
                java.util.Iterator it7 = linkedList3.iterator();
                int i19 = 0;
                while (true) {
                    if (!it7.hasNext()) {
                        i19 = -1;
                        break;
                    }
                    r45.z5 z5Var = ((r45.o5) it7.next()).R;
                    if (z5Var != null && z5Var.f391718e == i17) {
                        break;
                    } else {
                        i19++;
                    }
                }
                if (i19 != -1) {
                    if (linkedList3.size() == 1) {
                        com.tencent.mars.xlog.Log.i(str, "delete featured msg " + i17 + " from all msg.FeaturedList (single detail)");
                        it6.remove();
                    } else if (com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher.h(bizProfileTabMsgFragment.n0(), s5Var2, java.lang.Integer.valueOf(i17), null, 4, null)) {
                        com.tencent.mars.xlog.Log.i(str, "all msg feature list delete detail appMsgId=" + i17);
                    } else {
                        com.tencent.mars.xlog.Log.e(str, "all msg removeDetailInfoFromMsg failed");
                    }
                }
            }
        }
        wr3.t0 t0Var = bizProfileTabMsgFragment.f154439u;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        r45.gl glVar2 = bizProfileTabMsgFragment.m0().f389235f;
        java.lang.Integer valueOf = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f375328i) : null;
        r45.gl glVar3 = bizProfileTabMsgFragment.m0().f389235f;
        t0Var.N(bizProfileTabMsgFragment.f154440v, valueOf, glVar3 != null ? glVar3.f375327h : null, bizProfileTabMsgFragment.f154441w);
    }
}
