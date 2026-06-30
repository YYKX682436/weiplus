package og1;

/* loaded from: classes7.dex */
public final class f extends og1.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345144d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f345145e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345146f;

    /* renamed from: g, reason: collision with root package name */
    public final int f345147g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f345148h;

    public f(java.lang.String str, java.lang.String str2, boolean z17, k91.d5 d5Var) {
        super(new r45.xc7(), new r45.zc7());
        com.tencent.mm.protobuf.g f17;
        this.f345144d = str;
        this.f345145e = str2;
        this.f345146f = "MicroMsg.WALaunchCgiWxaAttrSync";
        this.f345147g = 1151;
        this.f345148h = "/cgi-bin/mmbiz-bin/wxaattr/wxaattrsync";
        r45.xc7 xc7Var = (r45.xc7) this.f68420a;
        xc7Var.f389982d = str;
        xc7Var.f389984f = str2;
        if (z17) {
            f17 = null;
        } else {
            if (str == null || str.length() == 0) {
                if (str2 == null || str2.length() == 0) {
                    throw new java.lang.IllegalArgumentException("both username & appId is empty");
                }
                f17 = com.tencent.mm.plugin.appbrand.config.q.f(str2);
            } else {
                f17 = k91.j4.i1(com.tencent.mm.plugin.appbrand.app.r9.ij().n1(str, "syncVersion"));
            }
        }
        xc7Var.f389983e = f17;
        if (d5Var != null) {
            ((r45.xc7) this.f68420a).f389985g = d5Var.c();
            ((r45.xc7) this.f68420a).f389986h = d5Var.b();
            ((r45.xc7) this.f68420a).f389987i = d5Var.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<init> hash:");
        sb6.append(hashCode());
        sb6.append(", username:");
        sb6.append(str);
        sb6.append(", appId:");
        sb6.append(str2);
        sb6.append(", cleanUpdate:");
        sb6.append(z17);
        sb6.append(", instanceId:");
        java.lang.String str3 = ((r45.xc7) this.f68420a).f389985g;
        sb6.append(str3 == null ? "" : str3);
        sb6.append(", scene:");
        sb6.append(((r45.xc7) this.f68420a).f389986h);
        sb6.append(", source:");
        sb6.append(wz0.a.a(((r45.xc7) this.f68420a).f389987i));
        com.tencent.mars.xlog.Log.i("MicroMsg.WALaunchCgiWxaAttrSync", sb6.toString());
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return this.f345147g;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return this.f345146f;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return this.f345148h;
    }

    @Override // og1.c
    public java.lang.String f() {
        return this.f345145e;
    }

    @Override // og1.c
    public java.lang.String g() {
        return this.f345144d;
    }
}
