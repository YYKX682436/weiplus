package pk2;

/* loaded from: classes3.dex */
public final class x2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b3 f356351d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f356352e;

    public x2(pk2.b3 b3Var, pk2.o9 o9Var) {
        this.f356351d = b3Var;
        this.f356352e = o9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView finderLiveLocationView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f356351d.x(2);
        mf2.b0 b0Var = (if2.b) this.f356352e.e(yf2.z0.class);
        if (b0Var != null && (b0Var instanceof jm2.c) && (finderLiveLocationView = (com.tencent.mm.plugin.finder.live.view.FinderLiveLocationView) ((yf2.z0) ((jm2.c) b0Var)).S6(com.tencent.mm.R.id.l0q)) != null) {
            finderLiveLocationView.h();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/moreaction/AnchorPoiOption$addItem$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
