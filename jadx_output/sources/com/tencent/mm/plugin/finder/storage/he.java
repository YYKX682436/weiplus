package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class he extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.he f126889d = new com.tencent.mm.plugin.finder.storage.he();

    public he() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_BOOLEAN, java.lang.Boolean.FALSE);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_FULL_FEED_GUIDE_COUNT_INT, 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
