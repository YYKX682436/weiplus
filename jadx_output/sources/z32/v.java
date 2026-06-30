package z32;

/* loaded from: classes4.dex */
public final class v implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469947a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f469948b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f469949c;

    public v(z32.a0 a0Var, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f469947a = a0Var;
        this.f469948b = textView;
        this.f469949c = weImageView;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        android.app.Activity context = this.f469947a.getContext();
        boolean z17 = v5Var != null;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.f(new a42.f(this.f469948b, z17 ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), this.f469949c));
    }
}
