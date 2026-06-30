package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.b f159495e;

    public a(com.tencent.mm.plugin.scanner.ui.b bVar, android.graphics.Bitmap bitmap) {
        this.f159495e = bVar;
        this.f159494d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.b bVar = this.f159495e;
        bVar.N.setImageBitmap(this.f159494d);
        bVar.N.setVisibility(0);
        bVar.getClass();
    }
}
