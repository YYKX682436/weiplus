package gw1;

/* loaded from: classes14.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final gw1.a f276149a;

    /* renamed from: b, reason: collision with root package name */
    public final qw1.b f276150b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f276151c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.cloudvoip.cloudvoice.service.j f276152d;

    public e(gw1.a decodeResultHandler, qw1.b bufferManager) {
        kotlin.jvm.internal.o.g(decodeResultHandler, "decodeResultHandler");
        kotlin.jvm.internal.o.g(bufferManager, "bufferManager");
        this.f276149a = decodeResultHandler;
        this.f276150b = bufferManager;
        jz5.h.b(new gw1.d(this));
        this.f276151c = new java.util.HashMap();
        this.f276152d = new gw1.c(this);
    }
}
