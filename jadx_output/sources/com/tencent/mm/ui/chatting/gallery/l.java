package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.gallery.l f201163a = new com.tencent.mm.ui.chatting.gallery.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f201164b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f201165c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.Long f201166d;

    public final fk4.k a(long j17) {
        return (fk4.k) f201164b.get(java.lang.Long.valueOf(j17));
    }

    public final boolean b(long j17) {
        java.lang.Boolean bool = (java.lang.Boolean) f201165c.get(java.lang.Long.valueOf(j17));
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final void c(com.tencent.mm.storage.f9 msgInfo, fk4.k downloader) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        kotlin.jvm.internal.o.g(downloader, "downloader");
        f201164b.put(java.lang.Long.valueOf(msgInfo.getMsgId()), downloader);
        downloader.f263634v = new com.tencent.mm.ui.chatting.gallery.k(msgInfo);
    }

    public final fk4.k d(long j17) {
        return (fk4.k) f201164b.remove(java.lang.Long.valueOf(j17));
    }
}
