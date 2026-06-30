package uh1;

/* loaded from: classes13.dex */
public final class r1 extends uh1.y1 {

    /* renamed from: h, reason: collision with root package name */
    public static final uh1.r1 f427898h = new uh1.r1();

    /* renamed from: i, reason: collision with root package name */
    public static final android.net.NetworkRequest f427899i;

    static {
        android.net.NetworkRequest build = new android.net.NetworkRequest.Builder().addTransportType(1).build();
        kotlin.jvm.internal.o.f(build, "build(...)");
        f427899i = build;
    }

    public r1() {
        super(null);
    }

    @Override // uh1.y1
    public android.net.NetworkRequest a() {
        return f427899i;
    }
}
