package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes4.dex */
public final class jn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.jn f127022d = new com.tencent.mm.plugin.finder.storage.jn();

    public jn() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ORIGIN_GREEN_TIPS_SHOW_COUNT_INT_SYNC, 0);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ORIGIN_GREEN_TIPS_LAST_CONFIG_STRING_SYNC, "");
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_ORIGIN_GREEN_TIPS_SHOW_MULTI_TIMESTAMP_STRING_SYNC, "");
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
