package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class m extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder f204537a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.g92 f204538b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204539c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204540d;

    public m(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, r45.g92 g92Var, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f204537a = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;
        this.f204538b = g92Var;
        this.f204539c = f9Var;
        this.f204540d = dVar;
    }

    @Override // in5.v
    public long c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f204539c.getMsgId() + view.hashCode();
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder = this.f204537a;
        yz5.p onViewExposedListener = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getOnViewExposedListener();
        if (onViewExposedListener != null) {
            onViewExposedListener.invoke(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j19));
        }
        if (z17) {
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            r45.g92 g92Var = this.f204538b;
            java.lang.String string = g92Var.getString(1);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f4x);
            com.tencent.mm.ui.chatting.viewitems.x xVar = com.tencent.mm.ui.chatting.viewitems.z.f206107a;
            boolean Zi = ((vd2.d5) i0Var).Zi(string, findViewById, xVar.i(view), chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveId());
            com.tencent.mm.storage.f9 f9Var = this.f204539c;
            if (Zi) {
                xVar.m(g92Var, com.tencent.mm.storage.z3.R4(f9Var.Q0()));
            }
            com.tencent.mm.ui.chatting.viewitems.x.b(xVar, f9Var, this.f204540d, g92Var, com.tencent.mm.ui.chatting.viewitems.x.a(xVar, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder));
        }
    }
}
