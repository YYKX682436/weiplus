package kb0;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f306187a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f306188b;

    /* renamed from: c, reason: collision with root package name */
    public int f306189c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f306190d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f306191e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.recyclerview.widget.w2 f306192f;

    public b(java.util.HashMap commonReportMap, java.util.Map itemMap, com.tencent.mm.pluginsdk.ui.otherway.w wVar) {
        int i17;
        xj.m mVar;
        kotlin.jvm.internal.o.g(commonReportMap, "commonReportMap");
        kotlin.jvm.internal.o.g(itemMap, "itemMap");
        this.f306187a = commonReportMap;
        this.f306188b = itemMap;
        this.f306190d = new java.util.LinkedHashSet();
        this.f306192f = new kb0.a(this);
        java.lang.Boolean valueOf = (wVar == null || (mVar = wVar.f191022o) == null) ? null : java.lang.Boolean.valueOf(mVar.f454760h);
        if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.TRUE)) {
            i17 = 2;
        } else if (kotlin.jvm.internal.o.b(valueOf, java.lang.Boolean.FALSE)) {
            i17 = 1;
        } else {
            if (valueOf != null) {
                throw new jz5.j();
            }
            i17 = 0;
        }
        commonReportMap.put("yuanbao_user_state", java.lang.Integer.valueOf(i17));
    }

    public final void a(com.tencent.mm.pluginsdk.ui.otherway.w wVar, int i17, java.lang.String str) {
        boolean z17 = wVar.f191018h;
        java.util.HashMap hashMap = this.f306187a;
        if (z17) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_open_another_app", str, hashMap, 35480);
            return;
        }
        java.util.HashMap i18 = kz5.c1.i(new jz5.l("recent_app_index", java.lang.Integer.valueOf(i17)), new jz5.l("recent_app_name", wVar.a()));
        i18.putAll(hashMap);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("view_share_sheet_recent_apps", str, i18, 35480);
    }
}
