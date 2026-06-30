package zo1;

/* loaded from: classes5.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f474590e;

    public e1(com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.ref.WeakReference weakReference) {
        this.f474589d = u3Var;
        this.f474590e = weakReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.Object obj;
        java.util.List i18 = com.tencent.mm.plugin.backup.roambackup.r0.f92684a.i(true);
        try {
            fo1.q qVar = new fo1.q();
            c01.d9.e().g(new ug3.i(gm0.j1.b().f273249l, 1, new fo1.b(new fo1.a(qVar))));
            com.tencent.mars.xlog.Log.i("AutoBindHelper", "post NetSceneGetOnlineInfo into NetSceneQueue");
            java.util.Iterator it = so1.b.f410226a.d().iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                po1.d dVar = (po1.d) it.next();
                if (!i18.isEmpty()) {
                    java.util.Iterator it6 = i18.iterator();
                    while (it6.hasNext()) {
                        if (kotlin.jvm.internal.o.b(((po1.d) it6.next()).f357300f, dVar.f357300f)) {
                            break;
                        }
                    }
                }
                i17 = 1;
                if (i17 != 0) {
                    ((java.util.ArrayList) i18).add(dVar);
                }
            }
            java.lang.Object obj2 = qVar.get();
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            for (po1.d dVar2 : (java.lang.Iterable) obj2) {
                java.util.Iterator it7 = i18.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj = it7.next();
                        if (kotlin.jvm.internal.o.b(dVar2.f357295a, ((po1.d) obj).f357295a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                po1.d dVar3 = (po1.d) obj;
                if (dVar3 != null) {
                    dVar3.f357302h = true;
                } else {
                    ((java.util.ArrayList) i18).add(dVar2);
                }
            }
            int size = ((java.util.ArrayList) i18).size() - 1;
            while (i17 < size) {
                while (i17 < size && ((po1.d) ((java.util.ArrayList) i18).get(i17)).f357302h) {
                    i17++;
                }
                while (i17 < size && !((po1.d) ((java.util.ArrayList) i18).get(size)).f357302h) {
                    size--;
                }
                if (i17 < size) {
                    java.util.ArrayList arrayList = (java.util.ArrayList) i18;
                    po1.d dVar4 = (po1.d) arrayList.get(i17);
                    java.util.ArrayList arrayList2 = (java.util.ArrayList) i18;
                    arrayList2.set(i17, arrayList.get(size));
                    arrayList2.set(size, dVar4);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", "Start select device, devices.count=" + ((java.util.ArrayList) i18).size());
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CreatePackageUI", e17.toString());
        }
        nf.e.f(new zo1.d1(this.f474589d, this.f474590e, i18));
    }
}
