package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class be0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.be0 f126525d = new com.tencent.mm.plugin.finder.storage.be0();

    public be0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否使用新的DSL红点曝光上报逻辑（修复completeType错误问题）", null, null, 12, null);
        aVar.c(e42.d0.clicfg_finder_dsl_render_state_new_report_logic, false);
        aVar.a("FINDER_DSL_RENDER_STATE_NEW_REPORT_LOGIC", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
