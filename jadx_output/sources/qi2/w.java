package qi2;

/* loaded from: classes10.dex */
public final class w extends qi2.c0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin) {
        super(context, basePlugin);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
    }

    @Override // qi2.c0
    public void B() {
        java.util.LinkedList linkedList = this.f363506o;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f363507p;
        linkedList2.clear();
        dk2.u4 u4Var = ((mm2.o4) this.f363502h.P0(mm2.o4.class)).Z;
        if (u4Var != null) {
            r45.r22 r22Var = (r45.r22) kz5.n0.a0(u4Var.f234163j, 0);
            if (r22Var != null) {
                java.util.LinkedList list = r22Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getMembers(...)");
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    java.lang.String string = ((r45.wk6) it.next()).getString(1);
                    if (string == null) {
                        string = "";
                    }
                    km2.q I = I(string);
                    if (I != null) {
                        linkedList.add(I);
                    }
                }
            }
            r45.r22 r22Var2 = (r45.r22) kz5.n0.a0(u4Var.f234163j, 1);
            if (r22Var2 != null) {
                java.util.LinkedList list2 = r22Var2.getList(0);
                kotlin.jvm.internal.o.f(list2, "getMembers(...)");
                java.util.Iterator it6 = list2.iterator();
                while (it6.hasNext()) {
                    java.lang.String string2 = ((r45.wk6) it6.next()).getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    km2.q I2 = I(string2);
                    if (I2 != null) {
                        linkedList2.add(I2);
                    }
                }
            }
        }
    }

    @Override // qi2.c0
    public void D(qi2.z viewHolder) {
        java.util.List list;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        dk2.u4 u4Var = ((mm2.o4) this.f363502h.P0(mm2.o4.class)).Z;
        if (u4Var == null || (list = u4Var.f234159f) == null) {
            return;
        }
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = ((km2.k) next).f309114a;
                km2.q qVar = viewHolder.f363664g;
                if (kotlin.jvm.internal.o.b(str, qVar != null ? qVar.f309172c : null)) {
                    obj = next;
                    break;
                }
            }
        }
        km2.k kVar = (km2.k) obj;
        if (kVar != null) {
            boolean z17 = kVar.f309118e;
            viewHolder.f363662e.setVisibility(4);
            android.view.ViewGroup viewGroup = viewHolder.f363665h;
            if (z17) {
                viewGroup.setVisibility(0);
            } else {
                viewGroup.setVisibility(8);
            }
        }
    }

    @Override // qi2.c0
    public void G() {
        km2.k e17;
        com.tencent.mm.plugin.finder.live.plugin.l lVar = this.f363502h;
        dk2.u4 u4Var = ((mm2.o4) lVar.P0(mm2.o4.class)).Z;
        if (u4Var == null || (e17 = u4Var.e(((mm2.c1) lVar.P0(mm2.c1.class)).f328852o)) == null) {
            return;
        }
        android.content.Context context = this.f118381d;
        if (e17.f309121h) {
            this.f363509r = 2;
            fg2.g gVar = this.f363505n;
            if (gVar == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            gVar.f262037e.setVisibility(0);
            fg2.g gVar2 = this.f363505n;
            if (gVar2 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            gVar2.f262042j.setVisibility(8);
            fg2.g gVar3 = this.f363505n;
            if (gVar3 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            gVar3.f262035c.setVisibility(8);
            fg2.g gVar4 = this.f363505n;
            if (gVar4 != null) {
                gVar4.f262036d.setText(context.getResources().getString(com.tencent.mm.R.string.d6o));
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        if (e17.f309118e) {
            this.f363509r = 4;
            fg2.g gVar5 = this.f363505n;
            if (gVar5 == null) {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
            gVar5.f262042j.setVisibility(0);
            fg2.g gVar6 = this.f363505n;
            if (gVar6 != null) {
                gVar6.f262037e.setVisibility(4);
                return;
            } else {
                kotlin.jvm.internal.o.o("uiBinding");
                throw null;
            }
        }
        this.f363509r = 3;
        fg2.g gVar7 = this.f363505n;
        if (gVar7 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar7.f262037e.setVisibility(0);
        fg2.g gVar8 = this.f363505n;
        if (gVar8 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar8.f262042j.setVisibility(8);
        fg2.g gVar9 = this.f363505n;
        if (gVar9 == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        gVar9.f262035c.setVisibility(8);
        fg2.g gVar10 = this.f363505n;
        if (gVar10 != null) {
            gVar10.f262036d.setText(context.getResources().getString(com.tencent.mm.R.string.d6l));
        } else {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
    }

    @Override // qi2.c0
    public void H() {
        java.util.Iterator it = this.f363508q.entrySet().iterator();
        while (it.hasNext()) {
            D((qi2.z) ((java.util.Map.Entry) it.next()).getValue());
        }
    }

    public final km2.q I(java.lang.String str) {
        java.lang.Object obj;
        if (kotlin.jvm.internal.o.b(str, ((mm2.o4) this.f363502h.P0(mm2.o4.class)).a7().f309170a)) {
            return ((mm2.o4) this.f363502h.P0(mm2.o4.class)).a7();
        }
        java.util.List list = ((mm2.o4) this.f363502h.P0(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, str)) {
                    break;
                }
            }
        }
        return (km2.q) obj;
    }
}
