package lf4;

/* loaded from: classes4.dex */
public final class d0 implements androidx.recyclerview.widget.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lf4.q0 f318378a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f318379b;

    public d0(lf4.q0 q0Var, java.util.List list) {
        this.f318378a = q0Var;
        this.f318379b = list;
    }

    @Override // androidx.recyclerview.widget.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", "onChanged: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f318378a;
        q0Var.f318465i.clear();
        q0Var.f318465i.addAll(this.f318379b);
        ((sf4.a1) q0Var.f318462f).h(0, q0Var.f318465i);
        ((sf4.a1) q0Var.f318462f).d();
        ((sf4.a1) q0Var.f318462f).e(0, i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void b(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", "onInserted: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f318378a;
        q0Var.f318465i.clear();
        java.util.ArrayList arrayList = q0Var.f318465i;
        arrayList.addAll(this.f318379b);
        lf4.h hVar = q0Var.f318462f;
        ((sf4.a1) hVar).h(0, arrayList);
        ((sf4.a1) hVar).d();
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = ((sf4.a1) hVar).f407411a;
        if (storyGalleryView.f172102u != 0) {
            storyGalleryView.f172107y.post(new sf4.x0(storyGalleryView, 0));
        } else {
            pf4.x xVar = storyGalleryView.f172099r;
            if (xVar != null) {
                xVar.notifyItemRangeInserted(i17, i18);
            }
        }
    }

    @Override // androidx.recyclerview.widget.r1
    public void c(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", "onRemoved: " + i17 + ' ' + i18);
        lf4.q0 q0Var = this.f318378a;
        q0Var.f318465i.clear();
        q0Var.f318465i.addAll(this.f318379b);
        ((sf4.a1) q0Var.f318462f).h(0, q0Var.f318465i);
        ((sf4.a1) q0Var.f318462f).d();
        ((sf4.a1) q0Var.f318462f).f(0, i17, i18);
    }

    @Override // androidx.recyclerview.widget.r1
    public void d(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SelfGalleryPresenter", "onMoved: " + i17 + ' ' + i18);
    }
}
