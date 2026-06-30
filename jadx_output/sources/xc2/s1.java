package xc2;

/* loaded from: classes4.dex */
public final class s1 implements ya2.n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ai f453294a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f453295b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.p0 f453296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f453297d;

    public s1(com.tencent.mm.plugin.finder.viewmodel.component.ai aiVar, android.content.Context context, xc2.p0 p0Var, in5.s0 s0Var) {
        this.f453294a = aiVar;
        this.f453295b = context;
        this.f453296c = p0Var;
        this.f453297d = s0Var;
    }

    public int a() {
        int i17;
        android.content.Context context = this.f453295b;
        int c17 = com.tencent.mm.ui.bl.c(context == null ? com.tencent.mm.sdk.platformtools.x2.f193071a : context);
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a);
        int i18 = b17.x;
        int i19 = b17.y;
        java.lang.System.nanoTime();
        boolean z17 = com.tencent.mm.ui.bk.y() || com.tencent.mm.ui.bk.Q() || com.tencent.mm.ui.bk.A();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z17) {
            i17 = i19 - c17;
        } else {
            if (i19 >= i18) {
                i18 = i19;
            }
            i17 = i18 - c17;
        }
        return (int) (i17 * kx2.a.f313278a.a(context));
    }

    public void b(yz5.a listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        xc2.r1 r1Var = new xc2.r1(listener);
        gx2.q qVar = this.f453294a.f133777d;
        if (qVar == null) {
            return;
        }
        qVar.setOnDrawerDetach(r1Var);
    }
}
