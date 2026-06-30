package v23;

/* loaded from: classes10.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f432886a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f432887b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f432888c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f432889d;

    /* renamed from: e, reason: collision with root package name */
    public final int f432890e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f432891f;

    public b(java.lang.String name, java.util.List mediaList, java.lang.String bucketId, boolean z17, int i17, int i18, kotlin.jvm.internal.i iVar) {
        mediaList = (i18 & 2) != 0 ? new java.util.ArrayList() : mediaList;
        bucketId = (i18 & 4) != 0 ? "" : bucketId;
        z17 = (i18 & 8) != 0 ? false : z17;
        i17 = (i18 & 16) != 0 ? -1 : i17;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(mediaList, "mediaList");
        kotlin.jvm.internal.o.g(bucketId, "bucketId");
        this.f432886a = name;
        this.f432887b = mediaList;
        this.f432888c = bucketId;
        this.f432889d = z17;
        this.f432890e = i17;
        this.f432891f = jz5.h.b(new v23.a(this));
    }

    public final long a() {
        return ((java.lang.Number) ((jz5.n) this.f432891f).getValue()).longValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !kotlin.jvm.internal.o.b(getClass(), obj.getClass())) {
            return false;
        }
        v23.b bVar = (v23.b) obj;
        return a() == bVar.a() && kotlin.jvm.internal.o.b(this.f432886a, bVar.f432886a) && kotlin.jvm.internal.o.b(this.f432887b, bVar.f432887b);
    }
}
