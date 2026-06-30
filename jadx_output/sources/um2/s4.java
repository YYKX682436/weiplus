package um2;

/* loaded from: classes3.dex */
public final class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428958d;

    public s4(um2.x5 x5Var) {
        this.f428958d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var;
        um2.x5 x5Var = this.f428958d;
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = x5Var.f429062p;
        if (nd0Var == null || (viewGroup = nd0Var.f365323d) == null || (de0Var = x5Var.V) == null) {
            return;
        }
        de0Var.f112283x = viewGroup;
        de0Var.x1(viewGroup);
    }
}
