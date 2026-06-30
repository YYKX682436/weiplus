package ni2;

/* loaded from: classes10.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.p2 f337386d;

    public m2(ni2.p2 p2Var) {
        this.f337386d = p2Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        km2.q qVar;
        java.lang.String str;
        java.util.LinkedList<xh2.a> linkedList;
        xh2.a aVar;
        java.util.HashMap hashMap;
        km2.q qVar2;
        java.lang.String str2;
        int itemId = menuItem.getItemId();
        fj2.s sVar = fj2.s.f263183a;
        ni2.p2 p2Var = this.f337386d;
        if (itemId == 1) {
            ml2.w4 w4Var = ml2.w4.f328191i;
            xh2.a aVar2 = p2Var.f337418d;
            fj2.s.h(sVar, w4Var, (aVar2 == null || (qVar = aVar2.f454520a) == null || (str = qVar.f309172c) == null) ? "" : str, 0, 0, 12, null);
            ((ni2.f1) ((jz5.n) p2Var.f337421g).getValue()).B(p2Var.f337418d, p2Var.f337419e);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ml2.w4 w4Var2 = ml2.w4.f328195p;
        xh2.a aVar3 = p2Var.f337418d;
        fj2.s.h(sVar, w4Var2, (aVar3 == null || (qVar2 = aVar3.f454520a) == null || (str2 = qVar2.f309172c) == null) ? "" : str2, 0, 0, 12, null);
        xh2.c cVar = (xh2.c) ((mm2.o4) p2Var.f337416b.a(mm2.o4.class)).A.getValue();
        if (cVar == null || (linkedList = cVar.f454531a) == null || (aVar = p2Var.f337418d) == null) {
            return;
        }
        ni2.k0 k0Var = (ni2.k0) ((jz5.n) p2Var.f337422h).getValue();
        k0Var.getClass();
        k0Var.w();
        java.util.HashMap hashMap2 = k0Var.f337353n;
        hashMap2.clear();
        k0Var.f337355p = aVar.a();
        for (xh2.a aVar4 : linkedList) {
            hashMap2.put(java.lang.Integer.valueOf(aVar4.f454521b.f454553e), aVar4);
        }
        java.util.HashMap hashMap3 = k0Var.f337354o;
        hashMap3.clear();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((xh2.a) it.next()).a());
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = k0Var.f337352m;
            if (!hasNext) {
                break;
            }
            xh2.a aVar5 = (xh2.a) it6.next();
            hashMap3.put(java.lang.Integer.valueOf(aVar5.f454521b.f454553e), aVar5);
            ij2.c cVar2 = (ij2.c) hashMap.get(java.lang.Integer.valueOf(aVar5.f454521b.f454553e));
            if (cVar2 != null) {
                cVar2.a(aVar5);
            }
        }
        ij2.c cVar3 = (ij2.c) hashMap.get(java.lang.Integer.valueOf(aVar.f454521b.f454553e));
        if (cVar3 != null) {
            cVar3.b(true);
            ((ni2.i0) k0Var.f337357r).invoke(java.lang.Integer.valueOf(aVar.f454521b.f454553e), cVar3);
        }
    }
}
