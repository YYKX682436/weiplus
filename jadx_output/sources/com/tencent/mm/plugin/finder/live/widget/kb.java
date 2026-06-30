package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class kb implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118831d;

    public kb(com.tencent.mm.plugin.finder.live.widget.nb nbVar) {
        this.f118831d = nbVar;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlinx.coroutines.flow.f3 f3Var;
        if (menuItem.getItemId() == 2) {
            com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f118831d;
            mm2.n0 n0Var = nbVar.H;
            java.lang.String str = null;
            r45.f50 f50Var = (n0Var == null || (f3Var = n0Var.f329265g) == null) ? null : (r45.f50) ((kotlinx.coroutines.flow.l2) f3Var).getValue();
            long j17 = f50Var != null ? f50Var.f374013d : 0L;
            if (f50Var != null && (finderContact = f50Var.f374017h) != null) {
                str = finderContact.getUsername();
            }
            java.lang.String str2 = str;
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "doEndCoLive: invitationId=" + j17 + ", initiator=" + str2);
            if (j17 == 0) {
                com.tencent.mars.xlog.Log.e("Finder.FinderLiveCoLiveInvitorPreparePanel", "doEndCoLive: invalid invitationId, skip");
                return;
            }
            az2.f a17 = az2.c.a(az2.f.f16125d, nbVar.f118183e, null, 0L, null, 8, null);
            a17.a();
            kotlinx.coroutines.y0 y0Var = nbVar.E;
            re2.e1.f394405a.a(j17, 4, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : str2, (r18 & 16) != 0 ? null : new com.tencent.mm.plugin.finder.live.widget.wa(y0Var, a17, j17, nbVar), (r18 & 32) != 0 ? null : new com.tencent.mm.plugin.finder.live.widget.ya(y0Var, a17, nbVar));
        }
    }
}
