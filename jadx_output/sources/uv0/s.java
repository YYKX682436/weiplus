package uv0;

/* loaded from: classes5.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f431347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vv0.k f431348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f431349f;

    public s(uv0.u uVar, vv0.k kVar, int i17) {
        this.f431347d = uVar;
        this.f431348e = kVar;
        this.f431349f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = this.f431348e.f440388d;
        uv0.u uVar = this.f431347d;
        uVar.P(i17);
        uv0.u.N(uVar, this.f431349f);
    }
}
