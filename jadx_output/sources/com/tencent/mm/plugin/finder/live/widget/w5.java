package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class w5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.d6 f120143a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f120144b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f120145c;

    public w5(com.tencent.mm.plugin.finder.live.widget.d6 d6Var, boolean z17, boolean z18) {
        this.f120143a = d6Var;
        this.f120144b = z17;
        this.f120145c = z18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        int i17;
        r45.xq1 xq1Var;
        r45.t63 t63Var;
        java.util.LinkedList list;
        r45.y63 y63Var;
        r45.y63 y63Var2;
        r45.z73 z73Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.live.widget.d6 d6Var = this.f120143a;
        d6Var.f118072n = false;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list2 = ((r45.hv1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list2, "getGame_user_info_list(...)");
            r45.n73 n73Var = (r45.n73) kz5.n0.Z(list2);
            java.lang.Object obj2 = null;
            r45.yq1 yq1Var = (n73Var == null || (z73Var = (r45.z73) n73Var.getCustom(5)) == null) ? null : (r45.yq1) z73Var.getCustom(14);
            d6Var.f118068j = yq1Var;
            d6Var.f118070l = (yq1Var == null || (y63Var2 = (r45.y63) yq1Var.getCustom(0)) == null) ? null : y63Var2.getString(2);
            r45.yq1 yq1Var2 = d6Var.f118068j;
            d6Var.f118071m = (yq1Var2 == null || (y63Var = (r45.y63) yq1Var2.getCustom(0)) == null) ? false : y63Var.getBoolean(1);
            java.lang.String str = (java.lang.String) ((mm2.c1) d6Var.f118061c.P0(mm2.c1.class)).f328833k6.getValue();
            if (!(str == null || str.length() == 0)) {
                r45.yq1 yq1Var3 = d6Var.f118068j;
                r45.xq1 xq1Var2 = yq1Var3 != null ? (r45.xq1) yq1Var3.getCustom(2) : null;
                if (xq1Var2 != null) {
                    r45.yq1 yq1Var4 = d6Var.f118068j;
                    if (yq1Var4 != null && (xq1Var = (r45.xq1) yq1Var4.getCustom(2)) != null && (t63Var = (r45.t63) xq1Var.getCustom(0)) != null && (list = t63Var.getList(0)) != null) {
                        java.util.Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.lang.Object next = it.next();
                            if (kotlin.jvm.internal.o.b(((r45.u24) next).getString(0), str)) {
                                obj2 = next;
                                break;
                            }
                        }
                        r45.u24 u24Var = (r45.u24) obj2;
                        if (u24Var != null) {
                            i17 = u24Var.getInteger(1);
                            xq1Var2.set(1, java.lang.Integer.valueOf(i17));
                        }
                    }
                    i17 = 0;
                    xq1Var2.set(1, java.lang.Integer.valueOf(i17));
                }
            }
            boolean z17 = this.f120145c;
            boolean z18 = this.f120144b;
            if (z18) {
                com.tencent.mm.plugin.finder.live.widget.d6.a(d6Var);
            } else if (z17) {
                d6Var.j();
            } else {
                com.tencent.mm.plugin.finder.live.widget.d6.b(d6Var);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("CgiFinderLiveGetUserGameConfig hasContinue: ");
            sb6.append(d6Var.f118071m);
            sb6.append(", hasLastBuffer: ");
            sb6.append(d6Var.f118070l != null);
            sb6.append(", isLoadMore: ");
            sb6.append(z18);
            sb6.append(", isResume: ");
            sb6.append(z17);
            com.tencent.mars.xlog.Log.i(d6Var.f118062d, sb6.toString());
        }
        return jz5.f0.f302826a;
    }
}
