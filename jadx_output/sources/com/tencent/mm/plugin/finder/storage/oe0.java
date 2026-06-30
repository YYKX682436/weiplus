package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class oe0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.oe0 f127310d = new com.tencent.mm.plugin.finder.storage.oe0();

    public oe0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "发现页右侧红点最大宽度是否使用DSL宽度", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_entrance_using_dsl_title_max_width, false, 2, null);
        aVar.a("FINDER_ENTRANCE_USING_DSL_TITLE_MAX_WIDTH", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
