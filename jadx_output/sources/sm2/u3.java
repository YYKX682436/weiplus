package sm2;

/* loaded from: classes3.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409734d;

    public u3(sm2.o4 o4Var) {
        this.f409734d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var;
        sm2.o4 o4Var = this.f409734d;
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = o4Var.f409622l;
        if (khVar == null || (view = khVar.f113249w) == null || (de0Var = o4Var.f409638x) == null) {
            return;
        }
        de0Var.f112283x = view;
        de0Var.x1(view);
    }
}
