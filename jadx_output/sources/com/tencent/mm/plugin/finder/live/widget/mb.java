package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class mb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f119059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.v1 f119060e;

    public mb(com.tencent.mm.plugin.finder.live.widget.nb nbVar, com.tencent.mm.plugin.finder.live.widget.v1 v1Var) {
        this.f119059d = nbVar;
        this.f119060e = v1Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlinx.coroutines.flow.f3 f3Var;
        if (menuItem.getItemId() == 1) {
            com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f119059d;
            mm2.n0 n0Var = nbVar.H;
            java.lang.String str = null;
            r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
            long j17 = f50Var != null ? f50Var.f374013d : 0L;
            java.lang.String str2 = this.f119060e.f120020a;
            if (f50Var != null && (finderContact = f50Var.f374017h) != null) {
                str = finderContact.getUsername();
            }
            java.lang.String str3 = str;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "doRemoveInvitee: invitationId=" + j17 + ", target=" + str2 + ", initiator=" + str3);
            if (j17 != 0) {
                if (!(str2.length() == 0)) {
                    az2.f a17 = az2.c.a(az2.f.f16125d, nbVar.f118183e, null, 0L, null, 8, null);
                    a17.a();
                    re2.e1.f394405a.a(j17, 3, str2, str3, new com.tencent.mm.plugin.finder.live.widget.bb(nbVar, a17, str2), new com.tencent.mm.plugin.finder.live.widget.db(nbVar, a17));
                    return;
                }
            }
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInvitorPreparePanel", "doRemoveInvitee: invalid params, skip");
        }
    }
}
