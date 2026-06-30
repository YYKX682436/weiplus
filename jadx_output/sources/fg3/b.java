package fg3;

/* loaded from: classes12.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.g f262428d;

    public b(fg3.g gVar) {
        this.f262428d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        fg3.g gVar = this.f262428d;
        mf3.s sVar = gVar.f326110m;
        if (sVar != null && (kVar = sVar.f326117a) != null && (mVar = (dg3.m) gVar.H(dg3.m.class)) != null) {
            mVar.y6(kVar, gVar.f353826s);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
