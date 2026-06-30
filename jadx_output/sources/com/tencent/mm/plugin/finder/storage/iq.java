package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class iq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.iq f126962d = new com.tencent.mm.plugin.finder.storage.iq();

    public iq() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(true, "去掉图片下载时的 refer", "FINDER_REMOVE_DOWNLOAD_REFERER", null);
        lb2.j.d(aVar, e42.c0.clicfg_finder_remove_download_referer, false, 2, null);
        return aVar;
    }
}
