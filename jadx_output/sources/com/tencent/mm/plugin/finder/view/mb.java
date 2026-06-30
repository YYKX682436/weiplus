package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class mb implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f132655a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f132656b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132657c;

    public mb(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, int i17, java.lang.String str) {
        this.f132655a = weImageView;
        this.f132656b = i17;
        this.f132657c = str;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.lb((android.graphics.Bitmap) obj, this.f132655a, this.f132656b, this.f132657c));
    }
}
