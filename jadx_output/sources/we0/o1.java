package we0;

@j95.b
/* loaded from: classes5.dex */
public final class o1 extends jm0.o {

    /* renamed from: m, reason: collision with root package name */
    public final xg3.h0 f445144m = new we0.n1();

    @Override // jm0.o
    public void Ri(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusMMFeatureService", "onAccountInitAfter() called with: context = " + context);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().n0(this.f445144m, null);
    }

    @Override // jm0.o
    public void Vi() {
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().za(this.f445144m);
    }

    @Override // jm0.o, i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusMMFeatureService", "onCreate: ");
    }
}
