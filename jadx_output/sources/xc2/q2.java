package xc2;

/* loaded from: classes2.dex */
public final class q2 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f453273a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f453274b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.o0 f453275c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f453276d;

    public q2(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, xc2.o0 o0Var, int i17) {
        this.f453273a = view;
        this.f453274b = weImageView;
        this.f453275c = o0Var;
        this.f453276d = i17;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.view.View view = this.f453273a;
        boolean z17 = bitmap != null;
        int i17 = this.f453276d;
        com.tencent.mm.ui.widget.imageview.WeImageView iconView = this.f453274b;
        kotlin.jvm.internal.o.g(iconView, "iconView");
        xc2.o0 cache = this.f453275c;
        kotlin.jvm.internal.o.g(cache, "cache");
        pm0.v.X(new xc2.p1(iconView, z17, i17, view, cache));
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "loadLinkIcon resource :" + bitmap);
    }
}
