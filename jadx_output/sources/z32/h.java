package z32;

/* loaded from: classes12.dex */
public final class h implements com.tencent.mm.plugin.appbrand.service.e6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z32.s f469910a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z32.b f469911b;

    public h(z32.s sVar, z32.b bVar) {
        this.f469910a = sVar;
        this.f469911b = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.service.e6
    public final void a(k91.v5 v5Var) {
        android.app.Activity context = this.f469910a.getContext();
        z32.b bVar = this.f469911b;
        android.widget.TextView textView = bVar.f469879d;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = bVar.f469878c;
        boolean z17 = v5Var != null;
        kotlin.jvm.internal.o.g(context, "context");
        ym5.a1.f(new a42.f(textView, z17 ? i65.a.d(context, com.tencent.mm.R.color.Link_100) : i65.a.d(context, com.tencent.mm.R.color.FG_2), weImageView));
    }
}
