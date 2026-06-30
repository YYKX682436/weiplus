package rx4;

/* loaded from: classes8.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rx4.u0 f401267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx4.x0 f401268e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f401269f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f401270g;

    public s0(rx4.u0 u0Var, rx4.x0 x0Var, int i17, android.view.ViewGroup viewGroup, java.lang.String str) {
        this.f401267d = u0Var;
        this.f401268e = x0Var;
        this.f401269f = viewGroup;
        this.f401270g = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$updateRecommendBox$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rx4.u0 u0Var = this.f401267d;
        u0Var.hideVKB();
        u0Var.getClass();
        rx4.x0 item = this.f401268e;
        kotlin.jvm.internal.o.g(item, "item");
        vu4.a aVar = vu4.a.f440243m;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(u0Var.f401282f);
        sb6.append("|39|");
        rx4.w0 w0Var = u0Var.f401284h;
        if (w0Var == null || (str = w0Var.f401317d) == null) {
            str = "";
        }
        sb6.append(fp.s0.b(str, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding));
        java.lang.String itemInfo = sb6.toString();
        java.lang.String docInfo = item.a();
        boolean z17 = u0Var.f401283g;
        kotlin.jvm.internal.o.g(itemInfo, "itemInfo");
        kotlin.jvm.internal.o.g(docInfo, "docInfo");
        android.app.Activity context = u0Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rx4.h2 h2Var = (rx4.h2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(rx4.h2.class);
        h2Var.a7();
        java.util.Map l17 = kz5.c1.l(new jz5.l("clickId", h2Var.f401183y));
        l17.put("items", h2Var.f401176r);
        h2Var.q7(aVar, itemInfo, docInfo, z17, l17);
        su4.z0 z0Var = (su4.z0) i95.n0.c(su4.z0.class);
        int i17 = u0Var.f401281e;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{\"teachData\":{\"type\":");
        rx4.w0 w0Var2 = u0Var.f401284h;
        sb7.append(w0Var2 != null ? java.lang.Integer.valueOf(w0Var2.f401316c) : null);
        sb7.append(",\"item\":");
        sb7.append(item.f401324a);
        sb7.append("}}");
        ((sg0.a2) z0Var).bj(i17, 14, new org.json.JSONObject(sb7.toString()));
        android.content.Context context2 = this.f401269f.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f353948a;
        if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((rx4.h2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(rx4.h2.class)).t7(64, this.f401270g, item.f401328e, kz5.c1.k(new jz5.l(ya.b.SOURCE, java.lang.Integer.valueOf(item.f401329f)), new jz5.l("flutterSearchDirectlyAddToKvHistory", java.lang.Boolean.FALSE)));
        yj0.a.h(this, "com/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSNativeTeachRecommendBoxUIC$updateRecommendBox$1$1$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
