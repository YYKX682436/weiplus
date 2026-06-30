package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class vl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderTagView f133255d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f133256e;

    public vl(com.tencent.mm.plugin.finder.view.FinderTagView finderTagView, kotlin.jvm.internal.f0 f0Var) {
        this.f133255d = finderTagView;
        this.f133256e = f0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133255d;
        java.lang.Object obj = finderTagView.getTagData().getList(0).get(this.f133256e.f310116d);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        r45.r03 r03Var = (r45.r03) obj;
        finderTagView.tagClickMap.put(java.lang.Long.valueOf(r03Var.getLong(1)), 1);
        com.tencent.mm.autogen.events.FinderTagClickEvent finderTagClickEvent = new com.tencent.mm.autogen.events.FinderTagClickEvent();
        finderTagClickEvent.f54330g.f7026a = r03Var;
        finderTagClickEvent.e();
    }
}
