package com.tencent.mm.plugin.login_exdevice.ui;

/* loaded from: classes12.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f144997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.login_exdevice.ui.j f144998e;

    public i(com.tencent.mm.plugin.login_exdevice.ui.j jVar, android.graphics.Bitmap bitmap) {
        this.f144998e = jVar;
        this.f144997d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f144998e.f145000e.f144977m.setImageBitmap(this.f144997d);
    }
}
