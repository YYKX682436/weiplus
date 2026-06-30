package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class nb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.nb f127242d = new com.tencent.mm.plugin.finder.storage.nb();

    public nb() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "启用设置播放器缓冲区大小", null, null, 12, null);
        lb2.j.d(aVar, e42.d0.clicfg_finder_set_buffer_size, false, 2, null);
        aVar.a("FINDER_ENABLE_SET_BUFFER_SIZE", kz5.c0.i(1, 0), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
