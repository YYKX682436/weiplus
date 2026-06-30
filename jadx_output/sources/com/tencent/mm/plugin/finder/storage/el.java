package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class el extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.el f126721d = new com.tencent.mm.plugin.finder.storage.el();

    public el() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "非自己profile流出发表时间", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_not_self_tl_show_create_time_android, false);
        aVar.a("FINDER_NOT_SELF_PROFILE_TIMELINE_SHOW_CREATE_TIME", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
