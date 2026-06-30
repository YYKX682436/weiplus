package vs1;

/* loaded from: classes7.dex */
public final class d extends vs1.a {

    /* renamed from: a, reason: collision with root package name */
    public static final vs1.d f439865a = new vs1.d();

    @Override // vs1.e
    public boolean a(us1.b request, us1.a callback) {
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(callback, "callback");
        ((ku5.t0) ku5.t0.f312615d).g(new vs1.c(request, callback));
        return true;
    }

    @Override // vs1.e
    public boolean b(us1.b request) {
        kotlin.jvm.internal.o.g(request, "request");
        return true;
    }

    @Override // vs1.e
    public java.lang.String name() {
        return "MicroMsg.HttpContentFetcher";
    }
}
