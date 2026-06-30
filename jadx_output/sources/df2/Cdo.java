package df2;

/* renamed from: df2.do, reason: invalid class name */
/* loaded from: classes15.dex */
public final class Cdo extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jo f229993d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lg0 f229994e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cdo(df2.jo joVar, bw5.lg0 lg0Var) {
        super(0);
        this.f229993d = joVar;
        this.f229994e = lg0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        st2.h1 h1Var;
        bw5.lg0 updateItem = this.f229994e;
        kotlin.jvm.internal.o.f(updateItem, "$updateItem");
        df2.jo joVar = this.f229993d;
        joVar.getClass();
        java.lang.String str = "refreshShelfAction type: " + updateItem.f29774d;
        java.lang.String str2 = joVar.f230491m;
        com.tencent.mars.xlog.Log.i(str2, str);
        if (updateItem.f29774d == 4) {
            com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = (com.tencent.mm.plugin.finder.live.plugin.ga0) joVar.R6(com.tencent.mm.plugin.finder.live.plugin.ga0.class);
            if (ga0Var != null && (h1Var = ga0Var.f112668r) != null) {
                h1Var.m().a(updateItem.f29778h[4] ? updateItem.f29777g : new bw5.kj0());
                com.tencent.mars.xlog.Log.i(str2, "refreshShelfAction, type: " + updateItem.f29774d);
            }
        } else {
            java.util.LinkedList<bw5.g10> linkedList = updateItem.f29775e;
            if (linkedList != null) {
                for (bw5.g10 g10Var : linkedList) {
                    int i17 = updateItem.f29774d;
                    if (i17 == 1) {
                        so2.j5 j5Var = (so2.j5) ((mm2.f6) joVar.business(mm2.f6.class)).f329039o.c(new df2.eo(g10Var));
                        if (j5Var != null) {
                            cm2.m0 m0Var = j5Var instanceof cm2.m0 ? (cm2.m0) j5Var : null;
                            if (m0Var != null) {
                                r45.y23 y23Var = m0Var.f43368v;
                                java.util.LinkedList<bw5.b10> linkedList2 = g10Var.L;
                                kotlin.jvm.internal.o.f(linkedList2, "getShowBoxItems(...)");
                                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList2, 10));
                                for (bw5.b10 b10Var : linkedList2) {
                                    r45.p56 p56Var = new r45.p56();
                                    byte[] byteArray = b10Var.toByteArray();
                                    if (byteArray != null) {
                                        try {
                                            p56Var.parseFrom(byteArray);
                                        } catch (java.lang.Exception e17) {
                                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                                        }
                                    }
                                    arrayList.add(p56Var);
                                }
                                y23Var.set(28, new java.util.LinkedList(arrayList));
                            }
                            android.view.View S6 = joVar.S6(com.tencent.mm.R.id.flh);
                            androidx.recyclerview.widget.RecyclerView recyclerView = S6 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) S6 : null;
                            androidx.recyclerview.widget.f2 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
                            tt2.e1 e1Var = adapter instanceof tt2.e1 ? (tt2.e1) adapter : null;
                            if (e1Var != null) {
                                e1Var.T(g10Var.f27613d, 9);
                            }
                            com.tencent.mars.xlog.Log.i(str2, "NotifyShopShelfUpdateType_Label productId: " + g10Var.f27613d);
                        }
                    } else if (i17 == 2) {
                        so2.j5 j5Var2 = (so2.j5) ((mm2.f6) joVar.business(mm2.f6.class)).f329039o.c(new df2.fo(g10Var));
                        if (j5Var2 != null) {
                            cm2.m0 m0Var2 = j5Var2 instanceof cm2.m0 ? (cm2.m0) j5Var2 : null;
                            if (m0Var2 != null) {
                                m0Var2.f43368v.set(76, g10Var.Y1[90] ? g10Var.W1 : new bw5.n00());
                            }
                            android.view.View S62 = joVar.S6(com.tencent.mm.R.id.flh);
                            androidx.recyclerview.widget.RecyclerView recyclerView2 = S62 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) S62 : null;
                            androidx.recyclerview.widget.f2 adapter2 = recyclerView2 != null ? recyclerView2.getAdapter() : null;
                            tt2.e1 e1Var2 = adapter2 instanceof tt2.e1 ? (tt2.e1) adapter2 : null;
                            if (e1Var2 != null) {
                                e1Var2.T(g10Var.f27613d, 9);
                            }
                            com.tencent.mars.xlog.Log.i(str2, "NotifyShopShelfUpdateType_OpenPrice productId: " + g10Var.f27613d);
                        }
                    } else if (i17 == 3) {
                        so2.j5 j5Var3 = (so2.j5) ((mm2.f6) joVar.business(mm2.f6.class)).f329039o.c(new df2.go(g10Var));
                        if (j5Var3 != null) {
                            df2.ho hoVar = new df2.ho(j5Var3, joVar, g10Var);
                            if (updateItem.f29776f == 1) {
                                cm2.m0 m0Var3 = j5Var3 instanceof cm2.m0 ? (cm2.m0) j5Var3 : null;
                                if (m0Var3 != null) {
                                    r45.bd5 bd5Var = (r45.bd5) m0Var3.f43368v.getCustom(70);
                                    java.lang.Integer valueOf = bd5Var != null ? java.lang.Integer.valueOf(bd5Var.getInteger(13)) : null;
                                    bw5.v00 b17 = g10Var.b();
                                    if (kotlin.jvm.internal.o.b(valueOf, b17 != null ? java.lang.Integer.valueOf(b17.f34109t) : null)) {
                                        hoVar.invoke();
                                    } else {
                                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("NotifyShopShelfUpdateType_ProductButton buttonType, local: ");
                                        r45.bd5 bd5Var2 = (r45.bd5) m0Var3.f43368v.getCustom(70);
                                        sb6.append(bd5Var2 != null ? java.lang.Integer.valueOf(bd5Var2.getInteger(13)) : null);
                                        sb6.append(", remote: ");
                                        bw5.v00 b18 = g10Var.b();
                                        sb6.append(b18 != null ? java.lang.Integer.valueOf(b18.f34109t) : null);
                                        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
                                    }
                                }
                            } else {
                                hoVar.invoke();
                            }
                        }
                    } else if (i17 != 5) {
                        com.tencent.mars.xlog.Log.i(str2, "refreshShelfAction, type: " + updateItem.f29774d);
                    } else {
                        so2.j5 j5Var4 = (so2.j5) ((mm2.f6) joVar.business(mm2.f6.class)).f329039o.c(new df2.io(g10Var));
                        if (j5Var4 != null) {
                            cm2.m0 m0Var4 = j5Var4 instanceof cm2.m0 ? (cm2.m0) j5Var4 : null;
                            if (m0Var4 != null) {
                                r45.y23 y23Var2 = m0Var4.f43368v;
                                java.util.LinkedList<bw5.b10> linkedList3 = g10Var.f27625p1;
                                kotlin.jvm.internal.o.f(linkedList3, "getEvalutionLabelList(...)");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList3, 10));
                                for (bw5.b10 b10Var2 : linkedList3) {
                                    r45.p56 p56Var2 = new r45.p56();
                                    byte[] byteArray2 = b10Var2.toByteArray();
                                    if (byteArray2 != null) {
                                        try {
                                            p56Var2.parseFrom(byteArray2);
                                        } catch (java.lang.Exception e18) {
                                            com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                                        }
                                    }
                                    arrayList2.add(p56Var2);
                                }
                                y23Var2.set(49, new java.util.LinkedList(arrayList2));
                            }
                            android.view.View S63 = joVar.S6(com.tencent.mm.R.id.flh);
                            androidx.recyclerview.widget.RecyclerView recyclerView3 = S63 instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) S63 : null;
                            androidx.recyclerview.widget.f2 adapter3 = recyclerView3 != null ? recyclerView3.getAdapter() : null;
                            tt2.e1 e1Var3 = adapter3 instanceof tt2.e1 ? (tt2.e1) adapter3 : null;
                            if (e1Var3 != null) {
                                e1Var3.T(g10Var.f27613d, 11);
                            }
                            com.tencent.mars.xlog.Log.i(str2, "NotifyShopShelfUpdateType_EvalutionLabel productId: " + g10Var.f27613d);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
