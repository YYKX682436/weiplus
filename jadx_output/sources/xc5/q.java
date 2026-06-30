package xc5;

/* loaded from: classes12.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f453552d;

    public q(xc5.h0 h0Var) {
        this.f453552d = h0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        com.tencent.mm.storage.f9 h07;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.h0 h0Var = this.f453552d;
        mf3.s sVar = h0Var.f326110m;
        if (sVar != null && (kVar = sVar.f326117a) != null && (h07 = h0Var.h0()) != null) {
            if (h0Var.f453467y) {
                h0Var.f453467y = false;
                kVar.f(mf3.w.f326128d);
                lg3.a aVar = h0Var.f453465w;
                if (aVar != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar).h(kVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                }
            } else {
                h0Var.f453467y = true;
                kVar.f(mf3.w.f326129e);
                lg3.a aVar2 = h0Var.f453465w;
                if (aVar2 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(kVar, new vf3.f(vf3.e.f436380g, null, 0, 0.0f, 6, null));
                }
                h0Var.b0();
                kotlinx.coroutines.l.d(h0Var.f453468z, null, null, new xc5.e0(h07, h0Var, kVar, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
