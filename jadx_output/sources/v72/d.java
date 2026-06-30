package v72;

/* loaded from: classes12.dex */
public class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public final long f433651n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v72.i f433652o;

    public d(v72.i iVar, long j17) {
        this.f433652o = iVar;
        this.f433651n = j17;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "DeleteFavItemTask";
    }

    @Override // p13.c
    public boolean i() {
        this.f433652o.f433667h.F(o13.d.f342216b, this.f433651n);
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return java.lang.String.format("{favItemId: %d}", java.lang.Long.valueOf(this.f433651n));
    }
}
