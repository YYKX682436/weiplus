package jf2;

/* loaded from: classes3.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.u f299392d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f299393e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f299394f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jf2.u uVar, java.lang.String str, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f299392d = uVar;
        this.f299393e = str;
        this.f299394f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new jf2.r(this.f299392d, this.f299393e, this.f299394f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((jf2.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        int i17;
        jf2.v vVar;
        java.util.List list;
        int i18;
        int i19;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jf2.u uVar = this.f299392d;
        java.lang.String str = uVar.f299398m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[calculateFoldedState-");
        java.lang.String str2 = this.f299393e;
        sb6.append(str2);
        sb6.append("] enter");
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        java.util.LinkedList linkedList = uVar.f299401p;
        java.lang.String Z6 = uVar.Z6(linkedList);
        jf2.w wVar = uVar.f299404s;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = wVar.f299407a;
        int R6 = ((mm2.e1) liveRoomControllerStore.business(mm2.e1.class)).R6();
        int U6 = ((mm2.e1) liveRoomControllerStore.business(mm2.e1.class)).U6();
        if (R6 != 1) {
            if (R6 != 2) {
                if (R6 == 3) {
                    boolean a17 = wVar.a(25);
                    boolean a18 = wVar.a(16);
                    vVar = (a17 && a18) ? new jf2.v(kz5.c0.i(25, 11, 16, 6), null, 2, null) : (!a17 || a18) ? (a17 || !a18) ? new jf2.v(kz5.c0.i(11, 6, 8, 2), null, 2, null) : new jf2.v(kz5.c0.i(11, 16, 6, 8), null, 2, null) : new jf2.v(kz5.c0.i(25, 11, 6, 8), null, 2, null);
                } else if (R6 != 4) {
                    com.tencent.mars.xlog.Log.e(wVar.f299409c, "getPriorityListByLiveMode: unknown live mode: " + R6);
                    vVar = new jf2.v(wVar.b(), null, 2, null);
                } else {
                    vVar = wVar.c();
                }
            } else if (U6 == 8) {
                vVar = wVar.c();
            } else if (wVar.a(11)) {
                vVar = new jf2.v(kz5.c0.i(18, 10, 6, 8), null, 2, null);
                i17 = 0;
            } else {
                vVar = new jf2.v(kz5.c0.i(18, 10, 11, 6), null, 2, null);
            }
            i17 = 0;
        } else {
            boolean a19 = wVar.a(11);
            boolean a27 = wVar.a(16);
            if (!a19 && !a27) {
                vVar = new jf2.v(kz5.c0.i(24, 10, 6, 8), null, 2, null);
            } else if (!a19 && a27) {
                vVar = new jf2.v(kz5.c0.i(24, 10, 16, 6), null, 2, null);
            } else if (a19 && !a27) {
                vVar = new jf2.v(kz5.c0.i(24, 10, 11, 6), null, 2, null);
            } else if (wVar.a(10)) {
                i17 = 0;
                vVar = new jf2.v(kz5.c0.i(10, 11, 16), kz5.b0.c(24));
            } else {
                i17 = 0;
                vVar = new jf2.v(kz5.c0.i(24, 11, 16), kz5.b0.c(10));
            }
            i17 = 0;
        }
        java.util.List b17 = wVar.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = b17.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = vVar.f299405a;
            if (!hasNext) {
                break;
            }
            java.lang.Object next = it.next();
            int intValue = ((java.lang.Number) next).intValue();
            if (((list.contains(java.lang.Integer.valueOf(intValue)) || vVar.f299406b.contains(java.lang.Integer.valueOf(intValue))) ? i17 : 1) != 0) {
                arrayList.add(next);
            }
        }
        java.util.List t07 = kz5.n0.t0(list, arrayList);
        java.lang.String str3 = "[initBtnList-" + str2 + "] 新页面布局已启用，获取优先级列表: " + kz5.n0.g0(t07, null, null, null, 0, null, null, 63, null);
        java.lang.String str4 = uVar.f299398m;
        com.tencent.mars.xlog.Log.i(str4, str3);
        linkedList.clear();
        java.util.LinkedList linkedList2 = uVar.f299400o;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList2) {
            if (((((jf2.h) obj2).i() || ((java.lang.Boolean) ae2.in.S7.r()).booleanValue()) ? 1 : i17) != 0) {
                arrayList2.add(obj2);
            }
        }
        if (!(!arrayList2.isEmpty())) {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            linkedList3.addAll(arrayList2);
            com.tencent.mars.xlog.Log.i(str4, "[initBtnList-" + str2 + "] 过滤后的可见按钮数量: " + linkedList3.size());
            if (linkedList3.size() > 1) {
                kz5.g0.t(linkedList3, new jf2.t(t07, uVar, str2));
            }
            linkedList.addAll(linkedList3);
        }
        java.lang.String Z62 = uVar.Z6(linkedList);
        boolean z17 = !kotlin.jvm.internal.o.b(Z6, Z62);
        if (z17) {
            com.tencent.mars.xlog.Log.i(str4, "[initBtnList-" + str2 + "] 按钮列表发生变化，oldMd5 = " + Z6 + ", newMd5 = " + Z62);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[initBtnList-");
            sb7.append(str2);
            sb7.append("] 最终可见按钮列表: ");
            i18 = 1;
            i19 = i17;
            sb7.append(kz5.n0.g0(linkedList, null, null, null, 0, null, jf2.s.f299395d, 31, null));
            com.tencent.mars.xlog.Log.i(str4, sb7.toString());
        } else {
            i18 = 1;
            i19 = i17;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17 && !this.f299394f) {
            com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + str2 + "] 按钮列表未变化且不需要强制刷新，直接返回");
            return f0Var;
        }
        java.util.LinkedList linkedList4 = uVar.f299400o;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : linkedList4) {
            if (!((jf2.h) obj3).i()) {
                arrayList3.add(obj3);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3.isEmpty() ^ true ? arrayList3 : null;
        if (arrayList4 != null) {
            com.tencent.mars.xlog.Log.i(uVar.f299398m, "[checkUnableEntrances] unable list = ".concat(uVar.Z6(arrayList4)));
            java.util.Iterator it6 = arrayList4.iterator();
            while (it6.hasNext()) {
                ((jf2.h) it6.next()).g();
            }
        }
        uVar.f299403r.clear();
        uVar.f299402q.clear();
        int i27 = uVar.f299399n;
        int i28 = uVar.f299401p.size() > i27 ? i18 : i19;
        uVar.f299403r.addAll(kz5.n0.K0(uVar.f299401p, i27));
        if (i28 != 0) {
            java.util.LinkedList linkedList5 = uVar.f299402q;
            java.util.LinkedList linkedList6 = uVar.f299401p;
            linkedList5.addAll(kz5.n0.L0(linkedList6, linkedList6.size() - i27));
        }
        com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + str2 + "] 初始外露按钮: " + uVar.f299403r.size() + ", 折叠按钮: " + uVar.f299402q.size());
        java.util.LinkedList linkedList7 = uVar.f299402q;
        java.util.ArrayList<jf2.i> arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj4 : linkedList7) {
            if (obj4 instanceof jf2.i) {
                arrayList5.add(obj4);
            }
        }
        java.util.LinkedList linkedList8 = uVar.f299403r;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        for (java.lang.Object obj5 : linkedList8) {
            if (obj5 instanceof jf2.j) {
                arrayList6.add(obj5);
            }
        }
        java.util.LinkedList linkedList9 = new java.util.LinkedList(arrayList6);
        com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + str2 + "] 需要调整的不可折叠按钮数量: " + arrayList5.size());
        for (jf2.i iVar : arrayList5) {
            uVar.f299402q.remove(iVar);
            uVar.f299403r.addLast(iVar);
            jf2.j jVar = (jf2.j) kz5.n0.k0(linkedList9);
            if (jVar != null) {
                uVar.f299402q.add(jVar);
            }
        }
        com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + str2 + "] 调整后外露按钮: " + uVar.f299403r.size() + ", 折叠按钮: " + uVar.f299402q.size());
        java.lang.String str5 = uVar.f299398m;
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[calculateFoldedState-");
        sb8.append(str2);
        sb8.append("] 启用新页面布局，开始调整按钮显示顺序");
        com.tencent.mars.xlog.Log.i(str5, sb8.toString());
        java.lang.String str6 = uVar.f299398m;
        com.tencent.mars.xlog.Log.i(str6, "[adjustButtonDisplayOrder] 开始调整按钮显示顺序");
        java.util.LinkedList linkedList10 = uVar.f299403r;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        for (java.lang.Object obj6 : linkedList10) {
            if (obj6 instanceof xt2.m6) {
                arrayList7.add(obj6);
            }
        }
        com.tencent.mars.xlog.Log.i(str6, "[adjustButtonDisplayOrder] 找到可调整的widget数量: " + arrayList7.size());
        com.tencent.mars.xlog.Log.i(str6, "[adjustButtonDisplayOrder] 当前outer按钮列表: ".concat(kz5.n0.g0(linkedList10, null, null, null, 0, null, jf2.p.f299390d, 31, null)));
        java.util.Iterator it7 = ((kz5.l1) kz5.i0.H(arrayList7)).iterator();
        while (true) {
            kz5.k1 k1Var = (kz5.k1) it7;
            if (!k1Var.hasNext()) {
                break;
            }
            android.view.ViewGroup h17 = ((xt2.m6) k1Var.next()).h();
            android.view.ViewParent parent = h17.getParent();
            if (parent instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
                viewGroup.removeView(h17);
                viewGroup.addView(h17, i19);
            }
        }
        com.tencent.mars.xlog.Log.i(str6, "[adjustButtonDisplayOrder] 按钮顺序已调整为: ".concat(kz5.n0.g0(linkedList10, null, null, null, 0, null, jf2.q.f299391d, 31, null)));
        java.util.Iterator it8 = uVar.f299403r.iterator();
        while (it8.hasNext()) {
            ((jf2.h) it8.next()).b();
        }
        java.util.Iterator it9 = uVar.f299402q.iterator();
        while (it9.hasNext()) {
            ((jf2.h) it9.next()).g();
        }
        ((mm2.c1) uVar.business(mm2.c1.class)).K2.postValue(java.lang.Boolean.TRUE);
        com.tencent.mars.xlog.Log.i(uVar.f299398m, "[calculateFoldedState-" + str2 + "] 完成折叠状态计算");
        return f0Var;
    }
}
