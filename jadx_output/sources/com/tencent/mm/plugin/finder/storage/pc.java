package com.tencent.mm.plugin.finder.storage;

/* loaded from: classes5.dex */
public final class pc extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.storage.pc f127363d = new com.tencent.mm.plugin.finder.storage.pc();

    public pc() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ob2.a aVar = new ob2.a(0, "Feed安全检查cgi轮询间隔", null, null, 12, null);
        aVar.a("FINDER_FEED_SAFE_CHECK_INTERVAL_SEC", kz5.c0.i(0, 10, 20, 30), kz5.c0.i("用后台", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_DEFAULT, "20", com.tenpay.android.wechat.PayuSecureEncrypt.ENCRYPT_VERSION_HASH));
        return aVar;
    }
}
