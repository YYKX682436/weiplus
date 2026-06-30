package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class vn extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.vn f128205d = new com.tencent.mm.plugin.finder.storage.vn();

    public vn() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_POST_MATERIAL_POI_SWITCH_DIALOG_CLOSE_TIME_INT_SYNC, 0);
        if (activity != null) {
            db5.t7.makeText(activity, "已清除", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
