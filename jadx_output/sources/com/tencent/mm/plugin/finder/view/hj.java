package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class hj implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderRedDotTextView f132245a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f132246b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f132247c;

    public hj(com.tencent.mm.plugin.finder.view.FinderRedDotTextView finderRedDotTextView, java.lang.String str, int i17) {
        this.f132245a = finderRedDotTextView;
        this.f132246b = str;
        this.f132247c = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new com.tencent.mm.plugin.finder.view.gj((android.graphics.Bitmap) obj, this.f132245a, this.f132246b, this.f132247c));
    }
}
