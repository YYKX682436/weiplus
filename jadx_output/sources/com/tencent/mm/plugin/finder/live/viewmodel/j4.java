package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.k4 f117161a;

    public j4(com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var) {
        this.f117161a = k4Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        com.tencent.mm.plugin.finder.live.viewmodel.k4 k4Var = this.f117161a;
        if (i17 == 0 && fVar.f70616b == 0) {
            android.content.Context context = k4Var.f118381d;
            db5.t7.h(context, context.getString(com.tencent.mm.R.string.djw));
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ACCOUNT_LIVE_VISITOR_HONOR_RANK_SWITCH_ENABLE_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            df2.c9 c9Var = liveRoomControllerStore != null ? (df2.c9) liveRoomControllerStore.controller(df2.c9.class) : null;
            if (c9Var != null) {
                c9Var.f229868n = k4Var.f117189h;
            }
            mm2.f7 f7Var = (mm2.f7) efVar.i(mm2.f7.class);
            if (f7Var != null && (liveMutableData = f7Var.f329060h) != null) {
                liveMutableData.postValue(new mm2.a7(true, null, 2, null));
            }
        }
        k4Var.a();
        return jz5.f0.f302826a;
    }
}
