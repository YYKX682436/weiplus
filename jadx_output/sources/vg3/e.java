package vg3;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final vg3.d f436688a;

    /* renamed from: b, reason: collision with root package name */
    public final vg3.b f436689b;

    /* renamed from: c, reason: collision with root package name */
    public final vg3.c f436690c;

    /* renamed from: d, reason: collision with root package name */
    public final int f436691d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f436692e;

    public e(vg3.d requestPage, vg3.b eventType, vg3.c requestContent, int i17, java.util.List list) {
        kotlin.jvm.internal.o.g(requestPage, "requestPage");
        kotlin.jvm.internal.o.g(eventType, "eventType");
        kotlin.jvm.internal.o.g(requestContent, "requestContent");
        this.f436688a = requestPage;
        this.f436689b = eventType;
        this.f436690c = requestContent;
        this.f436691d = i17;
        this.f436692e = list;
    }

    public /* synthetic */ e(vg3.d dVar, vg3.b bVar, vg3.c cVar, int i17, java.util.List list, int i18, kotlin.jvm.internal.i iVar) {
        this(dVar, bVar, cVar, (i18 & 8) != 0 ? 0 : i17, (i18 & 16) != 0 ? kz5.p0.f313996d : list);
    }
}
