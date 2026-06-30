package so2;

/* loaded from: classes2.dex */
public final class t4 implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f410607d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f410608e;

    /* renamed from: f, reason: collision with root package name */
    public final long f410609f;

    /* renamed from: g, reason: collision with root package name */
    public int f410610g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f410611h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f410612i;

    /* renamed from: m, reason: collision with root package name */
    public final int f410613m;

    public t4(java.lang.String title, java.lang.String subTitle, long j17, int i17, java.util.List objectList, java.lang.String byPass, int i18) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(subTitle, "subTitle");
        kotlin.jvm.internal.o.g(objectList, "objectList");
        kotlin.jvm.internal.o.g(byPass, "byPass");
        this.f410607d = title;
        this.f410608e = subTitle;
        this.f410609f = j17;
        this.f410610g = i17;
        this.f410611h = objectList;
        this.f410612i = byPass;
        this.f410613m = i18;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        if (!(obj instanceof so2.t4)) {
            return -1;
        }
        return kotlin.jvm.internal.o.j(this.f410609f, ((so2.t4) obj).f410609f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.t4)) {
            return false;
        }
        so2.t4 t4Var = (so2.t4) obj;
        return kotlin.jvm.internal.o.b(this.f410607d, t4Var.f410607d) && kotlin.jvm.internal.o.b(this.f410608e, t4Var.f410608e) && this.f410609f == t4Var.f410609f && this.f410610g == t4Var.f410610g && kotlin.jvm.internal.o.b(this.f410611h, t4Var.f410611h) && kotlin.jvm.internal.o.b(this.f410612i, t4Var.f410612i) && this.f410613m == t4Var.f410613m;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f410609f;
    }

    @Override // in5.c
    public int h() {
        return so2.t4.class.hashCode();
    }

    public int hashCode() {
        return (((((((((((this.f410607d.hashCode() * 31) + this.f410608e.hashCode()) * 31) + java.lang.Long.hashCode(this.f410609f)) * 31) + java.lang.Integer.hashCode(this.f410610g)) * 31) + this.f410611h.hashCode()) * 31) + this.f410612i.hashCode()) * 31) + java.lang.Integer.hashCode(this.f410613m);
    }

    public java.lang.String toString() {
        return "FinderPostPlaySquareContainerData(title=" + this.f410607d + ", subTitle=" + this.f410608e + ", topicId=" + this.f410609f + ", favStatus=" + this.f410610g + ", objectList=" + this.f410611h + ", byPass=" + this.f410612i + ", tabId=" + this.f410613m + ')';
    }
}
