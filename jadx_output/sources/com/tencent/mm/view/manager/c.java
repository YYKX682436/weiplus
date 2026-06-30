package com.tencent.mm.view.manager;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.pluginsdk.ui.g1 {

    /* renamed from: a, reason: collision with root package name */
    public int f213615a;

    /* renamed from: b, reason: collision with root package name */
    public int f213616b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f213617c;

    /* renamed from: d, reason: collision with root package name */
    public int f213618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.h1 f213619e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f213620f;

    public c(com.tencent.mm.pluginsdk.ui.h1 h1Var, android.view.View view) {
        this.f213619e = h1Var;
        this.f213620f = view;
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void a(int i17) {
        if (this.f213618d == i17) {
            return;
        }
        this.f213618d = i17;
        com.tencent.mm.pluginsdk.ui.h1 h1Var = this.f213619e;
        int i18 = ((ym5.f0) h1Var).f463290p;
        ((ym5.f0) h1Var).c();
        this.f213620f.setTranslationY(i18 + (i17 * (-1.0f)));
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void b(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onFinished: expanded=%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        ((ym5.f0) this.f213619e).b(this.f213615a, this.f213616b, 0);
        int i17 = this.f213616b;
        android.view.View view = this.f213620f;
        com.tencent.mm.view.manager.a aVar = new com.tencent.mm.view.manager.a(this, view);
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "update height " + view.getHeight() + " to " + i17);
        if (layoutParams == null || view.getHeight() == i17) {
            return;
        }
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
        aVar.invoke();
        view.requestLayout();
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void c(int i17, int i18, int i19, int i27) {
        if (this.f213615a == 0 && this.f213616b == 0) {
            this.f213615a = (com.tencent.mm.ui.bl.b(com.tencent.mm.sdk.platformtools.x2.f193071a).y * 4) / 5;
            this.f213616b = i27;
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onPanelSizeChanged: [" + i19 + ',' + i27 + "], " + this.f213615a);
            ((ym5.f0) this.f213619e).b(this.f213615a, this.f213616b, 0);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void d() {
        int i17 = this.f213616b;
        com.tencent.mm.pluginsdk.ui.h1 h1Var = this.f213619e;
        if (((ym5.f0) h1Var).c()) {
            i17 += ((ym5.f0) h1Var).f463290p;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onUpdateHeight: %s %s %s", java.lang.Integer.valueOf(this.f213615a), java.lang.Integer.valueOf(i17), 0);
        ((ym5.f0) h1Var).b(this.f213615a, i17, 0);
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void e(boolean z17) {
        this.f213617c = z17;
        com.tencent.mm.pluginsdk.ui.h1 h1Var = this.f213619e;
        if (!z17) {
            ((ym5.f0) h1Var).d();
        } else {
            ((ym5.f0) h1Var).b(this.f213615a, this.f213616b, 0);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.g1
    public void f(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "onStart: expanded=%s", java.lang.Boolean.valueOf(z17));
        if (z17) {
            return;
        }
        int i17 = this.f213615a;
        int i18 = this.f213616b;
        com.tencent.mm.pluginsdk.ui.h1 h1Var = this.f213619e;
        ((ym5.f0) h1Var).b(i17, i18, 0);
        int i19 = this.f213616b + ((ym5.f0) h1Var).f463290p;
        android.view.View view = this.f213620f;
        com.tencent.mm.view.manager.b bVar = new com.tencent.mm.view.manager.b(view, h1Var);
        if (view == null) {
            return;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiPanelSlideIndicatorHelper", "update height " + view.getHeight() + " to " + i19);
        if (layoutParams == null || view.getHeight() == i19) {
            return;
        }
        layoutParams.height = i19;
        view.setLayoutParams(layoutParams);
        bVar.invoke();
        view.requestLayout();
    }
}
