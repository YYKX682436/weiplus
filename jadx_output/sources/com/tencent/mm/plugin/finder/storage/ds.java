package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class ds extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.ds f126669d = new com.tencent.mm.plugin.finder.storage.ds();

    public ds() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "视频号主态feed不展示小眼睛，展示新样式", "FINDER_SELF_READ_FEED_WITHOUT_EYE_STYLE", null);
        aVar.c(e42.c0.clicfg_finder_show_self_read_without_eye_style, false);
        return aVar;
    }
}
