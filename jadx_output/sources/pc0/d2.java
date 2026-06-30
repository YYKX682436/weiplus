package pc0;

/* loaded from: classes10.dex */
public final class d2 implements androidx.activity.result.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f353245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pc0.e2 f353246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.b f353247c;

    public d2(java.lang.String str, pc0.e2 e2Var, androidx.activity.result.b bVar) {
        this.f353245a = str;
        this.f353246b = e2Var;
        this.f353247c = bVar;
    }

    @Override // androidx.activity.result.b
    public void a(java.lang.Object obj) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("restoreCallback callback key:");
        java.lang.String str = this.f353245a;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaOptService", sb6.toString());
        this.f353246b.f353249d.remove(str);
        this.f353247c.a((qc0.m1) obj);
    }
}
