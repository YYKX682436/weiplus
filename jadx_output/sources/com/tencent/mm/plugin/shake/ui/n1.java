package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f162312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162313f;

    public n1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI, java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f162313f = tVInfoUI;
        this.f162311d = str;
        this.f162312e = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap;
        com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI = this.f162313f;
        java.lang.String str = tVInfoUI.f162226f;
        if (str != null && str.equals(this.f162311d)) {
            android.widget.ImageView imageView = tVInfoUI.f162225e;
            if (imageView != null && (bitmap = this.f162312e) != null) {
                imageView.setImageBitmap(bitmap);
                tVInfoUI.X6();
            }
            tVInfoUI.f162233p = true;
        }
        com.tencent.mm.ui.base.preference.r rVar = tVInfoUI.f162224d;
    }
}
