package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class v40 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.v40 f128170d = new com.tencent.mm.plugin.finder.storage.v40();

    public v40() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "B-profile设置展示视频号，是否影响我-视频号", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_setting_to_me_finder_switch, false, 2, null);
        aVar.a("SETTING_TO_ME_FINDER_ENTRY_SWITCH", kz5.c0.i(0, 1), kz5.c0.i("不影响", "影响"));
        return aVar;
    }
}
