package com.tencent.mm.ui.brandservice;

/* loaded from: classes11.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.brandservice.BrandServiceNotifyUI f198042d;

    public c(com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI) {
        this.f198042d = brandServiceNotifyUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI = this.f198042d;
        brandServiceNotifyUI.f198023g = (com.tencent.mm.storage.l4) brandServiceNotifyUI.f198022f.getItem(i17);
        brandServiceNotifyUI.f198028o = brandServiceNotifyUI.f198023g.h1();
        com.tencent.mm.ui.brandservice.BrandServiceNotifyUI brandServiceNotifyUI2 = this.f198042d;
        brandServiceNotifyUI2.f198024h.g(view, i17, j17, brandServiceNotifyUI2, brandServiceNotifyUI2.f198035v, brandServiceNotifyUI2.f198030q, brandServiceNotifyUI2.f198031r);
        return true;
    }
}
