package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class r3 extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.b4 f119571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderObject f119572b;

    public r3(com.tencent.mm.plugin.finder.live.widget.b4 b4Var, com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        this.f119571a = b4Var;
        this.f119572b = finderObject;
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f119572b;
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.f119571a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("FinderLiveAfterNextLiveInfoWidget", "on report new live valid expose");
            b4Var.b(finderObject, ml2.x1.f328217x, null);
            return;
        }
        com.tencent.mars.xlog.Log.i("FinderLiveAfterNextLiveInfoWidget", "on report new live expose time =" + j19);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("exp_time", j19);
        b4Var.b(finderObject, ml2.x1.f328218y, jSONObject);
    }
}
