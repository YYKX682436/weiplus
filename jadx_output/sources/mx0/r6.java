package mx0;

/* loaded from: classes5.dex */
public final class r6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332287d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332287d = shootComposingPluginLayout;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.r6(this.f332287d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        mx0.r6 r6Var = (mx0.r6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        r6Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.List S0;
        boolean z17;
        com.google.android.material.tabs.TabLayout tabLayout;
        java.lang.Object obj2;
        xx0.d0 d0Var;
        boolean z18;
        com.google.android.material.tabs.TabLayout tabLayout2;
        vu3.c centerComponent;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        xx0.n nVar = this.f332287d.K1;
        if (nVar != null) {
            uu3.u uVar = nVar.f457919e;
            android.view.View a17 = (uVar == null || (centerComponent = uVar.getCenterComponent()) == null) ? null : centerComponent.a();
            xx0.c cVar = a17 instanceof xx0.c ? (xx0.c) a17 : null;
            if (cVar != null) {
                xx0.i iVar = cVar.f457862e;
                synchronized (iVar.f457908f) {
                    S0 = kz5.n0.S0(iVar.f457911i);
                }
                if (!(!S0.isEmpty()) || (z18 = cVar.f457867m)) {
                    if (S0.isEmpty() && (z17 = cVar.f457867m) && z17 && (tabLayout = cVar.f457863f) != null) {
                        java.util.List list = cVar.f457866i;
                        int i17 = cVar.f457868n;
                        list.remove(i17);
                        xx0.f0 f0Var = cVar.f457864g;
                        if (f0Var != null) {
                            f0Var.notifyDataSetChanged();
                        }
                        tabLayout.o(i17);
                        tabLayout.s(tabLayout.getSelectedTabPosition(), 0.0f, false, true);
                        cVar.f457867m = false;
                    }
                } else if (!z18 && (tabLayout2 = cVar.f457863f) != null) {
                    java.lang.String string = cVar.getContext().getString(com.tencent.mm.R.string.oil);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    vt3.r rVar = new vt3.r(-1L, string, new vt3.n(null, null, null, null, 8, null), true);
                    java.util.List list2 = cVar.f457866i;
                    int i18 = cVar.f457868n;
                    list2.add(i18, rVar);
                    xx0.f0 f0Var2 = cVar.f457864g;
                    if (f0Var2 != null) {
                        f0Var2.notifyDataSetChanged();
                    }
                    android.view.View inflate = com.tencent.mm.ui.id.b(cVar.getContext()).inflate(com.tencent.mm.R.layout.f489424dk2, (android.view.ViewGroup) null);
                    ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.qoy)).setText(rVar.f440040b);
                    inflate.setTag(java.lang.Long.valueOf(rVar.f440039a));
                    oa.i l17 = tabLayout2.l();
                    l17.f343783f = inflate;
                    l17.f();
                    tabLayout2.c(l17, i18, tabLayout2.f44541d.isEmpty());
                    tabLayout2.s(tabLayout2.getSelectedTabPosition(), 0.0f, false, true);
                    cVar.f457867m = true;
                }
                xx0.f0 f0Var3 = cVar.f457864g;
                if (f0Var3 != null) {
                    java.util.Iterator it = f0Var3.f457896e.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((vt3.r) obj2).f440042d) {
                            break;
                        }
                    }
                    vt3.r rVar2 = (vt3.r) obj2;
                    if (rVar2 != null) {
                        xx0.e0 e0Var = (xx0.e0) ((java.util.LinkedHashMap) f0Var3.f457899h).get(java.lang.Long.valueOf(rVar2.f440039a));
                        if (e0Var != null && (d0Var = e0Var.f457888a) != null) {
                            kotlinx.coroutines.l.d(d0Var.f457876d, null, null, new xx0.c0(d0Var, null), 3, null);
                        }
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
