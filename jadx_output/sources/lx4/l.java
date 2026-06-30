package lx4;

/* loaded from: classes8.dex */
public final class l implements hx4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx4.x f322144a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx4.m f322145b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f322146c;

    public l(hx4.x xVar, lx4.m mVar, int i17) {
        this.f322144a = xVar;
        this.f322145b = mVar;
        this.f322146c = i17;
    }

    @Override // hx4.v
    public void a(android.graphics.drawable.Drawable drawable) {
        this.f322144a.f285702c = drawable;
        this.f322145b.notifyItemChanged(this.f322146c);
    }
}
