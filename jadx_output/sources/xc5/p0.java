package xc5;

/* loaded from: classes12.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f453548d;

    public p0(xc5.y0 y0Var) {
        this.f453548d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.y0.g0(this.f453548d, dg3.q.f232342f);
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
