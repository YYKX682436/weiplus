package xc5;

/* loaded from: classes12.dex */
public final class k2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.s2 f453519d;

    public k2(xc5.s2 s2Var) {
        this.f453519d = s2Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.s2.g0(this.f453519d, dg3.q.f232348o);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryVideoBottomBarLayer$attach$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
