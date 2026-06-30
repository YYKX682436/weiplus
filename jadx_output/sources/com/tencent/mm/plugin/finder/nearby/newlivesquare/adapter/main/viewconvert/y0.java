package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class y0 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.n f122038a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f122039b;

    public y0(vp2.n nVar, in5.s0 s0Var) {
        this.f122038a = nVar;
        this.f122039b = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        long j17;
        jz5.l[] lVarArr = new jz5.l[5];
        r45.nw1 liveInfo = this.f122038a.getFeedObject().getLiveInfo();
        if (liveInfo != null && liveInfo.getInteger(2) == 1) {
            ml2.v1 v1Var = ml2.v1.f328140e;
            j17 = 1;
        } else {
            ml2.v1 v1Var2 = ml2.v1.f328140e;
            j17 = 2;
        }
        lVarArr[0] = new jz5.l("live_enter_status", java.lang.Long.valueOf(j17));
        android.content.Context context = this.f122039b.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        lVarArr[1] = new jz5.l("behaviour_session_id", nyVar != null ? nyVar.f135385q : null);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[2] = new jz5.l("finder_context_id", b52.b.b());
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        lVarArr[3] = new jz5.l("finder_tab_context_id", b52.b.c());
        lVarArr[4] = new jz5.l("share_username", "");
        return kz5.c1.k(lVarArr);
    }
}
