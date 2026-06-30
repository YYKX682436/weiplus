package wn4;

/* loaded from: classes11.dex */
public final class d implements w73.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wn4.f f447533a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f447534b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.vfs.r6 f447535c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f447536d;

    public d(wn4.f fVar, java.lang.String str, com.tencent.mm.vfs.r6 r6Var, long j17) {
        this.f447533a = fVar;
        this.f447534b = str;
        this.f447535c = r6Var;
        this.f447536d = j17;
    }

    @Override // w73.d
    public final void a(boolean z17) {
        wn4.f fVar = this.f447533a;
        java.util.HashMap hashMap = fVar.f447541g;
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String str = this.f447534b;
        hashMap.put(str, bool);
        com.tencent.mars.xlog.Log.i(fVar.f447543i, "HdiffApk, onPatchResult, result.isSuccess = %s, isPatchFileRead = %s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(fVar.f447545n));
        if (fVar.f447545n) {
            wn4.x.f447571a.d(this.f447535c, this.f447536d, fVar.f447538d);
            fVar.f447541g.remove(str);
        }
    }
}
