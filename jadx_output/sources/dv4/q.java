package dv4;

/* loaded from: classes.dex */
public class q extends dv4.a {

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f244034c;

    public q(java.lang.String str, int i17) {
        super(str, i17);
        this.f244034c = java.util.Collections.emptyList();
    }

    @Override // dv4.a
    public void a(java.util.List list) {
        this.f244034c = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p13.y yVar = (p13.y) it.next();
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(yVar.f351187e, true);
            dv4.p pVar = new dv4.p();
            pVar.f244028a = n17.d1();
            pVar.f244029b = yVar.f351190h;
            pVar.f244030c = n17.P0();
            pVar.f244031d = n17.w0();
            pVar.f244032e = n17.t0();
            pVar.f244033f = n17.f236589y1;
            this.f244034c.add(pVar);
        }
    }
}
