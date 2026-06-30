package gg1;

/* loaded from: classes7.dex */
public final class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.platformtools.o4 f271601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f271602e;

    public l1(com.tencent.mm.sdk.platformtools.o4 o4Var, x91.h hVar, int i17) {
        this.f271601d = o4Var;
        this.f271602e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.sdk.platformtools.o4 o4Var = this.f271601d;
        java.util.Set stringSet = o4Var.getStringSet("VideoCastDeviceManager.saveDevice", null);
        java.util.List V0 = stringSet != null ? kz5.n0.V0(stringSet) : null;
        x91.h hVar = this.f271602e;
        x91.c cVar = hVar.f452647a;
        java.lang.String str = cVar != null ? cVar.f452641i : null;
        if (V0 == null) {
            x.d dVar = new x.d(0);
            dVar.add(str);
            o4Var.putStringSet("VideoCastDeviceManager.saveDevice", dVar);
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
            return;
        }
        if (V0.contains(str)) {
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
            return;
        }
        if (V0.size() >= 2) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(V0, 10));
            java.util.Iterator it = V0.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(o4Var.getLong((java.lang.String) it.next(), 0L)));
            }
            kz5.n0.D0(arrayList);
            o4Var.W((java.lang.String) V0.get(0));
            V0.set(0, str);
            o4Var.putLong(str, java.lang.System.currentTimeMillis());
        }
        x91.c cVar2 = hVar.f452647a;
        V0.add(cVar2 != null ? cVar2.f452641i : null);
        o4Var.putStringSet("VideoCastDeviceManager.saveDevice", kz5.n0.X0(V0));
        o4Var.putLong(str, java.lang.System.currentTimeMillis());
    }
}
