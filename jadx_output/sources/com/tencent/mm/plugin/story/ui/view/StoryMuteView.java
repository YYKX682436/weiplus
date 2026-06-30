package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMuteView;", "Lcom/tencent/mm/plugin/story/api/AbsStoryMuteView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class StoryMuteView extends com.tencent.mm.plugin.story.api.AbsStoryMuteView {

    /* renamed from: d, reason: collision with root package name */
    public final int f172029d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.drawable.Drawable f172030e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f172031f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageView f172032g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMuteView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f172029d = 30;
        c();
    }

    @Override // com.tencent.mm.plugin.story.api.AbsStoryMuteView
    public void a() {
        android.widget.ImageView imageView = this.f172032g;
        if (imageView != null) {
            imageView.setPadding(0, 0, 0, 0);
        }
    }

    @Override // com.tencent.mm.plugin.story.api.AbsStoryMuteView
    public void b() {
        android.widget.ImageView imageView = this.f172032g;
        if (imageView != null) {
            int i17 = this.f172029d;
            imageView.setPadding(0, i17, i17, 0);
        }
    }

    public final void c() {
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489545cx1, this);
        this.f172031f = (android.widget.TextView) findViewById(com.tencent.mm.R.id.npe);
        this.f172032g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.npd);
        android.graphics.drawable.Drawable drawable = getContext().getResources().getDrawable(com.tencent.mm.R.raw.icons_outlined_volume_off);
        com.tencent.mm.ui.uk.f(drawable, -1);
        this.f172030e = drawable;
        kotlin.jvm.internal.o.d(drawable);
        drawable.setBounds(0, 0, i65.a.b(getContext(), 48), i65.a.b(getContext(), 48));
        android.widget.TextView textView = this.f172031f;
        if (textView != null) {
            textView.setCompoundDrawables(null, this.f172030e, null, null);
        }
        android.widget.TextView textView2 = this.f172031f;
        if (textView2 != null) {
            textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.jmy));
        }
        android.widget.ImageView imageView = this.f172032g;
        if (imageView != null) {
            int i17 = this.f172029d;
            imageView.setPadding(0, i17, i17, 0);
        }
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int f17 = i65.a.f(getContext(), com.tencent.mm.R.dimen.a8e);
        int mode = android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        if (mode == Integer.MIN_VALUE) {
            f17 = java.lang.Math.min(f17, size);
        } else if (mode == 1073741824) {
            f17 = size;
        }
        int f18 = i65.a.f(getContext(), com.tencent.mm.R.dimen.a8e);
        int mode2 = android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        if (mode2 == Integer.MIN_VALUE) {
            f18 = java.lang.Math.min(f18, size2);
        } else if (mode2 == 1073741824) {
            f18 = size2;
        }
        super.onMeasure(i17, i18);
        setMeasuredDimension(f17, f18);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryMuteView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        this.f172029d = 30;
        c();
    }

    public StoryMuteView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172029d = 30;
        c();
    }
}
