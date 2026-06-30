package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ph0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ph0 f127374d = new com.tencent.mm.plugin.finder.storage.ph0();

    public ph0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "撤回发现页视频号右侧内容红点时是否删除整个红点", "FINDER_REMOVE_CTRLINFO_WHEN_DISPOSE_FINDER_ENTRANCE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_remove_ctrlinfo_when_dispose_finder_entrance, false, 2, null);
        return aVar;
    }
}
