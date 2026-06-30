package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent f133092d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener f133093e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.autogen.events.FinderExposeInfoChangeEvent finderExposeInfoChangeEvent, com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener finderExposeChangedEventListener) {
        super(0);
        this.f133092d = finderExposeInfoChangeEvent;
        this.f133093e = finderExposeChangedEventListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList list;
        am.cb cbVar = this.f133092d.f54272g;
        long j17 = cbVar.f6343a;
        r45.yl2 yl2Var = cbVar.f6344b;
        int i17 = cbVar.f6345c;
        com.tencent.mm.plugin.finder.view.FinderExposeChangedEventListener finderExposeChangedEventListener = this.f133093e;
        java.lang.String f122661d = finderExposeChangedEventListener.getF122661d();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderExposeChangedEventListener] feedId=");
        sb6.append(j17);
        sb6.append(" commentList=");
        sb6.append((yl2Var == null || (list = yl2Var.getList(0)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        sb6.append(" totalCommentCount=");
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i(f122661d, sb6.toString());
        com.tencent.mm.plugin.finder.storage.FinderItem c17 = finderExposeChangedEventListener.c(j17);
        if (c17 != null) {
            com.tencent.mars.xlog.Log.i(finderExposeChangedEventListener.getF122661d(), "[FinderExposeChangedEventListener] feedObject: " + c17.getFeedObject().hashCode() + ", " + c17.getId());
            if (yl2Var != null) {
                java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo> list2 = yl2Var.getList(0);
                kotlin.jvm.internal.o.f(list2, "getCommentList(...)");
                c17.setCommentList(list2);
            }
            if (i17 >= 0) {
                c17.setCommentCount(i17);
            }
            finderExposeChangedEventListener.e(j17, yl2Var);
        }
        return jz5.f0.f302826a;
    }
}
