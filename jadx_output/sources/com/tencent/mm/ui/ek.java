package com.tencent.mm.ui;

/* loaded from: classes7.dex */
public class ek implements android.view.View.OnApplyWindowInsetsListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f208403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f208404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.qk f208405f;

    public ek(int i17, android.view.View view, com.tencent.mm.ui.qk qkVar) {
        this.f208403d = i17;
        this.f208404e = view;
        this.f208405f = qkVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        android.view.DisplayCutout displayCutout;
        java.util.List<android.graphics.Rect> boundingRects;
        synchronized (com.tencent.mm.ui.bk.f197982e) {
            com.tencent.mm.ui.bk.f197980c.put(this.f208403d, this.f208404e.getRootWindowInsets());
            if (this.f208404e.getRootWindowInsets() != null && (displayCutout = this.f208404e.getRootWindowInsets().getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && boundingRects.size() > 0) {
                com.tencent.mm.ui.bk.f197979b = true;
                com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).putBoolean("has_cutout", com.tencent.mm.ui.bk.f197979b);
            }
        }
        this.f208405f.d(this);
        return windowInsets;
    }
}
