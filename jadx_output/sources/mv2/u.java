package mv2;

/* loaded from: classes2.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f331634e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f331635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(long j17, long j18, boolean z17) {
        super(0);
        this.f331633d = j17;
        this.f331634e = j18;
        this.f331635f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f331566f.iterator();
            while (it.hasNext()) {
                mv2.v0 v0Var = (mv2.v0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostOk ");
                long j17 = this.f331633d;
                sb6.append(j17);
                sb6.append(" svrId ");
                long j18 = this.f331634e;
                sb6.append(pm0.v.u(j18));
                sb6.append(" isOk ");
                sb6.append(this.f331635f);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
                v0Var.onPostOk(j17, j18);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostError");
        }
        return jz5.f0.f302826a;
    }
}
