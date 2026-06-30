package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xv extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xv f128328d = new com.tencent.mm.plugin.finder.storage.xv();

    public xv() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "视频号用户问卷一周出现最大次数", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_quiz_show_count_weekly_android, false, 2, null);
        aVar.a("FINDER_SURVEY_SHOW_COUNT_WEEKLY", kz5.c0.i(0, 3, 4, 5, Integer.MAX_VALUE), kz5.c0.i("0", "3", "4", "5", "无限"));
        return aVar;
    }
}
