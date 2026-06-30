package qn4;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f365245a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f365246b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.ref.WeakReference f365247c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f365248d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f365249e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f365250f;

    public static final void a(qn4.i iVar) {
        com.tencent.mm.ui.base.AnimImageView animImageView;
        java.lang.ref.WeakReference weakReference = iVar.f365249e;
        if (weakReference != null && (animImageView = (com.tencent.mm.ui.base.AnimImageView) weakReference.get()) != null) {
            animImageView.c();
            animImageView.setVisibility(8);
        }
        java.lang.ref.WeakReference weakReference2 = iVar.f365248d;
        android.widget.ProgressBar progressBar = weakReference2 != null ? (android.widget.ProgressBar) weakReference2.get() : null;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        java.lang.ref.WeakReference weakReference3 = iVar.f365247c;
        android.widget.FrameLayout frameLayout = weakReference3 != null ? (android.widget.FrameLayout) weakReference3.get() : null;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechIndicator", "hideAll: all indicators GONE");
    }

    public final boolean b() {
        java.lang.ref.WeakReference weakReference = this.f365246b;
        android.widget.LinearLayout linearLayout = weakReference != null ? (android.widget.LinearLayout) weakReference.get() : null;
        if (linearLayout != null && linearLayout.getParent() != null) {
            return true;
        }
        java.lang.ref.WeakReference weakReference2 = this.f365245a;
        android.view.View view = weakReference2 != null ? (com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate) weakReference2.get() : null;
        if (view == null) {
            com.tencent.mars.xlog.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView is null");
            return false;
        }
        android.view.ViewParent parent = view.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView has no parent");
            return false;
        }
        int indexOfChild = viewGroup.indexOfChild(view);
        if (indexOfChild < 0) {
            com.tencent.mars.xlog.Log.w("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: translateView not found in parent");
            return false;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return false;
        }
        android.content.Context context = view.getContext();
        android.content.res.Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479704cz);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479688cn);
        int dimensionPixelSize3 = resources.getDimensionPixelSize(com.tencent.mm.R.dimen.f479646bl);
        android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setTag("translation_speech_indicator_wrapper");
        viewGroup.removeViewAt(indexOfChild);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(context);
        android.widget.ProgressBar progressBar = new android.widget.ProgressBar(context, null, 0, com.tencent.mm.R.style.f494818x4);
        progressBar.setClickable(false);
        progressBar.setVisibility(8);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimensionPixelSize2, dimensionPixelSize2);
        layoutParams2.gravity = 17;
        frameLayout.addView(progressBar, layoutParams2);
        com.tencent.mm.ui.base.AnimImageView animImageView = new com.tencent.mm.ui.base.AnimImageView(context);
        animImageView.setType(3);
        animImageView.setFromVoice(!this.f365250f);
        animImageView.setVisibility(8);
        animImageView.setClickable(true);
        animImageView.setOnClickListener(qn4.b.f365238d);
        frameLayout.addView(animImageView, new android.widget.FrameLayout.LayoutParams(-1, -1));
        frameLayout.setVisibility(8);
        android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        android.view.ViewGroup.LayoutParams layoutParams4 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        if (this.f365250f) {
            layoutParams3.rightMargin = dimensionPixelSize3;
            linearLayout2.addView(frameLayout, layoutParams3);
            linearLayout2.addView(view, layoutParams4);
        } else {
            layoutParams3.leftMargin = dimensionPixelSize3;
            linearLayout2.addView(view, layoutParams4);
            linearLayout2.addView(frameLayout, layoutParams3);
        }
        viewGroup.addView(linearLayout2, indexOfChild, layoutParams);
        this.f365246b = new java.lang.ref.WeakReference(linearLayout2);
        this.f365247c = new java.lang.ref.WeakReference(frameLayout);
        this.f365248d = new java.lang.ref.WeakReference(progressBar);
        this.f365249e = new java.lang.ref.WeakReference(animImageView);
        com.tencent.mars.xlog.Log.i("TranslationSpeechSpeechIndicator", "ensureWrapperCreated: created wrapper at index=" + indexOfChild + ", isSent=" + this.f365250f);
        return true;
    }
}
