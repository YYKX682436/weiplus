package xc2;

/* loaded from: classes2.dex */
public final class k1 implements com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentDrawer f453192d;

    public k1(com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer) {
        this.f453192d = finderCommentDrawer;
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void a(float f17) {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void b() {
    }

    @Override // com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a
    public void c(boolean z17, boolean z18, int i17) {
        com.tencent.mm.plugin.finder.view.FinderCommentEditText editText;
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f453192d;
        com.tencent.mm.plugin.finder.view.FinderCommentFooter footer = finderCommentDrawer.getFooter();
        if (footer != null && (editText = footer.getEditText()) != null) {
            editText.requestFocus();
        }
        finderCommentDrawer.postDelayed(new xc2.j1(finderCommentDrawer), 800L);
        finderCommentDrawer.t(this);
    }
}
