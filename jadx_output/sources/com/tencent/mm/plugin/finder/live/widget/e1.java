package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class e1 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.h1 f118203d;

    public e1(com.tencent.mm.plugin.finder.live.widget.h1 h1Var) {
        this.f118203d = h1Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.lh2 req = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i(this.f118203d.f118491h, "[doBlockOpLog] retcode = " + ret.getInteger(1));
    }
}
