package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class xd0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.xd0 f128304d = new com.tencent.mm.plugin.finder.storage.xd0();

    public xd0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "DSL红点最大可渲染宽度是否减去文案节点间的margin间距", "FINDER_DSL_REDDOT_RENDER_MAX_WIDTH_CONTAIN_MARGIN", null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_dsl_reddot_max_render_width_contain_margin, false, 2, null);
        return aVar;
    }
}
