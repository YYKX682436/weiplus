package qt2;

/* loaded from: classes2.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qt2.h0 f366582d;

    public g0(qt2.h0 h0Var) {
        this.f366582d = h0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qt2.h0 h0Var = this.f366582d;
        com.tencent.mm.plugin.finder.ui.o6 o6Var = h0Var.B;
        if (o6Var != null) {
            o6Var.b(h0Var.f366590g);
        }
    }
}
