package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes2.dex */
public final class ei implements zy2.gc {
    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.lh2 req = (r45.lh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveFollowGuidePlugin", "[doBlockOpLog] retcode = " + ret.getInteger(1));
    }
}
