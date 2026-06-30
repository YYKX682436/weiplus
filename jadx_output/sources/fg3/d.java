package fg3;

/* loaded from: classes12.dex */
public final class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg3.g f262430d;

    public d(fg3.g gVar) {
        this.f262430d = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        dg3.q qVar = dg3.q.f232341e;
        fg3.g gVar = this.f262430d;
        mf3.s sVar = gVar.f326110m;
        if (sVar != null && (kVar = sVar.f326117a) != null && (mVar = (dg3.m) gVar.H(dg3.m.class)) != null) {
            mVar.Z0(kVar, gVar.f353826s, qVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/media/video/VideoBottomBarLayer$attach$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
