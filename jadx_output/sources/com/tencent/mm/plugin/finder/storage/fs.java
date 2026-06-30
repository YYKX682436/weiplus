package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fs extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fs f126790d = new com.tencent.mm.plugin.finder.storage.fs();

    public fs() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(-1, "个人中心用户状态", null, null, 12, null);
        aVar.a("FINDER_SELF_STATE", new java.util.ArrayList(kz5.c0.i(1, 2, 3, 4, 5, 6, 7, -1)), new java.util.ArrayList(kz5.c0.i("无发表资格", "有发表资格但未创建账号", "账号处于正常状态", "账号被封禁", "账号审核中", "账号被禁言", "全网禁言", "reset")));
        return aVar;
    }
}
