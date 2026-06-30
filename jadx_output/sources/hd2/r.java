package hd2;

/* loaded from: classes2.dex */
public final class r implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderEmojiView f280522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f280523e;

    public r(com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView, android.widget.ImageView imageView) {
        this.f280522d = finderEmojiView;
        this.f280523e = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.plugin.finder.view.FinderEmojiView finderEmojiView = this.f280522d;
        android.view.ViewTreeObserver viewTreeObserver = finderEmojiView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        android.widget.ImageView imageView = this.f280523e;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = finderEmojiView.getMeasuredHeight();
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.width = finderEmojiView.getMeasuredWidth();
    }
}
