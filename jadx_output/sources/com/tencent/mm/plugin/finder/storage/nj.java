package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nj extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nj f127258d = new com.tencent.mm.plugin.finder.storage.nj();

    public nj() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否显示多账号创建入口", null, null, 12, null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_multi_finder_create_entry, false, 2, null);
        aVar.a("FINDER_MULTI_FINDER_CREATE_ENTRY", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
