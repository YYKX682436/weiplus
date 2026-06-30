package l06;

/* loaded from: classes16.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final r06.y0 f314962a;

    static {
        h26.m mVar = h26.m.f278374a;
        r06.y yVar = new r06.y(h26.m.f278375b, l06.x.f314951f);
        o06.h hVar = o06.h.f341961e;
        n16.g f17 = l06.x.f314952g.f();
        o06.x1 x1Var = o06.x1.f342004a;
        e26.c0 c0Var = e26.u.f247037e;
        r06.y0 y0Var = new r06.y0(yVar, hVar, false, false, f17, x1Var, c0Var);
        y0Var.f368559p = o06.t0.f341988h;
        o06.g0 g0Var = o06.f0.f341945e;
        if (g0Var == null) {
            r06.y0.j0(9);
            throw null;
        }
        y0Var.f368560q = g0Var;
        java.util.List c17 = kz5.b0.c(r06.p1.x0(y0Var, p06.i.f350765a, false, f26.d3.f259144g, n16.g.k(androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE), 0, c0Var));
        if (y0Var.f368562s != null) {
            throw new java.lang.IllegalStateException("Type parameters are already set for " + y0Var.getName());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(c17);
        y0Var.f368562s = arrayList;
        y0Var.f368561r = new f26.q(y0Var, arrayList, y0Var.f368563t, y0Var.f368564u);
        java.util.Set emptySet = java.util.Collections.emptySet();
        if (emptySet == null) {
            r06.y0.j0(13);
            throw null;
        }
        java.util.Iterator it = emptySet.iterator();
        while (it.hasNext()) {
            ((r06.r) ((o06.n0) it.next())).C0(y0Var.k());
        }
        f314962a = y0Var;
    }
}
