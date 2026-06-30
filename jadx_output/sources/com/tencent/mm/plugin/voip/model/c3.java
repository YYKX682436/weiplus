package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class c3 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.voip.model.d3 f176369a;

    public c3(com.tencent.mm.plugin.voip.model.d3 d3Var) {
        this.f176369a = d3Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.voip.model.b3(this), "VoipServiceEx-mBatInfoReceiver");
    }
}
