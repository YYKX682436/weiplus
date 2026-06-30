package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class r7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.r7 f127470d = new com.tencent.mm.plugin.finder.storage.r7();

    public r7() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "栏目卡片完播后自动播下一条", "FINDER_COLUMN_AUTO_SCROLL_NEXT", null);
        aVar.c(e42.c0.clicfg_finder_column_end_auto_scroll, false);
        return aVar;
    }
}
