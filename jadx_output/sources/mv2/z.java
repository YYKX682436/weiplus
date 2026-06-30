package mv2;

/* loaded from: classes2.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f331669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mv2.g0 f331670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(java.lang.String str, mv2.g0 g0Var) {
        super(0);
        this.f331669d = str;
        this.f331670e = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (gm0.j1.a()) {
            java.util.Iterator it = mv2.f0.f331565e.iterator();
            while (it.hasNext()) {
                mv2.w0 w0Var = (mv2.w0) it.next();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyPrePostEvent ");
                java.lang.String str = this.f331669d;
                sb6.append(str);
                com.tencent.mars.xlog.Log.i("LogPost.FinderPostManager", sb6.toString());
                w0Var.onPrePostEvent(str, this.f331670e);
            }
        } else {
            com.tencent.mars.xlog.Log.e("LogPost.FinderPostManager", "is invalid to notifyPrePostEvent");
        }
        return jz5.f0.f302826a;
    }
}
