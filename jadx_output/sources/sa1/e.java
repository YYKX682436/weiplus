package sa1;

/* loaded from: classes7.dex */
public final class e extends sa1.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ae.a logicImpl) {
        super(logicImpl);
        kotlin.jvm.internal.o.g(logicImpl, "logicImpl");
    }

    @Override // yg.b0
    public void a0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: inserting magicbrush view in global parent screen canvas view delegate " + view.getVirtualElementId());
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.b(view, i19, i27, this, i17, i18, i28));
        }
    }

    @Override // yg.b0
    public void q0(com.tencent.magicbrush.ui.MagicBrushView view, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(view, "view");
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.d(i17, i18, i19, i27, i28, this, view));
        }
    }

    @Override // yg.b0
    public void w0(com.tencent.magicbrush.ui.MagicBrushView view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.GlobalParentScreenCanvasViewDelegate", "hy: removing magicbrush view in global parent screen canvas view delegate " + view.getVirtualElementId());
        ze.n S = this.f405259d.S();
        if (S != null) {
            S.m(new sa1.c(this, view));
        }
    }
}
