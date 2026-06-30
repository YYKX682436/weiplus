package um2;

/* loaded from: classes3.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428810d;

    public g5(um2.x5 x5Var) {
        this.f428810d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = this.f428810d.M;
        if (x80Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, java.lang.Boolean.TRUE, null, 2, null);
        }
    }
}
