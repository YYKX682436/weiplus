package com.tencent.mm.plugin.setting.ui.setting.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B%\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B\u001d\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/view/GetHdHeadImageGalleryView;", "Lcom/tencent/mm/ui/tools/MMGestureGallery;", "", dm.i4.COL_USERNAME, "Ljz5/f0;", "setUsername", "Landroid/graphics/Bitmap;", "p1", "Landroid/graphics/Bitmap;", "getDefaultAvatarBitmap", "()Landroid/graphics/Bitmap;", "defaultAvatarBitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "x14/b", "x14/f", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class GetHdHeadImageGalleryView extends com.tencent.mm.ui.tools.MMGestureGallery {

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f161648l1;

    /* renamed from: p1, reason: collision with root package name and from kotlin metadata */
    public final android.graphics.Bitmap defaultAvatarBitmap;

    /* renamed from: x0, reason: collision with root package name */
    public final kv.b0 f161650x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.graphics.Bitmap f161651x1;

    /* renamed from: y0, reason: collision with root package name */
    public final x14.b f161652y0;

    /* renamed from: y1, reason: collision with root package name */
    public android.graphics.Bitmap f161653y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f161654z1;

    public GetHdHeadImageGalleryView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
        this.f161650x0 = b0Var;
        android.graphics.Bitmap Ri = ((hn1.s) b0Var).Ri(0.0f);
        this.defaultAvatarBitmap = Ri;
        this.f161651x1 = Ri;
        x14.b bVar = new x14.b(this);
        this.f161652y0 = bVar;
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) bVar);
        setSelection(0);
        setLongClickOverListener(new x14.f(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView r9, boolean r10, yz5.l r11, yz5.a r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView.e(com.tencent.mm.plugin.setting.ui.setting.view.GetHdHeadImageGalleryView, boolean, yz5.l, yz5.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final android.graphics.Bitmap getDefaultAvatarBitmap() {
        return this.defaultAvatarBitmap;
    }

    public final void setUsername(java.lang.String str) {
        this.f161648l1 = str;
        kotlinx.coroutines.l.d(v65.m.a(this), null, null, new x14.p(this, null), 3, null);
    }

    public GetHdHeadImageGalleryView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
        this.f161650x0 = b0Var;
        android.graphics.Bitmap Ri = ((hn1.s) b0Var).Ri(0.0f);
        this.defaultAvatarBitmap = Ri;
        this.f161651x1 = Ri;
        x14.b bVar = new x14.b(this);
        this.f161652y0 = bVar;
        setVerticalFadingEdgeEnabled(false);
        setHorizontalFadingEdgeEnabled(false);
        setAdapter((android.widget.SpinnerAdapter) bVar);
        setSelection(0);
        setLongClickOverListener(new x14.f(this));
    }
}
