package xx0;

/* loaded from: classes5.dex */
public final class k extends vu3.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xx0.n f457913b;

    public k(xx0.n nVar) {
        this.f457913b = nVar;
    }

    @Override // vu3.c
    public void b(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        this.f457913b.f457924j = false;
        yz5.a aVar = this.f457913b.f457921g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // vu3.c
    public void c(uu3.u layout) {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        kotlin.jvm.internal.o.g(layout, "layout");
        xx0.l lVar = this.f457913b.f457922h;
        if (lVar != null) {
            rootView = ((mx0.a8) lVar).f331833a.getRootView();
            rootView.setEnabled(true);
        }
    }

    @Override // vu3.c
    public void d(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        yz5.a aVar = this.f457913b.f457920f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // vu3.c
    public void e(uu3.u layout) {
        kotlin.jvm.internal.o.g(layout, "layout");
        xx0.l lVar = this.f457913b.f457922h;
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        com.tencent.mm.mj_publisher.finder.shoot_composing.widget.ShootComposingCameraViewContainer templateSurfaceParent;
        com.tencent.mm.mj_publisher.finder.shoot_composing.widget.ShootComposingCameraViewContainer templateSurfaceParent2;
        mx0.l favoritePlugin;
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(source, "source");
        super.f(layout, f17, source);
        xx0.n nVar = this.f457913b;
        xx0.l lVar = nVar.f457922h;
        if (lVar != null) {
            float f18 = nVar.f457918d;
            mx0.a8 a8Var = (mx0.a8) lVar;
            float f19 = 1;
            float f27 = a8Var.f331834b - f19;
            float f28 = a8Var.f331835c;
            float f29 = ((f27 / (0 - f28)) * ((f28 > f17 ? f17 : f28) - f28)) + f19;
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = a8Var.f331833a;
            templateSurfaceParent = shootComposingPluginLayout.getTemplateSurfaceParent();
            templateSurfaceParent.setScaleX(f29);
            templateSurfaceParent2 = shootComposingPluginLayout.getTemplateSurfaceParent();
            templateSurfaceParent2.setScaleY(f29);
            com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView moreTemplateFakeView = a8Var.f331836d;
            float fakeShootButtonSize = moreTemplateFakeView.getFakeShootButtonSize();
            float f37 = f17 < fakeShootButtonSize ? (fakeShootButtonSize - f17) / fakeShootButtonSize : 0.0f;
            moreTemplateFakeView.setAlpha(f37);
            favoritePlugin = shootComposingPluginLayout.getFavoritePlugin();
            favoritePlugin.d(f37);
        }
    }
}
