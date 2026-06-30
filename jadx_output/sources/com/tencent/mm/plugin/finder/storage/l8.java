package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.l8 f127115d = new com.tencent.mm.plugin.finder.storage.l8();

    public l8() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        nb2.a aVar = new nb2.a(false, "评论图片加密url", "FINDER_COMMENT_IMAGE_ENCRYPT", null);
        lb2.j.d(aVar, e42.c0.clicfg_enable_finder_comment_image_encrypt, false, 2, null);
        return aVar;
    }
}
