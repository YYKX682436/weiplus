package rv4;

/* loaded from: classes12.dex */
public final class w extends mv4.h {

    /* renamed from: c, reason: collision with root package name */
    public jv4.i f400557c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f400558d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f400559e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(java.lang.String sessionId) {
        super(sessionId);
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        this.f400558d = jz5.h.b(rv4.u.f400555d);
        this.f400559e = jz5.h.b(rv4.v.f400556d);
    }

    public final rv4.t a() {
        return (rv4.t) ((jz5.n) this.f400558d).getValue();
    }
}
