package xh2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedHashMap f454522a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f454523b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.Rect f454524c;

    /* renamed from: d, reason: collision with root package name */
    public final int f454525d;

    /* renamed from: e, reason: collision with root package name */
    public final int f454526e;

    /* renamed from: f, reason: collision with root package name */
    public final int f454527f;

    /* renamed from: g, reason: collision with root package name */
    public final int f454528g;

    /* renamed from: h, reason: collision with root package name */
    public final float f454529h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.LinkedList f454530i;

    public b(java.util.LinkedHashMap micViewRect, java.util.LinkedHashMap micLayoutInfo, android.graphics.Rect viewRootRect, int i17, int i18, int i19, int i27, float f17, java.util.LinkedList micCoverDataList) {
        kotlin.jvm.internal.o.g(micViewRect, "micViewRect");
        kotlin.jvm.internal.o.g(micLayoutInfo, "micLayoutInfo");
        kotlin.jvm.internal.o.g(viewRootRect, "viewRootRect");
        kotlin.jvm.internal.o.g(micCoverDataList, "micCoverDataList");
        this.f454522a = micViewRect;
        this.f454523b = micLayoutInfo;
        this.f454524c = viewRootRect;
        this.f454525d = i17;
        this.f454526e = i18;
        this.f454527f = i19;
        this.f454528g = i27;
        this.f454529h = f17;
        this.f454530i = micCoverDataList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh2.b)) {
            return false;
        }
        xh2.b bVar = (xh2.b) obj;
        return kotlin.jvm.internal.o.b(this.f454522a, bVar.f454522a) && kotlin.jvm.internal.o.b(this.f454523b, bVar.f454523b) && kotlin.jvm.internal.o.b(this.f454524c, bVar.f454524c) && this.f454525d == bVar.f454525d && this.f454526e == bVar.f454526e && this.f454527f == bVar.f454527f && this.f454528g == bVar.f454528g && java.lang.Float.compare(this.f454529h, bVar.f454529h) == 0 && kotlin.jvm.internal.o.b(this.f454530i, bVar.f454530i);
    }

    public int hashCode() {
        return (((((((((((((((this.f454522a.hashCode() * 31) + this.f454523b.hashCode()) * 31) + this.f454524c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f454525d)) * 31) + java.lang.Integer.hashCode(this.f454526e)) * 31) + java.lang.Integer.hashCode(this.f454527f)) * 31) + java.lang.Integer.hashCode(this.f454528g)) * 31) + java.lang.Float.hashCode(this.f454529h)) * 31) + this.f454530i.hashCode();
    }

    public java.lang.String toString() {
        return "FinderLiveMicInfoData(micViewRect=" + this.f454522a + ", micLayoutInfo=" + this.f454523b + ", viewRootRect=" + this.f454524c + ", mode=" + this.f454525d + ", voiceMode=" + this.f454526e + ", liveMode=" + this.f454527f + ", liveSubMode=" + this.f454528g + ", anchorVideoRate=" + this.f454529h + ", micCoverDataList=" + this.f454530i + ')';
    }
}
