package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class j implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.m f202275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.k f202276e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n f202277f;

    public j(com.tencent.mm.ui.chatting.presenter.n nVar, com.tencent.mm.ui.chatting.presenter.m mVar, com.tencent.mm.ui.chatting.presenter.k kVar) {
        this.f202277f = nVar;
        this.f202275d = mVar;
        this.f202276e = kVar;
    }

    @Override // l01.u
    public void b() {
        n11.a.b().h(this.f202276e.f202294n, this.f202275d.f202331i, this.f202277f.f202353t);
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "SEARCH#" + ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        com.tencent.mm.ui.chatting.presenter.m mVar = this.f202275d;
        if (bitmap == null || bitmap.isRecycled()) {
            n11.a.b().h(this.f202276e.f202294n, mVar.f202331i, this.f202277f.f202353t);
        } else {
            mVar.f202331i.setImageBitmap(bitmap);
        }
    }
}
