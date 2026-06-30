package nu0;

/* loaded from: classes5.dex */
public final class k1 implements com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339996a;

    public k1(nu0.b4 b4Var) {
        this.f339996a = b4Var;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.m
    public void a(float f17, float f18, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.q composingPanel) {
        kotlin.jvm.internal.o.g(composingPanel, "composingPanel");
        nu0.b4 b4Var = this.f339996a;
        if (b4Var.f339891z == null) {
            return;
        }
        float panelHeight = composingPanel.getPanelHeight();
        int height = b4Var.i7().getHeight();
        float f19 = b4Var.L;
        float width = b4Var.t7().getWidth();
        float height2 = b4Var.t7().getHeight();
        float height3 = (b4Var.t7().getHeight() + height) - panelHeight;
        float f27 = width / height3;
        boolean z17 = f19 > width / height2;
        boolean z18 = f19 > f27;
        android.util.SizeF sizeF = z17 ? new android.util.SizeF(width, width / f19) : new android.util.SizeF(height2 * f19, height2);
        android.util.SizeF sizeF2 = z18 ? new android.util.SizeF(width, width / f19) : new android.util.SizeF(f19 * height3, height3);
        float f28 = ((-(height2 - height3)) * f18) / 2;
        b4Var.s7().setTranslationY(f28);
        b4Var.r7().setTranslationY(f28);
        b4Var.s7().requestLayout();
        if (!(sizeF.getWidth() == sizeF2.getWidth())) {
            float width2 = sizeF2.getWidth() / sizeF.getWidth();
            float f29 = 1;
            float f37 = f29 - ((f29 - width2) * f18);
            b4Var.s7().setScaleX(f37);
            b4Var.s7().setScaleY(f37);
            b4Var.r7().setScaleX(f37);
            b4Var.r7().setScaleY(f37);
        }
        java.lang.Integer evaluate = w9.c.f444039a.evaluate(f18, java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) b4Var.X).getValue()).intValue()), java.lang.Integer.valueOf(((java.lang.Number) ((jz5.n) b4Var.U).getValue()).intValue()));
        android.widget.FrameLayout t76 = b4Var.t7();
        kotlin.jvm.internal.o.d(evaluate);
        t76.setBackgroundColor(evaluate.intValue());
        java.lang.Object parent = b4Var.t7().getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        if (view != null) {
            view.setBackgroundColor(evaluate.intValue());
        }
    }
}
