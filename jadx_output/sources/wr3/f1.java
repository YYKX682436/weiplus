package wr3;

/* loaded from: classes11.dex */
public final class f1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment f448789d;

    public f1(com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment) {
        this.f448789d = bizProfileTabMsgFragment;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        r45.gl glVar;
        java.util.LinkedList linkedList;
        r45.l5 l5Var;
        r45.l5 l5Var2;
        r45.l5 l5Var3;
        r45.p5 p5Var;
        java.util.LinkedList linkedList2;
        vr3.g gVar = (vr3.g) obj;
        if (gVar == null) {
            return;
        }
        java.util.List list = gVar.f439630a;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                vr3.h hVar = (vr3.h) obj2;
                r45.s5 s5Var = hVar.f439631a;
                if ((s5Var != null && (p5Var = s5Var.f385514i) != null && (linkedList2 = p5Var.f382754e) != null && (linkedList2.isEmpty() ^ true)) && ((r45.o5) hVar.f439631a.f385514i.f382754e.get(0)).f381923p != 8) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        com.tencent.mm.plugin.profile.ui.tab.list.BizProfileTabMsgFragment bizProfileTabMsgFragment = this.f448789d;
        bizProfileTabMsgFragment.f154441w.clear();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            glVar = bizProfileTabMsgFragment.f154440v;
            linkedList = bizProfileTabMsgFragment.f154441w;
            if (!hasNext) {
                break;
            }
            vr3.h hVar2 = (vr3.h) it.next();
            if (hVar2.f439631a != null) {
                if (hVar2.f439632b == wr3.n0.f448845i) {
                    java.util.LinkedList Msg = glVar.f375323d;
                    kotlin.jvm.internal.o.f(Msg, "Msg");
                    java.util.Iterator it6 = Msg.iterator();
                    boolean z17 = false;
                    while (it6.hasNext()) {
                        r45.p5 p5Var2 = ((r45.s5) it6.next()).f385514i;
                        java.lang.Integer valueOf = (p5Var2 == null || (l5Var3 = p5Var2.f382753d) == null) ? null : java.lang.Integer.valueOf(l5Var3.f379138d);
                        r45.s5 s5Var2 = hVar2.f439631a;
                        r45.p5 p5Var3 = s5Var2.f385514i;
                        if (kotlin.jvm.internal.o.b(valueOf, (p5Var3 == null || (l5Var2 = p5Var3.f382753d) == null) ? null : java.lang.Integer.valueOf(l5Var2.f379138d))) {
                            com.tencent.mm.plugin.profile.ui.tab.s sVar = (com.tencent.mm.plugin.profile.ui.tab.s) i95.n0.c(com.tencent.mm.plugin.profile.ui.tab.s.class);
                            r45.p5 p5Var4 = s5Var2.f385514i;
                            sVar.wi((p5Var4 == null || (l5Var = p5Var4.f382753d) == null) ? 0 : l5Var.f379138d);
                            z17 = true;
                        }
                    }
                    if (!z17) {
                        linkedList.add(hVar2);
                    }
                } else {
                    linkedList.add(hVar2);
                }
            }
        }
        wr3.t0 t0Var = bizProfileTabMsgFragment.f154439u;
        if (t0Var == null) {
            kotlin.jvm.internal.o.o("mAdapter");
            throw null;
        }
        r45.gl glVar2 = bizProfileTabMsgFragment.m0().f389235f;
        java.lang.Integer valueOf2 = glVar2 != null ? java.lang.Integer.valueOf(glVar2.f375328i) : null;
        r45.gl glVar3 = bizProfileTabMsgFragment.m0().f389235f;
        t0Var.N(glVar, valueOf2, glVar3 != null ? glVar3.f375327h : null, linkedList);
    }
}
