package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class z30 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.z30 f128424d = new com.tencent.mm.plugin.finder.storage.z30();

    public z30() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "实名点赞头像", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_real_name_like_avatar_control, false, 2, null);
        aVar.a("REAL_NAME_LIKE_AVATAR_RADIUS_CONTROL", kz5.c0.i(0, 1), kz5.c0.i("圆头像", "方头像"));
        return aVar;
    }
}
