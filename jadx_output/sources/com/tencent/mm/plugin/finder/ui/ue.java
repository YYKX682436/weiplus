package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class ue implements qk.p7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI f129913a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129914b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f129915c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f129916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f129917e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f129918f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f129919g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Canvas f129920h;

    public ue(com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, int i17, int i18, long j17, boolean z17, android.graphics.Canvas canvas) {
        this.f129913a = finderSelectCoverUI;
        this.f129914b = bitmap;
        this.f129915c = bitmap2;
        this.f129916d = i17;
        this.f129917e = i18;
        this.f129918f = j17;
        this.f129919g = z17;
        this.f129920h = canvas;
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        if (bitmap == null) {
            return;
        }
        if (!z17) {
            int i17 = this.f129916d;
            int i18 = this.f129917e;
            android.graphics.Rect rect = new android.graphics.Rect(0, 0, i17, i18);
            if (bitmap.getHeight() < i18) {
                int height = (i17 - bitmap.getHeight()) / 2;
                rect.top = height;
                rect.bottom = height + bitmap.getHeight();
            }
            if (bitmap.getWidth() < i17) {
                int width = (i17 - bitmap.getWidth()) / 2;
                rect.left = width;
                rect.right = width + bitmap.getWidth();
            }
            this.f129920h.drawBitmap(bitmap, (android.graphics.Rect) null, rect, (android.graphics.Paint) null);
        }
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129913a;
        finderSelectCoverUI.o7(this.f129914b, this.f129915c, this.f129916d, this.f129917e, this.f129918f, finderSelectCoverUI.f128682x0, java.lang.Boolean.valueOf(this.f129919g));
    }

    @Override // qk.p7
    public void onError(java.lang.Exception exc) {
        com.tencent.mars.xlog.Log.e("Finder.FinderSelectCoverUI", "gen title error");
        com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI finderSelectCoverUI = this.f129913a;
        android.graphics.Bitmap bitmap = this.f129914b;
        android.graphics.Bitmap bitmap2 = this.f129915c;
        int i17 = this.f129916d;
        int i18 = this.f129917e;
        long j17 = this.f129918f;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f129919g);
        int i19 = com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI.f128668e2;
        finderSelectCoverUI.o7(bitmap, bitmap2, i17, i18, j17, null, valueOf);
    }
}
