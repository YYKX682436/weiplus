package jn3;

/* loaded from: classes8.dex */
public final class o extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f300792f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.jb f300793g;

    /* renamed from: h, reason: collision with root package name */
    public r45.f03 f300794h;

    /* renamed from: i, reason: collision with root package name */
    public long f300795i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // jm0.g
    public void P6(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        O6(new jn3.n(this));
    }

    public final void T6(java.lang.String str, long j17, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.NewLifeRedDotReportFSC", "reportRedDotUnExp uuid:" + str + " exposeTime:" + j17 + " source:" + i17);
        if (this.f300793g == null) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("inner_version", 2);
        hashMap.put("expose_time", java.lang.Long.valueOf(j17));
        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ui("view_unexp", this.f300793g, this.f300794h, hashMap, false, i17);
    }
}
