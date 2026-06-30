package ht2;

/* loaded from: classes2.dex */
public final class h implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f284833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f284834b;

    public h(com.tencent.mm.ui.widget.imageview.WeImageView weImageView, ht2.y0 y0Var) {
        this.f284833a = weImageView;
        this.f284834b = y0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        pm0.v.X(new ht2.g((android.graphics.Bitmap) obj, this.f284833a, this.f284834b));
    }
}
