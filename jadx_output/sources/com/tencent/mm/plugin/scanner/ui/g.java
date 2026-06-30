package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes9.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f159551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference f159552e;

    public g(com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference categoryWithTitlePreference, android.graphics.Bitmap bitmap) {
        this.f159552e = categoryWithTitlePreference;
        this.f159551d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.scanner.ui.CategoryWithTitlePreference categoryWithTitlePreference = this.f159552e;
        categoryWithTitlePreference.N.setImageBitmap(this.f159551d);
        categoryWithTitlePreference.N.setVisibility(0);
        categoryWithTitlePreference.getClass();
    }
}
