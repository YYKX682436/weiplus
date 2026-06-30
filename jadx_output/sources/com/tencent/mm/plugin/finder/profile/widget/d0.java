package com.tencent.mm.plugin.finder.profile.widget;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f124504a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f124505b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f124506c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f124507d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f124508e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f124509f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f124510g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f124511h;

    public d0(android.view.View header, androidx.appcompat.app.AppCompatActivity activity, r45.qt2 contextObj) {
        kotlin.jvm.internal.o.g(header, "header");
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(contextObj, "contextObj");
        this.f124504a = activity;
        this.f124505b = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.c0(header));
        this.f124507d = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.v(this));
        this.f124508e = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.w(this));
        this.f124509f = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.y(this));
        jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.x(this));
        this.f124511h = jz5.h.b(new com.tencent.mm.plugin.finder.profile.widget.b0(this));
    }

    public static final void a(com.tencent.mm.plugin.finder.profile.widget.d0 d0Var, int i17, java.lang.String finderUsername, java.lang.String contactId) {
        d0Var.getClass();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127989vd).getValue()).r()).booleanValue();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = d0Var.f124504a;
        long longExtra = appCompatActivity.getIntent().getLongExtra("finder_from_feed_id", 0L);
        int i18 = i17 == 1 ? 1 : 0;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(contactId, "contactId");
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(appCompatActivity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String string = V6.getString(1);
        if (string == null) {
            string = "";
        }
        int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(string).f302841d).intValue();
        int integer = V6.getInteger(8);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", finderUsername);
        jSONObject.put("kfcontactid", contactId);
        jSONObject.put("add_wecom_fri_location", booleanValue ? 1 : 0);
        jSONObject.put("enter_scene", intValue);
        jSONObject.put("enter_type", integer);
        jSONObject.put("ref_commentscene", V6.getInteger(7));
        if (longExtra != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(longExtra));
        }
        i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        com.tencent.mm.plugin.finder.report.o3.ij((com.tencent.mm.plugin.finder.report.o3) c17, i18, "finder_add_wecom_fri", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    public final android.widget.FrameLayout b() {
        return (android.widget.FrameLayout) ((jz5.n) this.f124507d).getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r9, ya2.b2 r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.profile.widget.d0.c(java.lang.String, ya2.b2):void");
    }
}
