package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ei0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ei0 f126716d = new com.tencent.mm.plugin.finder.storage.ei0();

    public ei0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "当红点重要信息为空时FinderSync是否丢弃FinderEntrance红点", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_sync_throw_reddot_ctrl_info_if_filed_is_null, false, 2, null);
        aVar.a("FINDER_SYNC_THROW_REDDOT_CTRL_INFO_IF_FIELD_IS_NULL", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
