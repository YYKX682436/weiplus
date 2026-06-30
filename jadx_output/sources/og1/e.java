package og1;

/* loaded from: classes7.dex */
public final class e extends og1.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345141d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f345142e;

    /* renamed from: f, reason: collision with root package name */
    public final int f345143f;

    public e() {
        super(new r45.zd7(), new r45.ae7());
        this.f345141d = "MicroMsg.WALaunchCgiGetWxaJsApi";
        this.f345142e = "/cgi-bin/mmbiz-bin/wxaattr/wxajsapiinfo";
        this.f345143f = 3827;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return this.f345143f;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return this.f345141d;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return this.f345142e;
    }

    @Override // og1.c
    public java.lang.String f() {
        r45.mr5 mr5Var = this.f68420a;
        if (((r45.zd7) mr5Var).f391945d.size() == 1) {
            return ((r45.be7) ((r45.zd7) mr5Var).f391945d.getFirst()).f370712d;
        }
        return null;
    }

    @Override // og1.c
    public java.lang.String g() {
        return null;
    }
}
