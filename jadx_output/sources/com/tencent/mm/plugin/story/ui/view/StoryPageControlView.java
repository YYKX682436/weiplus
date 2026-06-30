package com.tencent.mm.plugin.story.ui.view;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0002B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryPageControlView;", "Lcom/tencent/mm/ui/base/MMPageControlView;", "Lrf4/f2;", "pageControlInterface", "Ljz5/f0;", "setPageIndicatorStatusInterface", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class StoryPageControlView extends com.tencent.mm.ui.base.MMPageControlView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StoryPageControlView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
    }

    @Override // com.tencent.mm.ui.base.MMPageControlView
    public void a(int i17) {
        super.a(i17);
        int i18 = this.f197514e;
        int i19 = 0;
        while (i19 < i18) {
            android.widget.ImageView imageView = (android.widget.ImageView) ((java.util.HashMap) this.f197515f).get(java.lang.Integer.valueOf(i19));
            this.f197516g = imageView;
            imageView.setSelected(i17 == i19);
            i19++;
        }
    }

    public final void setPageIndicatorStatusInterface(rf4.f2 f2Var) {
    }
}
