package ot0;

/* loaded from: classes4.dex */
public final class z implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348819a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f348820b;

    public z(java.lang.String str, km5.b bVar) {
        this.f348819a = str;
        this.f348820b = bVar;
    }

    @Override // c01.o8
    public final void a(java.lang.String retUsername, boolean z17) {
        kotlin.jvm.internal.o.g(retUsername, "retUsername");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "flush contact callback, username: %s, success: %b, isUpdatingBizInfo: %b", retUsername, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ot0.f0.f348473b));
        boolean z18 = ot0.f0.f348473b;
        km5.b bVar = this.f348820b;
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "callback when request interrupted by user");
            bVar.a(new ot0.p0(1, "flush contact fail"));
            return;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f348819a;
        if (str == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b(str, retUsername) || !z17) {
            bVar.a(new ot0.p0(1, "flush contact fail"));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 11, 1L, false);
            bVar.c(java.lang.Boolean.TRUE);
        }
    }
}
