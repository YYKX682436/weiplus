package com.tencent.mm.plugin.fts;

/* loaded from: classes8.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f137410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f137411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fts.i f137412f;

    public h(com.tencent.mm.plugin.fts.i iVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f137412f = iVar;
        this.f137410d = str;
        this.f137411e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fts.i iVar = this.f137412f;
        if (this.f137410d.equals(iVar.f137416a.getTag())) {
            t13.m mVar = new t13.m(iVar.f137417b.getResources(), this.f137411e);
            android.widget.ImageView imageView = iVar.f137416a;
            imageView.setImageDrawable(mVar);
            imageView.postInvalidate();
        }
    }
}
