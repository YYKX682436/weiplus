package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ia extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ia f126938d = new com.tencent.mm.plugin.finder.storage.ia();

    public ia() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "视频号不感兴趣可取消", "FINDER_DISLIKE_CANCEL", null);
        aVar.c(e42.c0.clicfg_finder_dislike_cancellable, false);
        return aVar;
    }
}
