package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class d7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.k7 f116249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protocal.protobuf.FinderContact f116251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116252d;

    public d7(com.tencent.mm.plugin.finder.live.view.k7 k7Var, android.view.View view, com.tencent.mm.protocal.protobuf.FinderContact finderContact, android.view.View view2) {
        this.f116249a = k7Var;
        this.f116250b = view;
        this.f116251c = finderContact;
        this.f116252d = view2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 nw1Var;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i(this.f116249a.H, "CgiFinderLivePrepare: errCode=" + fVar.f70616b + ", errType=" + fVar.f70615a);
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            i95.m c17 = i95.n0.c(c61.ub.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            android.content.Context context = this.f116250b.getContext();
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
            android.app.Activity activity = (android.app.Activity) context;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_FINDER_LIVE_NOTICE_IS_FROM_LIVE", true);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = this.f116251c;
            gk2.e eVar = dk2.ef.I;
            c61.ub.A3(ubVar, activity, intent, finderContact, 1012, true, java.lang.Boolean.valueOf(((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f328988r) == null) ? 0L : nw1Var.getLong(0)) > 0), null, false, (r45.j01) fVar.f70618d, null, 704, null);
        } else {
            db5.t7.makeText(this.f116252d.getContext(), com.tencent.mm.R.string.msg_net_error, 0).show();
        }
        return jz5.f0.f302826a;
    }
}
