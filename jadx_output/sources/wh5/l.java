package wh5;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446074d;

    public l(wh5.s sVar) {
        this.f446074d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s sVar = this.f446074d;
        mf3.s sVar2 = sVar.f326110m;
        if (sVar2 != null && (kVar = sVar2.f326117a) != null && (mVar = (dg3.m) sVar.H(dg3.m.class)) != null) {
            mVar.y6(kVar, sVar.f353826s);
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
