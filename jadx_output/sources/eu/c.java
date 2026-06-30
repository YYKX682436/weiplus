package eu;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f256682a;

    /* renamed from: b, reason: collision with root package name */
    public final l15.a f256683b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f256684c;

    /* renamed from: d, reason: collision with root package name */
    public final pu.l f256685d;

    public c(java.lang.String fromUsername, java.lang.String toUsername, l15.a prepareMsgXmlObj, java.lang.ref.WeakReference flowApiRef, pu.l lVar) {
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(prepareMsgXmlObj, "prepareMsgXmlObj");
        kotlin.jvm.internal.o.g(flowApiRef, "flowApiRef");
        this.f256682a = toUsername;
        this.f256683b = prepareMsgXmlObj;
        this.f256684c = flowApiRef;
        this.f256685d = lVar;
        kotlin.jvm.internal.o.f(java.util.UUID.randomUUID().toString(), "toString(...)");
        new java.util.LinkedHashMap();
    }
}
