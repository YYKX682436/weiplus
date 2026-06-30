package og1;

/* loaded from: classes7.dex */
public final class d extends og1.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f345136d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f345137e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f345138f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f345139g;

    /* renamed from: h, reason: collision with root package name */
    public final int f345140h;

    public d(java.lang.String str) {
        super(new r45.h00(), new r45.i00());
        this.f345136d = str;
        this.f345137e = "MicroMsg.WALaunchCgiCheckDemoInfo";
        this.f345138f = "";
        this.f345139g = "/cgi-bin/mmbiz-bin/wxaapp/checkdemoinfo";
        this.f345140h = 1124;
        ((r45.h00) this.f68420a).f375700d = str;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public int a() {
        return this.f345140h;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String b() {
        return this.f345137e;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.c
    public java.lang.String c() {
        return this.f345139g;
    }

    @Override // og1.c
    public java.lang.String f() {
        return this.f345136d;
    }

    @Override // og1.c
    public java.lang.String g() {
        return this.f345138f;
    }
}
