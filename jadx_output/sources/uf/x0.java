package uf;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c1 f427122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x91.h f427123e;

    public x0(uf.c1 c1Var, x91.h hVar) {
        this.f427122d = c1Var;
        this.f427123e = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Set stringSet;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VideoCastDeviceManager.saveDevice");
        uf.c1 c1Var = this.f427122d;
        sb6.append(c1Var.f426982a);
        java.lang.String sb7 = sb6.toString();
        com.tencent.mm.sdk.platformtools.o4 d17 = c1Var.d();
        java.util.List V0 = (d17 == null || (stringSet = d17.getStringSet(sb7, null)) == null) ? null : kz5.n0.V0(stringSet);
        x91.c cVar = this.f427123e.f452647a;
        java.lang.String str = cVar != null ? cVar.f452641i : null;
        if (V0 == null) {
            com.tencent.mm.sdk.platformtools.o4 d18 = c1Var.d();
            if (d18 != null) {
                x.d dVar = new x.d(0);
                dVar.add(str);
                ((com.tencent.mm.sdk.platformtools.o4) d18.putStringSet(sb7, dVar)).putLong(str, java.lang.System.currentTimeMillis());
                return;
            }
            return;
        }
        if (V0.contains(str)) {
            com.tencent.mm.sdk.platformtools.o4 d19 = c1Var.d();
            if (d19 != null) {
                d19.putLong(str, java.lang.System.currentTimeMillis());
                return;
            }
            return;
        }
        if (2 <= V0.size()) {
            if (V0.size() > 1) {
                kz5.g0.t(V0, new uf.w0(c1Var));
            }
            com.tencent.mm.sdk.platformtools.o4 d27 = c1Var.d();
            if (d27 != null) {
                d27.W((java.lang.String) V0.get(0));
            }
            V0.remove(0);
        }
        V0.add(str);
        com.tencent.mm.sdk.platformtools.o4 d28 = c1Var.d();
        if (d28 != null) {
            ((com.tencent.mm.sdk.platformtools.o4) d28.putStringSet(sb7, kz5.n0.X0(V0))).putLong(str, java.lang.System.currentTimeMillis());
        }
    }
}
