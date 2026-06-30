package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class b4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124489a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f124490b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.e4 f124491c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.n3 f124492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f124493e;

    public b4(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, int i17, com.tencent.mm.plugin.finder.profile.widget.e4 e4Var, com.tencent.mm.plugin.finder.profile.widget.n3 n3Var, int i18) {
        this.f124489a = s4Var;
        this.f124490b = i17;
        this.f124491c = e4Var;
        this.f124492d = n3Var;
        this.f124493e = i18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            this.f124489a.f124765s = (r45.c32) ((r45.qu0) fVar.f70618d).getCustom(1);
            int i17 = this.f124493e;
            com.tencent.mm.plugin.finder.profile.widget.n3 n3Var = this.f124492d;
            com.tencent.mm.plugin.finder.profile.widget.e4 e4Var = this.f124491c;
            int i18 = this.f124490b;
            if (i18 == 1) {
                e4Var.z(n3Var, i17);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nko));
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                c50.c1 c1Var = (c50.c1) c17;
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str = e4Var.f124528d;
                android.content.Context context2 = e4Var.f124530f;
                kotlin.jvm.internal.o.g(context2, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9(c1Var, i5Var, str, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i18 == 2) {
                e4Var.z(n3Var, i17);
                android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context3, context3.getString(com.tencent.mm.R.string.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                c50.c1 c1Var2 = (c50.c1) c18;
                ml2.i5 i5Var2 = ml2.i5.f327572g;
                java.lang.String str2 = e4Var.f124528d;
                android.content.Context context4 = e4Var.f124530f;
                kotlin.jvm.internal.o.g(context4, "context");
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
