package z32;

/* loaded from: classes12.dex */
public final class g implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.s f469908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z32.b f469909b;

    public g(z32.s sVar, z32.b bVar) {
        this.f469908a = sVar;
        this.f469909b = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        if (v5Var != null) {
            ((ku5.t0) ku5.t0.f312615d).B(new z32.f(this.f469909b, v5Var, this.f469908a));
        }
        android.app.Activity context = this.f469908a.getContext();
        android.widget.TextView textView = this.f469909b.f469879d;
        boolean z17 = v5Var != null;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.f(new a42.f(textView, z17 ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), null));
    }
}
