package y83;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst f459992d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst) {
        super(0);
        this.f459992d = kidsWatchLoginFirst;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.kidswatch.ui.login.KidsWatchLoginFirst kidsWatchLoginFirst = this.f459992d;
        if (y83.k.f459991a[kidsWatchLoginFirst.f143126m.ordinal()] == 1) {
            x83.f[] fVarArr = x83.f.f452567d;
            com.tencent.mm.plugin.report.service.g0.INSTANCE.g(21256, true, true, false, "", 3, 0);
        } else {
            x83.g gVar = x83.g.f452568a;
            x83.c cVar = x83.c.f452552e;
            java.lang.String str = kidsWatchLoginFirst.f143120d;
            if (str == null) {
                kotlin.jvm.internal.o.o("loginUrl");
                throw null;
            }
            gVar.a(cVar, str, x83.e.f452562e, x83.d.f452558g, kidsWatchLoginFirst.f143124h, 0);
        }
        kidsWatchLoginFirst.finish();
        return jz5.f0.f302826a;
    }
}
