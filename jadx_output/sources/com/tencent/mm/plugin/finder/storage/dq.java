package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class dq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.dq f126667d = new com.tencent.mm.plugin.finder.storage.dq();

    public dq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(1, "红包封面编辑视频档位下载策略", null, null, 12, null);
        aVar.c(e42.c0.clicfg_finder_red_packet_cover_edit_video_download_level, false);
        aVar.a("FINDER_RED_PACKET_COVER_EDIT_VIDEO_DOWNLOAD_LEVEL", kz5.c0.i(0, 1, 2), kz5.c0.i("最低档位", "中间档位", "最高档位"));
        return aVar;
    }
}
