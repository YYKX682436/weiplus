package sa1;

/* loaded from: classes7.dex */
public final class i extends sa1.a {

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f405292e;

    /* renamed from: f, reason: collision with root package name */
    public final hh.g f405293f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ae.a logicImpl) {
        super(logicImpl);
        kotlin.jvm.internal.o.g(logicImpl, "logicImpl");
        this.f405293f = new hh.g();
    }

    @Override // yg.b0
    public void a0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.f(this, view, i28, i19, i27, i17, i18));
        }
    }

    @Override // yg.b0
    public void q0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.h(i19, i27, i17, i18, this, view, i28));
        }
    }

    @Override // yg.b0
    public void w0(com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.g(this, view));
        }
    }
}
