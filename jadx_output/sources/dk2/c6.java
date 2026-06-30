package dk2;

/* loaded from: classes3.dex */
public final class c6 implements hn0.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f233277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f233278b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.s f233279c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f233280d;

    public c6(gk2.e eVar, dk2.xf xfVar, yz5.s sVar, dk2.k6 k6Var) {
        this.f233277a = eVar;
        this.f233278b = xfVar;
        this.f233279c = sVar;
        this.f233280d = k6Var;
    }

    @Override // hn0.i
    public void callback(int i17, android.os.Bundle bundle) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("on enterRoom finish, liveData.business(LiveCommonSlice::class.java).enableAudioMode():");
        gk2.e eVar = this.f233277a;
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).l7());
        sb6.append(" audioModeHolderBm:");
        sb6.append(((mm2.c1) eVar.a(mm2.c1.class)).I4);
        com.tencent.mars.xlog.Log.i("FinderLiveExternalHelper", sb6.toString());
        dk2.xf xfVar = this.f233278b;
        if (i17 > 0) {
            com.tencent.mm.plugin.finder.assist.u8.f102603e = c01.id.a();
            com.tencent.mm.plugin.finder.assist.p8 p8Var = com.tencent.mm.plugin.finder.assist.p8.f102460a;
            com.tencent.mm.plugin.finder.assist.r8 r8Var = com.tencent.mm.plugin.finder.assist.t8.f102555a;
            com.tencent.mm.plugin.finder.assist.p8.c(p8Var, com.tencent.mm.plugin.finder.assist.t8.A.f102540b, null, false, false, 14, null);
            if (xfVar != null) {
                dk2.xf.e(xfVar, ((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.c1) eVar.a(mm2.c1.class)).f328866q, 1, false, new dk2.a6(this.f233277a, this.f233278b, this.f233280d, this.f233279c, i17), 16, null);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.assist.p8 p8Var2 = com.tencent.mm.plugin.finder.assist.p8.f102460a;
        com.tencent.mm.plugin.finder.assist.r8 r8Var2 = com.tencent.mm.plugin.finder.assist.t8.f102555a;
        com.tencent.mm.plugin.finder.assist.p8.c(p8Var2, com.tencent.mm.plugin.finder.assist.t8.f102580z.f102540b, null, false, true, 6, null);
        com.tencent.mars.xlog.Log.w("FinderLiveExternalHelper", "enter room fail");
        if (xfVar != null) {
            dk2.xf.f(xfVar, 0, dk2.b6.f233238d, 1, null);
        }
        this.f233279c.v(java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), -1, null, null);
    }
}
