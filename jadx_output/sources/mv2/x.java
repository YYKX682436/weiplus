package mv2;

/* loaded from: classes2.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331666d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(long j17) {
        super(0);
        this.f331666d = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f331565e.iterator();
            while (it.hasNext()) {
                mv2.w0 w0Var = (mv2.w0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostFakeOk ");
                long j17 = this.f331666d;
                sb6.append(j17);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
                w0Var.onPostFakeOk(j17);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostFakeOk");
        }
        return jz5.f0.f302826a;
    }
}
