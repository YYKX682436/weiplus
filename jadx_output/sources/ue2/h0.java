package ue2;

/* loaded from: classes3.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f426816a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f426817b;

    /* renamed from: c, reason: collision with root package name */
    public final ue2.e0 f426818c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f426819d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.FrameLayout f426820e;

    public h0(android.content.Context context, android.widget.FrameLayout frameLayout, ue2.e0 e0Var, android.view.View view, android.widget.FrameLayout frameLayout2) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f426816a = context;
        this.f426817b = frameLayout;
        this.f426818c = e0Var;
        this.f426819d = view;
        this.f426820e = frameLayout2;
    }

    public final boolean a() {
        android.view.ViewGroup contentView;
        com.tencent.mars.xlog.Log.i("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 开始迁移预览从主布局到弹窗");
        android.widget.FrameLayout frameLayout = this.f426817b;
        if (frameLayout == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 找不到previewContainer的父容器");
            return false;
        }
        android.view.ViewParent parent = frameLayout.getParent();
        android.widget.FrameLayout frameLayout2 = null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 找不到previewContainer的父容器");
            return false;
        }
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        com.tencent.mars.xlog.Log.i("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 当前previewContainer位置: (" + iArr[0] + ", " + iArr[1] + ')');
        viewGroup.removeView(frameLayout);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(frameLayout.getLayoutParams().width, frameLayout.getLayoutParams().height);
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = 0;
        layoutParams.gravity = 1;
        ue2.e0 e0Var = this.f426818c;
        if (e0Var != null && (contentView = e0Var.getContentView()) != null) {
            frameLayout2 = (android.widget.FrameLayout) contentView.findViewById(com.tencent.mm.R.id.t3y);
        }
        if (frameLayout2 == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 找不到内部弹窗的预览容器");
            return false;
        }
        frameLayout2.removeAllViews();
        frameLayout2.addView(frameLayout, layoutParams);
        frameLayout.setElevation(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout.setTranslationX(0.0f);
        com.tencent.mars.xlog.Log.i("FinderLiveChatPreviewMigrationHelper", "migratePreviewFromMainToDialog: 预览容器已迁移到内部弹窗");
        return true;
    }
}
