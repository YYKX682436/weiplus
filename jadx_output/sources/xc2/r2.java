package xc2;

/* loaded from: classes2.dex */
public final class r2 implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f453283a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f453284b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xc2.o0 f453285c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f453286d;

    public r2(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, xc2.o0 o0Var, int i17) {
        this.f453283a = view;
        this.f453284b = weImageView;
        this.f453285c = o0Var;
        this.f453286d = i17;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        com.tencent.mars.xlog.Log.i("Finder.JumperUtils", "loadLinkIcon success :" + z17);
        xc2.y2 y2Var = xc2.y2.f453343a;
        android.view.View view = this.f453283a;
        int i17 = this.f453286d;
        com.tencent.mm.ui.widget.imageview.WeImageView iconView = this.f453284b;
        kotlin.jvm.internal.o.g(iconView, "iconView");
        xc2.o0 cache = this.f453285c;
        kotlin.jvm.internal.o.g(cache, "cache");
        pm0.v.X(new xc2.p1(iconView, z17, i17, view, cache));
    }
}
