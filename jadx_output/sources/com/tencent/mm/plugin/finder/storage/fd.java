package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fd extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fd f126768d = new com.tencent.mm.plugin.finder.storage.fd();

    public fd() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "是否修复FinderCache限制个数问题", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_fix_finder_cache_trim_size_bug, false, 2, null);
        aVar.a("FixFinderCacheTrimSize", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
