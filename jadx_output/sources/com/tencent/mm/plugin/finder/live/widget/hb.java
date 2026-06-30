package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hb implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nb f118560d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f118561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f118562f;

    public hb(com.tencent.mm.plugin.finder.live.widget.nb nbVar, mm2.n0 n0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f118560d = nbVar;
        this.f118561e = n0Var;
        this.f118562f = c0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList linkedList;
        r45.f50 f50Var = (r45.f50) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeSlice: invitationId=");
        sb6.append(f50Var != null ? new java.lang.Long(f50Var.f374013d) : null);
        sb6.append(", inviteeCount=");
        sb6.append((f50Var == null || (linkedList = f50Var.f374016g) == null) ? null : new java.lang.Integer(linkedList.size()));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.nb nbVar = this.f118560d;
        nbVar.e0();
        boolean O6 = this.f118561e.O6();
        kotlin.jvm.internal.c0 c0Var = this.f118562f;
        if (c0Var.f310112d && !O6) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInvitorPreparePanel", "observeSlice: invitation invalidated, close panel");
            com.tencent.mm.plugin.finder.live.widget.e0.t(nbVar, false, 1, null);
        }
        c0Var.f310112d = O6;
        return jz5.f0.f302826a;
    }
}
