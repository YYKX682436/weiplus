package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class na implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ra f119171d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.n0 f119172e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f119173f;

    public na(com.tencent.mm.plugin.finder.live.widget.ra raVar, mm2.n0 n0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f119171d = raVar;
        this.f119172e = n0Var;
        this.f119173f = c0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.util.LinkedList linkedList;
        r45.f50 f50Var = (r45.f50) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("observeSlice: invitationId=");
        sb6.append(f50Var != null ? new java.lang.Long(f50Var.f374013d) : null);
        sb6.append(", status=");
        sb6.append(f50Var != null ? new java.lang.Integer(f50Var.f374014e) : null);
        sb6.append(", inviteeCount=");
        sb6.append((f50Var == null || (linkedList = f50Var.f374016g) == null) ? null : new java.lang.Integer(linkedList.size()));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", sb6.toString());
        com.tencent.mm.plugin.finder.live.widget.ra raVar = this.f119171d;
        raVar.e0();
        boolean O6 = this.f119172e.O6();
        int i17 = f50Var != null ? f50Var.f374014e : -1;
        kotlin.jvm.internal.c0 c0Var = this.f119173f;
        if (c0Var.f310112d && !O6 && i17 != 3) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveCoLiveInviteePreparePanel", "observeSlice: invitation invalidated (non-Used), close panel");
            com.tencent.mm.plugin.finder.live.widget.e0.t(raVar, false, 1, null);
        }
        c0Var.f310112d = O6;
        return jz5.f0.f302826a;
    }
}
