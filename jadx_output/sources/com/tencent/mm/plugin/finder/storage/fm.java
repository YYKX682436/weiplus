package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class fm extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.fm f126784d = new com.tencent.mm.plugin.finder.storage.fm();

    public fm() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "视频号暂停新样式是否开启", null, null, 12, null);
        aVar.a("FINDER_PAUSE_CHANGE_ENABLE_SWITCH", new java.util.ArrayList(kz5.c0.i(1, 0)), kz5.c0.i("打开", "关闭"));
        return aVar;
    }
}
