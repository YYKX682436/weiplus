package ys1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f465126a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f465127b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f465128c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f465129d;

    /* renamed from: e, reason: collision with root package name */
    public final int f465130e;

    /* renamed from: f, reason: collision with root package name */
    public int f465131f;

    /* renamed from: g, reason: collision with root package name */
    public int f465132g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f465133h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f465134i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f465135j;

    public b(java.lang.String url, java.lang.String appId, java.lang.String title, java.lang.String desc, java.lang.String from, int i17, int i18, int i19, java.lang.String str, java.lang.String str2, java.lang.String str3, int i27, kotlin.jvm.internal.i iVar) {
        from = (i27 & 16) != 0 ? "" : from;
        i17 = (i27 & 32) != 0 ? -1 : i17;
        i18 = (i27 & 64) != 0 ? -1 : i18;
        i19 = (i27 & 128) != 0 ? -1 : i19;
        java.lang.Integer num = null;
        str = (i27 & 256) != 0 ? null : str;
        str2 = (i27 & 512) != 0 ? null : str2;
        str3 = (i27 & 1024) != 0 ? null : str3;
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(from, "from");
        this.f465126a = url;
        this.f465127b = appId;
        this.f465128c = title;
        this.f465129d = desc;
        this.f465130e = i17;
        this.f465131f = i18;
        this.f465132g = i19;
        this.f465133h = str;
        this.f465134i = str2;
        this.f465135j = str3;
        if (hy4.i.j(url)) {
            num = 211;
        } else if (hy4.i.n(url)) {
            num = 213;
        } else if (hy4.i.o(url)) {
            num = 212;
        }
        if (num != null) {
            int intValue = num.intValue();
            if (this.f465131f != num.intValue()) {
                this.f465132g = this.f465131f;
                this.f465131f = intValue;
            }
        }
    }
}
