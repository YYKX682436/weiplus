package px2;

/* loaded from: classes2.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358872d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358872d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mw2.j spritePreviewController;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358872d;
        android.view.View seekTimeLayout = finderLandscapePreviewLayout.getSeekTimeLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(seekTimeLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(seekTimeLayout, "com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        spritePreviewController = finderLandscapePreviewLayout.getSpritePreviewController();
        if (spritePreviewController.f331726e) {
            android.widget.ImageView imageView = spritePreviewController.f331723b;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            spritePreviewController.f331728g = null;
            spritePreviewController.f331725d = 0L;
        }
        return jz5.f0.f302826a;
    }
}
