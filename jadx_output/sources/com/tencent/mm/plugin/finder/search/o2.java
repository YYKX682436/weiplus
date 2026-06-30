package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class o2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.q2 f125799d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.e21 f125800e;

    public o2(com.tencent.mm.plugin.finder.search.q2 q2Var, r45.e21 e21Var) {
        this.f125799d = q2Var;
        this.f125800e = e21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.search.q2 q2Var = this.f125799d;
        q2Var.getClass();
        r45.e21 e21Var = this.f125800e;
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(15);
            android.content.Context context = q2Var.f125823a;
            if (finderJumpInfo != null) {
                int jumpinfo_type = finderJumpInfo.getJumpinfo_type();
                if (jumpinfo_type == 1) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                    if (finderContact == null || (str2 = finderContact.getUsername()) == null) {
                        str2 = "";
                    }
                    sb6.append(str2);
                    sb6.append(':');
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.s0());
                    java.lang.String sb7 = sb6.toString();
                    xc2.p0 p0Var = new xc2.p0(finderJumpInfo);
                    p0Var.f453250l = sb7;
                    xc2.y2.P(xc2.y2.f453343a, q2Var.f125823a, p0Var, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, false, null, 0.0f, 56, null);
                } else if (jumpinfo_type == 2) {
                    xc2.y2.f453343a.I(context, new xc2.p0(finderJumpInfo), null);
                }
            } else {
                finderJumpInfo = null;
            }
            if (finderJumpInfo == null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                if (finderContact2 == null || (str = finderContact2.getUsername()) == null) {
                    str = "";
                }
                sb8.append(str);
                sb8.append(':');
                sb8.append(com.tencent.mm.sdk.platformtools.t8.s0());
                java.lang.String sb9 = sb8.toString();
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                android.content.Context context2 = q2Var.f125823a;
                java.lang.String string = e21Var.getString(9);
                java.lang.String str3 = string == null ? "" : string;
                java.lang.String string2 = e21Var.getString(10);
                i0Var.ll(context2, str3, string2 == null ? "" : string2, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, sb9);
                java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
                kotlin.jvm.internal.o.g(context, "context");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                java.lang.String str4 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p;
                java.lang.String valueOf = java.lang.String.valueOf(c01.id.a());
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("TopicId", "");
                    jSONObject.put("TopicName", "");
                } catch (java.lang.Throwable unused) {
                }
                com.tencent.mars.xlog.Log.i("Finder.HotSearchInfoDialog", "report21875 sessionId:" + Ri + " contextId:" + str4 + " commentScene:59 action:1 eid:link_miniprogram udf_kv:" + jSONObject);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(21875, Ri, str4, 59, 1, valueOf, "link_miniprogram", jSONObject.toString());
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/search/FinderHotSearchInfoDialog$initDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
