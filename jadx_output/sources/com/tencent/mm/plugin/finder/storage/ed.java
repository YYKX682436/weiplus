package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ed extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ed f126705d = new com.tencent.mm.plugin.finder.storage.ed();

    public ed() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "发现页预加载视频延长缓冲区", "FINDER_FIRST_VIDEO_EXPEND_BUFFER_SIZE", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_first_video_expend_buffer_size, false, 2, null);
        return aVar;
    }
}
