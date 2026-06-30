package mv2;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f331629d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f331630e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(long j17, boolean z17) {
        super(0);
        this.f331629d = j17;
        this.f331630e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f331566f.iterator();
            while (it.hasNext()) {
                mv2.v0 v0Var = (mv2.v0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPostError ");
                long j17 = this.f331629d;
                sb6.append(j17);
                sb6.append(" isOk ");
                boolean z17 = this.f331630e;
                sb6.append(z17);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
                v0Var.a(j17, z17);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyPostError");
        }
        return jz5.f0.f302826a;
    }
}
