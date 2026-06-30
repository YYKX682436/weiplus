package od2;

/* loaded from: classes12.dex */
public class g extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f344612n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ od2.k f344613o;

    public g(od2.k kVar, java.lang.String str) {
        this.f344613o = kVar;
        this.f344612n = str;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteFinderFollowTask";
    }

    @Override // p13.c
    public boolean i() {
        java.lang.String str = this.f344612n;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SearchFinderFollowerLogic", "delete we app info id=%s", str);
        this.f344613o.f344621f.m0(o13.d.f342220f, str);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{id: %s}", this.f344612n);
    }
}
