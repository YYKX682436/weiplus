package zi2;

/* loaded from: classes3.dex */
public final class y implements lj2.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final gk2.e f473163a;

    public y(gk2.e buContext) {
        kotlin.jvm.internal.o.g(buContext, "buContext");
        this.f473163a = buContext;
    }

    @Override // lj2.t0
    public java.lang.String A() {
        return zl2.r4.f473950a.m0(this.f473163a).getHeadUrl();
    }

    @Override // lj2.t0
    public boolean B() {
        return zl2.r4.f473950a.M1(this.f473163a);
    }

    @Override // lj2.t0
    public java.lang.String C(java.lang.String str) {
        ((mm2.c1) this.f473163a.a(mm2.c1.class)).a7(str);
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public void D(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        ((mm2.c1) this.f473163a.a(mm2.c1.class)).I4 = bitmap;
    }

    @Override // lj2.t0
    public int E() {
        return ((om2.g) this.f473163a.a(om2.g.class)).f346317x;
    }

    @Override // lj2.t0
    public boolean F() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).O4;
    }

    @Override // lj2.t0
    public java.lang.String G(int i17) {
        return ((mm2.y2) this.f473163a.a(mm2.y2.class)).R6(i17);
    }

    @Override // lj2.t0
    public boolean H() {
        if (((mm2.c1) this.f473163a.a(mm2.c1.class)).T) {
            return true;
        }
        return ((mm2.n0) this.f473163a.a(mm2.n0.class)).f329273r;
    }

    @Override // lj2.t0
    public int I() {
        return ((mm2.e1) this.f473163a.a(mm2.e1.class)).R6();
    }

    @Override // lj2.t0
    public boolean J() {
        if (zl2.r4.f473950a.w1()) {
            return ((mm2.c1) this.f473163a.a(mm2.c1.class)).S4;
        }
        return true;
    }

    @Override // lj2.t0
    public dk2.u4 K() {
        return ((mm2.o4) this.f473163a.a(mm2.o4.class)).Z;
    }

    @Override // lj2.t0
    public void L(dk2.zf msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        ((mm2.x4) this.f473163a.a(mm2.x4.class)).f329528f.add(msg);
    }

    @Override // lj2.t0
    public boolean M() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).f328898v3;
    }

    @Override // lj2.t0
    public void N(boolean z17) {
        ((mm2.c1) this.f473163a.a(mm2.c1.class)).n9(z17);
    }

    @Override // lj2.t0
    public int O() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).f328801f2;
    }

    @Override // lj2.t0
    public kn0.i P() {
        return ((mm2.e1) this.f473163a.a(mm2.e1.class)).f328990t;
    }

    @Override // lj2.t0
    public boolean Q() {
        if (((mm2.c1) this.f473163a.a(mm2.c1.class)).I) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("LiveRoomBuContextAbility", "enableAudienceViewPkBoard false, do not open panel for audience or other users' contributor");
        return false;
    }

    @Override // lj2.t0
    public int a() {
        xh2.c cVar = (xh2.c) ((mm2.o4) this.f473163a.a(mm2.o4.class)).A.getValue();
        if (cVar != null) {
            return cVar.f454533c;
        }
        return 0;
    }

    @Override // lj2.t0
    public void b(yz5.l callback) {
        kotlin.jvm.internal.o.g(callback, "callback");
        ya2.b2 b17 = ya2.h.f460484a.b(((mm2.c1) this.f473163a.a(mm2.c1.class)).f328852o);
        if (b17 != null) {
            zl2.r4.f473950a.Y(b17.y0(), new zi2.x(callback));
        }
    }

    @Override // lj2.t0
    public boolean c() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).H;
    }

    @Override // lj2.t0
    public boolean d(int i17) {
        return ((mm2.y2) this.f473163a.a(mm2.y2.class)).b7(i17);
    }

    @Override // lj2.t0
    public long e() {
        if (((mm2.e1) this.f473163a.a(mm2.e1.class)).f328988r != null) {
            return r0.getInteger(1);
        }
        return -1L;
    }

    @Override // lj2.t0
    public android.graphics.Bitmap f() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).I4;
    }

    @Override // lj2.t0
    public java.util.List g() {
        java.util.List list = ((mm2.o4) this.f473163a.a(mm2.o4.class)).f329324s;
        kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
        return list;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x005d, code lost:
    
        if (r4 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0062, code lost:
    
        if (r4 == null) goto L20;
     */
    @Override // lj2.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(km2.q r15) {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zi2.y.h(km2.q):int");
    }

    @Override // lj2.t0
    public boolean i() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).Q4;
    }

    @Override // lj2.t0
    public boolean j(java.lang.String sdkUserId) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        r45.yx1 Q6 = ((om2.g) this.f473163a.a(om2.g.class)).Q6();
        return kotlin.jvm.internal.o.b(Q6 != null ? Q6.f391469r : null, sdkUserId);
    }

    @Override // lj2.t0
    public int k() {
        return ((mm2.e1) this.f473163a.a(mm2.e1.class)).U6();
    }

    @Override // lj2.t0
    public java.util.List l() {
        java.util.List list = ((mm2.o4) this.f473163a.a(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        return list;
    }

    @Override // lj2.t0
    public fj2.k m(java.lang.String sdkUserId) {
        kotlin.jvm.internal.o.g(sdkUserId, "sdkUserId");
        return ((mm2.y2) this.f473163a.a(mm2.y2.class)).U6(sdkUserId);
    }

    @Override // lj2.t0
    public boolean n() {
        return ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((mm2.o4) this.f473163a.a(mm2.o4.class)).H).getValue()).booleanValue();
    }

    @Override // lj2.t0
    public boolean o() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).L;
    }

    @Override // lj2.t0
    public java.lang.String p() {
        java.lang.String str = ((mm2.e1) this.f473163a.a(mm2.e1.class)).f328987q.f380301n;
        return str == null ? "" : str;
    }

    @Override // lj2.t0
    public long q() {
        r45.nw1 liveInfo;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) this.f473163a.a(mm2.c1.class)).f328846n;
        if (finderObject == null || (liveInfo = finderObject.getLiveInfo()) == null) {
            return 0L;
        }
        return liveInfo.getLong(0);
    }

    @Override // lj2.t0
    public java.lang.String r() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).f328852o;
    }

    @Override // lj2.t0
    public java.lang.String s() {
        java.lang.String m86 = ((mm2.c1) this.f473163a.a(mm2.c1.class)).m8();
        return m86 == null ? "" : m86;
    }

    @Override // lj2.t0
    public java.util.List t() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        gk2.e eVar = this.f473163a;
        arrayList.add(((mm2.o4) eVar.a(mm2.o4.class)).a7());
        arrayList.addAll(((mm2.o4) eVar.a(mm2.o4.class)).f329327v);
        arrayList.addAll(((mm2.o4) eVar.a(mm2.o4.class)).f329324s);
        return arrayList;
    }

    @Override // lj2.t0
    public boolean u() {
        return zl2.r4.f473950a.a2(this.f473163a);
    }

    @Override // lj2.t0
    public boolean v() {
        return ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) this.f473163a.a(om2.e.class)).f346294m).getValue()).booleanValue();
    }

    @Override // lj2.t0
    public boolean w() {
        gk2.e eVar = this.f473163a;
        return ((mm2.c1) eVar.a(mm2.c1.class)).G || ((mm2.e1) eVar.a(mm2.e1.class)).g7();
    }

    @Override // lj2.t0
    public boolean x() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).K;
    }

    @Override // lj2.t0
    public int y() {
        r45.kf5 kf5Var;
        r45.il4 il4Var = ((mm2.o4) this.f473163a.a(mm2.o4.class)).U;
        if (il4Var == null || (kf5Var = il4Var.f377132g) == null) {
            return 0;
        }
        return kf5Var.f378657e;
    }

    @Override // lj2.t0
    public com.tencent.mm.protocal.protobuf.FinderObject z() {
        return ((mm2.c1) this.f473163a.a(mm2.c1.class)).f328846n;
    }
}
