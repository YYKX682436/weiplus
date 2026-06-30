package en5;

/* loaded from: classes12.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn5.n0 f255532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f255533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(fn5.n0 n0Var, yz5.l lVar) {
        super(1);
        this.f255532d = n0Var;
        this.f255533e = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        if (((com.tencent.mm.smiley.x1) ((com.tencent.mm.pluginsdk.ui.span.r) i95.n0.c(com.tencent.mm.pluginsdk.ui.span.r.class))).Bi(it) || ((com.tencent.mm.smiley.x1) ((com.tencent.mm.pluginsdk.ui.span.r) i95.n0.c(com.tencent.mm.pluginsdk.ui.span.r.class))).Ai(it)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQuerySearchBar", "input is emoji, return");
        } else if (!android.text.TextUtils.equals(it, " ")) {
            this.f255532d.c7(it);
            this.f255533e.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
