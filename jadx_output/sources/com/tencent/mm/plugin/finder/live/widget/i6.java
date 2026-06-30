package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class i6 implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.m6 f118642a;

    public i6(com.tencent.mm.plugin.finder.live.widget.m6 m6Var) {
        this.f118642a = m6Var;
    }

    @Override // al5.c2
    public final void onStatusChange(boolean z17) {
        int i17;
        com.tencent.mm.plugin.finder.live.widget.m6 m6Var = this.f118642a;
        boolean z18 = !m6Var.f119046n.getBoolean(1);
        if (m6Var.f119043h == 1) {
            i17 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("element", 11);
            jSONObject.put("sub_element", 2);
            jSONObject.put("sub_type", i17);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5((zy2.zb) c17, 37L, jSONObject.toString(), null, 4, null);
        } else {
            i17 = z18 ? 2 : 3;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("element", 15);
            jSONObject2.put("sub_element", 2);
            jSONObject2.put("sub_type", i17);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.D1, jSONObject2.toString(), null, 4, null);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorLiveReplaySettingWidget", "intelligently_gen_replay_highlight changed to: " + z18);
        m6Var.f119046n.set(1, java.lang.Boolean.valueOf(z18));
    }
}
