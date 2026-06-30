package z32;

/* loaded from: classes12.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f469956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f469957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f469958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z32.a0 f469959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.ed6 f469960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r32.d f469961i;

    public z(boolean z17, int i17, org.json.JSONObject jSONObject, z32.a0 a0Var, r45.ed6 ed6Var, r32.d dVar) {
        this.f469956d = z17;
        this.f469957e = i17;
        this.f469958f = jSONObject;
        this.f469959g = a0Var;
        this.f469960h = ed6Var;
        this.f469961i = dVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f469956d && this.f469957e == 1) {
            java.lang.String optString = this.f469958f.optString("finder_username");
            android.app.Activity context = this.f469959g.getContext();
            kotlin.jvm.internal.o.d(optString);
            kotlin.jvm.internal.o.g(context, "context");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", optString);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1.f460472a.w(context, intent);
            a42.c cVar = a42.c.f1200a;
            java.lang.String appName = this.f469960h.f373328e;
            kotlin.jvm.internal.o.f(appName, "appName");
            java.lang.String field_username = this.f469961i.field_username;
            kotlin.jvm.internal.o.f(field_username, "field_username");
            cVar.a(1, 2, appName, 1, 1, field_username);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/exdevice/uic/SportRankUIC$handleRankRecordView$1$2$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
