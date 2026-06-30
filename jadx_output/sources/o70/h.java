package o70;

/* loaded from: classes10.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.vfs.r6 f343233a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f343234b;

    /* renamed from: c, reason: collision with root package name */
    public int f343235c;

    /* renamed from: d, reason: collision with root package name */
    public int f343236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f343237e;

    /* renamed from: f, reason: collision with root package name */
    public long f343238f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f343239g;

    /* renamed from: h, reason: collision with root package name */
    public int f343240h;

    /* renamed from: i, reason: collision with root package name */
    public final int f343241i;

    /* renamed from: j, reason: collision with root package name */
    public final int f343242j;

    /* renamed from: k, reason: collision with root package name */
    public android.net.Uri f343243k;

    /* renamed from: l, reason: collision with root package name */
    public o70.j f343244l;

    public h(com.tencent.mm.vfs.r6 preBuildFolder) {
        kotlin.jvm.internal.o.g(preBuildFolder, "preBuildFolder");
        this.f343233a = preBuildFolder;
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f343234b = uuid;
        this.f343237e = "";
        this.f343239g = "";
        this.f343241i = com.tencent.mm.R.drawable.bzt;
        this.f343242j = -1;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f343237e = str;
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f343234b = str;
    }

    public java.lang.String toString() {
        return "PreBuildParams(source=" + this.f343235c + ", rotateCount=" + this.f343236d + ", imgId='" + this.f343238f + "' imgPath='" + this.f343237e + "', toUserName='" + this.f343239g + "', compressType=" + this.f343240h + ", resId=" + this.f343241i + ", backgroundColor=" + this.f343242j + ')';
    }
}
