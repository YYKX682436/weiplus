package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class k extends in5.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder f204286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.c f204287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204288c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204289d;

    public k(com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder, zy2.c cVar, com.tencent.mm.storage.f9 f9Var, yb5.d dVar) {
        this.f204286a = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder;
        this.f204287b = cVar;
        this.f204288c = f9Var;
        this.f204289d = dVar;
    }

    @Override // in5.v
    public long c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        return this.f204288c.getMsgId() + view.hashCode();
    }

    @Override // in5.v
    public void d(android.view.View view, long j17, long j18, boolean z17, long j19) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.ui.chatting.viewitems.ChatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder = this.f204286a;
        yz5.p onViewExposedListener = chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getOnViewExposedListener();
        if (onViewExposedListener != null) {
            onViewExposedListener.invoke(java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j19));
        }
        if (z17) {
            ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
            zy2.c cVar = this.f204287b;
            java.lang.String string = cVar.f477359b.getString(1);
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f4x);
            com.tencent.mm.ui.chatting.viewitems.x xVar = com.tencent.mm.ui.chatting.viewitems.z.f206107a;
            boolean Zi = ((vd2.d5) i0Var).Zi(string, findViewById, xVar.i(view), chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder.getLiveId());
            com.tencent.mm.storage.f9 f9Var = this.f204288c;
            if (Zi) {
                xVar.m(cVar.f477359b, com.tencent.mm.storage.z3.R4(f9Var.Q0()));
            }
            com.tencent.mm.ui.chatting.viewitems.x.b(xVar, f9Var, this.f204289d, cVar.f477359b, com.tencent.mm.ui.chatting.viewitems.x.a(xVar, chatingItemAppMsgFinderLiveFeed$AppMsgFinderLiveFeedHolder));
        }
    }
}
