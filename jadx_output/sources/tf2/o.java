package tf2;

/* loaded from: classes3.dex */
public final class o extends if2.b implements mf2.c {

    /* renamed from: m, reason: collision with root package name */
    public km2.q f418939m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f418940n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f418940n = new java.util.ArrayList();
    }

    @Override // mf2.c
    public void M2(xh2.b micInfoData) {
        kotlin.jvm.internal.o.g(micInfoData, "micInfoData");
        tf2.n nVar = (tf2.n) controller(tf2.n.class);
        boolean z17 = false;
        if (nVar != null && nVar.f418938m) {
            z17 = true;
        }
        Z6(z17);
    }

    public final synchronized void Z6(boolean z17) {
        java.lang.Object obj;
        java.util.List list;
        java.lang.Object obj2;
        java.lang.Object obj3 = null;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            dk2.u4 u4Var = ((mm2.o4) business(mm2.o4.class)).Z;
            if (u4Var != null && (list = u4Var.f234163j) != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj4 : list) {
                    java.util.LinkedList list2 = ((r45.r22) obj4).getList(0);
                    kotlin.jvm.internal.o.f(list2, "getMembers(...)");
                    java.util.Iterator it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (kotlin.jvm.internal.o.b(((r45.wk6) obj2).getString(1), ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    if (obj2 == null) {
                        arrayList2.add(obj4);
                    }
                }
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    java.util.LinkedList list3 = ((r45.r22) it6.next()).getList(0);
                    kotlin.jvm.internal.o.f(list3, "getMembers(...)");
                    arrayList.addAll(list3);
                }
            }
            ((java.util.ArrayList) this.f418940n).clear();
            java.util.List list4 = this.f418940n;
            java.util.List list5 = ((mm2.o4) business(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list5, "<get-anchorPkMicUserList>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (java.lang.Object obj5 : list5) {
                km2.q qVar = (km2.q) obj5;
                java.util.Iterator it7 = arrayList.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (kotlin.jvm.internal.o.b(((r45.wk6) obj).getString(1), qVar.f309170a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                if (obj != null) {
                    arrayList3.add(obj5);
                }
            }
            ((java.util.ArrayList) list4).addAll(arrayList3);
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo pkAnchorBucket.size=" + ((java.util.ArrayList) this.f418940n).size());
            java.util.Iterator it8 = ((java.util.ArrayList) this.f418940n).iterator();
            while (it8.hasNext()) {
                km2.q qVar2 = (km2.q) it8.next();
                com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo nickname=" + qVar2.f309173d + ", sdkuserid=" + qVar2.f309170a);
            }
            if (this.f418939m != null) {
                java.util.Iterator it9 = this.f418940n.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it9.next();
                    java.lang.String str = ((km2.q) next).f309170a;
                    km2.q qVar3 = this.f418939m;
                    if (kotlin.jvm.internal.o.b(str, qVar3 != null ? qVar3.f309170a : null)) {
                        obj3 = next;
                        break;
                    }
                }
                if (obj3 != null) {
                    com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo do not need replace. Now is " + this.f418939m);
                }
            }
            a7((km2.q) kz5.n0.w0(this.f418940n, c06.e.f37716d));
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "refreshTargetInfo replace to " + this.f418939m);
        } else {
            ((java.util.ArrayList) this.f418940n).clear();
            a7(null);
        }
    }

    public final void a7(km2.q qVar) {
        java.lang.Object obj;
        java.util.Iterator it = this.f418940n.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, qVar != null ? qVar.f309170a : null)) {
                    break;
                }
            }
        }
        if (obj != null) {
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "set currentPickUser find it. " + qVar);
        } else {
            com.tencent.mars.xlog.Log.i("FinderLivePkGiftTargetPickerController", "set currentPickUser not found, set null. " + qVar);
            qVar = null;
        }
        this.f418939m = qVar;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }
}
