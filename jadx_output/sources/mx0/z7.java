package mx0;

/* loaded from: classes5.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f332475g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f332476h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, yz5.a aVar, java.lang.String str, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2) {
        super(0);
        this.f332472d = shootComposingPluginLayout;
        this.f332473e = aVar;
        this.f332474f = str;
        this.f332475g = c0Var;
        this.f332476h = c0Var2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mx0.o1 materialImportUIPlugin;
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        mx0.ja templateUIPlugin;
        mx0.l favoritePlugin;
        mx0.l favoritePlugin2;
        mx0.o1 materialImportUIPlugin2;
        mx0.g3 recordPlugin;
        mx0.ja templateUIPlugin2;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332472d;
        materialImportUIPlugin = shootComposingPluginLayout.getMaterialImportUIPlugin();
        materialImportUIPlugin.f332188m = null;
        materialImportUIPlugin.f332189n = null;
        this.f332473e.invoke();
        rootView = shootComposingPluginLayout.getRootView();
        rootView.setEnabled(true);
        templateUIPlugin = shootComposingPluginLayout.getTemplateUIPlugin();
        templateUIPlugin.f332088t = true;
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        if (!kotlin.jvm.internal.o.b(this.f332474f, b8Var.M())) {
            templateUIPlugin2 = shootComposingPluginLayout.getTemplateUIPlugin();
            templateUIPlugin2.b(b8Var.M(), false);
        }
        shootComposingPluginLayout.S0();
        favoritePlugin = shootComposingPluginLayout.getFavoritePlugin();
        android.view.View view = favoritePlugin.f331814d;
        view.setElevation(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (j65.q.a(com.tencent.mm.sdk.platformtools.x2.f193071a).getDisplayMetrics().density * 5);
        favoritePlugin2 = shootComposingPluginLayout.getFavoritePlugin();
        favoritePlugin2.d(1.0f);
        if (this.f332475g.f310112d) {
            recordPlugin = shootComposingPluginLayout.getRecordPlugin();
            recordPlugin.getClass();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
            kotlin.jvm.internal.o.d(obtain);
            com.tencent.mm.mj_publisher.finder.shoot_composing.RecordButton recordButton = recordPlugin.f331993g;
            recordButton.onTouchEvent(obtain);
            obtain.recycle();
            android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
            kotlin.jvm.internal.o.d(obtain2);
            recordButton.onTouchEvent(obtain2);
            obtain2.recycle();
        }
        if (this.f332476h.f310112d) {
            materialImportUIPlugin2 = shootComposingPluginLayout.getMaterialImportUIPlugin();
            materialImportUIPlugin2.onClick(shootComposingPluginLayout);
        }
        return jz5.f0.f302826a;
    }
}
