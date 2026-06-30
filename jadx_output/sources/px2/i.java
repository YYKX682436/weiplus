package px2;

/* loaded from: classes2.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout f358889d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358890e;

    public i(com.tencent.mm.plugin.finder.view.landscape.FinderLandscapePreviewLayout finderLandscapePreviewLayout, in5.s0 s0Var) {
        this.f358889d = finderLandscapePreviewLayout;
        this.f358890e = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f358889d.q(this.f358890e);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout$attachSeekBar$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
