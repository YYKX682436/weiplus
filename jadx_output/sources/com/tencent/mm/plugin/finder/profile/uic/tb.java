package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class tb extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.yb f124231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb(com.tencent.mm.plugin.finder.profile.uic.yb ybVar) {
        super(1);
        this.f124231d = ybVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.feed.model.t6 response = (com.tencent.mm.plugin.finder.feed.model.t6) obj;
        kotlin.jvm.internal.o.g(response, "response");
        if (!response.getHasMore()) {
            com.tencent.mm.plugin.finder.profile.uic.yb ybVar = this.f124231d;
            com.tencent.mars.xlog.Log.i(ybVar.f124388i, "[fetchEndCallback] totalSize=" + ybVar.O6().getSize());
            ybVar.getRlLayout().E(true);
        }
        return jz5.f0.f302826a;
    }
}
