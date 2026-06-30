package z32;

/* loaded from: classes4.dex */
public final class u implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f469945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.imageview.WeImageView f469946c;

    public u(z32.a0 a0Var, android.widget.TextView textView, com.tencent.mm.ui.widget.imageview.WeImageView weImageView) {
        this.f469944a = a0Var;
        this.f469945b = textView;
        this.f469946c = weImageView;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new z32.t(this.f469945b, v5Var, this.f469946c, this.f469944a));
        }
        android.app.Activity context = this.f469944a.getContext();
        android.widget.TextView textView = this.f469945b;
        boolean z17 = v5Var != null;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.f(new a42.f(textView, z17 ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), null));
    }
}
