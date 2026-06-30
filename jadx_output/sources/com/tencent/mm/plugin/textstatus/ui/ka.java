package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes3.dex */
public final class ka implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174034d;

    public ka(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174034d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String obj;
        bi4.o0 o0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174034d;
        java.lang.String str3 = null;
        if (!textStatusEditActivity.c7().isEnabled()) {
            textStatusEditActivity.R5(null);
            yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        textStatusEditActivity.c1(textStatusEditActivity.i7().getText().toString());
        p52.c cVar = p52.h.f352016a;
        if (p52.h.f352019d != null) {
            ((b92.y0) ((m40.i0) i95.n0.c(m40.i0.class))).getClass();
            ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).getClass();
            if (zl2.r4.f473950a.w1()) {
                p52.h.f352020e++;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put("type", "5");
                zy2.ac acVar = (zy2.ac) i95.n0.c(zy2.ac.class);
                ml2.z4 z4Var = ml2.z4.f328362m;
                java.lang.String jSONObject2 = jSONObject.toString();
                ((ml2.l0) acVar).getClass();
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb.y6((zy2.zb) c17, z4Var, jSONObject2, null, 4, null);
            } else {
                p52.h.f352020e++;
                ((ml2.r0) ((c50.c1) i95.n0.c(c50.c1.class))).Fk(p52.h.f352019d, ml2.j5.f327632g, kz5.q0.f314001d);
            }
        }
        bi4.h0 h0Var = textStatusEditActivity.f173593n2;
        if (h0Var != null && (o0Var = ((sj4.v0) h0Var).f408899e) != null) {
            str3 = o0Var.g();
        }
        if (kotlin.jvm.internal.o.b(str3, "2")) {
            m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
            jz5.l[] lVarArr = new jz5.l[3];
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = p52.h.B;
            java.lang.Object obj2 = concurrentHashMap.get("share_scene");
            java.lang.String str4 = "";
            if (obj2 == null || (str = obj2.toString()) == null) {
                str = "";
            }
            lVarArr[0] = new jz5.l("share_scene", str);
            java.lang.Object obj3 = concurrentHashMap.get("live_id");
            if (obj3 == null || (str2 = obj3.toString()) == null) {
                str2 = "";
            }
            lVarArr[1] = new jz5.l("liveid", str2);
            java.lang.Object obj4 = concurrentHashMap.get("feed_id");
            if (obj4 != null && (obj = obj4.toString()) != null) {
                str4 = obj;
            }
            lVarArr[2] = new jz5.l("feedid", str4);
            ((b92.y0) i0Var).Bi(false, kz5.c1.i(lVarArr));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$onCreate$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
