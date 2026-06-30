package lf4;

/* loaded from: classes4.dex */
public final class q implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf4.b0 f318459a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f318460b;

    public q(lf4.b0 b0Var, int i17) {
        this.f318459a = b0Var;
        this.f318460b = i17;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        lf4.b0 b0Var = this.f318459a;
        com.tencent.mars.xlog.Log.i(b0Var.f318358h, "onChanged: " + i17 + ' ' + i18);
        ((sf4.a1) b0Var.f318355e).e(this.f318460b, i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        lf4.b0 b0Var = this.f318459a;
        com.tencent.mars.xlog.Log.i(b0Var.f318358h, "onInserted: " + i17 + ' ' + i18);
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = ((sf4.a1) b0Var.f318355e).f407411a;
        int i19 = storyGalleryView.f172102u;
        int i27 = this.f318460b;
        if (i19 != i27) {
            storyGalleryView.f172107y.post(new sf4.x0(storyGalleryView, i27));
        } else {
            pf4.x xVar = storyGalleryView.f172099r;
            if (xVar != null) {
                xVar.notifyItemRangeInserted(i17, i18);
            }
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        lf4.b0 b0Var = this.f318459a;
        com.tencent.mars.xlog.Log.i(b0Var.f318358h, "onRemoved: " + i17 + ' ' + i18);
        ((sf4.a1) b0Var.f318355e).f(this.f318460b, i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f318459a.f318358h, "onMoved: " + i17 + ' ' + i18);
    }
}
