package sc2;

/* loaded from: classes2.dex */
public final class v4 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406306a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406307b;

    public v4(java.lang.String str, android.view.View view) {
        this.f406306a = str;
        this.f406307b = view;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            i95.m c17 = i95.n0.c(c50.c1.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c50.c1 c1Var = (c50.c1) c17;
            ml2.i5 i5Var = ml2.i5.f327570e;
            java.lang.String str = this.f406306a;
            android.content.Context context = this.f406307b.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("notice_type", 2);
            c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
        }
    }
}
