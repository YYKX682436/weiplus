package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class mb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.mb f127185d = new com.tencent.mm.plugin.finder.storage.mb();

    public mb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "推荐分类小程序销毁后按长辈模式变化强刷feed", "FINDER_ENABLE_RECOMMEND_CATEGORY_ELDERLY_MODE_REFRESH", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_elderly_mode_refresh, false, 2, null);
        return aVar;
    }
}
