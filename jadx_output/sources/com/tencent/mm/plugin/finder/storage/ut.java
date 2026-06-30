package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ut extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ut f128153d = new com.tencent.mm.plugin.finder.storage.ut();

    public ut() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号首次转发会话后出教育页", null, null, 12, null);
        aVar.c(e42.d0.clicfg_finder_show_education_after_share, false);
        aVar.a("FINDER_SHOW_EDUCATION_AFTER_SHARE", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
