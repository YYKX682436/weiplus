package zu;

/* loaded from: classes12.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f475645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f475646b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f475647c;

    /* renamed from: d, reason: collision with root package name */
    public final l15.a f475648d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f475649e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f475650f;

    public e(java.lang.String fromUsername, java.lang.String toUsername, long j17, java.lang.String msgTalker, l15.a msgXmlObj, java.lang.ref.WeakReference flowApiRef) {
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(msgTalker, "msgTalker");
        kotlin.jvm.internal.o.g(msgXmlObj, "msgXmlObj");
        kotlin.jvm.internal.o.g(flowApiRef, "flowApiRef");
        this.f475645a = toUsername;
        this.f475646b = j17;
        this.f475647c = msgTalker;
        this.f475648d = msgXmlObj;
        this.f475649e = flowApiRef;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f475650f = uuid;
        new java.util.LinkedHashMap();
    }
}
