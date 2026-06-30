package lx;

/* loaded from: classes9.dex */
public final class n5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx.p5 f321883d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(lx.p5 p5Var) {
        super(0);
        this.f321883d = p5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String i17 = com.tencent.mm.vfs.w6.i(g83.a.c(), false);
        kotlin.jvm.internal.o.d(i17);
        this.f321883d.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizSharePlugin", "imgCacheDirectory=".concat(i17));
        return i17;
    }
}
