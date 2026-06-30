package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class cn extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.cn f126597d = new com.tencent.mm.plugin.finder.storage.cn();

    public cn() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "是否绕开创建帐号/发表所有预检查", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_post_create_account_precheck_ignore, false, 2, null);
        aVar.a("FINDER_POST_CREATE_ACCOUNT_PRECHECK_IGNORE", kz5.c0.i(0, 1), kz5.c0.i("否", "是"));
        return aVar;
    }
}
