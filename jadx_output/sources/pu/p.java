package pu;

/* loaded from: classes12.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f358355a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f358356b;

    /* renamed from: c, reason: collision with root package name */
    public final l15.a f358357c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f358358d;

    /* renamed from: e, reason: collision with root package name */
    public final pu.l f358359e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f358360f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f358361g;

    public p(java.lang.String fromUsername, java.lang.String toUsername, l15.a msgXmlObj, java.lang.ref.WeakReference flowApiRef, pu.l lVar) {
        kotlin.jvm.internal.o.g(fromUsername, "fromUsername");
        kotlin.jvm.internal.o.g(toUsername, "toUsername");
        kotlin.jvm.internal.o.g(msgXmlObj, "msgXmlObj");
        kotlin.jvm.internal.o.g(flowApiRef, "flowApiRef");
        this.f358355a = fromUsername;
        this.f358356b = toUsername;
        this.f358357c = msgXmlObj;
        this.f358358d = flowApiRef;
        this.f358359e = lVar;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f358360f = uuid;
        this.f358361g = new java.util.LinkedHashMap();
    }
}
