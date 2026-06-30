package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class qu extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.qu f127448d = new com.tencent.mm.plugin.finder.storage.qu();

    public qu() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "本地忽略后台配置-朋友圈发表后同时发表视频号", null, null, 12, null);
        aVar.a("FINDER_SNS_POST_ENTRANCE_IGNORE_SERVER", kz5.c0.i(1, 0), kz5.c0.i("开", "关"));
        return aVar;
    }
}
