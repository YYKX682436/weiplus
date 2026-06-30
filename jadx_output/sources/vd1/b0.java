package vd1;

/* loaded from: classes7.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f435564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(java.util.List list) {
        super(2);
        this.f435564d = list;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.appbrand.networking.p pVar = (com.tencent.mm.plugin.appbrand.networking.p) obj2;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOperateRealtimeReport.RealtimeReportQueue", "onCgiBack, isSucceed:" + booleanValue + ", exception:" + pVar);
        java.util.WeakHashMap weakHashMap = new java.util.WeakHashMap();
        java.util.List<vd1.y> list = this.f435564d;
        if (booleanValue) {
            for (vd1.y yVar : list) {
                com.tencent.mm.plugin.appbrand.y yVar2 = (com.tencent.mm.plugin.appbrand.y) yVar.f435626e.get();
                if (yVar2 != null) {
                    java.util.LinkedList linkedList = (java.util.LinkedList) weakHashMap.get(yVar2);
                    if (linkedList == null) {
                        linkedList = new java.util.LinkedList();
                        weakHashMap.put(yVar2, linkedList);
                    }
                    linkedList.addLast(yVar);
                }
                vd1.n nVar = new vd1.n();
                nVar.b((com.tencent.mm.plugin.appbrand.y) yVar.f435626e.get());
                nVar.f435605f = yVar.f435622a;
                nVar.f435606g = yVar.f435623b;
                vd1.l lVar = yVar.f435625d;
                kotlin.jvm.internal.o.g(lVar, "<set-?>");
                nVar.f435607h = lVar;
                nVar.f435608i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(vd1.f0.f435575c);
                nVar.f435609j = yVar.f435628g - 1;
                nVar.f435610k = vd1.m.f435596f;
                nVar.a();
            }
            vd1.f0 f0Var = vd1.f0.f435573a;
            ((ch1.c) f0Var.c()).b(1074L, 2L, list.size());
            f0Var.c().a(1074L, 5L);
        } else {
            int i17 = 0;
            for (vd1.y yVar3 : list) {
                if (vd1.f0.f435578f.b(yVar3)) {
                    i17++;
                } else {
                    java.lang.ref.WeakReference weakReference = yVar3.f435626e;
                    com.tencent.mm.plugin.appbrand.y yVar4 = (com.tencent.mm.plugin.appbrand.y) weakReference.get();
                    if (yVar4 != null) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) weakHashMap.get(yVar4);
                        if (linkedList2 == null) {
                            linkedList2 = new java.util.LinkedList();
                            weakHashMap.put(yVar4, linkedList2);
                        }
                        linkedList2.addLast(yVar3);
                    }
                    vd1.n nVar2 = new vd1.n();
                    nVar2.b((com.tencent.mm.plugin.appbrand.y) weakReference.get());
                    nVar2.f435605f = yVar3.f435622a;
                    nVar2.f435606g = yVar3.f435623b;
                    vd1.l lVar2 = yVar3.f435625d;
                    kotlin.jvm.internal.o.g(lVar2, "<set-?>");
                    nVar2.f435607h = lVar2;
                    nVar2.f435608i = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(vd1.f0.f435575c);
                    nVar2.f435609j = yVar3.f435628g - 1;
                    nVar2.f435610k = vd1.m.f435597g;
                    nVar2.a();
                }
            }
            if (i17 > 0) {
                ((ch1.c) vd1.f0.f435573a.c()).b(1074L, 0L, i17);
            }
        }
        java.util.Set<java.util.Map.Entry> entrySet = weakHashMap.entrySet();
        kotlin.jvm.internal.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            com.tencent.mm.plugin.appbrand.jsapi.l lVar3 = (com.tencent.mm.plugin.appbrand.jsapi.l) entry.getKey();
            if (lVar3 != null && lVar3.isRunning()) {
                vd1.j jVar = new vd1.j();
                jVar.u(lVar3);
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("errcode", java.lang.Integer.valueOf(booleanValue ? 0 : com.tencent.mm.plugin.appbrand.networking.o.SERVER == (pVar != null ? pVar.f86120d : null) ? pVar.f86121e : -9999));
                hashMap.put("errmsg", pVar != null ? pVar.f86122f : null);
                java.lang.Object value = entry.getValue();
                kotlin.jvm.internal.o.f(value, "<get-value>(...)");
                java.lang.Iterable iterable = (java.lang.Iterable) value;
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
                java.util.Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(java.lang.Long.valueOf(((vd1.y) it.next()).f435624c.length()));
                }
                hashMap.put("dataSize", java.lang.Long.valueOf(kz5.n0.J0(arrayList)));
                java.lang.Object value2 = entry.getValue();
                kotlin.jvm.internal.o.f(value2, "<get-value>(...)");
                java.lang.Iterable iterable2 = (java.lang.Iterable) value2;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(iterable2, 10));
                java.util.Iterator it6 = iterable2.iterator();
                while (it6.hasNext()) {
                    arrayList2.add(java.lang.Integer.valueOf(((vd1.y) it6.next()).f435622a));
                }
                hashMap.put("idList", new org.json.JSONArray((java.util.Collection) kz5.n0.S0(arrayList2)));
                jVar.t(hashMap);
                jVar.m();
            }
        }
        return jz5.f0.f302826a;
    }
}
