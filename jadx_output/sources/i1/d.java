package i1;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f286852a;

    /* renamed from: b, reason: collision with root package name */
    public final float f286853b;

    /* renamed from: c, reason: collision with root package name */
    public final float f286854c;

    /* renamed from: d, reason: collision with root package name */
    public final float f286855d;

    /* renamed from: e, reason: collision with root package name */
    public final float f286856e;

    /* renamed from: f, reason: collision with root package name */
    public final long f286857f;

    /* renamed from: g, reason: collision with root package name */
    public final int f286858g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f286859h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f286860i;

    /* renamed from: j, reason: collision with root package name */
    public final i1.c f286861j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f286862k;

    public d(java.lang.String str, float f17, float f18, float f19, float f27, long j17, int i17, boolean z17, int i18, kotlin.jvm.internal.i iVar) {
        long j18;
        java.lang.String str2 = (i18 & 1) != 0 ? "" : str;
        if ((i18 & 32) != 0) {
            int i19 = e1.y.f246321l;
            j18 = e1.y.f246320k;
        } else {
            j18 = j17;
        }
        int i27 = (i18 & 64) != 0 ? 5 : i17;
        boolean z18 = (i18 & 128) != 0 ? false : z17;
        this.f286852a = str2;
        this.f286853b = f17;
        this.f286854c = f18;
        this.f286855d = f19;
        this.f286856e = f27;
        this.f286857f = j18;
        this.f286858g = i27;
        this.f286859h = z18;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f286860i = arrayList;
        i1.c cVar = new i1.c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
        this.f286861j = cVar;
        arrayList.add(cVar);
    }

    public final i1.d a(java.lang.String name, float f17, float f18, float f19, float f27, float f28, float f29, float f37, java.util.List clipPathData) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(clipPathData, "clipPathData");
        c();
        this.f286860i.add(new i1.c(name, f17, f18, f19, f27, f28, f29, f37, clipPathData, null, 512, null));
        return this;
    }

    public final i1.d b() {
        c();
        java.util.ArrayList arrayList = this.f286860i;
        i1.c cVar = (i1.c) arrayList.remove(arrayList.size() - 1);
        ((i1.c) arrayList.get(arrayList.size() - 1)).f286845j.add(new i1.o1(cVar.f286836a, cVar.f286837b, cVar.f286838c, cVar.f286839d, cVar.f286840e, cVar.f286841f, cVar.f286842g, cVar.f286843h, cVar.f286844i, cVar.f286845j));
        return this;
    }

    public final void c() {
        if (!(!this.f286862k)) {
            throw new java.lang.IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
        }
    }
}
