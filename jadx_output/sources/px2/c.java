package px2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358870d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout) {
        super(0);
        this.f358870d = finderLandscapePreviewLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mw2.j spritePreviewController;
        com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout = this.f358870d;
        android.view.View seekTimeLayout = finderLandscapePreviewLayout.getSeekTimeLayout();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(seekTimeLayout, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        seekTimeLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(seekTimeLayout, "com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$1$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        spritePreviewController = finderLandscapePreviewLayout.getSpritePreviewController();
        spritePreviewController.b();
        return jz5.f0.f302826a;
    }
}
