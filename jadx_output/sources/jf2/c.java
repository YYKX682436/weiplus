package jf2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.m f299359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f299360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jf2.g f299361f;

    public c(jf2.m mVar, int i17, jf2.g gVar) {
        this.f299359d = mVar;
        this.f299360e = i17;
        this.f299361f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f299359d.e(this.f299360e);
        com.tencent.mm.plugin.finder.live.widget.e0.t(this.f299361f, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
