package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes.dex */
public final class q1 implements zy2.gc {
    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        kotlin.jvm.internal.o.g(req, "req");
        kotlin.jvm.internal.o.g(ret, "ret");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (ret.getInteger(1) == 0) {
            com.tencent.mars.xlog.Log.i("Finder.MenuItemCreateListener", "comment black list succ");
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.e7g), 0).show();
        } else {
            com.tencent.mars.xlog.Log.i("Finder.MenuItemCreateListener", "comment black list failed:" + ret.getInteger(1));
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.e7h), 0).show();
        }
    }
}
