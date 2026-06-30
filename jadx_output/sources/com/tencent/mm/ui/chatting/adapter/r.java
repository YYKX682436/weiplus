package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.s f198439d;

    public r(com.tencent.mm.ui.chatting.adapter.s sVar) {
        this.f198439d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.adapter.s sVar = this.f198439d;
        try {
            if (!sVar.f198440d.f198446a.endsWith("hd")) {
                sVar.f198440d.f198446a = sVar.f198440d.f198446a + "hd";
            }
            androidx.recyclerview.widget.RecyclerView recyclerView = sVar.f198442f.f198385e;
            if (recyclerView != null) {
                androidx.recyclerview.widget.k3 p07 = recyclerView.p0(sVar.f198441e);
                if (p07 instanceof com.tencent.mm.ui.chatting.adapter.z) {
                    n11.a.b().h(sVar.f198440d.f198446a, ((com.tencent.mm.ui.chatting.adapter.z) p07).f198455d, sVar.f198442f.f198388h);
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "load hd thumb image failed : " + th6.getMessage());
        }
    }
}
