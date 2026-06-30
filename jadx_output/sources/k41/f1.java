package k41;

/* loaded from: classes11.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f303989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f303990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f303991f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f303992g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k41.g0 f303993h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.gk3 f303994i;

    public f1(java.util.ArrayList arrayList, int i17, int i18, java.lang.String str, k41.g0 g0Var, r45.gk3 gk3Var) {
        this.f303989d = arrayList;
        this.f303990e = i17;
        this.f303991f = i18;
        this.f303992g = str;
        this.f303993h = g0Var;
        this.f303994i = gk3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        java.util.ArrayList<j41.w> arrayList = this.f303989d;
        if (arrayList != null) {
            for (j41.w wVar : arrayList) {
                j41.i0 i0Var = new j41.i0();
                i0Var.f297640a = this.f303990e;
                i0Var.f297641b = this.f303991f;
                i0Var.f297642c = this.f303992g;
                i0Var.f297643d = this.f303993h;
                java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
                r45.gk3 gk3Var = this.f303994i;
                i0Var.f297644e = gk3Var != null ? gk3Var.f375312e : 3;
                if (gk3Var == null || (str = gk3Var.f375313f) == null) {
                    str = "";
                }
                i0Var.f297645f = str;
                wVar.a(i0Var);
            }
        }
    }
}
