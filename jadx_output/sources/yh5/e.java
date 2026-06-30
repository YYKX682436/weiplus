package yh5;

/* loaded from: classes3.dex */
public final class e extends lf3.n implements lf3.i {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f462425d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f462426e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f462427f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f462428g;

    /* renamed from: h, reason: collision with root package name */
    public yh5.g f462429h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f462430i;

    /* renamed from: m, reason: collision with root package name */
    public int f462431m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462431m = -1;
    }

    @Override // lf3.n, lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.e2w;
    }

    public void V6(float f17) {
        android.view.View view = this.f462425d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBackgroundAlphaChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBackgroundAlphaChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void W6(float f17) {
        android.view.View view = this.f462425d;
        if (view != null) {
            float f18 = 1 - f17;
            if (f18 < view.getAlpha()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Float.valueOf(f18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onExitProgressChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onExitProgressChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void X6(boolean z17) {
        this.f462428g = z17;
        android.widget.CheckBox checkBox = this.f462427f;
        if (checkBox != null && checkBox.isChecked() == z17) {
            return;
        }
        this.f462430i = true;
        android.widget.CheckBox checkBox2 = this.f462427f;
        if (checkBox2 != null) {
            checkBox2.setChecked(z17);
        }
        this.f462430i = false;
    }

    public final void Y6(int i17) {
        java.lang.Integer S;
        if (i17 < 0) {
            return;
        }
        this.f462431m = i17;
        yh5.g gVar = this.f462429h;
        boolean z17 = false;
        if (gVar != null) {
            if ((i17 >= 0 && (S = kz5.z.S(gVar.f462433e, i17)) != null) ? gVar.f462434f.get(S.intValue()) : false) {
                z17 = true;
            }
        }
        com.tencent.mars.xlog.Log.i("CleanGalleryToolbarComponent", "updateSelectionForPosition position=" + i17 + " selected=" + z17);
        X6(z17);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onBeforeFinish(android.content.Intent intent) {
        android.view.ViewPropertyAnimator animate;
        android.view.View view = this.f462425d;
        if (view != null && (animate = view.animate()) != null) {
            animate.alpha(0.0f);
            animate.setDuration(200L);
            animate.start();
        }
        super.onBeforeFinish(intent);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onBeforeFinishAfterTransition() {
        super.onBeforeFinishAfterTransition();
        android.view.View view = this.f462425d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBeforeFinishAfterTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBeforeFinishAfterTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        this.f462425d = null;
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f462425d = contentView;
        com.tencent.mars.xlog.Log.i("CleanGalleryToolbarComponent", "onViewCreated");
        contentView.setClickable(true);
        contentView.setOnClickListener(yh5.b.f462422d);
        this.f462426e = contentView.findViewById(com.tencent.mm.R.id.vg6);
        this.f462427f = (android.widget.CheckBox) contentView.findViewById(com.tencent.mm.R.id.vg7);
        android.view.View view = this.f462426e;
        if (view != null) {
            view.setOnClickListener(new yh5.c(this));
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f462429h = (yh5.g) pf5.z.f353948a.a(activity).a(yh5.g.class);
        lf3.j jVar = (lf3.j) U6(lf3.j.class);
        if (jVar != null) {
            jVar.N3(this);
        }
        android.widget.CheckBox checkBox = this.f462427f;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new yh5.d(this));
        }
        X6(this.f462428g);
    }
}
