package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class gj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f132165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRedDotTextView f132166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f132168g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj(android.graphics.Bitmap bitmap, com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView, java.lang.String str, int i17) {
        super(0);
        this.f132165d = bitmap;
        this.f132166e = finderRedDotTextView;
        this.f132167f = str;
        this.f132168g = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f132167f;
        com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView = this.f132166e;
        android.graphics.Bitmap bitmap = this.f132165d;
        if (bitmap == null) {
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderRedDotTextView.f131450m;
            if (weImageView == null) {
                kotlin.jvm.internal.o.o("highLightIcon");
                throw null;
            }
            weImageView.setVisibility(4);
        } else {
            int i17 = com.tencent.mm.plugin.finder.view.FinderRedDotTextView.f131443w;
            boolean j17 = finderRedDotTextView.j(str);
            int i18 = this.f132168g;
            if (j17) {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = finderRedDotTextView.f131450m;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("highLightIcon");
                    throw null;
                }
                weImageView2.setIconColor(i18);
            } else {
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = finderRedDotTextView.f131450m;
                if (weImageView3 == null) {
                    kotlin.jvm.internal.o.o("highLightIcon");
                    throw null;
                }
                weImageView3.setImageBitmap(bitmap);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = finderRedDotTextView.f131450m;
                if (weImageView4 == null) {
                    kotlin.jvm.internal.o.o("highLightIcon");
                    throw null;
                }
                weImageView4.setIconColor(i18);
            }
            finderRedDotTextView.f131456s = str == null ? "" : str;
        }
        com.tencent.mars.xlog.Log.i("Finder.RedDotTextView", "getImage resource :" + bitmap + " iconUrl:" + str);
        return jz5.f0.f302826a;
    }
}
