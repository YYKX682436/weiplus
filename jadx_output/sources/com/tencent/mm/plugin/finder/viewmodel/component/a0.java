package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class a0 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.n0 f133694d;

    public a0(com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var) {
        this.f133694d = n0Var;
    }

    @Override // in5.x
    public void s2(androidx.recyclerview.widget.f2 adapter, android.view.View view, int i17, androidx.recyclerview.widget.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(holder, "holder");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_entrance_type", 26);
        com.tencent.mm.plugin.finder.viewmodel.component.iy iyVar = com.tencent.mm.plugin.finder.viewmodel.component.ny.L1;
        com.tencent.mm.plugin.finder.viewmodel.component.n0 n0Var = this.f133694d;
        iyVar.c(n0Var.getContext(), intent);
        java.lang.Object obj = holder.f293125i;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.viewmodel.component.FinderAccountRecommendListItem");
        com.tencent.mm.plugin.finder.viewmodel.component.t tVar = (com.tencent.mm.plugin.finder.viewmodel.component.t) obj;
        intent.putExtra("finder_username", tVar.f135948d.getUsername());
        intent.putExtra("KEY_FROM_TIMELINE", false);
        com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        android.content.Context context = holder.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        i0Var.mk(context, intent);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = tVar.f135948d;
        jSONObject.put("finder_nickname", finderContact.getNickname());
        jSONObject.put("click_item", 1);
        jSONObject.put("recommend_source_finder_username", n0Var.P6());
        jSONObject.put("finderusername", finderContact.getUsername());
        jSONObject.put("finder_index", i17 + 1);
        jSONObject.put("click_item", 1);
        com.tencent.mm.plugin.finder.report.b6 b6Var = com.tencent.mm.plugin.finder.report.b6.f124969a;
        com.tencent.mm.plugin.finder.viewmodel.component.ny e17 = iyVar.e(context);
        com.tencent.mm.plugin.finder.report.b6.d(b6Var, e17 != null ? e17.V6() : null, "channel_profile_otherfrdfollow_authorcard", 1, jSONObject, false, null, 48, null);
    }
}
