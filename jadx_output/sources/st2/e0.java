package st2;

/* loaded from: classes3.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f412272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(st2.h1 h1Var) {
        super(0);
        this.f412272d = h1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = ((mm2.c1) this.f412272d.f412335f.a(mm2.c1.class)).T;
        zl2.r4 r4Var = zl2.r4.f473950a;
        boolean z18 = r4Var.w1() || z17;
        com.tencent.mars.xlog.Log.i("Finder.LiveShoppingListPlugin", "isAnchorOrAssistant result: " + z18 + ", isAnchorLive: " + r4Var.w1() + ", isAssistant: " + z17);
        return java.lang.Boolean.valueOf(z18);
    }
}
