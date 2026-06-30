package ot0;

/* loaded from: classes4.dex */
public final class b0 implements r01.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f348401a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ km5.b f348402b;

    public b0(java.lang.String str, km5.b bVar) {
        this.f348401a = str;
        this.f348402b = bVar;
    }

    @Override // r01.c
    public final void a(boolean z17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "flush bizInfo callback, username: %s, success: %b, isUpdatingBizInfo: %b", str, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(ot0.f0.f348473b));
        boolean z18 = ot0.f0.f348473b;
        km5.b bVar = this.f348402b;
        if (!z18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppMsgBizClickHandler", "callback when request interrupted by user");
            bVar.a(new ot0.p0(2, "flush bizInfo fail"));
            return;
        }
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        if (!kotlin.jvm.internal.o.b(str, this.f348401a) || !z17) {
            bVar.a(new ot0.p0(2, "flush bizInfo fail"));
        } else {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1908L, 13, 1L, false);
            bVar.c(java.lang.Boolean.TRUE);
        }
    }
}
