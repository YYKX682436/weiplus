package xm;

/* loaded from: classes11.dex */
public class g implements xm.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xm.n f455150a;

    public g(xm.n nVar) {
        this.f455150a = nVar;
    }

    @Override // xm.b
    public java.lang.Object getData() {
        com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent();
        shouldShowAppBrandEntranceInFindMoreEvent.f54779g.f7462a = true;
        shouldShowAppBrandEntranceInFindMoreEvent.e();
        return (!shouldShowAppBrandEntranceInFindMoreEvent.f54780h.f7576a || xm.n.b(this.f455150a, 16777216L) || (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 2)) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}
