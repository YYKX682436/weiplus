package lx4;

/* loaded from: classes8.dex */
public final class c implements hx4.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hx4.x f322118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lx4.e f322119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f322120c;

    public c(hx4.x xVar, lx4.e eVar, int i17) {
        this.f322118a = xVar;
        this.f322119b = eVar;
        this.f322120c = i17;
    }

    @Override // hx4.v
    public void a(android.graphics.drawable.Drawable drawable) {
        this.f322118a.f285702c = drawable;
        this.f322119b.notifyItemChanged(this.f322120c);
    }
}
