package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class rd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.rd f127482d = new com.tencent.mm.plugin.finder.storage.rd();

    public rd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "关注双流进单流样式", null, null, 12, null);
        aVar.a("FINDER_FOLLOW_TIMELINE_TYPE", kz5.c0.i(0, 1), kz5.c0.i("推荐流", "相同流"));
        lb2.j.d(aVar, e42.d0.clicfg_finder_follow_timeline_type, false, 2, null);
        return aVar;
    }
}
