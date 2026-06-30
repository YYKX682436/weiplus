package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class ms extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ms f127210d = new com.tencent.mm.plugin.finder.storage.ms();

    public ms() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SHARE_BUBBLE_TIPS_LAST_TIME_LONG_SYNC, 0L);
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SET_SHARE_BUBBLE_TIPS_INT_SYNC, 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除，可重新测试", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
