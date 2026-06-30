package ow5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f349429a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f349430b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f349431c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f349432d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f349433e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Class f349434f;

    /* renamed from: g, reason: collision with root package name */
    public final defpackage.m f349435g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f349436h;

    /* renamed from: i, reason: collision with root package name */
    public final double f349437i;

    /* renamed from: j, reason: collision with root package name */
    public final vw5.d f349438j;

    public a(android.content.Context context, java.lang.String bizName, java.lang.String instanceId, ow5.b bVar, java.util.Set mbJsApiSet, java.util.Set mbJSApiGroup, java.util.Set set, java.lang.Class cls, defpackage.m mVar, boolean z17, double d17, vw5.d dVar, int i17, kotlin.jvm.internal.i iVar) {
        mVar = (i17 & 256) != 0 ? null : mVar;
        z17 = (i17 & 512) != 0 ? false : z17;
        d17 = (i17 & 1024) != 0 ? 0.0d : d17;
        dVar = (i17 & 2048) != 0 ? null : dVar;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(bizName, "bizName");
        kotlin.jvm.internal.o.g(instanceId, "instanceId");
        kotlin.jvm.internal.o.g(mbJsApiSet, "mbJsApiSet");
        kotlin.jvm.internal.o.g(mbJSApiGroup, "mbJSApiGroup");
        this.f349429a = context;
        this.f349430b = bizName;
        this.f349431c = mbJsApiSet;
        this.f349432d = mbJSApiGroup;
        this.f349433e = set;
        this.f349434f = cls;
        this.f349435g = mVar;
        this.f349436h = z17;
        this.f349437i = d17;
        this.f349438j = dVar;
    }
}
