package ea1;

/* loaded from: classes12.dex */
public class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f250511n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f250512o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ ea1.g f250513p;

    public d(ea1.g gVar, java.lang.String str) {
        this.f250513p = gVar;
        this.f250511n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "InsertWeAppTask";
    }

    @Override // p13.c
    public boolean i() {
        ea1.g gVar = this.f250513p;
        gVar.f250518f.h();
        ea1.h hVar = gVar.f250518f;
        int[] iArr = o13.d.f342218d;
        java.lang.String str = this.f250511n;
        hVar.m0(iArr, str);
        com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo wi6 = ((et.i2) ((ft.l4) i95.n0.c(ft.l4.class))).wi(str);
        if (wi6 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str2 = wi6.f76354v;
            if (str2 == null) {
                str2 = "";
            }
            java.lang.String str3 = str2;
            long hashCode = str3.hashCode();
            gVar.f250518f.u(393216, 1, hashCode, str3, currentTimeMillis, wi6.f76356x);
            ea1.h hVar2 = gVar.f250518f;
            java.lang.String str4 = wi6.f76356x;
            hVar2.u(393216, 2, hashCode, str3, currentTimeMillis, o13.n.i(str4, false));
            gVar.f250518f.u(393216, 3, hashCode, str3, currentTimeMillis, o13.n.i(str4, true));
            this.f250512o = str4;
        }
        gVar.f250518f.j();
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{name: %s id: %s}", this.f250512o, this.f250511n);
    }
}
