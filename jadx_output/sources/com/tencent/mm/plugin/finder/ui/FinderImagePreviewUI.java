package com.tencent.mm.plugin.finder.ui;

@db5.a(35)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderImagePreviewUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/f7", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderImagePreviewUI extends com.tencent.mm.plugin.finder.ui.MMFinderUI {
    public static final /* synthetic */ int H = 0;
    public boolean A;
    public android.graphics.Rect B;
    public float C;
    public float D;
    public float E;
    public float F;
    public android.graphics.Bitmap G;

    /* renamed from: t, reason: collision with root package name */
    public final int f128585t = 1;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f128586u = "MicroMsg.FinderImagePreviewUI";

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f128587v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.ui.tools.MMGestureGallery f128588w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f128589x;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.view.AnimationLayout f128590y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f128591z;

    public final void c7() {
        if (this.B == null) {
            finish();
            return;
        }
        if (this.A) {
            finish();
            return;
        }
        this.A = true;
        com.tencent.mars.xlog.Log.i(this.f128586u, "runExitAnimation");
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f128588w;
        if (mMGestureGallery == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        android.view.View selectedView = mMGestureGallery.getSelectedView();
        kotlin.jvm.internal.o.e(selectedView, "null cannot be cast to non-null type com.tencent.mm.ui.base.MultiTouchImageView");
        com.tencent.mm.ui.base.MultiTouchImageView multiTouchImageView = (com.tencent.mm.ui.base.MultiTouchImageView) selectedView;
        com.tencent.mm.view.AnimationLayout animationLayout = this.f128590y;
        if (animationLayout == null) {
            kotlin.jvm.internal.o.o("animationLayout");
            throw null;
        }
        android.view.View view = this.f128589x;
        if (view == null) {
            kotlin.jvm.internal.o.o("galleryBg");
            throw null;
        }
        android.view.View view2 = this.f128587v;
        if (view2 != null) {
            animationLayout.a(view, view2, new com.tencent.mm.view.ViewAnimHelper$ViewInfo(this.B), new com.tencent.mm.plugin.finder.ui.k7(multiTouchImageView, this), new com.tencent.mm.plugin.finder.ui.l7(multiTouchImageView, this));
        } else {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.akj;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        getController().F().o();
        getController().W0(this, getResources().getColor(com.tencent.mm.R.color.a9e));
        getController().E0(getResources().getColor(com.tencent.mm.R.color.a9e));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.m7g);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f128587v = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ghs);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f128588w = (com.tencent.mm.ui.tools.MMGestureGallery) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.ght);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f128589x = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f483056vf);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f128590y = (com.tencent.mm.view.AnimationLayout) findViewById4;
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_file_list");
        java.util.ArrayList<java.lang.String> stringArrayListExtra2 = getIntent().getStringArrayListExtra("key_url_list");
        boolean booleanExtra = getIntent().getBooleanExtra("allow_long_click_save_image", true);
        this.f128591z = getIntent().getBooleanExtra("key_preview_avatar", false);
        this.B = (android.graphics.Rect) getIntent().getParcelableExtra("key_thumb_location");
        java.lang.String str = this.f128586u;
        com.tencent.mars.xlog.Log.i(str, "files %s, urls", stringArrayListExtra, stringArrayListExtra2);
        com.tencent.mm.plugin.finder.ui.f7 f7Var = new com.tencent.mm.plugin.finder.ui.f7(this);
        java.util.ArrayList arrayList = f7Var.f129122d;
        if (stringArrayListExtra != null) {
            arrayList.addAll(stringArrayListExtra);
            f7Var.f129123e = true;
        } else if (stringArrayListExtra2 != null) {
            arrayList.addAll(stringArrayListExtra2);
            f7Var.f129123e = false;
        }
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = this.f128588w;
        if (mMGestureGallery == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        mMGestureGallery.setSingleClickOverListener(new com.tencent.mm.plugin.finder.ui.h7(this));
        if (this.f128591z && booleanExtra) {
            com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery2 = this.f128588w;
            if (mMGestureGallery2 == null) {
                kotlin.jvm.internal.o.o("gallery");
                throw null;
            }
            mMGestureGallery2.setLongClickOverListener(new com.tencent.mm.plugin.finder.ui.i7(this, stringArrayListExtra2));
        }
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery3 = this.f128588w;
        if (mMGestureGallery3 == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        mMGestureGallery3.setAdapter((android.widget.SpinnerAdapter) f7Var);
        com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery4 = this.f128588w;
        if (mMGestureGallery4 == null) {
            kotlin.jvm.internal.o.o("gallery");
            throw null;
        }
        mMGestureGallery4.setGalleryScaleListener(new com.tencent.mm.plugin.finder.ui.g7(this));
        if (this.B == null) {
            android.view.View view = this.f128589x;
            if (view == null) {
                kotlin.jvm.internal.o.o("galleryBg");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/ui/FinderImagePreviewUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.A) {
            return;
        }
        this.A = true;
        com.tencent.mars.xlog.Log.i(str, "runEnterAnimation");
        com.tencent.mm.view.AnimationLayout animationLayout = this.f128590y;
        if (animationLayout == null) {
            kotlin.jvm.internal.o.o("animationLayout");
            throw null;
        }
        android.view.View view2 = this.f128589x;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("galleryBg");
            throw null;
        }
        android.view.View view3 = this.f128587v;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("root");
            throw null;
        }
        ym5.b bVar = new ym5.b(animationLayout, view3, new com.tencent.mm.view.ViewAnimHelper$ViewInfo(this.B), view2, new com.tencent.mm.plugin.finder.ui.j7(this), null);
        if ((animationLayout.getMeasuredState() & (-16777216)) > 0) {
            bVar.run();
        } else {
            animationLayout.getViewTreeObserver().addOnPreDrawListener(new ym5.c(animationLayout, bVar));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        c7();
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(5894);
        initView();
    }
}
