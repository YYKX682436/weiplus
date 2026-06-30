package xs2;

/* loaded from: classes3.dex */
public final class a1 extends yp.p {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f456305a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f456306b;

    public a1(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f456305a = context;
        this.f456306b = "ReplayTextDanmakuRender";
    }

    @Override // yp.p
    public int j(java.lang.Object obj) {
        return 1;
    }

    @Override // yp.p
    public void l(int i17, yp.o viewHolder, wp.i danmaku) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(danmaku, "danmaku");
        xs2.z0 z0Var = (xs2.z0) viewHolder;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.Object obj = danmaku.f448354y;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveMsgProxy");
        r45.t12 t12Var = (r45.t12) ((r45.z12) obj).getCustom(0);
        java.lang.String string = t12Var != null ? t12Var.getString(2) : null;
        ((ke0.e) xVar).getClass();
        z0Var.f456400g.setText(com.tencent.mm.pluginsdk.ui.span.c0.i(this.f456305a, string));
    }

    @Override // yp.p
    public yp.o m(int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        android.view.View inflate = android.view.LayoutInflater.from(this.f456305a).inflate(com.tencent.mm.R.layout.ay7, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        xs2.z0 z0Var = new xs2.z0(inflate);
        com.tencent.mm.ui.bk.r0(z0Var.f456400g.getPaint(), 0.8f);
        com.tencent.mars.xlog.Log.i(this.f456306b, "onCreateViewHolder: cost = " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
        return z0Var;
    }
}
