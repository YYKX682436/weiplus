package sf4;

/* loaded from: classes4.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView f407518d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView) {
        super(0);
        this.f407518d = storyGalleryView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.story.ui.view.gallery.StoryGalleryView storyGalleryView = this.f407518d;
        java.lang.Object obj = ((java.util.ArrayList) storyGalleryView.f172109z.get(storyGalleryView.f172102u)).get(storyGalleryView.f172103v);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        nf4.j J0 = ef4.w.f252468t.i().J0(((if4.f) obj).f291247e.f291253a);
        java.lang.String string = J0 != null && J0.u0() ? storyGalleryView.getContext().getString(com.tencent.mm.R.string.jmj) : storyGalleryView.getContext().getString(com.tencent.mm.R.string.jlx);
        kotlin.jvm.internal.o.d(string);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(storyGalleryView.getContext());
        u1Var.g(string);
        u1Var.n(storyGalleryView.getContext().getString(com.tencent.mm.R.string.jlx));
        u1Var.k(-65536);
        u1Var.a(true);
        u1Var.b(new sf4.c1(storyGalleryView, J0));
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("MicroMsg.StoryGalleryView", "delete click");
        return jz5.f0.f302826a;
    }
}
