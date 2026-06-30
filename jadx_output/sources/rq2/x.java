package rq2;

/* loaded from: classes2.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final rq2.x f398914a = new rq2.x();

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f398915b = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(12, 1, 94);

    /* renamed from: c, reason: collision with root package name */
    public static long f398916c = c01.id.c();

    /* renamed from: d, reason: collision with root package name */
    public static long f398917d = c01.id.c();

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.String f398918e = "";

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.String f398919f = "1001";

    public final void a() {
        b(com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL, f398916c, c01.id.c(), f398919f, 1L);
    }

    public final void b(java.lang.String str, long j17, long j18, java.lang.String str2, long j19) {
        com.tencent.mm.autogen.mmdata.rpt.NearbyStayandSwitchTabStruct nearbyStayandSwitchTabStruct = new com.tencent.mm.autogen.mmdata.rpt.NearbyStayandSwitchTabStruct();
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        nearbyStayandSwitchTabStruct.f59644d = nearbyStayandSwitchTabStruct.b("SessionID", Ri, true);
        nearbyStayandSwitchTabStruct.f59645e = nearbyStayandSwitchTabStruct.b("PageName", str, true);
        long j27 = j18 - j17;
        if (j27 <= 0) {
            j27 = 0;
        }
        nearbyStayandSwitchTabStruct.f59646f = j27;
        nearbyStayandSwitchTabStruct.f59647g = j17;
        nearbyStayandSwitchTabStruct.f59648h = j18;
        nearbyStayandSwitchTabStruct.f59649i = nearbyStayandSwitchTabStruct.b("ClickTabContextID", str2, true);
        nearbyStayandSwitchTabStruct.f59650j = nearbyStayandSwitchTabStruct.b("Sid", "", true);
        nearbyStayandSwitchTabStruct.f59651k = j19;
        nearbyStayandSwitchTabStruct.f59652l = nearbyStayandSwitchTabStruct.b("ContextID", f398915b, true);
        nearbyStayandSwitchTabStruct.k();
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Zk(nearbyStayandSwitchTabStruct);
    }

    public final void c(com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment) {
        java.lang.String str;
        androidx.fragment.app.FragmentActivity activity;
        if (absNearByFragment == null || (str = absNearByFragment.getF121516t()) == null) {
            str = "";
        }
        f398919f = str + '-' + c01.id.c();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchInNearbyTab: currentClickTabContextID=");
        sb6.append(f398919f);
        com.tencent.mars.xlog.Log.i("NearbyTabLifecycleReporter", sb6.toString());
        if (absNearByFragment == null || (activity = absNearByFragment.getActivity()) == null) {
            return;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        if (nyVar != null) {
            nyVar.f135386r = f398919f;
            com.tencent.mm.plugin.finder.report.d5 d5Var = nyVar.L;
            if (d5Var != null) {
                d5Var.P0(nyVar.V6());
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar2 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.b(absNearByFragment).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        nyVar2.f135386r = f398919f;
        com.tencent.mm.plugin.finder.report.d5 d5Var2 = nyVar2.L;
        if (d5Var2 != null) {
            d5Var2.P0(nyVar2.V6());
        }
    }

    public final void d(com.tencent.mm.plugin.finder.nearby.base.AbsNearByFragment absNearByFragment) {
        java.lang.String str;
        if (absNearByFragment == null || (str = absNearByFragment.w0()) == null) {
            str = "";
        }
        long c17 = c01.id.c();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Bi(f398915b);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).Di(f398919f);
        b(str, f398917d, c17, f398919f, 0L);
        f398918e = f398919f;
        f398917d = c17;
    }
}
