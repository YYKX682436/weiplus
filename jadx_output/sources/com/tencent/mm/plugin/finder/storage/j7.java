package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.j7 f126985d = new com.tencent.mm.plugin.finder.storage.j7();

    public j7() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Activity activity = (android.app.Activity) obj;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_SURVEY_INFO_STRING_SYNC, "{}");
        if (activity != null) {
            db5.t7.makeText(activity, "已清除用户问卷出现次数", 0).show();
        }
        return jz5.f0.f302826a;
    }
}
