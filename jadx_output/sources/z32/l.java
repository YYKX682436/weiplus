package z32;

/* loaded from: classes12.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f469918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f469919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f469920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.s f469921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f469923i;

    public l(boolean z17, int i17, org.json.JSONObject jSONObject, z32.s sVar, r45.ed6 ed6Var, java.lang.String str) {
        this.f469918d = z17;
        this.f469919e = i17;
        this.f469920f = jSONObject;
        this.f469921g = sVar;
        this.f469922h = ed6Var;
        this.f469923i = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f469918d && this.f469919e == 1) {
            java.lang.String optString = this.f469920f.optString("finder_username");
            android.app.Activity context = this.f469921g.getContext();
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(context, intent);
            a42.c cVar = a42.c.f1200a;
            java.lang.String appName = this.f469922h.f373328e;
            kotlin.jvm.internal.o.f(appName, "appName");
            cVar.a(2, 2, appName, 1, 1, this.f469923i);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportProfileUIC$updateItemView$17", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
