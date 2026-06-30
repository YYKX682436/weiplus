package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ct implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.et f118025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f118026e;

    public ct(com.tencent.mm.plugin.finder.live.widget.et etVar, yz5.a aVar) {
        this.f118025d = etVar;
        this.f118026e = aVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == this.f118025d.T) {
            this.f118026e.invoke();
        }
    }
}
