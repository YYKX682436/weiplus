package ho1;

/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f282736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ho1.a1 f282737e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f282738f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(java.util.List list, ho1.a1 a1Var, long j17) {
        super(1);
        this.f282736d = list;
        this.f282737e = a1Var;
        this.f282738f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List<po1.d> list;
        boolean z17;
        java.lang.Object obj2;
        java.util.List onlineDevices = (java.util.List) obj;
        kotlin.jvm.internal.o.g(onlineDevices, "onlineDevices");
        java.util.Iterator it = onlineDevices.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f282736d;
            if (!hasNext) {
                break;
            }
            po1.d dVar = (po1.d) it.next();
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it6.next();
                if (kotlin.jvm.internal.o.b(dVar.f357295a, ((po1.d) obj2).f357295a)) {
                    break;
                }
            }
            po1.d dVar2 = (po1.d) obj2;
            if (dVar2 != null) {
                dVar2.f357302h = true;
                java.lang.String str = dVar.f357297c;
                if (str != null) {
                    dVar2.f357297c = str;
                }
            } else {
                list.add(dVar);
            }
        }
        int size = list.size() - 1;
        int i17 = 0;
        while (i17 < size) {
            while (i17 < size && ((po1.d) list.get(i17)).f357302h) {
                i17++;
            }
            while (i17 < size && !((po1.d) list.get(size)).f357302h) {
                size--;
            }
            if (i17 < size) {
                po1.d dVar3 = (po1.d) list.get(i17);
                list.set(i17, list.get(size));
                list.set(size, dVar3);
            }
        }
        ho1.a1 a1Var = this.f282737e;
        com.tencent.mars.xlog.Log.i(a1Var.f282622a, "Start select device, devices.count=" + list.size() + " onlineDevices.count=" + onlineDevices.size());
        java.util.List b17 = ro1.v.f398014a.b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (po1.d dVar4 : list) {
            if (dVar4.f357296b == po1.g.f357310h) {
                java.util.ArrayList arrayList2 = (java.util.ArrayList) b17;
                if (!arrayList2.isEmpty()) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (it7.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((po1.d) it7.next()).f357300f, dVar4.f357300f)) {
                            z17 = true;
                            break;
                        }
                    }
                }
                z17 = false;
                dVar4.f357302h = z17;
            }
            arrayList.add(dVar4.e());
        }
        if (arrayList.size() > 0) {
            com.tencent.mars.xlog.Log.i(a1Var.f282622a, "Start select device, devices.name=" + ((com.tencent.wechat.aff.affroam.q0) arrayList.get(0)).f215959g);
        }
        com.tencent.wechat.aff.affroam.e0 e0Var = a1Var.f282623b;
        if (e0Var != null) {
            e0Var.V0(this.f282738f, arrayList);
        }
        return jz5.f0.f302826a;
    }
}
