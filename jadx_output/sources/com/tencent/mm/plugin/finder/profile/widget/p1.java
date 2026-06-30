package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes3.dex */
public final class p1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s1 f124664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f124665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f124666c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f124667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f124668e;

    public p1(com.tencent.mm.plugin.finder.profile.widget.s1 s1Var, java.lang.String str, int i17, boolean z17, boolean z18) {
        this.f124664a = s1Var;
        this.f124665b = str;
        this.f124666c = i17;
        this.f124667d = z17;
        this.f124668e = z18;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = this.f124664a;
            kk.l lVar = s1Var.f124721e;
            java.lang.String str = this.f124665b;
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(str);
            if (l2Var != null) {
                l2Var.B = (r45.c32) ((r45.qu0) fVar.f70618d).getCustom(1);
            }
            androidx.appcompat.app.AppCompatActivity activity = s1Var.f124718b;
            boolean z17 = this.f124668e;
            boolean z18 = this.f124667d;
            int i17 = this.f124666c;
            if (i17 == 1) {
                s1Var.n(str, z18, z17);
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.m(context, context.getString(com.tencent.mm.R.string.nkp));
                i95.m c17 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ml2.i5 i5Var = ml2.i5.f327571f;
                java.lang.String str2 = this.f124665b;
                kotlin.jvm.internal.o.g(activity, "activity");
                java.lang.String valueOf = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("notice_type", 2);
                c50.c1.l9((c50.c1) c17, i5Var, str2, 0L, 0, valueOf, null, null, null, null, null, null, null, jSONObject.toString(), 0L, 0, null, 61408, null);
            } else if (i17 == 2) {
                s1Var.n(str, z18, z17);
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                db5.t7.h(context2, context2.getString(com.tencent.mm.R.string.cn8));
                i95.m c18 = i95.n0.c(c50.c1.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ml2.i5 i5Var2 = ml2.i5.f327572g;
                java.lang.String str3 = this.f124665b;
                kotlin.jvm.internal.o.g(activity, "activity");
                java.lang.String valueOf2 = java.lang.String.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n);
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("notice_type", 2);
                c50.c1.l9((c50.c1) c18, i5Var2, str3, 0L, 0, valueOf2, null, null, null, null, null, null, null, jSONObject2.toString(), 0L, 0, null, 61408, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
