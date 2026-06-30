package sc2;

/* loaded from: classes2.dex */
public final class z4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f406416a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sc2.b5 f406417b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f406418c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f406420e;

    public z4(int i17, sc2.b5 b5Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, android.view.View view, java.lang.String str) {
        this.f406416a = i17;
        this.f406417b = b5Var;
        this.f406418c = baseFinderFeed;
        this.f406419d = view;
        this.f406420e = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            android.view.View view = this.f406419d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f406418c;
            sc2.b5 b5Var = this.f406417b;
            int i17 = this.f406416a;
            if (i17 == 1) {
                sc2.b5.G(b5Var, baseFinderFeed, true);
                b5Var.I(view, b5Var.H(baseFinderFeed));
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nkp));
                b5Var.f405783x = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), null, null, new sc2.y4(b5Var, null), 3, null);
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str = this.f406420e;
                android.content.Context context2 = view.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                sc2.b5.G(b5Var, baseFinderFeed, false);
                b5Var.I(view, b5Var.H(baseFinderFeed));
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context3, context3.getString(com.tencent.mm.R.string.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c50.c1 c1Var2 = (c50.c1) c18;
                ml2.i5 i5Var2 = ml2.i5.f327572g;
                java.lang.String str2 = this.f406420e;
                android.content.Context context4 = view.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                pf5.z zVar2 = pf5.z.f353948a;
                if (!(context4 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf2 = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context4).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9(c1Var2, i5Var2, str2, 0L, 0, valueOf2, null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
