package mv2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f331668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(long j17, long j18) {
        super(0);
        this.f331667d = j17;
        this.f331668e = j18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostOk ");
            long j17 = this.f331667d;
            sb6.append(j17);
            sb6.append(" svrId ");
            long j18 = this.f331668e;
            sb6.append(pm0.v.u(j18));
            com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
            java.util.Iterator it = mv2.f0.f331565e.iterator();
            while (it.hasNext()) {
                ((mv2.w0) it.next()).onPostOk(j17, j18);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostOk");
        }
        return jz5.f0.f302826a;
    }
}
