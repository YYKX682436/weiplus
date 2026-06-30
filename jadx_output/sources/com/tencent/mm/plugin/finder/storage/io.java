package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class io extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.io f126960d = new com.tencent.mm.plugin.finder.storage.io();

    public io() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "私密账号也允许朋友看", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_private_friend_and_follow_android, false);
        aVar.a("FINDER_PRIVATE_SET_FRIEND_AND_FOLLOW", kz5.c0.i(0, 1), kz5.c0.i("关闭", "打开"));
        return aVar;
    }
}
