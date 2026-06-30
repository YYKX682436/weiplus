package ox3;

/* loaded from: classes10.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox3.f0 f349732d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(ox3.f0 f0Var) {
        super(0);
        this.f349732d = f0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ox3.f0 f0Var = this.f349732d;
        for (android.view.View view : f0Var.f349746m) {
            ((lt2.b) f0Var.f349747n).getClass();
            kotlin.jvm.internal.o.g(view, "view");
            com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = view instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) view : null;
            if (finderThumbPlayerProxy != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FinderVideoPlayHelper", "release " + view);
                finderThumbPlayerProxy.d();
                finderThumbPlayerProxy.b();
            }
        }
        f0Var.f349746m.clear();
        return jz5.f0.f302826a;
    }
}
