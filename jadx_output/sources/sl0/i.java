package sl0;

/* loaded from: classes11.dex */
public class i implements ll0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sl0.o f409140a;

    public i(sl0.o oVar) {
        this.f409140a = oVar;
    }

    @Override // ll0.b
    public java.lang.Object getData() {
        com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent shouldShowAppBrandEntranceInFindMoreEvent = new com.tencent.mm.autogen.events.ShouldShowAppBrandEntranceInFindMoreEvent();
        shouldShowAppBrandEntranceInFindMoreEvent.f54779g.f7462a = true;
        shouldShowAppBrandEntranceInFindMoreEvent.e();
        return (!shouldShowAppBrandEntranceInFindMoreEvent.f54780h.f7576a || sl0.o.b(this.f409140a, 16777216L) || (((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode() && ((uh4.c0) i95.n0.c(uh4.c0.class)).hd() == 2)) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE;
    }
}
