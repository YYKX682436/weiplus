package um2;

/* loaded from: classes3.dex */
public final class t4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428967d;

    public t4(um2.x5 x5Var) {
        this.f428967d = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var;
        um2.x5 x5Var = this.f428967d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = x5Var.f429065q;
        if (khVar == null || (view = khVar.f113249w) == null || (de0Var = x5Var.V) == null) {
            return;
        }
        de0Var.f112283x = view;
        de0Var.x1(view);
    }
}
