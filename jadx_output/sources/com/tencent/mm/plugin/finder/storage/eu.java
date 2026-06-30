package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class eu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.eu f126730d = new com.tencent.mm.plugin.finder.storage.eu();

    public eu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "简介修改安全预检测", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_signature_pre_check_enable, false, 2, null);
        aVar.a("FINDER_SIGNATURE_PRE_CHECK_ENABLE", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        return aVar;
    }
}
