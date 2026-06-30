package ea1;

/* loaded from: classes12.dex */
public class f extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public int f250515n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ ea1.g f250516o;

    public f(ea1.g gVar) {
        this.f250516o = gVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "UpdateWeAppIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).getClass();
        java.util.LinkedList<com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo> linkedList = new java.util.LinkedList();
        if (com.tencent.mm.plugin.appbrand.app.r9.hj() != null) {
            java.util.ArrayList L0 = com.tencent.mm.plugin.appbrand.appusage.f3.L0(com.tencent.mm.plugin.appbrand.app.r9.hj().b1(null, 10000, 0, Integer.MAX_VALUE));
            if (!com.tencent.mm.sdk.platformtools.t8.L0(L0)) {
                linkedList.addAll(L0);
            }
        }
        if (linkedList.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchWeAppLogic", "WeApp recent usage list is nil.");
            return true;
        }
        this.f250515n = linkedList.size();
        ea1.g gVar = this.f250516o;
        gVar.f250518f.h();
        gVar.f250518f.k(o13.d.f342218d);
        for (com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo appBrandRecentTaskInfo : linkedList) {
            java.lang.String str = appBrandRecentTaskInfo.f76354v;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = str;
            int hashCode = str2.hashCode();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            long j17 = hashCode;
            gVar.f250518f.u(393216, 1, j17, str2, currentTimeMillis, appBrandRecentTaskInfo.f76356x);
            ea1.h hVar = gVar.f250518f;
            java.lang.String str3 = appBrandRecentTaskInfo.f76356x;
            hVar.u(393216, 2, j17, str2, currentTimeMillis, o13.n.i(str3, false));
            gVar.f250518f.u(393216, 3, j17, str2, currentTimeMillis, o13.n.i(str3, true));
        }
        gVar.f250518f.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{updateSize: %d}", java.lang.Integer.valueOf(this.f250515n));
    }
}
