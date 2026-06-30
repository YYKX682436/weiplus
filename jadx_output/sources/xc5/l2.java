package xc5;

/* loaded from: classes12.dex */
public final class l2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f453533d;

    public l2(xc5.s2 s2Var) {
        this.f453533d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        dg3.m mVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.s2 s2Var = this.f453533d;
        mf3.s sVar = s2Var.f326110m;
        if (sVar != null && (kVar = sVar.f326117a) != null && (mVar = (dg3.m) s2Var.H(dg3.m.class)) != null) {
            mVar.y6(kVar, s2Var.f353826s);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
