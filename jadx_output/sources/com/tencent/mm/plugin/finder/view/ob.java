package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ob implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f132779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f132780c;

    public ob(java.lang.String str, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17) {
        this.f132778a = str;
        this.f132779b = weImageView;
        this.f132780c = i17;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.HomeTabRedDotTipsBubbleView", "setImageDownloadListener iconUrl:" + this.f132778a + " success：" + z17);
        pm0.v.X(new com.tencent.mm.plugin.finder.view.nb(z17, this.f132779b, this.f132780c));
    }
}
