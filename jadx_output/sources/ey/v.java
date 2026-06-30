package ey;

/* loaded from: classes11.dex */
public final class v extends ey.j {

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f257291b;

    public v(yz5.p handler) {
        kotlin.jvm.internal.o.g(handler, "handler");
        this.f257291b = handler;
    }

    @Override // ey.j
    public void a(org.json.JSONObject param, yz5.l onComplete) {
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(onComplete, "onComplete");
        this.f257291b.invoke(param, onComplete);
    }
}
