package sm2;

/* loaded from: classes3.dex */
public final class l4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409551d;

    public l4(sm2.o4 o4Var) {
        this.f409551d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f409551d.f409616i;
        if (o9Var != null) {
            o9Var.v1();
        }
    }
}
